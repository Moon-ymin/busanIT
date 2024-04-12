-- 문제 3번
-- enrollment 스키마 생성
create schema if not exists Enrollment;
use Enrollment;

-- trainer 테이블
create table trainer (
	trainer_id int not null AUTO_INCREMENT,
    name varchar(45),
    specialty varchar(45),
    PRIMARY KEY (trainer_id)
);

-- class 테이블
create table class (
	class_id int not null AUTO_INCREMENT,
    class_name varchar(45),
    start_time time, 
    end_time time,
    trainer_id int,
    PRIMARY KEY (class_id),
    FOREIGN KEY (trainer_id) REFERENCES trainer(trainer_id)
);
-- member 테이블
create table member (
	member_id int not null AUTO_INCREMENT,
    name varchar(45),
    address varchar(45),
    phone varchar(45),
    class_id int,
    PRIMARY KEY (member_id),
    FOREIGN KEY (class_id) REFERENCES class(class_id)
);
select * from member;
select * from class;
select * from trainer;

-- 문제 4번
-- 데이터 삽입
insert into member (name, address, phone) values ('김지수', '서울시 강남구 역삼동', '010-1234-5678');
insert into member (name, address, phone) values ('이태민', '서울시 서초구 반포동', '010-8765-4321');
 
insert into trainer (name, specialty) values ('박서준','필라테스');
insert into trainer (name, specialty) values ('최유리','에어로빅');

insert into class (class_name, start_time, end_time, trainer_id) values ('오전 요가','09:00', '10:00', 1);
insert into class (class_name, start_time, end_time, trainer_id) values ('저녁 웨이트 트레이닝','20:00', '21:00', 2);

update member set class_id = 1 where member_id = 1; 
update member set class_id = 2 where member_id = 2; 

-- 문제 5번
select m.name, c.class_name
from member m join class c using (class_id);

select t.name, count(*) as classes
from trainer t join class c USING (trainer_id)
group by trainer_id
order by 2 desc;

select class_name, start_time, end_time
from class
where start_time <= '12:00'
order by 2 asc;

select m.name, c.class_name, c.start_time
from member m join class c USING (class_id)
order by c.start_time desc
limit 1;