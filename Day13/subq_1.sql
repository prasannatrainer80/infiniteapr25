-- subqueries 
select max(sal) from Emp; 
select ename from Emp where sal=(select max(sal) from Emp);
-- Display 2nd max salary 
select max(sal) from emp where sal < 
(select max(sal) from Emp);
-- Display Employ Name who is getting 2nd max sal
select ename from emp where sal = 
(
select max(sal) from emp where sal < 
(select max(sal) from Emp)
);
