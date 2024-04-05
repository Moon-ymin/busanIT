-- 정렬, 제한, 고유값
-- world 데이터베이스 사용하세요.
use world;
-- 문제 1: Country 테이블에서 국가의 이름(Name)과 수도(Capital)를 조회하세요.
--  단, 이름 컬럼의 이름은은 '나라' 수도의 컬럼 이름을 '수도'로 표시하세요.
select name as '나라', capital as '수도' from country;

-- 문제 2: City 테이블에서 인구가 1백만 이상인 도시들을 인구 순서대로 내림차순으로 정렬하여 
-- 상위 10개 도시의 이름(Name)과 인구(Population)를 조회하세요.
select name, population from city where population >= 1000000 order by population desc limit 10;

-- 문제 3: Country 테이블에서 'Asia' 대륙에 속한 국가들을 GNP가 높은 순서대로 내림차순 정렬하여 상위 5개 국가의 이름(Name)과 GNP를 조회하세요.
select name, gnp from country where continent = 'Asia' order by gnp desc limit 5;

-- 문제 4: CountryLanguage 테이블에서 'English'를 공식 언어로 사용하는 국가의 국가 코드(CountryCode)를 조회하세요. 
-- 단, 공식 언어 여부는 'IsOfficial' 컬럼을 사용하세요.
select countryCode from countryLanguage where language = 'English' and isOfficial='T';

-- 문제 5: Country 테이블에서 인구가 5천만 이상 1억 미만인 국가들을 인구 순서대로 오름차순 정렬하여 
-- 국가의 이름(Name)과 인구(Population)를 조회하세요.
select name, population from country where population>= 50000000 and population < 100000000 order by population asc;

-- 문제 6: Country 테이블에서 생명 기대치(LifeExpectancy)가 80 이상인 국가들의 이름(Name)과 생명 기대치를 조회하세요. 
-- 결과를 생명 기대치가 낮은 순으로 오름차순 정렬하세요.
select name, lifeExpectancy from country where lifeExpectancy >= 80 order by lifeExpectancy asc; 

-- 문제 7: Country 테이블에서 정부 형태(GovernmentForm)가 'Republic'인 국가들을 국가 이름(Name)으로 알파벳 순으로 정렬하여 조회하세요.
select * from country where governmentForm = 'Republic' order by name;

-- 문제 8: Country 테이블에서 대륙(Continent)을 기준으로 고유한 대륙 이름을 조회하세요.
select distinct continent from country;
-- 문제 9: CountryLanguage 테이블에서 고유한 언어(Language) 목록을 조회하세요.
select distinct language from countryLanguage;
-- 문제 10: Country 테이블에서 대륙(Continent) 순으로 고유한 정부 형태(GovernmentForm)를 조회하세요.
select distinct governmentForm from country order by continent asc;