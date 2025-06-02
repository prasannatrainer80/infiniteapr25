package com.java.jsf;

import java.util.List;

public interface UserDao {
	String addUserDao(Users user);
	List<Users> showUserDao();
	String addGroup(TravelGroup travelGroup);
	String addGroupMembers(GroupMembers groupMember);
	String addDailyExpenses(DailyExpenses dailyExpenses);
}
