CREATE TABLE indexTBL(
	first_name VARCHAR(14),
	last_name VARCHAR(16),
	hire_date date
	);

INSERT INTO indexTBL
	SELECT first_name, last_name, hire_date
	FROM employees.employees
	LIMIT 500;
SELECT * FROM indextbl;

SELECT * FROM indextbl WHERE first_name = 'Mary';

EXPLAIN SELECT * FROM indextbl WHERE first_name = 'Mary';

CREATE INDEX idx_indexTBL_firstname ON indextbl(first_name);
-- 인데스 확인 및 삭제
SHOW INDEXES FROM indextbl;
DROP INDEX idx_indexTBL_firstname ON indextbl;

CREATE VIEW uv_memberTBL AS SELECT memberName, memberAddress FROM membertbl;

SELECT * FROM uv_memberTBL;