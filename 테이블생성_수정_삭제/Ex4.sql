use libraryManagement;

/* 	문제 1: `Books` 테이블에 `ISBN` 열 추가하기
	`Books` 테이블에 국제 표준 도서 번호(`ISBN`)를 저장할 수 있는 열을 추가하세요. `ISBN`은 문자열이며, 고유해야 합니다. */
Alter TABLE books ADD COLUMN ISBN varchar(50) UNIQUE;

/* 문제 2: `Members` 테이블의 `Email` 열 고유 제약조건 삭제하기
- `Members` 테이블에서 `Email` 열의 고유 제약조건을 삭제하세요.*/
-- PRIMARY KEY, UNIQUE 제약 조건은 INDEX에 해당된다
ALTER TABLE members drop index email; 

/* 문제 3: `BorrowRecords` 테이블에 `Status` 열 추가하기
- `BorrowRecords` 테이블에 대출 상태를 나타내는 `Status` 열을 추가하세요. 가능한 값은 'Borrowed', 'Returned'입니다.*/
Alter TABLE BorrowRecords ADD COLUMN status enum('Borrowed', 'Returned');

/* 문제 4: `Books` 테이블의 `PublishedYear` 열의 CHECK 제약조건 변경하기
- `Books` 테이블에 `PublishedYear`이 1900 이상이 되도록 기존의 CHECK 제약조건을 변경하세요. 
(MySQL에서는 기존의 CHECK 제약조건을 직접 수정할 수 없으므로, 제약조건을 삭제한 후 새로 추가해야 합니다.)*/
show create table books; -- 제약 조건 이름 확인하기 'chk_py'
alter table books drop constraint chk_py;
alter table books add CONSTRAINT chk_py check (publishedYear >= 1900);

/* 문제 5: `Members` 테이블에서 `MembershipDate` 열의 기본값 변경하기
- `Members` 테이블의 `MembershipDate` 열에 대한 기본값을 현재 날짜에서 '2020-01-01'로 변경하세요.*/
alter table members alter column membershipdate set DEFAULT '2020-01-01';

/* 문제 6: `BorrowRecords` 테이블의 외래 키 제약조건의 레퍼런스 옵션 변경하기
- `BorrowRecords` 테이블의 `MemberID` 외래 키 제약조건에 대한 레퍼런스 옵션을 
`ON DELETE NO ACTION`로 변경하세요. 이를 위해서는 먼저 제약조건을 삭제하고, 새로운 옵션으로 다시 추가해야 합니다.*/
-- 1. 제약조건의 이름 확인
show create table borrowRecords; -- 제약 조건 이름 확인 'borrowrecords_ibfk_1'
select * from information_schema.table_constraints where table_name = 'borrowrecords'; -- 제약 조건 이름 확인하는 다른 방법
-- 2. 제약조건 삭제
alter table borrowRecords DROP CONSTRAINT borrowrecords_ibfk_1;
-- 3. 제약조건 추가 
alter table borrowRecords add constraint fk_memberID FOREIGN KEY (memberID) REFERENCES members(memberID)
	ON DELETE NO ACTION;