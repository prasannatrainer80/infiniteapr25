drop database if exists expenses;

create database expenses;

create table users
(
   userId int primary key,
   userName varchar(30),
   email varchar(30)
);

create table TravelGroup
(
    groupId INT auto_increment,
    createdBy INT REFERENCES Users(userId),
    groupName varchar(30),
    startDate Date,
    endDate Date,
    initialAmount numeric(9,2)
);

create Table GroupMembers
(
   gmId INT AUTO_INCREMENT,
   groupId INT REFERENCES TravelGroup(groupId),
   userId INT,
   amountCollected numeric(9,2)
);

Create Table Expenses
(
    expId INT AUTO_INCREMENT,
    groupId INT REFERENCES TravelGroup(groupId),
    expenseDate Date, 
    expenseDescription varchar(30),
    paidBy INT REFERENCES Users(userId),
    amount numeric(9,2)
);