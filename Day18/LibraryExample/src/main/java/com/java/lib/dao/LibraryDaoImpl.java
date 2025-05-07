package com.java.lib.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.lib.model.Books;
import com.java.lib.model.LibUsers;
import com.java.lib.model.TranBook;
import com.java.lib.util.ConnectionHelper;
import com.java.lib.util.EncryptPassword;

public class LibraryDaoImpl implements LibraryDao {

	Connection connection;
	PreparedStatement psmt;
	
	
	
	public int issueOrNot(String userName, int bookId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String sql = "select count(*) cnt from TranBook where UserName=? and BookId=?";
		psmt = connection.prepareStatement(sql);
		psmt.setString(1, userName);
		psmt.setInt(2, bookId);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		int count =rs.getInt("cnt");
		return count;
	}
	
	@Override
	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(libUsers.getPassWord());
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into LibUsers(UserName,Password) values(?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, libUsers.getUserName());
		psmt.setString(2, encr);
		psmt.executeUpdate();
		return "User Account Created Successfully...";
	}

	@Override
	public int login(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		String encr = EncryptPassword.getCode(libUsers.getPassWord());
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from LibUsers where UserName = ? AND "
				+ " Password = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, libUsers.getUserName());
		psmt.setString(2, encr);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		int count= rs.getInt("cnt");
		return count;
	}

	@Override
	public List<Books> searchBooks(String searchType, String searchValue) throws ClassNotFoundException, SQLException {
		String cmd;
		boolean isValid = true;
		if(searchType.equals("id")) {
			cmd = " SELECT * FROM Books WHERE Id = ? " ;
		} else if (searchType.equals("bookname")) {
			cmd = " SELECT * FROM Books Where Name = ?";
		} else if (searchType.equals("authorname")) {
			cmd = "SELECT * FROM Books where Author = ?";
		} else if (searchType.equals("dept")) {
			cmd = "select * from Books where Dept = ?";
		} else {
			isValid = false;
			cmd = "select * from Books";
		}
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		if (isValid == true) {
			psmt.setString(1, searchValue);
		}
		ResultSet rs = psmt.executeQuery();
		Books books = null;
		List<Books> booksList = new ArrayList<Books>();
		while(rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setDept(rs.getString("dept"));
			books.setNoOfBooks(rs.getInt("TotalBooks"));
			booksList.add(books);
		}
		return booksList;
	}

	@Override
	public String issueBook(String userName, int bookId) throws ClassNotFoundException, SQLException {
		int count = issueOrNot(userName, bookId);
		if (count==0) {
			connection = ConnectionHelper.getConnection();
			String sql = "Insert into TranBook(UserName,BookId) values(?,?)";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, userName);
			psmt.setInt(2, bookId);
			psmt.executeUpdate();
			sql="Update Books set TotalBooks=TotalBooks-1 where id=?";
			psmt = connection.prepareStatement(sql);
			psmt.setInt(1, bookId);
			psmt.executeUpdate();
			return "Book with Id " +bookId + " Issued Successfully...";
		} else {
			return "Book Id " +bookId+ " for User " +userName + " Already Issued...";
		}
	}

	@Override
	public List<TranBook> accountDetails(String userName) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from tranbook where username = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, userName);
		ResultSet rs = psmt.executeQuery();
		List<TranBook> booksIssued = new ArrayList<TranBook>();
		TranBook tranBook = null;
		while(rs.next()) {
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("BookId"));
			tranBook.setUserName(rs.getString("UserName"));
			tranBook.setFromDate(rs.getDate("FromDate"));
			booksIssued.add(tranBook);
		}
		return booksIssued;
	}

	@Override
	public String returnBook(String userName, int bookId) throws ClassNotFoundException, SQLException {
		String cmd = "SELECT * FROM TranBook WHERE Username = ? and BookId = ?";
		connection = ConnectionHelper.getConnection();
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, userName);
		psmt.setInt(2, bookId);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		Date fromDate = rs.getDate("fromDate");
		
		String sql2 = " INSERT INTO TransReturn(UserName,BookId,FromDate) VALUES (?,?,?)" ;
		psmt = connection.prepareStatement(sql2);
		psmt.setString(1,userName);
		psmt.setInt(2,bookId);
		psmt.setDate(3,fromDate);
		psmt.executeUpdate();
		
		String sql1 = "DELETE FROM TranBook WHERE BookId = ? AND Username = ? " ;
		psmt = connection.prepareStatement(sql1);
		psmt.setInt(1,bookId);
		psmt.setString(2,userName);
		psmt.executeUpdate();
		
		String sql3 = "Update Books set TotalBooks = TotalBooks + 1 where Id = ?";
		psmt = connection.prepareStatement(sql3);
		psmt.setInt(1, bookId);
		psmt.executeUpdate();
		return "Book with Id " +bookId + " For User " +userName + " Returned Successfully...";
	}

}
