-- 데이터 선택하여 활용 
select * from producttbl;
select productName, cost from producttbl;

-- 테이블의 생성과 삭제
create table `my test_tbl` (id int); 
drop table `my test_tbl`;

-- 인덱스 생성 (데이터 삽입 및 비교)
create table index_tbl (
	first_name varchar(14),
    last_name varchar(14),
    hired_date date
    );
    
insert into index_tbl
	select first_name, last_name, hire_date 
    from employees.employees
    limit 500;
    
select * from index_tbl;

select * from index_tbl 
where first_name = 'Mary';

create index idx_index_tbl_firstName 
on index_tbl(first_name);

-- 사용자 뷰 만들기
create view uv_member_tbl 
as select memberName, memberAddress from membertbl;

select * from uv_member_tbl;

-- 테이블 데이터 삭제 및 복구
delete from producttbl;
select * from producttbl;



