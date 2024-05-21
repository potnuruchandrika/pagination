CREATE DATABASE task;
USE task;
CREATE TABLE employee(employee_Id varchar(12),employee_name varchar(30),phone_number varchar(10),salary double(7,8),department varchar(30));
SELECT * FROM employee;
INSERT INTO employee(employee_Id,employee_name,phone_number,salary,department)
VALUES
('abc18','virat','897453151',34657.00,'hr');
SELECT COUNT(*) FROM employee;

