drop database if exists infinitepractice;

create database infinitepractice;

use infinitepractice;

create table Employ
(
   Empno INT Primary Key,
   Name varchar(30) NOT NULL,
   Gender ENUM('MALE','FEMALE'), 
   Dept varchar(30),
   Desig varchar(30),
   Basic numeric(9,2)
);

Insert into Employ(empno,name,gender,dept,desig,basic)
values(1,'Sandhan','MALE','Java','Programmer',88223),
(2,'Premjeet','MALE','Sql','Expert',98222),
(3,'Nirmalya','MALE','Java','Developer',88224),
(4,'Zainab','FEMALE','Sql','Expert',77224),
(5,'Sourav','MALE','Dotnet','Manager',77722),
(6,'Ananta','MALE','Sql','Expert',82555),
(7,'Ishani','FEMALE','Dotnet','Expert',77223);