-- 세션 2 : 쓰기 트랜잭션
-- 트랜잭션 고립 수준
use tcl;

-- 고립수준 변경하기
set transaction isolation level read committed;
start transaction;

UPDATE person set age = 50 where name = '홍길동';

rollback; 	-- 커밋하지 않은 내용 초기화

select * from person;

/* 2. READ COMMITTED, 반복 불가능 읽기 */
start transaction;

-- 1. 쓰기
UPDATE person set age = 50 where name = '홍길동';

-- 2. 커밋
COMMIT;

/* 3. REPEATABLE READ, 반복 가능 읽기 */
start transaction;
-- 1. 쓰기
UPDATE person 
	SET age = 50
	WHERE name = '홍길동';

-- 2. 커밋
COMMIT;


/* 4. SERIALIZABLE */
START TRANSACTION;

SELECT * FROM person;

-- 1. 쓰기 => 쓰기 불가
-- 해당 트랜잭션의 수정이 배타 LOCK 설정한 효과
UPDATE person 
	SET age = 70
	WHERE name = '홍길동';

COMMIT;