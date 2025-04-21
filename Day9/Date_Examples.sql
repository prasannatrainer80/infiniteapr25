-- Sql Date Functions
-- curdate() : used to display current date
select curDate();
-- curTime() : Used to display current time
select curTime();
select dayofWeek(curDate());
select quarter(curdate());
-- last_day() : Displays the last day of date of month specified
select last_day(curdate());
-- adddate() : Used to add no.of days 
select adddate(curdate(),INTERVAL 5 day); 
select adddate(curdate(), INTERVAL 3 MONTH);
select adddate(curdate(), INTERVAL 4 YEAR);