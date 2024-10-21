CREATE DATABASE shopdb;

USE shopdb;

CREATE TABLE memberTBL (
	memberID VARCHAR(255) NOT NULL,
	memberName VARCHAR(255) NOT NULL,
	memberAddress VARCHAR(255),
	PRIMARY KEY(memberID)
	);

CREATE TABLE productTBL(
	productName VARCHAR(255) NOT NULL,
	cost INT NOT NULL,
	MAKEDATE DATE,
	company VARCHAR(255),
	amount INT NOT NULL,
	PRIMARY KEY (productName)
	);
	
INSERT INTO memberTBL(memberID,memberName,memberAddress)
VALUES
	('Dang','담탕이','경기 부천시 중동'),
	('Jee','지운이','서울 은평구 중산동'),
	('Han','한주연','인천 남구 주안동'),
	('Sang','상길이','경기 성남시 분당구');

SELECT * FROM membertbl;

INSERT INTO producttbl(productName,cost,MAKEDATE,company,amount)
VALUES 
	('컴퓨터',10,'2017-01-01','삼성',17),
	('세탁기',20,'2018-09-01','LG',3),
	('냉장고',5,'2019-02-01','대우',22);
	
SELECT * FROM producttbl;

SELECT memberName, memberAddress FROM membertbl;

SELECT * FROM membertbl WHERE memberName='지운이';

CREATE TABLE `my testTBL` (id INT);
DROP TABLE `my testTBL`;

