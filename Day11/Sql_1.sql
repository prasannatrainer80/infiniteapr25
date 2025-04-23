use infinite;

-- Aggregate Functions : 

-- sum() -> Used to perform sum operation on field

select sum(sal) from Emp;

-- avg() -> Used to perform avg operartion on field

select avg(sal) from Emp;

-- max() -> Used to return max. values

select max(sal) from Emp;

-- min() -> Used to return min. value 

select min(sal) from Emp;

-- count(*) -> Used to display total no.of records 

select count(*) from Emp;  

select count(comm) from Emp;