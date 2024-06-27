-- JOIN
-- employees 데이터베이스에서 연습해보세요.
use employees;
-- employees(first_name, last_name, emp_no), titles(emp_no, title, to_date)
-- dept_emp(dept_no, emp_no, to_date), salaries(emp_no, salary, to_date)
-- departments(dept_no, dept_name)

-- 문제 1: 직원의 이름(first_name, last_name)과 직원의 현재 직책(title)을 조회하세요.
select first_name, last_name, title
from employees e join titles t on e.emp_no = t.emp_no
where year(to_date) = '9999';
-- 문제 2: 각 부서의 이름(dept_name)과 그 부서에 현재 속해있는 직원 수를 조회하세요.
select dept_name, count(*) as 부서직원수
from departments d join dept_emp e on d.dept_no = e.dept_no
where year(to_date) = '9999'
group by d.dept_no;
-- 문제 3: 현재 직원 중 급여가 80000 이상인 직원의 이름(first_name, last_name)과 급여(salary)를 조회하세요.
select first_name, last_name, salary
from employees e join salaries s on e.emp_no = s.emp_no
where salary >= 80000 and year(to_date) = '9999';
-- 문제 4: 'Marketing' 부서에 현재 속해있는 직원의 이름(first_name, last_name)과 부서 이름(dept_name)을 조회하세요.
select first_name, last_name, dept_name from employees e 
join dept_emp de on e.emp_no = de.emp_no
join departments d on de.dept_no = d.dept_no
where dept_name = 'Marketing' and year(to_date) = '9999';
-- 문제 5: 각 직원의 이름과 해당 직원이 현재 속한 부서 이름을 조회하세요. (LEFT JOIN 사용)
select first_name, last_name, dept_name from employees
left join dept_emp USING (emp_no)
left join departments USING (dept_no)
where year(to_date) = '9999';