#생성
create table myConst(
   class_id int auto_increment,
   class_name varchar(100) not null,
   begin_date date not null,
   end_date date not null,
   student_count int,
   constraint positive_student_count 
      check(student_count >0),
   constraint valid_date
      check(end_date >= begin_date),
   primary key(class_id)
);
# 수정
alter table myConst
add constraint valid_begin_date 
check(begin_date >= '2019-01-01');
# 삭제
alter table myConst
drop constraint valid_begin_date;