----------< 제약조건 사용하기 >----------
--제약조건 확인
--SELECT * FROM all_constraints;
--SELECT * FROM all_constraints WHERE table_name='member_tbl';
--제약조건 삭제
--ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명 CASCADE;
--제약조건과 함께 테이블삭제
--DROP TABLE member_tbl CASCADE CONSTRAINT;

----------< 고객테이블 >----------
DROP TABLE member_tbl;
CREATE TABLE member_tbl(
	custno number(6) not null,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2),
	CONSTRAINT member_tbl_pk primary key(custno)
);
SELECT * FROM member_tbl;

INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100001, '김행복', '010-1111-2222', '서울 동대문구 휘경1동', '20151202', 'A', '01');
INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', '20151206', 'B', '01');
INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100003, '장믿음', '010-1111-4444', '울룽군 울룽읍 독도1리', '20151001', 'B', '30');
INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100004, '최사랑', '010-1111-5555', '울룽군 울룽읍 독도2리', '20151113', 'A', '30');
INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', '20151225', 'B', '60');
INSERT INTO member_tbl(custno, custname, phone, address, joindate, grade, city) 
VALUES(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', '20151211', 'C', '60');

----------< 매출테이블 >----------

--제약조건과 함께 테이블삭제
--DROP TABLE money_tbl CASCADE CONSTRAINT;

DROP TABLE money_tbl;
CREATE TABLE money_tbl(
	custno number(6) not null,
	saleno number(8) not null,
	pcost number(8),
	amount number(4),
	price number(8), 
	pcode varchar2(4),
	sdate date,
	CONSTRAINT custno_fk FOREIGN KEY (custno) REFERENCES member_tbl(custno)
);
SELECT * FROM money_tbl;

INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100001, 20160001, 500, 5, 2500, 'A001', '20160101');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100001, 20160002, 500, 4, 4000, 'A002', '20160101');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100001, 20160003, 500, 3, 1500, 'A008', '20160101');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100002, 20160004, 500, 1, 2000, 'A004', '20160102');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100002, 20160005, 500, 1, 500, 'A001', '20160103');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100003, 20160006, 500, 2, 3000, 'A003', '20160103');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100004, 20160007, 500, 2, 1000, 'A001', '20160104');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100004, 20160008, 500, 1, 300, 'A005', '20160104');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100004, 20160009, 500, 1, 600, 'A006', '20160104');
INSERT INTO money_tbl(custno, saleno, pcost, amount, price, pcode, sdate)
VALUES(100004, 20160010, 500, 1, 3000, 'A007', '20160106');












