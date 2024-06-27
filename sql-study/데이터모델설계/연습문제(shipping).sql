CREATE SCHEMA IF NOT EXISTS nomarlization;
use nomarlization;

-- 선박 정보를 저장하는 테이블
-- 함수 종속관계 : shipname -> shiptype
create table ship(
	shipname varchar(255) primary key,
    shiptype varchar(255)
);

-- 항해 정보를 저장하는 테이블
-- 함수 종속관계 : voyageID -> shipname, cargo
create table voyage(
	voyageID int primary key,
    shipname varchar(255),
    cargo varchar(255),
    -- 공유 컬럼을 외래키로
    foreign key (shipname) references ship(shipname)
);

-- 항해 날짜와 항구 정보를 저장하는 테이블
-- 함수 종속관계 : {voyageID, date} -> port
create table voyageDetail (
	voyageID int,
    date date,
    port varchar(255),
    primary key (voyageID, date),
    foreign key (voyageID) references Voyage(voyageID)
);

describe ship;
describe voyage;
describe voyageDetail;

insert into ship values ('한라호', '화물선'), ('백두호', '여객선');
select * from ship;
insert into voyage values (101, '한라호', '화물컨테이너'), (102, '백두호', '고객화물');
select * from voyage;
insert  INTO VoyageDetail
 VALUES (101, '2024-04-15', '부산'), (102, '2024-04-16', '인천');
SELECT * FROM VoyageDetail;

-- 테이블 조인하여 보기
select v.voyageID, v.shipname, s.shiptype, v.cargo, vd.date, vd.port 
from voyage v
join voyagedetail vd on v.voyageId = vd.voyageID
join ship s on s.shipname = v.shipname;