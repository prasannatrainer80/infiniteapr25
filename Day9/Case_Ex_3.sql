select empno, ename, job,sal,comm from emp;

select empno, ename, job, sal, comm, 
case 
when comm is null then 0 
else comm 
end "commission" from Emp; 

select empno, ename, job, sal, comm, 
case 
when comm is null then 0 
else comm 
end "commission",
case
when comm is NULL THEN SAL
else sal + comm
END 'TakeHome' from Emp; 

