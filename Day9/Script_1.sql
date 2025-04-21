-- Change to infinite database 

use infinite;

-- Display List of tables available in current db 

show tables;

-- Display info about Emp table 

desc Emp;

-- Display Records from Emp table 

select * from Emp;

-- Display Empno, Ename, Job, sal, Comm from Emp table 

select Empno, Ename, Job, Sal, Comm
from Emp ;

-- Where Clause : Used to display Filtered records 

-- Display info whose Empno is 7900

select * from Emp 
where empno = 7900; 

-- Display info whose Job is 'CLERK' 
select * from Emp 
where job='CLERK'; 

-- Between...AND : Used to display form start to end range

select * from Emp where sal between 1000 and 2000;

select * from Emp where sal not between 1000 and 2000;

-- In clause : used to display for particular column
--	multiple values

select * from Emp where 
job in('CLERK','MANAGER','ANALYST');

select * from Emp where 
job NOT IN('CLERK','MANAGER','ANALYST');

-- Like Operator : Used to display w.r.t. wildcards 

select * from emp where ename like 'S%';

select * from Emp where ename like '%S';

select * from Emp where ename like 'J___S';

-- Order By : Used to display data w.r.t. Specific field(s)
-- in ascending or descending order 

select Empno, Ename, Job,Sal,Hiredate from Emp
order by ename;

select Empno, Ename, Job,Sal,Hiredate from Emp
order by sal desc;

select Empno, Ename, Job,Sal,Hiredate from Emp
order by Job,Ename;

select Empno, Ename, Job,Sal,Hiredate from Emp
order by Job, Ename DESC;

