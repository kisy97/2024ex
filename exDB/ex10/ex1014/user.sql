CREATE USER director@'%' IDENTIFIED BY 'director';
GRANT ALL ON *.* TO director@'%' WITH GRANT OPTION;

CREATE USER ceo@'%' IDENTIFIED BY 'ceo';
GRANT SELECT ON *.* TO ceo@'%';

CREATE USER staff@'%' IDENTIFIED BY 'staff';
GRANT SELECT, INSERT, UPDATE, DELETE ON shopDB.* TO staff@'%';
GRANT SELECT ON employees.* TO staff@'%';

#director 사용자
CREATE DATABASE sampleDB;
DROP DATABASE sampleDB;
# ceo 사용자
USE shopDB;
SELECT * FROM memberTBL;
# error
DELETE FROM memberTBL WHERE memberName='담탕이';

#staff 사용자
USE shopDB;
DELETE FROM memberTBL WHERE memberID = 'Sang';
SELECT * FROM memberTBL;
#error
DROP TABLE memberTBL;
#error 
USE nation;

USE employees;
SELECT * FROM employees;