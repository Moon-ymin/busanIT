-- 내장함수 연습
-- scott DB를 사용하세요.
use scott;
-- 문제 1: EMP 테이블에서 모든 직원의 ENAME을 대문자로 변환하여 조회하세요.
select upper(ename) from emp;
-- 문제 2: EMP 테이블에서 모든 직원의 입사 연도(HIREDATE)만 추출하여 조회하세요.
select date(hiredate) from emp;
-- 문제 3: EMP 테이블에서 각 직원의 이름(ENAME)과 '1981-12-01'부터 각 직원의 입사일까지 몇 일이 지났는지 계산하여 조회하세요.
select ename, datediff('1981-12-01', hiredate) from emp; 
-- 문제 4: EMP 테이블에서 모든 직원의 이름(ENAME)에 "님"을 붙여서 조회하세요.
select concat(ename,'님') from emp;
-- 문제 5: EMP 테이블에서 가장 높은 SAL을 가진 직원의 SAL을 조회하세요. 
select max(sal) from emp;
-- 문제 6: EMP 테이블에서 직원의 이름과 COMM 이 null인 사람을 "커미션 없음"이라는 컬럼으로 나타내어 조회하세요. 
select ename, ifnull(comm, '커미션 없음') from emp;
select * from emp;