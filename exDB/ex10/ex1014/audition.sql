USE examDB;

-- 참가자테이블 ----------
CREATE TABLE artistTBL(
	artist_id char(4) NOT NULL,
	artist_name varchar(20),
	artist_birth char(8), 
	artist_gender char(1),
	talent char(1),
	agency varchar(20),
	CONSTRAINT PRIMARY KEY (artist_id)
);
DESC artistTBL;

INSERT INTO artistTBL (artist_id, artist_name, artist_birth, artist_gender, talent, agency) 
VALUES 
	('A001', '황스타', '19970101', 'F', '1', 'A엔터테인먼트'),
	('A002', '정스타', '19980201', 'M', '2', 'B엔터테인먼트'),
	('A003', '박스타', '19990301', 'M', '3', 'C엔터테인먼트'),
	('A004', '김스타', '20000401', 'M', '1', 'D엔터테인먼트'),
	('A005', '서스타', '20010501', 'F', '2', 'E엔터테인먼트');
SELECT * FROM artisttbl;

-- 멘토테이블 ----------
CREATE TABLE mentoTBL(
	mento_id char(4) NOT NULL,
	mento_name varchar(20),
	CONSTRAINT PRIMARY KEY (mento_id)
);
DESC mentoTBL;

INSERT INTO mentoTBL (mento_id, mento_name) 
VALUES 
	('J001', '이멘토'),
	('J002', '안멘토'),
	('J003', '한멘토');

SELECT * FROM mentoTBL;

-- 점수테이블 ----------
CREATE TABLE pointTBL(
	serial_no char(4) NOT NULL,
	artist_id char(4),
	mento_id char(4),
	point int(3),
	CONSTRAINT PRIMARY KEY (serial_no),
	CONSTRAINT FK_artistPoint FOREIGN KEY (artist_id) 
		REFERENCES artistTBL (artist_id),
	CONSTRAINT FK_mentoPoint FOREIGN KEY (mento_id)
		REFERENCES mentoTBL (mento_id)
);
DESC pointTBL;

INSERT INTO pointTBL (serial_no, artist_id, mento_id, point) 
VALUES 
	('P001', 'A001', 'J001', 84),
	('P002', 'A001', 'J002', 82),
	('P003', 'A001', 'J003', 86),
	('P004', 'A002', 'J001', 98),
	('P005', 'A002', 'J002', 99),
	('P006', 'A002', 'J003', 100),
	('P007', 'A003', 'J001', 23),
	('P008', 'A003', 'J002', 43),
	('P009', 'A003', 'J003', 34),
	('P010', 'A004', 'J001', 67),
	('P011', 'A004', 'J002', 56),
	('P012', 'A004', 'J003', 89),
	('P013', 'A005', 'J001', 3),
	('P014', 'A005', 'J002', 6),
	('P015', 'A005', 'J003', 9);

SELECT * FROM pointTBL;

-------------------------------
-- 쿼리생성
-------------------------------
--참가자목록조회 기본
SELECT 
	artist_id, artist_name, artist_birth, artist_gender, talent, agency 
FROM artistTBL
ORDER BY artist_id;

--참가자목록조회_ 날짜,case...end설정
SELECT 
	artist_id, 
	artist_name,  
	DATE_FORMAT(artist_birth, '%Y년 %m월 %d일') AS artist_birth,
	case
		when artist_gender='F' then '남성'
		when artist_gender='M' then '여성'
		ELSE '기타'
	end AS artist_gender,
	case
		when talent='1' then '보컬'
		when talent='2' then '댄스'
		when talent='3' then '랩'
		ELSE '기타'
	end AS talent,
	agency
FROM artistTBL
ORDER BY artist_id;
		
--멘토점수조회_ 날짜,case...end설정
SELECT  
	a.artist_id AS artist_id,
	a.artist_name AS artist_name, 
	DATE_FORMAT(a.artist_birth, '%Y년 %m월 %d일') AS artist_birth,
	p.point AS point, 
	CASE 
		when point > 89 then 'A'
		when point between 80 and 89 then 'B'
		when point between 70 and 79 then 'C'
		when point between 60 and 69 then 'D'
		when point BETWEEN 50 AND 69 then 'E'
		else 'F'
	END grade, 
	m.mento_name 
FROM pointTBL p
	LEFT OUTER JOIN artistTBL a ON p.artist_id = a.artist_id
	LEFT OUTER JOIN mentoTBL m ON p.mento_id = m.mento_id
ORDER BY serial_no;
		
--참가자등수조회_ sum(), avg(), rank()
SELECT 
	p.artist_id AS artist_id,
	a.artist_name AS artist_name,
	sum(p.point) AS sum_point,
	ROUND(AVG(p.point), 2) as avg_point,
	RANK() OVER(ORDER BY SUM(p.point) desc) AS rank
FROM pointTBL p
	LEFT OUTER JOIN artistTBL a ON p.artist_id = a.artist_id
GROUP BY 
	artist_id, artist_name
ORDER BY 
	AVG(p.point) DESC;