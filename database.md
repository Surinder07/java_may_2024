## Recap


/*

database ?
Relational and non relational database





*/

show databases ;

use Employee;
show tables;

select * from TITLES limit 3;

select *
from EMPLOYEE;

## Employee name = Smith or Tokyo

Select Employee_Name, Employee_Address From EMPLOYEE
Where Employee_Name Like ‘Smith’ And Employee_Address = “Tokyo”;


## Functions
-- find the employee name who has the max salary
-- min, max,


show tables;

select  EMPLOYEE_NAME , min(EMPLOYEE_SALARY) from EMPLOYEE;


select max(EMPLOYEE_SALARY) from EMPLOYEE;


-- how many employees have salary more than 30K
-- count
select count(EMPLOYEE_SALARY) from EMPLOYEE
where EMPLOYEE_SALARY < 35000;

show tables;

select count(*) from EMPLOYEE;


-- sum
select sum(EMPLOYEE_SALARY) from EMPLOYEE;
select  * from EMPLOYEE;
--
-- avg
select avg(EMPLOYEE_SALARY) from EMPLOYEE;

select  EMPLOYEE_NAME, EMPLOYEE_SALARY from EMPLOYEE;


-- find all the emp with salary greater than 40K or address japan

select count(*) from EMPLOYEE
where EMPLOYEE_SALARY > 40000 AND EMPLOYEE_ADDRESS = 'japan';

-- find employees from these countries - Japan, Tokyo, Chile
select * from EMPLOYEE
where EMPLOYEE_ADDRESS  IN ('Japan', 'Tokyo', 'Chile');

select * from EMPLOYEE
where EMPLOYEE_ADDRESS NOT IN ('Japan', 'Tokyo', 'Chile');

-- how many employees are from Canada

select count(*) from EMPLOYEE
where EMPLOYEE_ADDRESS  IN ('Canada');


-- Find employees whose salary lies between 40K - 60K

-- BETWEEN

select count(*)
from EMPLOYEE
where EMPLOYEE_SALARY BETWEEN 40000 AND 60000;



--  ##############################################


-- constraints
/*

UNIQUE -    column should have unique
NOT NULL -  column should not be null
PRIMARY KEY - NOT and unique value
FOREIGN KEY -
DEFAULT - default values
CHECK - specific condition , age > 18

*/

show tables;
show databases ;

drop database pragra;
create database pragra;

use pragra;

show tables;

create table Student (
ID int NOT NULL,
FIRSTNAME  varchar(255) NOT NULL,
LASTNAME varchar(255),
AGE int,
EMAIL varchar(255),
PRIMARY KEY (ID));
show tables;

desc Student;

-- add some data to this table
select * from Student;


ALTER table Student
Drop primary key ;

ALTER table Student
ADD primary key(ID) ;




show tables;


show tables;

select * from employees;
desc employees;


create table Customer (
ID int NOT NULL,
FIRSTNAME  varchar(255) NOT NULL,
LASTNAME varchar(255),
AGE int NOT NULL ,
EMAIL varchar(255),
CHECK ( AGE > 4 ));

show tables;

select * from Customer;
desc  Customer;

insert into Customer (ID, FIRSTNAME, LASTNAME, AGE, EMAIL )
values (101, 'Divyesh', 'A', 5, 'test@gmail.com');



-- dev, full accecess, CRUD
-- staging, Read, Alter
-- prod - read,


-- IAM

update  Student
set EMAIL = 'abc@pragra.io'
where ID = 1;

select *
from Student;


-- remove record
delete from Student
where ID = 101;



-- JOINS [Interview Important]

/*
Employee id name email salary
Addreess id address and postalcode

Inner join -- common between both tables
left             - A  and B    ------------> fetch everything from left table and common rght table
right join   -- fetch everything from right table and common left table
full join   -- everything from both the tables
self join  -- when it is joined with itself

*/





show databases ;
use Employee;

show tables;
select * from EMPLOYEE;

select * from DEPT_MANAGER;
select * from SALARY;
select * from TITLES;
desc EMPLOYEE;
desc SALARY;


select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE from
EMPLOYEE e
INNER JOIN
TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE from
EMPLOYEE e
LEFT JOIN
TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE from
EMPLOYEE e
RIGHT JOIN
TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;

select e.EMPLOYEE_ID, e.EMPLOYEE_NAME, t.EMPLOYEE_TITLE from
EMPLOYEE e
RIGHT JOIN
TITLES t
ON
e.EMPLOYEE_ID = t.EMPLOYEE_ID;




INSERT INTO EMPLOYEE values (1008,'Divyesh','Toronto', 905924011, 30000,'F','2017-01-01');






























)












































