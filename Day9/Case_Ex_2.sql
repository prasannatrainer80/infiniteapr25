select * from Dept;

-- Write a Query, as For dname field as
 -- For 'ACCOUNTING' HEADoFFICE as 'Hyderabad'
--  For 'RESEARCH' HeadOffice as 'Delhi'
--  For 'SALES' headOffice as 'PUNE'
--  For 'OPERATIONS' headOffice as 'Mumbai'
select Deptno, Dname,
CASE Dname
   WHEN 'ACCOUNTING' THEN 'Hyderabad'
   WHEN 'RESEARCH' THEN 'DELHI'
   WHEN 'SALES' THEN 'PUNE'
   WHEN 'OPERATIONS' THEN 'Mumbai'
END 'HeadOffice'
from Dept;