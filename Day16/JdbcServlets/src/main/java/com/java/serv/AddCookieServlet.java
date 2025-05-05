package com.java.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckSandhan = new Cookie("Sandhan", "88");
		ckSandhan.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckSandhan);
		
		Cookie ckSamiksha = new Cookie("Samiksha", "91");
		ckSamiksha.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckSamiksha);
		
		Cookie ckZainab = new Cookie("Zainab", "84");
		ckZainab.setMaxAge(1000 * 60 * 60 * 24);
		response.addCookie(ckZainab);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<b> Cookies are Created Successfully </b>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
