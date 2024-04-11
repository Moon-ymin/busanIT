-- 뷰 연습문제
-- sakila DB를 사용하세요.
use sakila;
-- 문제 1: 'view_actor_info' 뷰를 생성하세요. 이 뷰는 actor 테이블에서 actor_id, first_name, last_name을 포함해야 합니다.
create view view_actor_info as
	select actor_id, first_name, last_name from actor;
-- 문제 2: 'view_actor_info' 뷰를 조회하여 모든 배우의 정보를 확인하세요.
select * from view_actor_info;
-- 문제 3: 'view_film_list' 뷰를 생성하세요. 
-- 이 뷰는 film 테이블에서 film_id, title, description, release_year를 포함하고, release_year가 2006년인 영화만 포함해야 합니다.
create view view_film_list as
	select film_id, title, description, release_year from film where release_year = 2006;
-- 문제 4: 'view_customer_rental_info' 뷰를 생성하세요. 
-- 이 뷰는 customer 테이블과 rental 테이블을 조인하여 고객의 ID, 이름(first_name, last_name), 그리고 그들이 대여한 영화의 총 수를 포함해야 합니다.
create view view_customer_rental_info as 
	select c.customer_id, c.first_name, c.last_name, count(rental_id) 
    from customer c join rental r using(customer_id)
    group by c.customer_id;
-- 문제 5: 'view_category_film_count' 뷰를 생성하세요.
-- 이 뷰는 film_category와 category 테이블을 조인하여 각 카테고리의 이름과 해당 카테고리에 속한 영화의 수를 포함해야 합니다.
create view view_category_film_count as
	select c.name, count(category_id)
    from film_category f join category c USING (category_id)
    group by category_id;

-- 문제 6: 생성한 모든 뷰를 확인하세요.
SHOW FULL TABLES IN sakila
WHERE TABLE_TYPE LIKE 'VIEW';
-- 문제 7 : 생성한 모든 뷰를 삭제하세요.
Drop 