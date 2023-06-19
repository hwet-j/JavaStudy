SELECT *
FROM dept;

INSERT INTO dept 
VALUES(seq_dno.nextval, '디%자인', '경주');

INSERT INTO dept 
VALUES(seq_dno.nextval, '총무_부', '경주');

SELECT *
FROM dept
WHERE dname = 'ACCOUNTING' --대소문자를 구분함

-- UPPER , LOWER, INITCAP(앞문자만 대문자로 나머지 소문자)
SELECT *
FROM dept
WHERE dname = UPPER('accoUnTING') --대소문자를 구분하기 때문에 UPPER로 대문자로 변환

SELECT *
FROM dept
WHERE dname LIKE '%'

--부서명이 S로 끝나는 부서정보조회
select deptno,dname,loc
from dept
where dname LIKE '%S'; 

--부서명이 A가 포함된 부서정보조회
select deptno,dname,loc
from dept
where dname LIKE '%A%'; 


-- 부서명에 %가 포함된 정보조회
select deptno,dname,loc
from dept
where dname LIKE '%@%%' ESCAPE '@';

-- 부서명에 _가 포함된 정보조회
select deptno,dname,loc
from dept
where dname LIKE '%&_%' ESCAPE '&';
