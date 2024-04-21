-- 문제 2. 복합 컬럼 인덱스 생성
-- 1. 인덱스 생성 전 `employees` 테이블에 `first_name`과  `last_name`  컬럼을 조건으로 하는 쿼리문을 실행하세요.
select * from employees where first_name = 'Jane' and last_name = 'Smith';
-- 2. `EXPLAIN`과 Execution Plan을 사용하여 `first_name`과  `last_name`을 조건으로 하는 SELECT 쿼리의 실행 계획을 확인하세요.
explain select * from employees where first_name = 'Jane' and last_name = 'Smith';
-- 3. `employees` 테이블에 `first_name`과  `last_name` 컬럼에 대한 복합 인덱스를 생성하세요.
creat index idx_name on employees (first_name, last_name);
-- 4. 인덱스 생성 전후의 쿼리문의 실행 시간을 비교하세요.

-- 5.  `employees` 테이블의 모든 인덱스 정보를 조회하세요.
show index from employees;

