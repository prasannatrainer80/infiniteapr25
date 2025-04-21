-- String Functions
-- instr() : Used to display first occurrence of given char
select instr('hello','l');

-- length() : Display's the length of string 
select length('Aakash');
select Ename, Length(Ename) from Emp;
-- Reverse() : Display's string in reverse order
select reverse('hello');
select ename, reverse(ename) from Emp;
select lower('Hello'), upper('Hello');
select left('Hello',4);
select right('Hello',4);
select concat('Hello',' ','world');
select replace('Java Training','Java','Sql');