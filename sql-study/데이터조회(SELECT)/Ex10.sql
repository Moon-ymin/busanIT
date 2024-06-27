-- 서브쿼리 문제
-- sakila 데이터베이스 사용
use sakila;
-- 문제1. 총 결제 금액이 $100을 초과하는 모든 고객의 이름과 성을 조회하세요.
-- 사용 테이블: customer (customer_id, first_name, last_name), payment (payment_id, customer_id, amount)
select first_name, last_name from customer where customer_id in 
(select customer_id from payment group by customer_id having sum(amount) > 100);
-- 문제2. 5개 이상의 영화를 대여한 모든 고객의 이름과 성을 조회하세요.
-- 사용 테이블: customer (customer_id, first_name, last_name), rental (rental_id, customer_id)
select first_name, last_name from customer where customer_id in 
(select customer_id from rental group by customer_id having count(*) >= 5);
-- 문제3. 5편 이상의 영화에 출연한 모든 배우의 이름과 성을 조회하세요.
-- 사용 테이블: actor (actor_id, first_name, last_name), film_actor (actor_id, film_id)
select first_name, last_name from actor where actor_id in  
(select actor_id from film_actor group by actor_id having count(actor_id) >= 5);
-- 문제4. 평균 영화 길이보다 긴 모든 영화의 제목을 조회하세요.
-- 사용 테이블: film (film_id, title, length)
select title from film where length > 
( select avg(length) from film );
-- 문제5. 평균 대여 비용보다 높은 대여 비용을 가진 모든 영화의 제목과 대여 비용을 조회하세요.
-- 사용 테이블: film (film_id, title, rental_rate)
select title, rental_rate from film where rental_rate > ( select avg(rental_rate) from film);
-- 문제6. 각 영화에 출연한 배우의 수와 함께 영화 제목을 조회하세요. (SELECT절 사용)
-- 사용 테이블: film (film_id, title), film_actor (actor_id, film_id)
select a.title, b.cnt as 출연배우수 from film a join (
select film_id, count(film_id) as cnt from film_actor group by film_id) b on a.film_id = b.film_id;
select f.title,
	   ( select count(fa.actor_id)
       from film_actor fa
       where fa.film_id = f.film_id ) as '배우의 수'
from film f;
-- 문제7. 단일 고객이 가장 많이 대여한 영화 수를 조회하세요. (FROM절 사용)
-- 사용 테이블: rental (rental_id, customer_id)
select customer_id, count(customer_id) 
from rental group by customer_id 
order by count(customer_id) desc limit 1;
SELECT 
    MAX(r_count)
FROM
    (SELECT 
        customer_id, COUNT(rental_id) AS r_count
    FROM
        rental
    GROUP BY customer_id) AS rent_count;