select * from Emp;

select empno, ename, job, mgr,sal from Emp;

select E1.empno 'Manager Id',
E1.ename 'Manager Name',
e2.empno 'Emp Id',E2.ename 'Employ Name' from 
Emp E1 INNER JOIN Emp E2 
ON E1.Empno = E2.Mgr;
