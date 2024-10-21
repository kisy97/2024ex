CREATE DATABASE examDB;
SHOW DATABASES ;
USE examDB;

CREATE TABLE memberTBL(
	custno INT NOT NULL,
	custname VARCHAR(20),
	phone VARCHAR(13),
	address VARCHAR(60),
	joindate DATE,
	grade CHAR(1),
	city CHAR(2),
	PRIMARY KEY(custno)
);

SHOW INDEX FROM memberTBL;

SELECT * FROM  information_schema.table_constraints
WHERE CONSTRAINT_NAME = 'PRIMARY' AND TABLE_NAME ='memberTBL';

DESCRIBE memberTBL;
DESC memberTBL;

INSERT INTO memberTBL(custno, custname, phone, address, joindate, grade, city) 
VALUES
	(100001, '김행복', '010-1111-2222', '서울 동대문구 휘경1동', '20151202', 'A', '01'),
	(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', '20151206', 'B', '01'),
	(100003, '장믿음', '010-1111-4444', '울룽군 울룽읍 독도1리', '20151001', 'B', '30'),
	(100004, '최사랑', '010-1111-5555', '울룽군 울룽읍 독도2리', '20151113', 'A', '30'),
	(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', '20151225', 'B', '60'),
	(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', '20151211', 'C', '60');
	
SELECT * FROM memberTBL;

CREATE TABLE moneyTBL(
	custno INT NOT null,
	saleno INT NOT null,
	pcost INT,
	amount INT,
	price INT, 
	pcode VARCHAR(4),
	sdate DATE
);

ALTER TABLE moneyTBL 
ADD CONSTRAINT PRIMARY KEY(custno, saleno);

ALTER TABLE moneyTBL 
ADD CONSTRAINT fk_no FOREIGN KEY(custno) REFERENCES memberTBL(custno);

SHOW INDEX FROM moneyTBL;

SELECT * FROM  information_schema.table_constraints
WHERE CONSTRAINT_NAME = 'PRIMARY' AND TABLE_NAME ='moneyTBL';

SELECT * FROM  information_schema.table_constraints
WHERE CONSTRAINT_NAME='fk_no';

ALTER TABLE moneyTBL
DROP CONSTRAINT fk_no;

DESCRIBE moneyTBL;

INSERT INTO moneyTBL(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES
	(100001, 20160001, 500, 5, 2500, 'A001', '20160101'),
	(100001, 20160002, 500, 4, 4000, 'A002', '20160101'),
	(100001, 20160003, 500, 3, 1500, 'A008', '20160101'),
	(100002, 20160004, 500, 1, 2000, 'A004', '20160102'),
	(100002, 20160005, 500, 1, 500, 'A001', '20160103'),
	(100003, 20160006, 500, 2, 3000, 'A003', '20160103'),
	(100004, 20160007, 500, 2, 1000, 'A001', '20160104'),
	(100004, 20160008, 500, 1, 300, 'A005', '20160104'),
	(100004, 20160009, 500, 1, 600, 'A006', '20160104'),
	(100004, 20160010, 500, 1, 3000, 'A007', '20160106');
	
SELECT * FROM moneyTBL;

SELECT * FROM memberTBL ORDER BY custno;
SELECT * FROM memberTBL WHERE grade = 'A' ORDER BY custno;
SELECT custno, custname, phone, address, joindate, grade, city FROM membertbl ORDER BY custno;
SELECT 
	custno, custname, phone, address, joindate, 
	case grade when 'A' then 'VIP' ELSE '기타' end, 
	city 
FROM memberTBL ORDER BY custno;
SELECT 
	custno, custname, phone, address, joindate, 
	case 
		when grade='A' then 'VIP'
		when grade='B' then '일반'
		when grade='C' then '직원'
		ELSE '기타' 
	end AS grade,
	city 
FROM memberTBL ORDER BY custno;
SELECT MAX(custno) FROM memberTBL;
SELECT MAX(custno)+1 FROM memberTBL;
SELECT * FROM memberTBL WHERE custno=100003;

UPDATE memberTBL
SET custname='삼삼삼', phone='010-999-3333'
WHERE custno=100003;
DELETE FROM memberTBL WHERE custno=100006;

INSERT INTO memberTBL(custno, custname, phone, address, joindate, grade, city) 
VALUES(100006, '차공단', '010-9999-7777', '제주도 제주시 감나무골', '20151211', 'C', '60');
INSERT INTO memberTBL(custno, custname, phone, address, joindate, grade, city) 
VALUES(100007, '팔공단', '010-9999-8888', '제주도 제주시 감나무골', '20151211', 'C', '60');
INSERT INTO moneyTBL(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100006, 20160001, 500, 5, 2500, 'A006', '20160101');
INSERT INTO moneyTBL(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100007, 20160001, 500, 5, 2500, 'A007', '20160101');

SELECT * FROM moneytbl;

SELECT * 
FROM membertbl A, moneytbl B;

SELECT * 
FROM membertbl A, moneytbl B
WHERE A.custno = B.custno;

SELECT A.custno, A.custname, 
	case
		when grade='A' then 'VIP'
		when grade='B' then '일반'
		when grade='C' then '직원'
		ELSE '기타' 
	END AS grade,
	SUM(price) 합계
FROM membertbl A, moneytbl B
WHERE A.custno = B.custno
GROUP BY A.custno, A.custname, A.grade;

SELECT A.custno, A.custname, 
	case
		when grade='A' then 'VIP'
		when grade='B' then '일반'
		when grade='C' then '직원'
		ELSE '기타' 
	END AS grade,
	SUM(price) 합계
FROM membertbl A, moneytbl B
WHERE A.custno = B.custno
GROUP BY A.custno, A.custname, A.grade
ORDER BY 합계 DESC ;
