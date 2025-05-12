drop database if exists infinitehib;

create database infinitehib;

use infinitehib;

create table Employee
(
   empid int primary key auto_increment,
   firstName varchar(30),
   lastName varchar(30),
   userName varchar(30) UNIQUE,
   passCode varchar(255),
   email varchar(30),
   status varchar(30) default 'inactive'
);

create table Otp
(
   otpid int primary key auto_increment,
   userName varchar(30),
   otpNo int,
   npassword varchar(50),
   status varchar(30) default 'inactive'
)