-- 데이터 삽입, 추가, 삭제 연습문제 
-- HealthCareManagement 스키마에서 진행해주세요.
use HealthCareManagement;

-- 문제 1: 'Patients' 테이블에 새로운 환자 추가하기
-- 이름: "John Smith", 생년월일: "1985-02-20", 성별: "M", 전화번호: "123-456-7890"
insert into patients (name, dob, gender, phone) 
VALUEs ('John Smith', '1985-02-20', 'Male', '123-456-7890');

-- 문제 2: 'Appointments' 테이블에 새로운 예약 추가하기
-- 환자 ID: 1, 예약 날짜: "2023-04-20", 예약 시간: "10:00", 진료 유형: "General Checkup"
alter table appointments add column diagnosis varchar(50);
insert into appointments (patientID, appointmentDate, appointmentTime, diagnosis)
values (1, '2023-04-20', '10:00', 'General Checkup');

-- 문제 3: 'MedicalRecords' 테이블에 새로운 의료 기록 추가하기
-- 환자 ID: 1, 방문 날짜: "2023-04-10", 진단: "Common Cold", 처방: "Rest and hydration"
create table medicalRecords (
	patientID int,
    date DATE,
    diagnosis varchar(50),
    prescription varchar(100)
);
insert into medicalRecords values (1, '2023-04-10', 'Common Cold', 'Rest and hydration');

-- 문제 4: 'Patients' 테이블에서 환자의 전화번호 업데이트하기
-- 환자 ID가 1인 환자의 전화번호를 "987-654-3210"으로 변경하기
update patients set phone = '987-654-3210' where patientId = 1;

-- 문제 5: 'Appointments' 테이블에서 예약 시간 변경하기
-- 환자 ID가 1이고 예약 날짜가 "2023-04-20"인 예약의 시간을 "14:00"으로 변경하기
SELECT * from Appointments;
update appointments set appointmentTime = '14:00' where appointmentDate = '2023-04-20';

-- 문제 6: 'MedicalRecords' 테이블에서 진단 정보 업데이트하기
-- 환자 ID가 1이고 방문 날짜가 "2023-04-10"인 기록의 진단을 "Seasonal Allergies"로 변경하기
update medicalRecords set diagnosis = 'Seasonal Allergies' where date = '2023-04-10' and patientId = 1;

-- 문제 7: 'Patients' 테이블에서 특정 환자 삭제하기
-- 환자 ID가 1인 환자 삭제하기
delete from appointments where patientId = 1;
delete from patients where patientId = 1;

-- 문제 8: 'Appointments' 테이블에서 특정 날짜의 모든 예약 삭제하기
-- 예약 날짜가 "2023-04-20"인 모든 예약 삭제하기
delete from appointments where appointmentDate = '2023-04-02' ;

-- 문제 9: 'MedicalRecords' 테이블에서 특정 진단을 가진 모든 기록 삭제하기
-- 진단이 "Seasonal Allergies"인 모든 의료 기록 삭제하기
DELETE from medicalRecords where diagnosis = 'Seasonal Allergies';

-- 문제 10: 'Patients' 테이블에 여러 환자 동시에 추가하기
-- 환자 정보: ("Alice Johnson", "1992-08-24", "F", "555-1234"), ("Bob Williams", "1980-03-15", "M", "555-5678")
select * from patients;
insert into patients (name, dob, gender, phone) values
('Alice Johnson', '1992-08-24', 'Female', '555-1234'), 
('Bob Williams', '1980-03-15', 'Male', '555-5678');