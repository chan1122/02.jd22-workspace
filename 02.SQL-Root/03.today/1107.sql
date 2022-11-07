-- select문 50개만들기

-- SELECT * FROM `테이블명` 
-- -> 전체 데이터 조회,전체 컬럼조회

-- 쿼리1 : 
SELECT * FROM `customers` ;

-- SELECT 컬럼명(들) FROM `테이블명` 
-- -> 전체 데이터 조회, 일부컬럼 조회 

-- 쿼리2 : `customers`테이블
SELECT `first_name`,`company`,`business_phone` FROM `customers`;



-- SELECT * FROM `테이블명` WHERE 컬럼명 = 값
-- -> 데이터 중 조건에 맞는 데이터 조회

-- 쿼리3 : `customers`테이블
SELECT `first_name`,`company`,`business_phone` FROM `customers` WHERE `first_name`="Daniel";
-- 쿼리4 : `customers`테이블
SELECT `first_name`,`company`,`business_phone` FROM `customers` WHERE `company`="Company K";

-- 참고) 선택시 컬럼명에 AS를 사용하고 뒤에 문자를 적으면
--     선택결과 출력시 해당 이름으로 결과가 출력된다!

-- 쿼리5 : `customers`테이블
SELECT `first_name`AS"이름",`company`AS"회사",`business_phone`AS"연락처" FROM `customers` WHERE `company`="Company K";
