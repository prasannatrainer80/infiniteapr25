drop table if exists customer;

create table Customer
(
   custId INT Primary Key auto_increment,
   customerName varchar(30),
   city varchar(30),
   mobile varchar(15)
);

Insert into Customer(custId,customerName,city,mobile)
values(1,'Induja','Chennai','888224455'),
(2,'Sandhan','Poori','8822552255');