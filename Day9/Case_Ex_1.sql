-- Write a query to display ManagerName as for job
-- For CLERK 'Anoop'
-- For SALESMAN 'Shwetha'
-- For MANAGER 'Navin'
-- For ANALYST 'Manoj'
-- For President 'No Manager' 

select empno, ename, job, sal, 
case JOB
   WHEN 'CLERK' THEN 'Anoop'
   WHEN 'SALESMAN' THEN 'Shwetha'
   WHEN 'MANAGER' THEN 'Navin'
   WHEN 'ANALYST' THEN 'Manoj'
   WHEN 'PRESIDENT' THEN 'No Manager'
END 'Reporting'
from Emp;