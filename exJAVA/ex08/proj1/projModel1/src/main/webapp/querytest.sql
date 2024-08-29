INSERT INTO board values (seq_board_num.nextval, '지금은 봄입니다', '봄의 왈츠', 'kk1', sysdate, 0);
INSERT INTO board values (seq_board_num.nextval, '지금은 여름입니다', '여름향기', 'kk1', sysdate, 0);
INSERT INTO board values (seq_board_num.nextval, '지금은 가을입니다', '가을동화', 'kk1', sysdate, 0);
INSERT INTO board values (seq_board_num.nextval, '지금은 겨울입니다', '겨울연가', 'kk1', sysdate, 0);

insert into board (num,title,content,id,visitcount) values (seq_board_num.NEXTVAL, '테스트용2','테스트용 입니다.','kk1',0);

select B.*, M.name from member M 
inner join board B on M.id=B.id
where num=2;

update board set 
visitcount=visitcount+1 
where num=1;

select * from board;

select id,pass, rownum from member;

select * from (
	select Tb.*, rownum rNum from (
		select * from board order by num DESC
	) Tb
)
where rNum between 1 and 10;