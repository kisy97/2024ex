CREATE TABLE student(
	student_id INT PRIMARY key NOT NULL,
	student_name VARCHAR(255) NOT null
);

CREATE TABLE jumsu(
	sid INT NOT NULL,
	html INT,
	db INT,
	java INT,
	PRIMARY KEY(sid)
);

INSERT INTO student (student_id, student_name)
VALUES
	(1,'Kim'), 
	(2,'Lee'), 
	(3,'Hwang'),
	(4,'Joo'),
	(5,'Kwang');
	
INSERT INTO jumsu(sid,html,db,java)
VALUES 
	(1,10,9,8),
	(2,5,10,5),
	(3,7,7,7),
	(4,6,8,3);
	
SELECT j.sid, j.html, j.db, j.java
FROM jumsu j
INNER JOIN student s ON s.student_id = j.sid
ORDER BY j.sid;

SELECT s.student_id, s.student_name , j.html, j.db, j.java
FROM student s
left JOIN jumsu j ON s.student_id = j.sid
ORDER BY s.student_id; 