-- 테이블 스페이스

-- 시스템 변수에서 데이터 파일 확인
-- '파일명:파일크기:최대파일크기;
show variables like 'innodb_data_file_path';

-- "C:\ProgramData\MySQL\MySQL Server 8.0\Data"
-- 위치에서 해당파일 'ibdata1'을 확인할 수 있음

show variables like 'innodb_file_per_table';
-- 기본값 ON, 테이블마다 데이터와 인덱스를 위한 별도 파일 생성
-- OFF : 테이블들이 공통 테이블 스페이스를 공유

-- 테이블 스페이스 생성 (3개)
-- 확장명 ibd (innodb 엔진 데이터파일)
create tablespace ts_a add datafile 'ts_a.ibd';
create tablespace ts_b add datafile 'ts_b.ibd';
create tablespace ts_c add datafile 'ts_c.ibd';

use db_index;
create table table_a (
	id INT) tablespace ts_a;
    
-- 만들어진 테이블에 테이블 스페이스 지정
create table table_b (id INT);
alter table table_b tablespace ts_b;

-- 대용량 데이터 테이블 복사
create table table_c (select * from employees.salaries);
alter table table_c tablespace ts_c;

-- 쿼리 질의시간이 오래 걸려서 응답하지 않을 경우
-- [Edit] > [Preferences] - [SQL Editor]
-- [MySQL Session] 부분의 
-- 'timeout intverval'을 포함하는 2개의 항목을 0으로 설정하면
-- 시간제한을 없앨 수 있음 (주의)