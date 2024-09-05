--회원 테이블
CREATE TABLE member_servlet (
	custno number(6) NOT NULL,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2),
	CONSTRAINT member_servlet_custno_pk PRIMARY KEY (custno)
);
INSERT INTO member_servlet VALUES(100001, '김형복', '010-1111-2222', '서울 동대문구 휘경1동', '20151202', 'A', '01');
INSERT INTO member_servlet VALUES(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', '20151206', 'B', '01');
INSERT INTO member_servlet VALUES(100003, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', '20151001', 'B', '30');
INSERT INTO member_servlet VALUES(100004, '최사랑', '010-1111-5555', '울릉군 울릉읍 독도2리', '20151113', 'A', '30');
INSERT INTO member_servlet VALUES(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', '20151225', 'B', '60');
INSERT INTO member_servlet VALUES(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', '20151211', 'C', '60');
--회원 매출 테이블
CREATE TABLE money_servlet (
	custno number(6) NOT NULL,
	saleno number(8) NOT NULL,
	pcost number(8),
	amount number(4),
	price number(8),
	pcode varchar2(4),
	sdate date,
	CONSTRAINT money_table_pk PRIMARY KEY (custno,saleno),
	CONSTRAINT custno_fk FOREIGN KEY (custno) REFERENCES member_servlet (custno)
);

INSERT INTO money_servlet VALUES(100001, 20160001, 500, 5, 2500, 'A001', '20160101');
INSERT INTO money_servlet VALUES(100001, 20160002, 1000, 4, 4000, 'A002', '20160101');
INSERT INTO money_servlet VALUES(100001, 20160003, 500, 3, 1500, 'A008', '20160101');
INSERT INTO money_servlet VALUES(100002, 20160004, 2000, 1, 2000, 'A004', '20160102');
INSERT INTO money_servlet VALUES(100002, 20160005, 500, 1, 500, 'A001', '20160103');
INSERT INTO money_servlet VALUES(100003, 20160006, 1500, 2, 3000, 'A003', '20160103');
INSERT INTO money_servlet VALUES(100004, 20160007, 500, 2, 1000, 'A001', '20160104');
INSERT INTO money_servlet VALUES(100004, 20160008, 300, 1, 300, 'A005', '20160104');
INSERT INTO money_servlet VALUES(100004, 20160009, 600, 1, 600, 'A006', '20160104');
INSERT INTO money_servlet VALUES(100004, 20160010, 3000, 1, 3000, 'A007', '20160106');
-- 회원목록 조회
SELECT custno, custname, phone, address, joindate,
	decode(grade, 'A','VIP', 'B','일반', 'C','직원') grade, city
from member_servlet
order by custno;

--  MAX(custno)마지막 회원번호 조회하여 다음번호 증가 +1
select max(custno)+1 nextCustNO from member_servlet;

-- 회원추가
insert into member_servlet
values(100007,'칠칠칠','010-9999-8888','추가~제주도 제주시 감나무골','20151211','A','99');

--선택한 회원조회 한명
SELECT custno, custname, phone, address, joindate, grade, city
from member_servlet where custno=100001;

-- 회원 수정
update member_servlet
set custname='수정칠', phone='010-2626-6566', address='수정 제주도', joindate='20151211', grade='B', city='99'
where custno=100007;

--update member_servlet
--set custname=?, phone=?, address=?, joindate=?, grade=?, city=?
--where custno=?


--회원삭제
delete from member_servlet
where custno = 100007;

select A.custno, A.custname, decode(A.grade, 'A','VIP', 'B','일반', 'C','직원') grade, SUM(price) price
from member_servlet A, money_servlet B
where A.custno=B.custno
group by A.custno, A.custname, A.grade
order by price DESC;


