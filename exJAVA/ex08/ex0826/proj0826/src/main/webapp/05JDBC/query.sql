create table member(
	id varchar2(10) not null,
	pass varchar2(10) not null,
	name varchar2(30) not null,
	regidate date default sysdate not null,
	primary key(id)
);
-- 멤버 테이블 확인
select * from member;
-- 멤버테이플 삭제
drop table MEMBER;
--테이블 생성
create table board(
	num number primary key,
	title varchar2(200) not null,
	content varchar2(2000) not null,
	id varchar2(10) not null,
	postdate date default sysdate not null,
	visitcount number(6)
);
--보드 테이블 업데이트(외래키설정)
alter table board
	add constraint board_mem_fk foreign key (id)
	references member (id);
	
create sequence seq_board_num
	increment by 1
	start with 1
	minvalue 1
	nomaxvalue
	nocycle
	nocache;
--user권한 없음
insert into member (id,pass,name) values ('kk1','1234','케이케이원');
insert into BOARD (num,title,content, id, postdate, visitcount)
	values (seq_board_num.nextval, '제목1입니다.', '내용1입니다.','kk1',sysdate,0);
	
select * from MEMBER
