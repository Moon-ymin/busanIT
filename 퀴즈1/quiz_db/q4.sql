-- 문제4. 동적SQL문 사용하기
-- 동적SQL문을 사용하여 특정 직원의 급여 이력 조회
/*
- 직원의 ID(`emp_no`)를 입력받습니다.
- 해당 직원의 모든 급여 이력(급여 `salary`, 급여 시작 날짜 `from_date`, 급여 종료 날짜 `to_date`)을 조회합니다.
- 결과는 급여 시작 날짜(`from_date`) 기준으로 오름차순으로 정렬해야 합니다.

1. 동적으로 입력받을 값와 SQL문을 변수로 선언하세요.
2. PREPARE 문으로 동적 SQL문을 준비하세요.
3. EXECUTE 문을 매개변수를 바인딩하여 실행하세요.
4. 준비된 문장을 메모리 해제하세요. */

DELIMITER $$
create procedure GetEmployeeSalariesHist(in emp_id int)
begin
    set @emp_no = emp_id;
    set @sql = concat('select salary, from_date, to_date from salaries where emp_no = ? order by from_date asc');

    prepare stmt from @sql;
    execute stmt using @emp_no;
    deallocate prepare stmt;
END$$
DELIMITER ;

call GetEmployeeSalariesHist(10001);