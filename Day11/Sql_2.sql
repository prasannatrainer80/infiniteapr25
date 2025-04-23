-- Group By : Used to generate summary report on the field specified

select job, sum(sal) from Emp 
group by job;

select job, count(*) from Emp
group by job;

select job, avg(sal) from Emp 
group by job;

select job, max(sal) from Emp 
group by job;

select job, sum(sal), avg(sal), max(sal),min(sal),
count(*) From emp
Group By JOb;

