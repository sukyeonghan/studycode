--워크시트에서 명령어를 실행하려면 ctrl+enter로 실행. 예약어(파란색) 대문자로 많이 씀
select * from DBA_USERS; 

--이건 주석표시
--불라불라 -자바랑 단축키 같음
--기본적으로 DB에 접속을 하려면 DBA(system/sys as dba)계정으로부터 계정을 생성해야지 접근이 가능함.
--생성한 다음 그 계정에 대한 권한이 있어야 DB를 이용할 수 있음

--계정 생성하기
--계정 생성 명령어 : CREATE USER 계정명 IDENTIFIED BY 비밀번호
--계정명은 대소문자 구분을 하지 않음. 하지만 비밀번호는 대소문자 구분을 한다!
CREATE USER KH IDENTIFIED BY kh;
--계정을 생성하고 DB를 이용하게 하려면 반드시 권한까지 부여를 해줘야한다
--GRANT 권한명,ROLE명 TO 계정명;
GRANT CONNECT, RESOURCE TO KH; --명령어 소문자로 써도 됨
SELECT * FROM TAB; --계정이 가지고 있는 저장공간(테이블) 조회하는 명령어
--KH로 바꾸고 실행하면 아무것도 안뜸. 저장소를 만든 게 없으니까

--TEST/TEST계정을 만들고 접속해서 SELECT * FROM TAB;명령어 실행하기
--관리자 계정에서 생성해야함. KH계정에서 만드니까 안됨..
CREATE USER TEST IDENTIFIED BY test;
GRANT RESOURCE, CONNECT TO TEST;

CREATE USER WORK IDENTIFIED BY work;
GRANT RESOURCE, CONNECT TO WORK;

--기본 Database 설치 완료!!
--기본으로 설정한 실습용 DB내용 보기!
--계정에 있는 테이블들 보기 F5
SELECT * FROM TAB; --Tab-table(저장소.데이터들이 저장되는 공간)을 말함

--기본 설치 디비 EMLPOYEE,DEPARTMENT,JOB,LOCATION,NATIONAL,SAL_GRADE저장소(TABLE)이 있음
--EMPLOYEE 테이블 데이터 조회해보기
SELECT * FROM EMPLOYEE;
--DEPARTMENT 테이블 데이터 보기
SELECT * FROM DEPARTMENT;
--JOB테이블 데이버 보기
SELECT * FROM JOB;
--테이블의 열이 하나의 변수명. 컬럼에 데이터들을 여러 개 저장할 수 있음. 배열이나 리스트와 비슷한 존재
--테이블에 있는 컬럼확인하기
--DESC 테이블명;
DESC EMPLOYEE;


--관리자 계정에 대헤 알아보고 가자 -> DB엔지니어가 하는 일!
--SYSTEM / SYS AS SYSDBA
--SYS : 슈퍼관리자계정 모든걸 다 할 수 있는 계정. DB에 모든것을 컨트롤 할 수 있는 권한이 있음
--SYSTEM  : 일반 관리자 계정. 데이터베이스를 삭제,생성할 권한이 없음! 사용자를 관리할 수 있는 권한이 있음

--SELECT문 활용하기
--TABLE에 저장되어 있는 데이터를 조회하는 명령어
--SELECT 컬럼명,컬럼명,.... FROM 테이블명 [WHERE 조건식];-생략가능
SELECT EMP_ID, EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE;

--TEST계정에 SCOTT_EN 데이터 설치하고
--TEST계정으로 접속해서 설치된 테이블을 조회하고
--그 테이블 중 3개의 테이블의 내용을 컬럼도 세 개만 선택해서 조회하기

-- 테스트에 저장된 table을 조회.객체여서 타입이 있음
SELECT * FROM TAB;  --테이블명을 보는 거!!
--tale의 컬럼명 확인하기
DESC BONUS;

SELECT ENAME,JOB,SAL
FROM BONUS;

SELECT * FROM TAB;

DESC DEPT;  
--컬럼에 대한 정보

SELECT DEPTNO,DNAME,LOC
FROM DEPT;

SELECT * FROM TAB;

DESC  EMP;

SELECT EMPNO,ENAME,JOB
FROM EMP;

--SELECT문에 대해 알아보자
--SELECT문 작성법-명령어 먼저 시작
--SELECT 컬럼명,컬럼명,컬럼명...
--FROM 테이블명 ->기본SELECT문. 데이터를 조회하는 구문
SELECT * FROM TAB;

--EMLOYEE를 조회하기위해 컬럼을 조회해보자
DESC EMPLOYEE;

SELECT EMP_NAME,PHONE,SALARY
FROM EMPLOYEE;

--DEPARTMENT테이블에 있는 컬럼 모두 조회하기
DESC DEPARTMENT;

SELECT DEPT_ID,DEPT_TITLE,LOCATION_ID
FROM DEPARTMENT;

--테이블에 있는 전체 컬럼을 조회하려면 * 사용하면 됨
--EMPLOYEE테이블의 전체컬럼을 조회해보자
SELECT *
FROM EMPLOYEE;

--SELECT 에서 산술연산하기(+,-,/,*)
SELECT 10+20 FROM DUAL; --오라클이 제공하는 테스트용 기본 테이블
SELECT EMP_NAME,SALARY,20+30 FROM EMPLOYEE; --연산처리결과가 EMPLOYEE 행의 수만큼 들어감

--산술연산처리는 리터럴값만 되는 것이 아니라 숫자형컬럼도 가능함
SELECT SALARY+100000 FROM EMPLOYEE;
SELECT EMP_NAME,DEPT_CODE,SALARY,SALARY+100000 --원래있는 데이터와 비교하기 위해. 원본값은 변하지 않음. RESULTSET으로 결과 그 자체.
FROM EMPLOYEE;

--컬럼끼리도 서로 산술연산이 가능함
SELECT EMP_NAME,BONUS,SALARY*BONUS --NULL뜨는 거 보너스가 NULL. 쓰레기값
FROM EMPLOYEE;

--각 사원의 연봉을 구해보자
--사원명,부서코드,직책코드,월급
--보너스를 포함한 연봉으로 바꿔보기
SELECT EMP_NAME,DEPT_CODE,JOB_CODE,SALARY,(SALARY+(BONUS*SALARY))*12
FROM EMPLOYEE;
--NULL처리 함수 -> NVL(컬럼,컬럼값이 NULL일 때 대체할 값)
SELECT EMP_NAME,DEPT_CODE,JOB_CODE,SALARY,BONUS,(SALARY+(NVL(BONUS,0)*SALARY))*12
FROM EMPLOYEE;

--문자타입의 컬럼에 +를 할 수 없다
--SELECT EMP_NAME+EMAIL FROM EMPLOYEE; 산술연산은 무조건 숫자만 됨!

--RESULTSET의 컬럼에 별칭을 부여할 수 있음
--1. AS예약어를 사용하여 별칭부여
--2. 띄어쓰기로 구분하여 별칭부여
SELECT EMP_NAME,SALARY FROM EMPLOYEE;
--별칭부여하기
SELECT EMP_NAME AS 사원명, SALARY AS 월급 FROM EMPLOYEE;
SELECT EMP_NAME 사원명, SALARY 월급 FROM EMPLOYEE;
SELECT EMP_NAME,SALARY,SALARY*12 AS YEARSALARY FROM EMPLOYEE;
--별칭에 특수기호는 사용이 가능한가?? 별칭은 ""로 사용가능. 문자열은""로 안씀
SELECT EMP_NAME,SALARY "월급 많이" FROM EMPLOYEE; 
SELECT EMP_NAME,SALARY 월급$많이 FROM EMPLOYEE; 
SELECT EMP_NAME,SALARY "월급^.~많이" FROM EMPLOYEE; 
--SELECT문을 이용해서 RESULTSET 리터럴값을 넣을 수 있음.  문자리터럴은 '' 사용. ''빼면 컬럼명으로 봄
SELECT EMP_NAME,SALARY, '원' FROM EMPLOYEE;
SELECT EMP_NAME, SALARY, '원', 20 FROM EMPLOYEE;

--컬럼(리터럴)을 연결하는 연결연산자 활용하기 -->||
SELECT EMP_NAME||SALARY||'원' FROM EMPLOYEE; --컬럼이 하나로 연결되서 나옴

--SELECT의 RESULTSET에서 중복값을 제거하는 예약어
--DISTINCT
--SELECT DISTINCT컬럼명 FROM 테이블
SELECT DEPT_CODE FROM EMPLOYEE;
SELECT DISTINCT DEPT_CODE FROM EMPLOYEE; --NULL도 하나의 값으로 본다
--DISTINCT예약어를 사용하면 다른 컬럼과 사용이 불가능
--SELECT EMP_NAME, DISTINCT DEPT_CODE FROM EMPLOYEE;
SELECT DISTINCT DEPT_CODE,JOB_CODE FROM EMPLOYEE; 
--여러 개 사용 가능.DISTINCT먼저 쓰기. 13개가 나옴. 둘을 그룹으로 묶어서 나옴-두 개를 합쳐서 중복비교
SELECT DISTINCT DEPT_CODE,EMP_NAME FROM EMPLOYEE; --이름은 중복값이 없어서 이렇게 쓰면 의미없음
--SELECT DISTINCT DEPT_CODE, DISTINCT JOB_CODE FROM EMPLOYEE; --DISTINCT 2개도 못 씀

--테이블의 DATA를 FILTERING해보자 -> 원하는 ROW만 가져올 수 있게 설정해보자
--조건식 DATA 분할해보자
--WHERE절을 사용하면 가능함
--SELECT 컬럼명,컬럼명,…..FROM 테이블명 WHERE 조건식(비교연산자) TRUE/FALSE
--EMPLOYEE 테이블에서 사원명 선동일 조회해보자
SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_NAME='선동일'; 
SELECT EMP_NAME FROM EMPLOYEE;

--EMPLOYEE테이블에서 DEPT_CODE가 D5인 사원의 모든 정보를 출력하세요
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE='D5';--d5로 하면 안됨. 데이터는 대소문자 구분함

--EMPLOYEE테이블에서 월급이 300만원 이상인 사원을 조회하세요!
--사원명,부서코드,월급,입사일
SELECT EMP_NAME, DEPT_CODE,SALARY, HIRE_DATE 
FROM EMPLOYEE
WHERE SALARY>=3000000;

--EMPLOYEE테이블에서 부서가 ‘D5’가 아닌 사원을 조회하세요
SELECT *
FROM EMPLOYEE
--WHERE DEPT_CODE != 'D5';
--WHERE DEPT_CODE <> 'D5';
--WHERE DEPT_CODE ^= 'D5';
WHERE NOT DEPT_CODE='D5';

--논리연산 : AND,OR
--월급이 300만원 이상이고 부서가 D5인 사원의 이름,사원명,부서코드,월급 조회하기
SELECT EMP_NAME,DEPT_CODE,SALARY
FROM EMPLOYEE
WHERE SALARY>=3000000 AND DEPT_CODE = ‘D5’;
--월급이 200만원 이상이고 500만원 이하인 사원의 사원명, 부서코드,직책코드,월급을 조회하기
SELECT EMP_NAME, DEPT_CODE,JOB_CODE,SALARY
FROM EMPLOYEE
WHERE SALARY>=2000000 AND SALARY<=5000000;
--대소비교는 DATE 가능한가요?
--입사일이 2000/01/01 이후 입사한 사원의 이름,부서,직책,입사일 출력하기
SELECT EMP_NAME, DEPT_CODE, JOB_CODE,HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE>='00/01/01'; --'년 월 일'은 안됨(00-00-00,000101,00 01 01,0000 01 01 등 된다)
--년월일 형식으로 사용한 문자열은 자동으로 DATE형으로 변경해줌
--WHERE HIRE-DATE>=TO DATE('200000101','YYYYMMDD');--원래는 이렇게 형변환을 해서 비교해야함

--BETWEEN AND 연산자를 이용해 쉽게 범위를 나타낼 수 있음
--월급이 300만원 이상 500만원 이하인 사원 구하기
SELECT *
FROM EMPLOYEE
WHERE SALARY BETWEEN 3000000 AND 5000000;

--EMPLOYEE테이블에서 입사일이 90/01/01부터 01/01/01까지 사원의 이름,급여,입사일 조회
SELECT EMP_NAME,SALARY,HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE NOT BETWEEN '90/01/01' AND '01/01/01';

-- LIKE : 문자패턴으로 동일한 값을 찾을 때 사용하는 연산자
-- 와일드카드 : %,_
-- % : 0개 이상의 문자를 의미->'%현' 현,조현,ㅇㅎㅇㅎㄹ현...->현으로 끝나는 모든 문자를 찾음
-- %현% : 현을 포함하고 있는 문자열
-- _ : 문자 한 개 -> '_현' -> 현으로 끝나는 두 글자 / '김_'->김으로 시작
-- 두 개를 같이 사용 가능함
-- EMPLOYEE테이블에서 하씨 성을 가진 사원을 검색하기
SELECT EMP_NAME 
FROM EMPLOYEE
WHERE EMP_NAME LIKE '하%';
--이름의 중간글자가 중인 사원을 검색하기
SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_NAME LIKE '_중_';
--WHERE EMP_NAME LIKE '_중_'; 문자열에 중을 포함하는 의미여서 중하하하하 도 가능. 엄밀히 말하면 _중_로 써야함

--EMAIL @앞에 문자가 5글자인 사원의 이름,이메일 조회하기
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '_____@%';
--EMAIL _앞에 문자가 4글자인 사원의 사원명, 이메일주소 조회
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE'____#_%'ESCAPE'#'; -- _앞에 특수기호+ESCAPE 해석하지말라고 빼는 거

--전화번호가 010으로 시작하지 않는 사원구하기
SELECT *
FROM EMPLOYEE
WHERE PHONE NOT LIKE '010%';

--메일주소가 _앞이 4자리이면서 DEPT_CODE가 D9 D6이고
--고용일이 90/01/01~00/12/01이면서 월급이 270만원 이상인 사원의 전체정보 출력하기
SELECT *
FROM EMPLOYEE
--WHERE EMAIL LIKE'____^_%'ESCAPE'^' AND
-- (DEPT_CODE='D9' OR DEPT_CODE='D6') AND   --OR나오면 우선순위 잘 보기!
WHERE EMAIL LIKE '____^_%'ESCAPE'^' AND DEPT_CODE IN('D9','D6') AND --IN으로 바꿔서 가능
 HIRE_DATE BETWEEN '90/01/01' AND '00/12/01' AND SALARY >=2700000 ;

--NULL값을 비교하기
--NULL 아무 의미없는 값
--연산처리가 안됨!
SELECT EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
--WHERE BONUS='(null)'; 안됨
--IS NULL/IS NOY NULL
--WHERE BONUS IS NULL;
WHERE BONUS IS NOT NULL;

--부서가 없는 사원의 사원명, 부서코드,월급 조회
SELECT EMP_NAME, NVL(DEPT_CODE,'인턴'), SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL;

--보너스가 없으면서 월급이 300만원 이상인 사원의 사원아이디,사원명,월급,보너스 구하기
SELECT EMP_ID,EMP_NAME,SALARY,BONUS
FROM EMPLOYEE
WHERE SALARY >=3000000 AND BONUS IS NULL;

--다수값 동등비교하기
--IN/NOT IN
--컬럼명 IN(비교값, 비교값2, 비교값3,비교값4...)
--부서코드가 D6이거나 D5,D9인 사원 모두 조회
SELECT *
FROM EMPLOYEE
--WHERE DEPT_CODE='D6' OR DEPT_CODE='D5' OR DEPT_CODE='D9';
WHERE DEPT_CODE IN('D6','D5','D9');

--직책이 J1,J2가 아닌 사원을 모두 조회하세요
SELECT *
FROM EMPLOYEE
WHERE JOB_CODE NOT IN('J1','J2');

SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN(SELECT DISTINCT DEPT_CODE FROM EMPLOYEE WHERE SALARY >= 3000000);
--IN은 이런식으로 많이 씀. 서브쿼리
--WHERE절 끝

--데이터 정렬 -> FOR문,COLLECTIONS.SORT..안해도 됨
--오라클에서 데이터 정렬하기
--ORDER BY 컬럼명 [정렬옵션(ASC||DESC)NULL설정옵션]
--SELECT컬럼명..컬럼명...FROM 테이블 [WHERE 조건식] [ORDER BY 컬럼명]
SELECT * FROM EMPLOYEE;
--이름 순으로 정렬하기
SELECT EMP_NAME, SALARY, DEPT_CODE, JOB_CODE
FROM EMPLOYEE
--ORDER BY EMP_NAME;--DEFAULT 가 오름차순(ASC)
ORDER BY EMP_NAME DESC; --내림차순

--NULL 값의 정렬은?
SELECT DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
--ORDER BY BONUS DESC; --NULL이 위로 올라옴
ORDER BY BONUS DESC NULLS LAST; --내림차순인데 NULL이 밑으로 감

--ORDER BY절에서는 별칭을 사용할 수 있음
SELECT EMP_NAME 사원
FROM EMPLOYEE
--WHERE 사원='김해술'; --안됨
ORDER BY 사원;--됨

--RESULTSET의 컬럼에는 특정 인덱스값이 1번부터 부여
SELECT * FROM EMPLOYEE;

SELECT EMP_NAME,SALARY*12
FROM EMPLOYEE
--ORDER BY SALARY*12 DESC;
ORDER BY 2 DESC;


--쿼리문을 더 잘 활용할 수 있게 하는 함수에 대해 배워보자
--문자 처리 함수
--1.LENGTH : 주어진 컬럼 또는 문자열의 길이를 반환해주는 함수-단일행함수여서 각각 따로 나옴
SELECT EMP_NAME, LENGTH(EMP_NAME),EMAIL, LENGTH(EMAIL) FROM EMPLOYEE;
SELECT LENGTH('오늘은 비가 많이 온다. 사람들이...') FROM DUAL; --테스트용 테이블
--2.LENGTHB : 문자의 바이트 크기를 반환
SELECT EMP_NAME, LENGTHB(EMP_NAME) FROM EMPLOYEE;
--EXPRESS버전에서는 한글 한 글자당 3바이트/ENTER버전에서는 2바이트
--3.INSTR : 찾는 문자열||컬럼이 지정한 위치부터 지정한 횟수번째에 나타난 문자의 위치값을 반환(자바 INDEXOF)
--사용법 INSTR(대상문자열(컬럼||문자열),찾을 문자[, POSITION(시작위치),OCCURENCE(횟수)])
--문자의 위치값을 반환하는데 오라클에서 문자열 시작인덱스가 1이다!
SELECT INSTR('KH정보교육원 국가정보원 정보문화사','정보') FROM DUAL;
SELECT INSTR('KH정보교육원 국가정보원 정보문화사','정보',4) FROM DUAL;
SELECT INSTR('KH정보교육원 국가정보원 정보문화사','정보',4,2) FROM DUAL;
SELECT INSTR('KH정보교육원 국가정보원 정보문화사','정보',-1) FROM DUAL; --뒤에서부터 찾음
SELECT INSTR('KH정보교육원 국가정보원 정보문화사','정보',-6,2) FROM DUAL;

--EMPLOYEE에 EMAIL컬럼에서 @의 위치를 찾아 출력하기
SELECT EMAIL,INSTR(EMAIL,'@') FROM EMPLOYEE;

--4. LPAD/RPAD : 문자열의 특정 길이만큼 저장공간을 확보하고 길이가 다 채워지지 않은 공간에 지정한 문자를 넣는 함수
--LPAD(문자||컬럼,길이(바이트수)[, 지정문자])--함수에서 문자열 처리할 때 한글 2바이트, 영문,공백,숫자,특수기호는 1바이트 
SELECT LPAD('밖에 비온다 주륵주륵',23,'$') FROM DUAL; --왼쪽
SELECT LPAD('밖에 비온다 주륵주륵',50,'|') FROM DUAL;
SELECT RPAD('이제 곧 쉬시',20) FROM DUAL; --오른쪽
SELECT RPAD('1분 후 쉬시',20,'하') FROM DUAL;
--유병승이라는 문구에 앞뒤에 #을 10개씩 추가하기
SELECT LPAD(RPAD('유병승',16,'#'),26,'#') FROM DUAL;

--5. LTRIM/RTRIM : 왼쪽/오른쪽에 특정문자를 제거하는 함수, 문자를 지정하지 않으면 공백제거
--LTRIM(문자열[,지정문자])
SELECT '          KH ',LTRIM('          KH ')FROM DUAL;
SELECT '000001234', LTRIM('000001234','0') FROM DUAL;
SELECT '0010001234', LTRIM('0010001234','0') FROM DUAL; --다른 문구 나오면 멈춤
SELECT '121212121병승',LTRIM('121212121병승','12') FROM DUAL;
SELECT '123321123321병승',LTRIM('123321123321병승','123') FROM DUAL;--낱개로 하나씩 보고 지움
--12309814271237427병승에서 앞에 있는 문자 지우기
SELECT '12309814271237427병승',LTRIM('12309814271237427병승','0123456789')FROM DUAL;--중간에 문자가 있다면 멈춤
--123152134151243병승123132094872134
--병승만 남기기
SELECT '123152134151243병승123132094872134', LTRIM(RTRIM('123152134151243병승123132094872134','0123456789'),'0123456789') FROM DUAL;

--TRIM : 양쪽있는 문자를 제거하는 것
SELECT '     KH     ',TRIM('     KH    '),LTRIM('     KH    ')FROM DUAL;
--TRIM([LEADING||TRAILING||BOTH][문자 한 개] [FROM] 대상문자열) 
--왼쪽만,뒤쪽만,양쪽 다 
SELECT 'XXXXXXXXKHXXXXXX',TRIM(LEADING 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
SELECT 'XXXXXXXXKHXXXXXX',TRIM(TRAILING 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
SELECT 'XXXXXXXXKHXXXXXX',TRIM(BOTH 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
--SELECT 'XXXXXXXXKHXXXXXX',TRIM(LEADING 'XI' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL; --문자 한 개만 된다!
SELECT 'XXXXX1XXXKHXXX1XXX',TRIM(BOTH 'X' FROM 'XXXXX1XXXKHXXX1XXX')FROM DUAL; --1나오기전까지 지움
--INSERT INTO TEMP VALUES(TRIM(BOTH'X' FROM 'XXXXXXXXKHXXXXXX')); --이런식으로 INSERT나 WHERE절에도 쓸 수 있음

--SUBSTR : 문자열의 특정부분을 잘라내는 기능
--SUBSTR(대상문자||컬럼명,시작위치[,길이])--길이 생략하면 처음부터 끝까지 다
SELECT '이요셉씨비가좋아요?',SUBSTR('이요셉씨비가좋아요?',5) FROM DUAL;
SELECT '이요셉씨비가좋아요?',SUBSTR('이요셉씨비가좋아요?',2,3) FROM DUAL;
SELECT '이요셉씨비가좋아요?',SUBSTR('이요셉씨비가좋아요?',INSTR('이요셉씨비가좋아요?','비'),3) FROM DUAL;

SELECT EMAIL, SUBSTR(EMAIL,INSTR(EMAIL,'@'))FROM EMPLOYEE;

--EMP_NAME 성만 조회하는데 중복값없이 출력하기
SELECT DISTINCT SUBSTR(EMP_NAME,1,1) FROM EMPLOYEE
ORDER BY 1; --여기서 EMP_NAME이라고 하면 안됨. ORDER BY는 FROM-SELECT-ORDER BY순서로 제일 마지막에 실행됨
--컬럼명을 SUBSTR(EMP_NAME,1,1) 썼으니까 EMP_NAME이 없음. 이걸 그대로 쓰던가 1로 쓰면 됨.

--알파벳 문자 처리
--UPPER/LOWER/INITCAP
SELECT 'Hello, My name is Han. How are you? Fine Thank you',
    UPPER('Hello, My name is Han. How are you? Fine Thank you'),--다 대문자
    LOWER('Hello, My name is Han. How are you? Fine Thank you'),--다 소문자
    INITCAP('Hello, My name is Han. How are you? Fine Thank you')--띄어쓰기하고 나오는 첫글자를 대문자로
FROM DUAL;

--CONCAT : 문자열을 합쳐주는 함수
SELECT EMP_NAME ||'님'||SALARY||'원' FROM EMPLOYEE;
SELECT CONCAT (EMP_NAME,'님') FROM EMPLOYEE; -- 둘 다 같음
--REPLACE : 문자열, 문자를 변경하는 것
--REPLACE(대상 문자, 찾는 문자, 변경할 문자)
SELECT REPLACE('I HATE U','HATE','LOVE') FROM DUAL;
SELECT REPLACE(EMAIL, 'kh.or.kr', 'KH.COM') FROM EMPLOYEE; --이거 했다고 원본값이 바뀌진 않음.조회만
--UPDATE EMPLOYEE SET EMAIL = REPLACE((EMAIL, 'kh.or.kr', 'KH.COM') ; --이렇게 해야 원본 DATA 바뀜
SELECT EMAIL FROM EMPLOYEE;

--REVERSE : 문자열을 반대로 출력해주는 것
SELECT 'ABCDE',REVERSE( REVERSE ('ABCDE') ) FROM DUAL; --2번하면 원래대로
SELECT '이세현대답해',REVERSE( REVERSE('이세현대답해')) FROM DUAL; --2번하면 돌아오긴하지만 한 번하면 깨짐

--TRANSLATE : 문자열을 지정된 문자로 변경
SELECT TRANSLATE('010-3644-6259','0123456789','영일이삼사오육칠팔구') FROM DUAL;
--문자처리함수 끝


--숫자처리함수
--소수점에 대한 처리 내용은 알고 있어야 함
--ABS : 절대값 -> 음양이 없는 숫자값
SELECT 10,-10,ABS(10),ABS(-10) FROM DUAL;

--MOD : 나머지를 구하는 함수
SELECT MOD(10,3), MOD(10,2),MOD(10,4) FROM DUAL; 

--소수점 처리함수
--ROUND : 소수점을 반올림하는 함수
--ROUND(대상값 [,반올림할 위치] )
SELECT ROUND(123.556) FROM DUAL; --그냥 하면 정수로 반올림해서 나옴
SELECT ROUND(123.556, 2) FROM DUAL; --2자리까지 표시
SELECT ROUND(123.456, 0) FROM DUAL;
SELECT ROUND(123.456, -1) FROM DUAL; --소수점 기준으로 -는 앞 자리로 감

--FLOOR : 소수점을 버리는 함수
SELECT FLOOR(123.456) FROM DUAL;
SELECT FLOOR(123.556) FROM DUAL;

--TRUNC : 소수점을 버리는 함수, 버리는 위치를 지정
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;

--CEIL : 소수점을 무조건 올림 -> 묻지도 따지지도 않고 올림
SELECT CEIL(123.456) FROM DUAL;
SELECT CEIL(123.556) FROM DUAL;
--숫자 처리 함수 끝


--날짜 처리 함수
--날짜끼리 산술연산 -> NUMBER형
--날짜와 숫자를 연산 -> 날짜의 일을 숫자만큼 연산한 것이 됨-DATE형

--SYSDATE : 오늘 날짜 구하기
--시스템에 저장되어있는 날짜를 표시
SELECT SYSDATE FROM DUAL;

--SYSTIMESTAMP : 시간까지 표시하는 예약어
SELECT SYSTIMESTAMP FROM DUAL;

--SYSDATE를 이용해서 시간을 나타내려면 문자열로 변환하여 출력
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;

--현재 시각을 알려주는 명령어. 지역
SELECT CURRENT_DATE, LOCALTIMESTAMP, CURRENT_TIMESTAMP FROM DUAL;

--날짜끼리 연산을 하면 NUMBR가 나옴 -> 일수
SELECT FLOOR( SYSDATE-HIRE_DATE)||'일' AS 근무일수 FROM EMPLOYEE;

--날짜에 숫자를 연산하면(+,-) 일수를 더하거나 뺀 것이 됨
SELECT SYSDATE-1, SYSDATE, SYSDATE+1 FROM DUAL;

--한 달씩 계산 할 때
--ADD_MONTHS : 개월 수를 더하는 함수
--ADD_MONTHS(날짜, 수)
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 4) FROM DUAL;
-- 사원명, 입사일, 입사 후 3개월 조회
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 3) FROM EMPLOYEE;

--MONTHS_BETWEEN : 날짜 간 개월 수를 알려주는 함수
--MONTHS_BETWEEN(날짜1, 날짜2)
SELECT FLOOR(MONTHS_BETWEEN( '20/12/25', SYSDATE)) FROM DUAL;
SELECT CEIL(MONTHS_BETWEEN( SYSDATE,  '20/12/25')) FROM DUAL; --음수여서 FLOOR하니까 -6으로 나옴

--NEXT_DAY : 요일을 선택하면 현재 일에서 가장 가까운 요일의 날짜가 나옴
SELECT SYSDATE, NEXT_DAY(SYSDATE, '월') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '금요일') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'MON') FROM DUAL; --영어는 안됨
SELECT * FROM V$NLS_PARAMETERS;--자동으로 한글로 언어 설정이 되어있음
ALTER SESSION SET NLS_LANGUAGE=KOREAN;--언어 설정에 따라 바뀜

--LAST_DAY : 현재 월의 마지막 날짜 
SELECT LAST_DAY(ADD_MONTHS(SYSDATE,1)) FROM DUAL;

--EXTRACT : 년, 월, 일 따로 출력할 수 있는 함수
--EXTRACT(YEAR||MONTH||DAY FROM 날짜) -> NUMBER형으로 변환
SELECT
    EXTRACT(YEAR FROM SYSDATE),
     EXTRACT(MONTH FROM SYSDATE),
     EXTRACT(DAY FROM SYSDATE)
 FROM DUAL;
 
 SELECT 
    EXTRACT(YEAR FROM SYSDATE)|| '년'
    || EXTRACT(MONTH FROM SYSDATE)|| '월'
    || EXTRACT(DAY FROM SYSDATE)|| '일' AS 현재일
 FROM DUAL;
    
--입사일을 0000년 00월 00일로 조회하세요
SELECT
    EXTRACT(YEAR FROM HIRE_DATE)||'년'
    ||EXTRACT(MONTH FROM HIRE_DATE)||'월'
    ||EXTRACT (DAY FROM HIRE_DATE)||'일'
    AS 입사일
FROM EMPLOYEE;

SELECT
    TO_CHAR(HIRE_DATE, 'YYYY "년" MM "월" DD "일" ') AS 입사일
FROM EMPLOYEE;

--EXTRACT를 이용해서 시간을 따로 빼는 게 가능한가? 형변환해야 함
SELECT 
    EXTRACT(HOUR FROM CAST(SYSDATE AS TIMESTAMP)) || '시' ||
    EXTRACT(MINUTE FROM CAST(SYSDATE AS TIMESTAMP)) || '분' ||
    EXTRACT (SECOND FROM CAST(SYSDATE AS TIMESTAMP)) || '초'
FROM DUAL;
--날짜 처리 함수 끝

--자료형을 변환하는 함수
--TO_CHAR, TO_DATE, TO_NUMBER

--TO_CHAR : 문자형으로 변경해주는 함수
--1. 날짜를 문자로 : TO_CHAR(날짜, '패턴')
--2. 숫자를 문자로 : TO_CHAR(숫자, '패턴')

SELECT 
    SYSDATE, TO_CHAR(SYSDATE, 'YY-MM-DD'),
    TO_CHAR(SYSDATE, 'YY-MM-DD D'), --일요일이 1번
    TO_CHAR(SYSDATE, 'YY-MM-DD (DY)'),
    TO_CHAR(SYSDATE, 'YY-MM-DD DAY'),
    TO_CHAR(SYSDATE, 'YY "년" MM "월" DD "일"  DY HH "시" MI "분" SS"초" ')
FROM DUAL;

--EMPLOYEE테이블에서 사원명, 입사일 출력  (1990/2/19 (화) )
SELECT
    EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD (DY)')
FROM EMPLOYEE;

--숫자를 문자형으로 변환
--패턴에 길이를 표시하는데 그 길이가 변환할 숫자보다 작으면 에러 발생
--9,0 패턴
-- 9 : 숫자값이 해당 위치에 없으면 공란으로 표시
-- 0 ; 숫자값이 해당 위치에 없으면 0으로 표시
-- $ : 숫자 앞에 $표시를 함
-- L : 로케일에 해당하는 통화(/)표시
-- , : 숫자를 구분하는 구분자
-- . : 소수점 자리 표현하는 표시

SELECT 
    TO_CHAR(1234567,'999,999,999'),
    TO_CHAR(1234567, '999,999'), --길이가 짧으면 에러남
    TO_CHAR(1234567, 'L999,999,999')
FROM DUAL;

SELECT 
    TO_CHAR(1234567,'000,000,000'),
    TO_CHAR(1234567, '000,000'), --길이가 짧으면 에러남
    TO_CHAR(1234567, 'L000,000,000')
FROM DUAL;

SELECT
    TO_CHAR(123.45,'9999.999'),--, 아니고 . -소수점은 9로 해도 0표시됨
    TO_CHAR(123.45,'0000.000'),
    TO_CHAR(123.2, '9999.00') -- 소수점은 0, 정수는 0없이 이렇게 섞어서도 가능
FROM DUAL;

--EMPLOYEE테이블의 SALARY를 통화로 표시하고 3자리마다 쉼표 넣어서 출력
--사원명, 부서코드, 월급, 연봉도 같은 형식으로 추가
SELECT EMP_NAME, DEPT_CODE,
    TO_CHAR(SALARY, 'L999,999,999') AS 월급,
    TO_CHAR(SALARY*12, 'L999,999,999') AS 연봉
FROM EMPLOYEE;

--TO_DATE : 날짜로 변경해주는 함수
--문자를 날짜로
--숫자를 날짜로
--TO_DATE(문자 || 숫자, '날짜패턴')

SELECT TO_DATE('20201225', 'YY/MM/DD'),
    TO_DATE('20201225', 'YYYYMMDD') --위랑 같은 형태로 나옴
FROM DUAL;

SELECT TO_DATE(20201225, 'YY/MM/DD') FROM DUAL;
SELECT '00/12/25' FROM DUAL;

--TO_NUMBER : 문자를 숫자로 변경
SELECT TO_NUMBER('10,200', '9,999,999')+200 FROM DUAL;--쉼표 있으면 쉼표빼고 변환하라는 뜻
--형변환 함수 끝

--선택함수-분기문을 SELECT문 안에서 쓸 수 있음
--자바에서 SWITCH 문과 비슷한 기능
--DECODE : 동등비교
--사용법 : DECODE(표현식(컬럼,문자열,값) , 조건1, 결과1(TRUE면 해당), 조건2, 결과2...결과3,결과00(디폴트랑 같은 믜미, 앞 조건 다 해당되지 않으면))
--EMPLOYEE 성별 컬럼 없음. 주민번호로 확인
SELECT EMP_ID, EMP_NAME, 
    EMP_NO, DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남', '2', '여', '3', '남', '4', '여')
FROM EMPLOYEE
ORDER BY 4;

--사원명, 직급코드에 따른 해당 직급명 출력
--J1 사장 J2 부사장 J3부장 나머지는 사원
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, JOB_CODE, DECODE(JOB_CODE,'J1', '사장', 'J2', '부사장', 'J3', '부장', '사원')
FROM EMPLOYEE
ORDER BY 2;

--CASE문 
-- SELECT
--  CASE
--      WHEN 조건식 THEN 실행할 구문
--      WHEN 조건식 THEN 실행
--      ELSE 실행할 구문
--     END AS 별칭

SELECT
    EMP_NAME,
    JOB_CODE,
    CASE
        WHEN JOB_CODE='J1' THEN '사장'
        WHEN JOB_CODE='J2' THEN '부사장'
        ELSE '사원'
    END
 FROM EMPLOYEE;
 
 --남,여 예제를 바꿔보기
 SELECT
    EMP_ID,
    EMP_NAME,
    CASE
        WHEN SUBSTR(EMP_NO, 8, 1) = '1'  THEN '남'
        WHEN SUBSTR(EMP_NO, 8, 1) = '2' THEN '여'
        WHEN SUBSTR(EMP_NO, 8, 1) = '3' THEN '남'
        WHEN SUBSTR(EMP_NO, 8, 1)= '4' THEN '여'
    END
FROM EMPLOYEE;


-- 현재나이 = 현재년도 -태어난 년도 +1
SELECT
    EMP_ID AS 사원번호,
    EMP_NAME AS 사원명,
    RPAD(SUBSTR(EMP_NO,1,8),14,'*') AS 주민번호, 
    --SUBSTR(EMP_NO,1,8)||'******' 혹은 CONCAT(SUBSTR(EMP_NO,1,8),'******')
    CASE
         WHEN SUBSTR(EMP_NO, 8, 1) IN( '1','3')  THEN '남'
        WHEN SUBSTR(EMP_NO, 8, 1) IN( '2','4') THEN '여'
    END AS 성별,
     EXTRACT(YEAR FROM SYSDATE)-EXTRACT(YEAR FROM TO_DATE(SUBSTR(EMP_NO,1,2),'YY'))+1 AS 현재나이 , 
--YY로 변환하면 무조건 현재 세기 20 이 붙음
     EXTRACT(YEAR FROM SYSDATE)-EXTRACT(YEAR FROM TO_DATE(SUBSTR(EMP_NO,1,2),'RR'))+1 AS 현재나이 , 
--RR은 50 기준으로 세기가 달라짐..47년 생이면 나이가 달라짐 -26으로
    TO_NUMBER( EXTRACT(YEAR FROM SYSDATE)) -( TO_NUMBER(SUBSTR(EMP_NO,1,2)) +
    CASE 
        WHEN SUBSTR(EMP_NO,8,1) IN('1','2') THEN 1900
        ELSE 2000
        END)+1 현재나이
FROM EMPLOYEE;

--확인하기 위해 47년생 데이터 추가
INSERT INTO EMPLOYEE VALUES (250, '이세현','471225-1234123','HYUN@HYUN.COM',NULL, 'D5', 'J2', 'S5', 150, NULL,
NULL,SYSDATE,DEFAULT,DEFAULT);
SELECT * FROM EMPLOYEE;    
--단일행함수 중에 선택함수가 있는 것.

--그룹함수
--실행결과가 한개 행이 나오는 함수
--합계, 평균, 최대값, 최소값 등을 리턴하는 함수들
--SUM,AVG,COUNT,MAX,MIN

--SUM : 합계 -> 전체 ROW의 특정컬럼 합계를 구하는 함수
SELECT SUM(SALARY) FROM EMPLOYEE;
--SELECT EMP_NAME, SUM(SALARY) FROM EMPLOYEE; --여기선 다른 컬럼과 쓸 수 없다. 뒤에서 그룹으로 묶는 명령어 배울 거임

--여자사원의 월급 합계를 구하세요
SELECT SUM(SALARY) FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) IN('2','4');

--AVG : RESULTSET의 특정 컬럼값의 평균을 구하는 함수
-- 전체 사원의 월급평균
SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE;
--보너스 평균
SELECT AVG(BONUS) FROM EMPLOYEE;
--그룹함수는 컬럼에 NULL이 있는 ROW는 제외하고 계산함!
SELECT EMP_NAME, BONUS FROM EMPLOYEE;
SELECT AVG(NVL(BONUS,0)) FROM EMPLOYEE; --정확한 평균 값 계산

--COUNT : RESULTSET의 ROW 수를 계산
SELECT COUNT(*) FROM EMPLOYEE;
SELECT COUNT(EMP_NAME) FROM EMPLOYEE;
--여자 사원 수
SELECT COUNT(*) FROM EMPLOYEE WHERE SUBSTR(EMP_NO,8,1) IN('2','4');
--D5 부서 사람 수
SELECT COUNT(*) FROM EMPLOYEE WHERE DEPT_CODE='D5';

SELECT COUNT(DEPT_CODE) FROM EMPLOYEE;--컬럼을 지정하면 해당 컬럼이 NULL인 값을 빼버림

--GROUP BY절
--그룹별로 분할하여 그룹함수를 실행하게 하는 것
--직책별 급여의 평균
SELECT JOB_CODE, AVG(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

SELECT DISTINCT JOB_CODE FROM EMPLOYEE; --중복 제거한 7개 만큼 나옴

--GROUP BY 위치
--SELECT 컬럼, 컬럼....
--FROM 테이블명
--[WHERE 조건식 AND || OR]
--[GROUP BY 컬럼명]
--[ORDER BY 컬럼명]

--부서별 임금의 합계는?
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL--NULL 빼기.RESULTSET기준으로 필터링
GROUP BY DEPT_CODE;--NULL도 묶여서 계산됨

--부서별 인원수 구하기
SELECT DEPT_CODE, COUNT(*), COUNT(DEPT_CODE)
--*은 전체가 NULL이 아닌 이상 개수 셈, DEPT_CODE로 지정하면 해당 컬럼이 NULL이 아니면 출력
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--EMP_NAME을 기준으로 월급의 합계 구하기--GROUP BY 그룹으로 묶일 수 있을 때 사용해야함
SELECT EMP_NAMEM, SUM(SALARY)
FROM EMPLOYEE
GROUP BY EMP_NAME;

--GROUP BY 절에 두개의 컬럼 사용 가능?
SELECT DEPT_CODE, JOB_CODE, AVG(SALARY), SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE;

SELECT EMP_NAME, DEPT_CODE, AVG(SALARY), SUM(SALARY)--중복값이 없게 그룹을 지으면 의미가 없음
FROM EMPLOYEE
GROUP BY EMP_NAME, DEPT_CODE;

--EMPLOYEE 테이블에서 직급이 J1인 사원을 제외하고 직급별 사원 수 및 평균 급여 구하기(정수, 원화표시)
SELECT * FROM EMPLOYEE;

SELECT JOB_CODE, COUNT(JOB_CODE), TO_CHAR(FLOOR(AVG(SALARY)),'L999,999,999')
FROM EMPLOYEE
WHERE JOB_CODE != 'J1'
GROUP BY JOB_CODE;

--년도별 인원 수 구해서 입사년 기준으로 오름차순 정렬
SELECT EXTRACT(YEAR FROM HIRE_DATE) AS 년도, COUNT(*) AS 인원수
FROM EMPLOYEE
GROUP BY EXTRACT(YEAR FROM HIRE_DATE)
ORDER BY 1;

--부서별 평균 급여가 300만원 이상인 부서에 대한 부서코드, 평균 급여 출력
SELECT DEPT_CODE, AVG(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING AVG(SALARY)>=3000000;

--HAVING : GROUP 함수에 대한 조건을 설정할 때 사용. WHERE절에 안들어감
--GRUOP BY  바로 뒤에 위치함
--SELECT 컬럼, 컬럼..
--FROM 테이블명
--[WHERE 조건식]
--[GROUP BY 컬럼명...]
--[HAVING 조건식]
--[ORDER BY 컬럼]--FROM, WHERE, GROUP BY, HAVING, SELECT, ORDER BY순서

--부서별 인원이 3명보다 많은 부서 출력하기
SELECT DEPT_CODE, COUNT(DEPT_CODE)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING COUNT(DEPT_CODE) > 3;

--ROLLUP, CUBE : 그룹함수 실행 후 전체에 대한 그룹함수를 실행하는 집계함수
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY ROLLUP(DEPT_CODE);--전체총계도 나오게 됨
GROUP BY CUBE(DEPT_CODE) --똑같은데 총계가 위에 나옴
ORDER BY DEPT_CODE; ---하면 ROLLUP이랑 같음


SELECT SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL;--이 총합계가 추가되는 것

--두 개 이상의 컬럼을 ROLLUP, CUBE에 넣었을 때
--ROLLUP : 두 컬럼에 대해 그룹별로 그룹함수를 실행, 첫 번째 인자로 들어간 컬럼에 대해 그룹함수 실행(소계),  총계
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY ROLLUP(DEPT_CODE, JOB_CODE);--DEPT 기준 소계, 총계
GROUP BY ROLLUP(JOB_CODE, DEPT_CODE);--잡코드 기준 소계, 총계

--CUBE : 지정된 컬럼을 모두 집계 함
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
GROUP BY CUBE(DEPT_CODE, JOB_CODE)--DEPT_CODE, JOB_CODE 소계도 다 하고 총계
ORDER BY 1;

--이 세개를 다 한꺼번에 처리한 것
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
GROUP BY DEPT_CODE;

SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
GROUP BY DEPT_CODE, JOB_CODE;

SELECT SUM(SALARY)
FROM EMPLOYEE;

--GROUPING : CUBE, ROLLUP에 의해 산출된 결과인지, 일반 그룹함수의 결과인지 확인해주는 함수
--ROW의 컬럼이 CUBE, ROLLUP에 의해 산출되었으면 1을 반환, 아니면 0을 반환
SELECT DEPT_CODE, GROUPING (DEPT_CODE)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY DEPT_CODE;
GROUP BY ROLLUP(DEPT_CODE);

--선택함수와 같이 사용함 : DECODE, CASE
SELECT DECODE(GROUPING(DEPT_CODE),0,NVL(DEPT_CODE,'인턴'),'전체인원') 부서코드,
    COUNT(*)
FROM EMPLOYEE
GROUP BY ROLLUP(DEPT_CODE);
    
--두 개 이상 컬럼으로 집계한 RESULTSET
SELECT DECODE(GROUPING(JOB_CODE), 0, JOB_CODE, '직급전체') 직급코드,
    DECODE(GROUPING(DEPT_CODE), 0, NVL(DEPT_CODE,'인턴'), '부서전체') 부서코드,
    CASE 
    WHEN GROUPING (DEPT_CODE) = 0 AND GROUPING (JOB_CODE) = 0 THEN '그룹별합계'
        WHEN GROUPING (DEPT_CODE) = 1 AND GROUPING (JOB_CODE) = 0 THEN '직급별합계'
        WHEN GROUPING (DEPT_CODE) = 0 AND GROUPING (JOB_CODE) = 1 THEN '부서별합계'
        WHEN GROUPING (DEPT_CODE) = 1 AND GROUPING (JOB_CODE) = 1 THEN '총합계'
    END 비고
FROM EMPLOYEE
GROUP BY CUBE(DEPT_CODE, JOB_CODE)
ORDER BY 1,2;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--집합 연산 : 두 개 이상의 RESULTSET을 연산처리 하는 것(더하기, 빼기, 중복값) 기능
--집합 연산 조건 
--1. 두 개의 RESULTSET의 컬럼의 개수, 타입이 일치
--2. 타입만 같으면 컬럼명과 상관없는 값이라도 들어갈 수 있음
--3. 첫 번째 나오는 RESULTSET이 기준이 됨

--1. UNION / UNIONALL: 두 개의 RESULTSET을 합치는 것
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION
--SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
--SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE --첫번째 RESULTSET이랑 컬럼 갯수 및 탕비이 같아야 함
SELECT EMP_ID, EMP_NAME, DEPT_CODE, 0 --자료형 맞춰서 0으로 써도 가능.
FROM EMPLOYEE
WHERE SALARY> 3000000
UNION
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, 0 --타입과 개수만 맞다면 다른 테이블도 가능!
FROM DEPARTMENT;

--UNIONALL
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION ALL
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3000000;

--INTERSECT : 중복값만 출력
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
INTERSECT 
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY>= 3000000;

--MINUS : 다른 RS를 뺀 나머지 ROW만 출력. 중복값이 제거 된 나머지
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
MINUS
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3000000
UNION
--SELECT DEPT_ID, DEPT_TITLE, '없다',NULL
SELECT '없다',  DEPT_TITLE, DEPT_ID,0
FROM DEPARTMENT;

--GROUPING SETS : GROUP BY 절에 사용하고 여러 GROUP BY를 포함한 SELECT문을 합쳐줌
SELECT DEPT_CODE, JOB_CODE, MANAGER_ID, FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY GROUPING SETS(
    (DEPT_CODE, JOB_CODE, MANAGER_ID),
    (JOB_CODE, MANAGER_ID),
    (DEPT_CODE, MANAGER_ID)
);
--3개로 쓸 것을 한 번에 씀

--중요!!!
--JOIN : 두 개 이상의 테이블을 한 개의 테이블로 합침(옆으로 합침) / UNION은 RESULTSET합침
--두 개의 테이블은 통상 서로 일치하는 값을 가지고 있음(기준자가 필요함)
--통상 PRIMARY KEY와 FOREIGN KEY(다른 테이블 참조하는 값)로 연결되어 있음

--오라클 구문, ANSI표준 구문을 사용할 수 있음
--오라클 전용 구문
--SELECT 컬럼, 컬럼...
--FROM 테이블명1, 테이블명2 WHERE 테이블명1.컬럼 = 테이블명2.컬럼

--사원명, 부서명 출력
SELECT DEPT_CODE, EMP_NAME FROM EMPLOYEE;--사원명
SELECT DEPT_ID, DEPT_TITLE FROM DEPARTMENT;--부서명

--SELECT EMP_NAME, DEPT_TITLE
SELECT * --전체 테이블이 합쳐짐
FROM EMPLOYEE, DEPARTMENT
WHERE EMPLOYEE.DEPT_CODE = DEPARTMENT.DEPT_ID; --객체로 봐서 . 을 사용 EMPLOYEE테이블의 DEPT_CODE로 가라

--사원명, 사원직책명, 부서코드, 월급 출력
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE, JOB
WHERE EMPLOYEE.JOB_CODE=JOB.JOB_CODE;

--ANSI로 변경해보자
SELECT  EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;
    --테이블 연결하는 조건을 설정할 때
    --컬럼명이 다르면 컬럼 앞의 테이블명은 생략 가능함. 오라클 구문에서도 마찬가지

--SELECT EMP_NAME, JOB_NAME, DEPT_CODE, SALARY
SELECT EMP_NAME, J.JOB_CODE, DEPT_CODE, SALARY --동일한 컬럼명 있을 때 여기서도 구분 필요!
FROM EMPLOYEE E --테이블에 대한 별칭부여
    JOIN JOB J ON E.JOB_CODE=J.JOB_CODE;
    --두 테이블의 컬럼명이 동일하면 컬럼 앞에 테이블명을 작성하여 .으로 접근한다

--만약에 두 테이블에 컬럼명이 같은 컬럼이 있으면 두 테이블을 JOIN할 때 
--USING 예약어를 사용할 수 있음. ON을 대신함
SELECT JOB_CODE
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE);--JOB_CODE 1개만 나옴
    
SELECT * 
FROM EMPLOYEE E
    JOIN JOB J ON(E.JOB_CODE = J.JOB_CODE); --JOB_CODE 2개 나옴

--EQUI JOIN : 컬럼의 동일한 값을 비교하여 ROW를 연결-지금까지 썼던 거
--NON-EQUI JOIN : 컬럼의 지정한 범위에 따라 ROW를 연결

--EQUI JOIN
--INNER JOIN / OUTER JOIN이 있음
--INNER JOIN : ON절에서 비교한 컬럼의 일치하는 값이 있을 때만 결합. 없으면 그 ROW는 버림-지금까지 썼던 거
SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;

SELECT * 
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID;--그냥 JOIN 쓰면 INNER JOIN으로 됨
    
SELECT COUNT(*)
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE);--문제 풀 때 조심. INNER JOIN이면 일치하지 않는 값을 빼버림

--일치하지 않는 값도 출력하고 싶다면?    
--OUTER JOIN : 한 개의 테이블 기준으로 설정하여 기준이 된 테이블의 모든 데이터 출력. 
--일치하는 값이 없으면 결합된 모든 컬럼 NULL처리함

SELECT *
FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;--EMPLOYEE 테이블이 기준

SELECT *
FROM EMPLOYEE
    RIGHT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID; -- DEPARTMENT 테이블이 기준

--OUTER 조인 - 오라클 문법 적용
SELECT * 
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+);--기준이 되지 않는,붙여지는 쪽에 + 하면 LEFT JOIN이 됨

SELECT * 
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE(+) = DEPT_ID;--RIGHT JOIN

--JOIN 구문도 일반적인 FROM 구문이랑 동일하기 때문에
--WHERE, GROUP BY, HAVING, ORDER BY 다 적용 가능

--사원명, 부서명,월급을 출력하는데 부서명이 '총무부'인 사람만 출력
SELECT EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
   JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
 WHERE DEPT_TITLE = '총무부';
--부서명, 지역명(LOCAL_NAME)을 출력
SELECT DEPT_TITLE, LOCAL_NAME
FROM DEPARTMENT
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE;

--CROSS JOIN : 카티션곱. 전체 ROW를 매칭
SELECT EMP_NAME, DEPT_CODE,DEPT_TITLE
FROM EMPLOYEE
    CROSS JOIN DEPARTMENT
ORDER BY 1;
 
 SELECT * FROM EMPLOYEE;   
 
 --SELF JOIN : 테이블을 자기 테이블과 연결하는 JOIN 스스로 연결
 --테이블 안에 동일한 값을 가지는 테이블이 두 개가 존재해야 함,
 --해당 ROW에 같은 값이 있어야 하는 게 아니라 전체를 기준으로 봄
 
 --각 사원의 매니저 이름을 확인하자
 SELECT E.EMP_ID, E. EMP_NAME, E.MANAGER_ID, M.EMP_ID, M.EMP_NAME
 --column ambiguously 오류. SELECT 컬럼들도 구분해야 함
 FROM EMPLOYEE E
    JOIN EMPLOYEE M ON E.MANAGER_ID = M.EMP_ID;
 
 --다중JOIN
 --여러 개의 조인문을 한 번에 사용할 수 있음 -> 2개 이상의 테이블을 한 개의 테이블로 만들 수 있다
 --사원명, 부서명, 근무지역을 조회하려면?
 SELECT EMP_NAME FROM EMPLOYEE;
 SELECT * FROM DEPARTMENT;
 SELECT * FROM LOCATION;
 
-- SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME
SELECT *
 FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID= LOCAL_CODE
WHERE LOCAL_NAME NOT LIKE 'ASIA%';
   
   SELECT DEPT_TITLE, LOCAL_NAME
   FROM DEPARTMENT
    JOIN LOCATION ON LOACL_CODE = LOCATION_ID;
    
--다중 조인 시 유의 사항! 이렇게 하면 오류남
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE--1번
    JOIN LOCATION ON LOCATION_ID=LOCAL_CODE--2번
     JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;--3번 순서. 연결 순서 잘 생각해야 함
 
 --직급이 대리면서 ASIA 지역에 근무하는 직원 조회
 --사번, 이름, 직급명, 부서명, 근무지역명, 급여
 SELECT * FROM JOB;
 
  SELECT EMP_ID, EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME, SALARY
 FROM EMPLOYEE 
    JOIN JOB USING(JOB_CODE)
--  JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID -- INNER JOIN .하나만 NULL이 있어 일치하는 게 없으면 빼버림.22명 나옴 
    LEFT JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID
    LEFT JOIN LOCATION  ON LOCATION_ID=LOCAL_CODE 
WHERE JOB_NAME='대리' AND LOCAL_NAME LIKE 'ASIA%';   

--1.주민번호가 1970년대 생이면서 성별이 여자고, 성이 전씨인 직원들의
--사원명, 주민번호, 부서명, 직급명 조회
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, EMP_NO, DEPT_TITLE, JOB_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN JOB USING( JOB_CODE)
WHERE SUBSTR(EMP_NO,1,2) BETWEEN '70' AND '79' AND --substr(emp_no,1,1) = 7--70년대 생이니까 7로 시작!!
    SUBSTR(EMP_NO, 8,1) = '2' AND
    SUBSTR(EMP_NAME,1,1) = '전'; --emp_name like '전%';

--2. 이름에 '형'자가 들어가는 직원들의 사번, 사원명, 부서명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
WHERE EMP_NAME LIKE '%형%';

--3.해외영업부에 근무하는 사원명, 직급명, 부서코드, 부서명 조회
SELECT * FROM DEPARTMENT;
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
--    JOIN JOB USING(JOB_CODE)
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
     JOIN JOB USING(JOB_CODE)
WHERE DEPT_TITLE LIKE '해외영업%';

--4. 보너스 포인트를 받는 직원들의 사원명, 보너스포인드, 부서명, 근무지역명을 조회
SELECT EMP_NAME, BONUS, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
WHERE BONUS IS NOT NULL;

--5.부서코드가 D2인 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회
SELECT EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
WHERE DEPT_CODE = 'D2';

--6. 급여등급테이블의 최대급여(MAX_SAL)보다 많이 받는 직원들의 사원명, 직급명, 급여, 연봉을 조회하시오.
-- (사원테이블과 급여등급테이블을 SAL_LEVEL컬럼기준으로 조인할 것)
SELECT * FROM SAL_GRADE;

SELECT EMP_NAME, JOB_NAME, SALARY, SALARY*12+SALARY*NVL(BONUS,0),MAX_SAL 
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    JOIN SAL_GRADE USING (SAL_LEVEL)
WHERE MAX_SAL < SALARY;

--7. 한국(KO)과 일본(JP)에 근무하는 직원들의 사원명, 부서명, 지역명, 국가명을 조회하시오.
SELECT * FROM NATIONAL;
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME, NATIONAL_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
    JOIN NATIONAL USING( NATIONAL_CODE )
WHERE NATIONAL_NAME IN('한국', '일본');

--8. 같은 부서에 근무하는 직원들의 사원명, 부서명, 동료이름을 조회하시오. (self join 사용)--다시
SELECT E.EMP_NAME, DEPT_TITLE, P.EMP_NAME 
FROM EMPLOYEE E
    JOIN EMPLOYEE P ON E.DEPT_CODE = P.DEPT_CODE
    LEFT JOIN DEPARTMENT ON E.DEPT_CODE = DEPT_ID
--    JOIN DEPARTMENT D ON DEPT_CODE = DEPT_ID
--    JOIN EMPLOYEE P ON E.EMP_NAME = P.EMP_NAME;
WHERE E.EMP_NAME != P.EMP_NAME
ORDER BY 1;
    
--기본 셀렉트 문-메인쿼리
--또 다른 셀렉트 문 - 서브쿼리
--서브쿼리
--하나의 SELECT문 안에 또 다른 SELECT문이 있는 것 
--외부 SELECT문 : 메인 쿼리, 내부 SELECT문 : 서브쿼리
--서브쿼리는 메인쿼리에 종속적임
--서브쿼리는 메인쿼리보다 먼저 실행이 되야하기 때문에 ()사용함

--전지연의 관리자 이름을 출력하기(JOIN쓰지 말것)
SELECT MANAGER_ID FROM EMPLOYEE WHERE EMP_NAME='전지연';
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '214';

SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_ID = (SELECT MANAGER_ID
                            FROM EMPLOYEE
                            WHERE EMP_NAME = '전지연');
                                        
--전체 사원의 평균 급여보다 많이 받는 사원 조회
--사원명, 부서명, 직책명, 급여
SELECT EMP_NAME, DEPT_TITLE, JOB_NAME, SALARY
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    LEFT JOIN DEPARTMENT ON DEPT_ID = DEPT_CODE
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);

--서브쿼리의 종류->서브쿼리의 RESULTSET을 기준으로 나눔
--1. 단일행 : 서브쿼리의 RS이 한 개 행, 한 개 컬럼일 경우 -- SELECT AVG(SALARY) FROM EMPLOYEE;
--2. 다중행 : 서브쿼리의 RS이 여러 행, 한 개 컬럼인 경우
--3. 다중열 : 서브쿼리의 RS이 한 개 행, 여러 컬럼인 경우
--4. 다중행 다중열 : 서브쿼리의 RS이 여러 행, 여러 컬럼인 경우
--5. 상관 서브쿼리 : 서브쿼리의 구문에 MAIN쿼리의 값이 조건으로 들어가 서브쿼리의 결과에 영향을 주고, 
--            그 서브쿼리의 RS이 MAIN쿼리에 영향을 주는 경우. 서로 영향을 준다 
--6. 스칼라 서브쿼리 : 위의 상관서브쿼리의 결과가 단일행(결과가 한 개)인 서브쿼리

--1. 단일행 서브쿼리 
--유재식이랑 같은 부서의 사원을 조회하기
--사원명, 부서명, 직급명
SELECT EMP_NAME, DEPT_TITLE, JOB_NAME
FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN JOB USING(JOB_CODE)
 WHERE DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME = '유재식');
--WHERE DEPT_CODE = 'D6'; 와 같음

--1.윤은해와 급여가 같은 사원을 검색. 사원번호, 사원이름, 급여 출력
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME = '윤은해')
            AND EMP_NAME <> '윤은해';--윤은해는 빼고 출력

--2. 기본급여가 제일 많은 사람과 제일 적은 사람의 정보를 출력. 사원번호, 사원이름, 급여 출력
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE) OR
                SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);

--3. D1,D2 부서에서 근무하는 사원들 중에서 기본 급여가 D5부서 직원들의 평균 급여보다 많은 사원 조회
--부서번호, 사원번호, 사원명, 월급
SELECT DEPT_CODE, EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IN('D1','D2') AND
    SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE WHERE  DEPT_CODE = 'D5');
    
--2. 다중행 서브쿼리
--서브쿼리의 결과가 한 개 컬럼, 여러 행으로 나오는 서브쿼리
--동등 비교 시 : IN, 대소비교 : ANY, ALL
--행, 결과가 있나없나에 따라 EXIST 

--송종기, 박나라가 속한 부서의 사원 정보출력
SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME IN('송종기','박나라');

SELECT * 
FROM EMPLOYEE
WHERE DEPT_CODE IN (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME IN('송종기','박나라'));
--IN - OR로 비교하는 것. D5또는 D9, 2개여서 ' ='은 안됨! 단일행 일때 동등비교를 = 을 쓸 수 있음

--1.차태연, 전지연 사원의 급여 등급과 같은 사원의 직급명, 사원명 출력
--차태연, 전지연 빼고
SELECT JOB_NAME, EMP_NAME
FROM JOB
    JOIN EMPLOYEE USING(JOB_CODE)
WHERE SAL_LEVEL IN (SELECT SAL_LEVEL FROM EMPLOYEE WHERE EMP_NAME IN('차태연','전지연'))
 AND EMP_NAME NOT IN ('차태연', '전지연'); 
 
 --2. 직급이 대표, 부사장이 아닌 모든 사원을 부서별로 출력
 SELECT *
 FROM EMPLOYEE
 WHERE JOB_CODE NOT IN (SELECT JOB_CODE FROM JOB WHERE JOB_NAME IN ( '대표',  '부사장'))
 ORDER BY DEPT_CODE;
 
 SELECT NVL(DEPT_TITLE, '인턴') 부서명, EMP_NAME 사원명
FROM EMPLOYEE E 
    LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE NOT JOB_CODE IN (SELECT JOB_CODE FROM JOB WHERE JOB_NAME IN ( '대표',  '부사장'))
ORDER BY 1,2;

 --3. ASIA1 지역에 근무하는 사원 정보 출력. 부서코드, 사원명
 SELECT * FROM LOCATION;
 SELECT * FROM EMPLOYEE;
 
 SELECT DEPT_ID, EMP_NAME
 FROM DEPARTMENT
    JOIN EMPLOYEE ON DEPT_ID = DEPT_CODE
--  JOIN LOCATION ON LOCAL_CODE = LOCATION_ID
-- WHERE LOCAL_NAME=''ASIA1';
 WHERE LOCATION_ID = (SELECT LOCAL_CODE FROM LOCATION WHERE LOCAL_NAME = 'ASIA1');
-- WHERE DEPT_CODE IN (SELECT DEPT_ID FROM DEPARTMENT 
--JOIN LOCATION ON LOCAL_CODE = LOCATION_ID
--WHERE LOCAL_NAME = 'ASIA1');

--다중행 서브쿼리
--ANY : 다중값에 대한 대소비교 - OR
-- 어떤 
--X < ANY(서브쿼리) : X값이 서브쿼리의 어떤 값보다 작으면 TRUE(최대값보다 작으면 TRUE)
-- X > ANY(서브쿼리) : X값이 서브쿼리의 어떤 값보다 크면 TRUE( 최소값보다 크면 TRUE)
--X < 10 OR X < 20 OR X <30  -> 30보다 작은면 TRUE. 셋 중 하나만 TRUE여도 TRUE

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY > ANY(2000000,5000000); --200보다 큰 사람들
--WHERE SALARY > 2000000 OR SALARY > 5000000; --위가 이거랑 같다
--WHERE SALARY < ANY (2000000,5000000); -- 500보다 작은 사람들 다 나옴

--J3 코드를 가진 사람들의 급여로 비교하기
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
--WHERE SALARY > ANY(SELECT SALARY FROM EMPLOYEE WHERE JOB_CODE='J3');
--이 서브쿼리의 최소값보다 큰 거
WHERE SALARY > (SELECT MIN(SALARY) FROM EMPLOYEE WHERE JOB_CODE='J3');

--ALL : 모든 값보다
--X < ALL(서브쿼리) : X값이 모든 값보다 작으면 TRUE(최소값보다 작으면 )- AND
--X > ALL(서브쿼리) : X값이 모든 값보다 크면 TRUE(최대값보다 크면)

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
--WHERE SALARY > ALL(2000000,5000000);
--WHERE SALARY < ALL(2000000,5000000);
--WHERE SALARY < 2000000 AND SALARY < 5000000;
--WHERE SALARY < ALL(SELECT SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D2');
--서브쿼리의 최소값보다 작은 거
WHERE SALARY > ALL(SELECT SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D2');
--서브쿼리의 최대값보다 큰 거

--EXIST : 서브쿼리에 결과가 있으면 무조건 TRUE-상관서브쿼리에서 많이 씀
SELECT *
FROM EMPLOYEE
WHERE EXISTS (SELECT EMP_NAME FROM EMPLOYEE WHERE DEPT_CODE = 'D10');

--3.다중열 서브쿼리 : 컬럼의 갯수가 여러 개인 것
--퇴사한 여직원의 부서,직급 조회하기
SELECT DEPT_CODE, JOB_CODE
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) = '2' AND ENT_YN = 'Y';
--퇴사한 여직원의 부서와 직급이 같은 사원을 구하기
SELECT *
FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE) IN(SELECT DEPT_CODE, JOB_CODE FROM EMPLOYEE 
                                                                                WHERE SUBSTR(EMP_NO,8,1) = '2' AND ENT_YN = 'Y');
                                                                                
--다중행을 비교할 때는 OR 또는또는..--이태림이거나 장쯔위이거나 전형돈-밑은 OR비교
--다중열을 비교할 때는 AND 그리고 그리고 --컬럼 D8이면서 J6인 거

--기술지원부이면서 급여가 2000000원인 사원의 이름, 부서코드, 급여 출력
SELECT * FROM EMPLOYEE;
SELECT * 
FROM DEPARTMENT 
    JOIN EMPLOYEE ON DEPT_CODE=DEPT_ID
WHERE DEPT_TITLE = '기술지원부' AND SALARY=2000000;

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE(DEPT_CODE, SALARY) IN (SELECT DEPT_CODE, SALARY FROM DEPARTMENT 
                                                                    JOIN EMPLOYEE ON DEPT_CODE=DEPT_ID
                                                                    WHERE DEPT_TITLE = '기술지원부' AND SALARY=2000000);
--4.다중행 다중열 서브쿼리
--직급별 최소급여를 받는 사원의 사원이름, 직급 급여 조회
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

SELECT  EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MIN(SALARY) FROM EMPLOYEE GROUP BY JOB_CODE);
--부서별 최대급여를 받고 있는 사원의 이름,부서코드, 급여
SELECT DEPT_CODE, MAX(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE (DEPT_CODE, SALARY) IN(SELECT DEPT_CODE, MAX(SALARY) FROM EMPLOYEE GROUP BY DEPT_CODE);

--5. 상(호연)관 서브쿼리
--메인쿼리 값을 서브쿼리에 주고 서브쿼리를 실행한 결과가 메인쿼리 결과에 영향을 주는 서브쿼리문
--프로그램의 이중for문과 비슷하게 돌아감

--사원의 매니저 이름 조회
--사원명, 매니저 아이디,매니저 이름
SELECT EMP_NAME, MANAGER_ID, 
    (SELECT EMP_NAME 
    FROM EMPLOYEE
    WHERE EMP_ID=E.MANAGER_ID)
    --스칼라 서브쿼리에 해당
    --행의 개수만큼 서브쿼리 실행
    --TRUE 나온 값만 RS에 출력
FROM EMPLOYEE E;

SELECT MANAGER_ID FROM EMPLOYEE;
SELECT * FROM EMPLOYEE;

--심봉선 사원과 같은 부서의 사원의 부서코드, 월평균급여를 조회
SELECT DEPT_CODE, TRUNC(AVG(SALARY)) 평균급여
FROM EMPLOYEE E
--WHERE DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE  
--                            WHERE DEPT_CODE=E.DEPT_CODE 
--                            AND EMP_NAME = '심봉선')
--EXISTS 확인 용도. 부서코드가 심봉선 부서 코드와 같으면 값 출력
WHERE EXISTS (SELECT DEPT_CODE FROM EMPLOYEE  --결과가 계속 바뀌니까 EXISTS가 항상 있는게 아님
                            WHERE DEPT_CODE=E.DEPT_CODE 
                            AND EMP_NAME = '심봉선')
GROUP BY  DEPT_CODE;

--6.스칼라 서브쿼리 : 상관서브쿼리 중에서 결과값이 단일행 서브쿼리인 것.
--부서별 평균보다 높은 급여를 받는 사원의 이름, 급여, 평균급여를 출력
SELECT EMP_NAME, SALARY, 
    (SELECT FLOOR(AVG(SALARY))
    FROM EMPLOYEE
    WHERE DEPT_CODE = E.DEPT_CODE) 평균급여
--WHERE절 외부에서 값 하나 가져와서 
-- E.DEPT_CODE =D1으로 찍힘
--필터링된 값으로 평균 구함
--EMPLOYEE E 개수만큼 ROW가 출력
FROM EMPLOYEE E;

SELECT EMP_NAME, DEPT_CODE,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE= 'D9';

--자신이 속한 직급의 평균 급여보다 많이 받는 사원의 이름 직급 급여 조회
SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE E
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE 
                        WHERE JOB_CODE=E.JOB_CODE);
    
 --사원명, 부서코드, 월급, 자기 부서 인원 수                       
SELECT EMP_NAME, DEPT_CODE, SALARY ,
    (SELECT COUNT(*) 
    FROM EMPLOYEE 
    WHERE DEPT_CODE=E.DEPT_CODE) "자기부서 인원 수"
FROM EMPLOYEE E;

--인라인 뷰 : 서브쿼리가 하나의 테이블로 이용될 수 있게 하는 것
--FROM절에 서브쿼리를 사용하는 것 
--VIEW 
--INLINE VIEW : 1회성으로 RS을 테이블로 이용하는 것
--STORED VIEW : 저장하고 영구적으로 사용하게 하는 것

--EMPLOYEE 테이블 남/여 성별 컬럼 없음
SELECT EMP_NAME, EMP_NO, EMAIL, PHONE,
    DECODE(SUBSTR(EMP_NO,8,1),'1','남','2','여') AS GENDER
FROM EMPLOYEE
WHERE DECODE(SUBSTR(EMP_NO,8,1),'1','남','2','여')='남';
--INLINE VIEW로 변경하면
SELECT *
 FROM (SELECT EMP_NAME AS 성명 , EMP_NO AS 주민번호, EMAIL AS 이메일 , PHONE AS 전화번호,
        DECODE(SUBSTR(EMP_NO,8,1),'1','남','2','여' ) AS 성별
        FROM EMPLOYEE)
--WHERE 성별 = '남' AND SALARY >= 3000000; invalid identifier오류. RS에 있는 것(EMP_NAME, EMP_NO, EMAIL, PHONE,성별)만 쓸 수 있음. 
--WHERE 성별 = '남' AND EMP_NAME = '이세현'; 된다
WHERE 성별 = '남' AND 이메일 LIKE '____@%'; --별칭부여하면 별칭으로 맞춰서 써야함! 별칭대로 테이블이 바뀌기 때문

--자기부서 평균보다 많이 받는 사원
SELECT EMP_NAME, DEPT_CODE, SALARY, (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE WHERE E.DEPT_CODE=DEPT_CODE)
FROM EMPLOYEE E
WHERE SALARY >  (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE  WHERE JOB_CODE=E.JOB_CODE);
--INLINE VIEW로 변경하면
SELECT *
FROM(
    SELECT EMP_NAME, DEPT_CODE, SALARY, (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE WHERE E.DEPT_CODE=DEPT_CODE) AS AVGSAL
    FROM EMPLOYEE E
    )
WHERE SALARY >  AVGSAL;

--연봉 TOP3구하기
--연봉 3위~5위 구하기
--ROWNUM 컬럼을 이용하는 방법 -> ORACLE에서 제공하는 ROW에 번호를 부여하는 컬럼 (RS는 컬럼아님!!)
--RANK() OVER()함수를 이용하는 방법 -> ORACLE이 제공하는 함수

--1. ROWNUM : 오라클의 모든 테이블에 자동으로 생성되는 컬럼
SELECT ROWNUM, EMPLOYEE.* FROM EMPLOYEE
WHERE ROWNUM < 5;
--ROWNUM은 RESULTSET이 발생하면 생성되는 컬럼
SELECT ROWNUM, EMPLOYEE.* 
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'; 
--FROM이 끝나자마자 결과,정렬에 따라 번호가 재부여됨. RS마다
--FROM -> SELECT -> ORDER BY순서

--급여 높은 순으로 정렬하고 ROWNUM출력해보기
SELECT ROWNUM, E.*
FROM EMPLOYEE E
ORDER BY SALARY DESC; --급여순서대로 번호가 부여가 안됨

SELECT ROWNUM, E.* 
FROM (SELECT *
                FROM EMPLOYEE
                ORDER BY SALARY DESC) E; --제대로 나옴

--급여를 제일 많이 받는 3명 구하고
--급여 제일 적게 받는 3명 구하기
SELECT ROWNUM, E.*
FROM (SELECT *
                FROM EMPLOYEE
                ORDER BY SALARY DESC) E
WHERE ROWNUM < 4;                

SELECT ROWNUM, E.*
FROM (SELECT *
                FROM EMPLOYEE
                ORDER BY SALARY ASC) E
WHERE ROWNUM < 4;   

--급여를 높게 받는 사원의 5등부터 10까지 구하기
SELECT * 
FROM ( -- 이만큼 테이블로 만듦. 고정된 RNUM을 가지고 WHERE절 씀
    SELECT ROWNUM AS RNUM, E.* --ROWNUM값을 인라인뷰로 고정시킴. 하나의 컬럼으로 됨. 페이징(원하는 데이터만 잘라씀) 때 자주 씀
    --이 SELECT에서 ROWNUM부여. 정렬된 채로 순서 부여.
    FROM (
                    SELECT *
                    FROM EMPLOYEE
                    ORDER BY SALARY DESC
                ) E
)
WHERE RNUM BETWEEN 5 AND 10; 
--원래 시작값(1)을 입력하지 않으면 ROWNUM은 중간부터 못 찾음

--인라인뷰 예시
SELECT *
FROM (
                SELECT EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO,8,1),'1','남','여') AS 성별
                FROM EMPLOYEE
)
WHERE 성별 = '여';

--1. D5부서에서 연봉 상위 3명의 정보를 출력
--순위, 사번,사원명,연봉(*12)
SELECT *
FROM (
                SELECT ROWNUM AS RNUM, E.* 
                FROM (
                                SELECT EMP_ID, EMP_NAME, SALARY*12 AS YEARSAL 
                                FROM EMPLOYEE
                                WHERE DEPT_CODE = 'D5'
                                ORDER BY 3 DESC
                ) E
    )
WHERE RNUM < 4 ;

--2.부서별 평균급여 TOP3 부서의 부서코드, 부서명, 평균급여 조회
SELECT *
FROM (
                SELECT ROWNUM AS RNUM, E.*
                FROM (
                                SELECT DEPT_CODE, DEPT_TITLE, TO_CHAR( FLOOR(AVG( SALARY)),'L999,999,999')
                                FROM EMPLOYEE
                                    JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID
                                GROUP BY DEPT_CODE,DEPT_TITLE
                                ORDER BY 3 DESC
                ) E
        )
 WHERE RNUM < 4;
 
 --RANK() OVER()함수 이용하기
 --연봉 상위 1~3인 사원 구하기
SELECT *
FROM (
                SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) AS 순위
                FROM EMPLOYEE)
WHERE 순위 BETWEEN 5 AND 10;

 --연봉 하위 1~3인 사원
 SELECT *
FROM (
                SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY ASC) AS 순위
                FROM EMPLOYEE)
WHERE 순위 <=3;

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY ASC) AS 순위
FROM EMPLOYEE;
--중복값 나왔을 때 같은 순위를 부여하고 다음 번호를 건너뛰고 넘어감(5번 2명, 다음 7번)
SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY ASC) AS 순위
FROM EMPLOYEE;
--다음 번호를 건너뛰지 않고 부여함(5번 2명, 6번)

--계층형 쿼리
--FROM절에 옵션을 부여하여 할 수 있음
--START WITH : 부모ROOT노드
--CONNECT BY : 부모-자식 관계를 설정
--PRIOR : 부모행부터 나오고 그 밑에 자식행이 나오게 하는 옵션
--LEVEL : 자동으로 부여되는 번호, ROOT노드가 LEVEL 1
SELECT LEVEL, EMP_ID, EMP_NAME, MANAGER_ID
FROM EMPLOYEE
START WITH EMP_ID=200 --이게 LEVEL1
CONNECT BY PRIOR EMP_ID = MANAGER_ID;

--보여주기 위해 쓴 거
SELECT LPAD( ' ', (LEVEL-1)*5, ' ') || EMP_NAME || NVL2(MANAGER_ID, '(' || MANAGER_ID || ')', ' ') AS 조직도
FROM EMPLOYEE
START WITH EMP_ID=200
CONNECT BY PRIOR EMP_ID = MANAGER_ID;

--DDL 
--CREATE : 테이블(데이터를 저장하는 공간)을 생성. 
--CREATE TABLE 테이블명 (컬럼명 자료형(크기))
--오라클데이터형 : VARCHAR2(바이트 크기)- 문자열. 최대 2000BYTE. 한글 3바이트. 길어지면 CLOB쓰기
--, NUMBER, DATE 외우기

--1. 숫자형 자료형 NUMBER
--기본적으로 선언할 때는 그냥 NUMBER만 사용해도 괜찮음
--NUMBER(PRECISION, SCALE)
--PRECISION : 표현할 수 있는 전체 자리 수를 의미 -> 숫자(1~38)
--SCALE : 소수점이하 자리수 -> 숫자(-84~127)까지 넣을 수 있음
CREATE TABLE TBL_NUMBERTEST(
    A NUMBER, --기본 출력
    B NUMBER(5), --정수 5개공간 확보. 5자리 수 
    C NUMBER(5,1), --정수5자리 소수점 1자리-자리수가 줄면 반올림해서 들어감
    D NUMBER(5,-2) --소수점기준 앞으로 2칸 옮기고 반올림해서 0 처리
);
DROP TABLE TBL_NUMBERTEST;--테이블 삭제

INSERT INTO TBL_NUMBERTEST
VALUES (1234.567, 1234.567, 1234.567, 1234.567);

INSERT INTO TBL_NUMBERTEST
VALUES (1234.567, 1234.567, 1234.567, 1264.567);

INSERT INTO TBL_NUMBERTEST
VALUES (123400.567, 123400.567, 123400.567, 126400.567); --더 큰 값을 넣으면 오류남

SELECT * FROM TBL_NUMBERTEST;

--문자형 : 문자는 따로 없고 문자열로 봄
--CHAR : 고정길이, 최대 2000바이트, 
--VARCHAR2 : 가변길이 문자 데이터, 최대 4000바이트 가능
--NCHAR, NVARCHAR2(유니코드값)
--VARCHAR2 권장함

CREATE TABLE TBL_STRTEST(
    NAME VARCHAR2(6),
    ADDRESS VARCHAR(20)
); --생성할 때 크기를 지정해줘야 함. 최대 크기로 지정하자. 나중에 더 늘릴수도 가능
DROP TABLE TBL_STRTENT;

INSERT INTO TBL_STRTEST VALUES('안녕','경기도 시흥시');
--INSERT INTO TBL_STRTEST VALUES('안녕하','경기도 시흥시'); 9바이트여서 오류남

SELECT * FROM TBL_STRTEST;

--날짜형 : DATE
--년/월/일 * 시, 분, 초
CREATE TABLE TBL_DATETEST(
    DAY DATE
);

INSERT INTO TBL_DATETEST VALUES('20/01/01');
INSERT INTO TBL_DATETEST VALUES('2020/01/01'); --정해진 양식대로 출력됨
INSERT INTO TBL_DATETEST VALUES(TO_DATE('20200101', 'YYYYMMDD'));

SELECT * FROM TBL_DATETEST;

--테이블을 생성해보자!
--CREATE TABLE [객체명] 테이블명(
--      컬럼명 자료형 [제약조건    ], 컬럼명 자료형, 컬럼명 자료형
--);
CREATE TABLE MEMBER(
    MEMBER_ID VARCHAR2(20), --컬럼끼리는 , 구분 / 자료형과 컬럼명 사이는 띄어쓰기로 구분함
    MEMBER_PWD VARCHAR2(20),
    MEMBER_NAME VARCHAR2(30),
    MEMBER_AGE NUMBER
);
SELECT * FROM MEMBER;

--컬럼별로 주석을 달아놓을 수 있음
COMMENT ON COLUMN MEMBER.MEMBER_ID IS '회원아이디';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '비번 8자리 이상 특수문자포함';

SELECT * FROM USER_COL_COMMENTS; --전체 주석확인
SELECT * FROM USER_COL_COMMENTS WHERE TABLE_NAME = 'MEMBER'; --MEMBER테이블만 조회

--데이터를 안정적으로 보관하기 위한 장치. 데이터 무결성을 유지하기 위해 
--제약 조건 - 테이블 작성 시 설정
--NOT NULL : 컬럼에 기본으로 NULL제약조건 설정됨. 아이디, 패스워드 같은 거 NULL허용 안 함
CREATE TABLE USER_NN (
    USER_NO NUMBER,
    USER_ID VARCHAR2(20),
    USER_PW VARCHAR2(20)
);
SELECT * FROM USER_NN;
INSERT INTO USER_NN VALUES(1, 'USER01', '1234');
INSERT INTO USER_NN VALUES(NULL,NULL,NULL);
--NOT NULL 제약조건 설정하기
CREATE TABLE USER_NN2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) NOT NULL,
    USER_PW VARCHAR2(20) NOT NULL
);
INSERT INTO USER_NN2 VALUES(1,'USER01','1234');
INSERT INTO USER_NN2 VALUES(2,NULL,NULL); --안들어감
INSERT INTO USER_NN2 VALUES(3,NULL,'1234'); --안들어감
INSERT INTO USER_NN2 VALUES(NULL,'USER02','1234');
SELECT * FROM USER_NN2;
INSERT INTO USER_NN2 VALUES(1,'USER01','1234'); --제약조건이 없는 상태여서 들어감

--UNIQUE : 컬럼에 중복값 허용하지 않는 제약조건
CREATE TABLE USER_UQ(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) UNIQUE, --컬럼 레벨에 제약조건 설정
    USER_PW VARCHAR2(20)
);
INSERT INTO USER_UQ VALUES(1,'USER01','1234');
SELECT * FROM USER_UQ;
INSERT INTO USER_UQ VALUES(2,'USER01','1234');--ID 중복이어서 안됨
INSERT INTO USER_UQ VALUES(1,'USER02','1234'); --ID만 다르게
--테이블 레벨에서 설정하기
CREATE TABLE USER_UQ2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20), 
    USER_PW VARCHAR2(20),
    UNIQUE(USER_ID) --테이블레벨 설정
);
INSERT INTO USER_UQ2 VALUES(1,'USER01','JINHO');
INSERT INTO USER_UQ2 VALUES(2,'USER01','CHOHYUN');
--UNIQUE제약조건이 설정된 컬럼에는 NULL값이 들어갈 수 있을까?
INSERT INTO USER_UQ2 VALUES(3,NULL,'되니?'); --들어감. 중복됨
SELECT * FROM USER_UQ2;
--UNIQUE는 컬럼 두 개 설정할 수 있을까?
CREATE TABLE USER_UQ3(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20), 
    USER_PW VARCHAR2(20),
    UNIQUE(USER_ID, USER_PW) -- 2개 값을 하나로 묶어, 둘 다 같을 때만 중복값으로 봄
);
INSERT INTO USER_UQ3 VALUES(1,'USER01','1234');
INSERT INTO USER_UQ3 VALUES(1,'USER01','1235'); --PW만 달라도 들어가짐
SELECT * FROM USER_UQ3;

--PRIMARY KEY : NULL과 중복값 허용하지 않음 (컬럼의 고유 식별자로 사용하기위해) 인덱스도 부여됨- 빠른 검색 가능
--테이블의 각 ROW를 구분할 수 있는 컬럼으로 지정
--NOT NULL, UNIQUE 동시에 설정 됨.
--테이블에 통상 한 개 컬럼에 설정
--복합키 : PK를 두 개 지정. 둘을 그룹화하여 둘 다 같은 값만 허용하지 않음
CREATE TABLE USER_PK (
    USER_NO NUMBER PRIMARY KEY,
    USER_ID VARCHAR2(20) NOT NULL UNIQUE, -- 한 테이블에 여러 개 제약조건 걸 수 있음
    USER_PW VARCHAR2(20) NOT NULL
);

INSERT INTO USER_PK VALUES(1,'USER01','1234');
INSERT INTO USER_PK VALUES(1,'USER02','4567'); -- 중복값 안 됨
INSERT INTO USER_PK VALUES(NULL,'USER02','4567'); --NULL 안 됨

SELECT * FROM USER_PK;
--PRIMARY KEY  테이블레벨에서도 제약조건을 설정할 수 있음
CREATE TABLE USER_PK2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) NOT NULL UNIQUE,
    USER_PW VARCHAR2(20) NOT NULL,
    PRIMARY KEY(USER_NO)
);
INSERT INTO USER_PK2 VALUES(1,'USER01','1234');
INSERT INTO USER_PK2 VALUES(1,'USER02','4567'); -- 중복값 안 됨
INSERT INTO USER_PK2 VALUES(NULL,'USER02','4567'); --NULL 안 됨
--PK를 두 개 컬럼에 설정(복합키)
CREATE TABLE ORDER_PK (
    PRODUCT_NO VARCHAR2(20),
    USER_ID VARCHAR2(20),
    ORDER_DATE DATE,
    ORDER_NUM NUMBER,
    PRIMARY KEY(PRODUCT_NO, USER_ID, ORDER_DATE) --복합키는 테이블레벨에서만 가능
);

INSERT INTO ORDER_PK VALUES('P1','USER01',SYSDATE,1);
INSERT INTO ORDER_PK VALUES('P1','USER02',SYSDATE,2);
INSERT INTO ORDER_PK VALUES('P2','USER01',SYSDATE,2);
INSERT INTO ORDER_PK VALUES('P1','USER01',SYSDATE,10);
INSERT INTO ORDER_PK VALUES('P2','USER01','20/07/30',1);
INSERT INTO ORDER_PK VALUES('P2','USER01','20/07/31',1);
INSERT INTO ORDER_PK VALUES('P3','USER01',NULL,1);--NULL 안됨
INSERT INTO ORDER_PK VALUES('P3','USER01','99/12/24',1);

SELECT * FROM ORDER_PK;

--중요!!!
--FOREIGN KEY : 참조되는 테이블의 컬럼이 값이 존재하면 허용. 참조키
--외래키. 다른 테이블의 특정 컬럼에 있는 데이터만 저장할 수 있게 하는 것
--참조대상이 되는 컬럼은 UNIQUE 제약조건이 있어야 함. NULL 가능
--PRIMARY KEY를 설정해도 됨(UNIQUE 제약조건 들어가 있음). NOT NULL의 차이가 있음
CREATE TABLE SHOP_MEMBER(
    USER_NO NUMBER UNIQUE,
    USER_ID VARCHAR2(20) PRIMARY KEY,
    USER_PW VARCHAR2(20) NOT NULL,
    USER_NAME VARCHAR2(30)
);
INSERT INTO SHOP_MEMBER VALUES(1,'USER01','1234', '설진호');
INSERT INTO SHOP_MEMBER VALUES(2,'USER02','2222', '조현');
INSERT INTO SHOP_MEMBER VALUES(3,'USER03','3333', '강경록');
INSERT INTO SHOP_MEMBER VALUES(4,'USER04','4444', '이세현');
COMMIT; --완전히 저장됨
SELECT * FROM SHOP_MEMBER;

CREATE TABLE SHOP_BUY(
    BUY_NO NUMBER PRIMARY KEY,
    USER_ID VARCHAR2(20) REFERENCES SHOP_MEMBER(USER_ID), 
    --REFERENCES 참조하는 테이블명(컬럼명)
    --회원구매이력이므로 SHOP_MEMBER에 저장된 ID가 같아야 함.회원가입  안하면 못 사게.
    PRODUCT_NAME VARCHAR2(20),
    REG_DATE DATE
);
INSERT INTO SHOP_BUY VALUES(1,'USER01','자동차','20/07/30');
INSERT INTO SHOP_BUY VALUES(2,'USER02','국회','21/07/30');
INSERT INTO SHOP_BUY VALUES(2,'USER00','국회','21/07/30');--안 됨
SELECT * FROM SHOP_BUY;
--테이블 간의 참조관계가 설정이 되면
--참조되는 부모테이블의 값을 함부로 삭제할 수 없음! -> 자식테이블에서 삭제 후 삭제 또는 삭제되면 NULL값 처리하는 옵션 값을 줄 수 있음
--자식테이블에 부모를  참조하고 있는 ROW가 하나라도 있으면 지울 수 없음
DELETE FROM SHOP_MEMBER WHERE USER_ID = 'USER01';
DELETE FROM SHOP_MEMBER WHERE USER_ID = 'USER04'; --삭제 됨. 자식이 참조하고 있지 않아서
DROP TABLE SHOP_MEMBER; --테이블도 안 지워짐.

--CHECK : 저장 가능한 데이터 값의 범위나 조건을 설정
