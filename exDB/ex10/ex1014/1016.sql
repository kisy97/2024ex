USE shopdb;

DELIMITER //
CREATE PROCEDURE myProc()
BEGIN
	SELECT * FROM membertbl WHERE memberName = '담탕이';
	SELECT * FROM producttbl WHERE productName = '냉장고';
END //

DELIMITER ;

CALL myProc();

INSERT INTO membertbl VALUES ('Figure','연아','경기도 군포시 당정동');

UPDATE membertbl SET memberAddress = '서울 강남구 역삼동' WHERE memberName='연아';

CREATE TABLE deleteMemberTBL(
	memberID CHAR(8) ,
	memberName CHAR(5) ,
	memberAddress CHAR(20),
	deleteDate DATE
	);
	
delimiter //
CREATE TRIGGER trg_deleteMemberTBL
	AFTER delete
	ON memberTBL
	FOR EACH row
BEGIN
	INSERT INTO deleteMemberTBL
	VALUES (OLD.memberID,OLD.memberName,OLD.memberAddress,CURDATE());
END //
delimiter ;

SELECT * FROM membertbl;

DELETE FROM membertbl WHERE memberName ='연아';

SELECT * FROM membertbl;
SELECT * FROM deleteMemberTBL;
