-- 회원테이블 만들기
CREATE TABLE member_test(
	name varchar2(20),
	tel varchar2(20)
);

-- 회원정보 추가
INSERT INTO member_test VALUES('aa', '010');
INSERT INTO member_test VALUES('bb', '020');


-- 회원리스트 확인
SELECT * FROM member_test;
