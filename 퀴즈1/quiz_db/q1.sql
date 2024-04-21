/* 문제 1.  단일 컬럼 인덱스 생성
   `employees` 테이블에 `last_name` 컬럼에 대한 인덱스를 생성하고,
   인덱스의 효과를 확인합니다. */
   select * from employees;
-- 1. 인덱스 생성 전 `employees` 테이블에  `last_name` 컬럼을 조건으로 하는 쿼리문을 실행하세요.
select * from employees where last_name = 'Facello';
-- 2. `EXPLAIN`과 Execution Plan을 사용하여 `last_name`을 조건으로 하는 SELECT 쿼리의 실행 계획을 확인하세요.
explain select * from employees where last_name = 'Georgi';
-- 3. `employees` 테이블에 `last_name` 컬럼에 대한 인덱스를 생성하세요.
create index idx_last_name on employees (last_name);
-- 4. 인덱스 생성 전후의 쿼리문의 실행 시간을 비교하세요.
-- 생성 전 : 30156.85
-- 생성 후 : 65.10
-- 5.  `employees` 테이블의 모든 인덱스 정보를 조회하세요
show index from employees;
