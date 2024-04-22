create schema jdbc;
use jdbc;

-- 사용자 테이블
create table users (
	userId varchar(255) PRIMARY key,
	username varchar(255) not null,
    password varchar(255) not null,
    age int not null,
    email VARCHAR(255) not null
); 

-- 게시판 테이블
create table boards (
	boardNo int PRIMARY key AUTO_INCREMENT,
    title VARCHAR(255) not null,
    content LONGTEXT not null,
    writer VARCHAR(255) not null,
    date DATETIME DEFAULT NOW(),	-- 기본 제약조건 날짜
    filename varchar(255) null,		-- 파일 이름 (필수 아님)
    filedate LONGBLOB null			-- 파일이진데이터 (필수 아님)
);

-- 계좌 테이블 
CREATE TABLE accounts(
	accountNo VARCHAR(255) PRIMARY KEY,
    owner VARCHAR(255) NOT NULL,
    balance INT NOT NULL
);

INSERT INTO accounts VALUES ('111-111-1111', '홍길동', 1000000);
INSERT INTO accounts VALUES ('222-222-2222', '전우치', 0);