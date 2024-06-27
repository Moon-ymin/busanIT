-- JOIN 연습문제
-- sakila 데이터베이스에서 조회하세요.
use sakila;
-- 문제 1: 고객(customer)의 이름과 그들이 대여(rental)한 영화(film)의 제목을 조회하세요.
select c.first_name, c.last_name, f.title
from customer c left join rental r USING (customer_id)
left join inventory i USING (inventory_id)
left join film f USING (film_id);
-- 문제 2: 각 영화(film)의 제목과 해당 영화가 속한 카테고리(category)의 이름을 조회하세요.
select f.title, c.name
from film f left join film_category fc USING (film_id)
left join category c USING (category_id);
-- 문제 3: 각 영화(film)에 대해 몇 명의 배우(actor)가 출연했는지, 영화 제목과 함께 조회하세요.
SELECT f.title, count(actor_id) as 출연배우수
from film f left join film_actor fa USING (film_id)
left join actor a USING (actor_id)
group by f.film_id;
-- 문제 4: 모든 대여(rental) 정보에 대해, 해당 대여가 이루어진 스토어(store)의 ID와 직원(staff)의 이름을 조회하세요.
select a.store_id, a.first_name, a.last_name
from staff a join store b USING (store_id)
join (
	select staff_id, count(staff_id) from rental
	group by staff_id
    ) c USING(staff_id);


-- 문제 5: 가장 많이 대여된 영화 5개의 제목과 대여 횟수를 조회하세요.
select f.title, a.counts
from film f join ( 
	select film_id, count(*) as counts
	from inventory join rental USING(inventory_id)
	group by film_id
	order by 2 desc
	limit 5) a on f.film_id = a.film_id;
    
-- 문제 6: 각 고객(customer)별로 그들이 지불한 총 금액(payment)을 조회하세요.
select c.customer_id, sum(amount) as total_payment
from customer c join payment p USING (customer_id)
group by c.customer_id;

-- 문제 7: 각 카테고리(category)별로 대여된 영화의 총 수를 조회하세요.
select f.category_id, c.name, count(*)
from rental r join inventory i USING (inventory_id)
left join film_category f USING (film_id)
left join category c USING (category_id)
group by f.category_id
order by 1;
-- 문제 8: 2005년 7월에 대여된 모든 영화의 제목과 대여 날짜를 조회하세요.
select f.title, r.rental_date
from rental r join inventory i USING (inventory_id)
left join film f USING (film_id)
where DATE_FORMAT(rental_date,'%Y-%m') = '2005-07';

-- 문제 9: 'Comedy' 카테고리에 속하는 영화들의 평균 대여 기간(rental_duration)을 조회하세요.
select avg(rental_duration) as 평균대여기간
from film f join film_category fc USING (film_id)
join category c USING(category_id)
where c.name = 'Comedy';

-- 문제 10: 모든 배우(actor)의 이름과 그들이 출연한 영화(film)의 수를 조회하세요. (LEFT JOIN 사용)
select a.first_name, a.last_name, count(*)
from film f left join film_actor fa USING (film_id)
left join actor a USING (actor_id)
group by a.actor_id
order by a.actor_id;