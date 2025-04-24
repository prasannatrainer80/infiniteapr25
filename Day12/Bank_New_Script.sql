drop database if exists banknew;

create database banknew;

use banknew;

create table Accounts
(
	AccountNo INT Primary Key Auto_Increment,
    AccHolderName varchar(30),
    UserName varchar(30) UNIQUE,
    Passcode varchar(30),
    Email varchar(30) UNIQUE,
    MobileNo varchar(20) UNIQUE,
    Amount Numeric(9,2)
);

Create Table Trans
(
    TranID INT Primary Key Auto_Increment,
    AccountNo INT REFERENCES Accounts(AccountNo),
    TranAmount Numeric(9,2),
    TranType varchar(5)
);

Insert into Accounts(AccHolderName,UserName,
passCode,Email,MobileNo,Amount) 
values('Geethika','Geethika12','Vuppala','Geethika@gmail.com',
9999888812,88234.22),
('Nitisha','Nitisha1','Sagar','Nitisha@gmail.com',
8888999913,88222.22);