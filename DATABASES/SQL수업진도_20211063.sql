--DESC: Description 테이블 구조 설명
DESC dept;
--select: 테이블 내용 조회 where 조회조건, as(Alias)별칭으로 필드명이 길때
SELECT
concat (deptno, '번') as"부서번호" ,
dname as"부서명" ,
concat (loc,'시') as"위치"
FROM dept WHERE loc = 'NEW YORK';
--DUAL 가상테이블이름. 테이블이 없는 내용을 select할때
SELECT 3+5 as "3더하기8은" from dual;
--레코드(row) : 컬럼(필드field)들로 구성
SELECT concat(count(*),'명') as "연봉이 2000이상 직원" FROM emp WHERE sal > 2000;
--" " 필드명, ' ' 문자열
SELECT * FROM emp WHERE ename != 'KING';
SELECT * FROM emp WHERE hiredate = '1982/01/01';
-- OR은 + (합집합) , AND 는 x (교집합)
SELECT * FROM emp WHERE deptno = 10 AND job = 'MANAGER';
SELECT * FROM emp WHERE sal NOT BETWEEN 2000 AND 3000 ;
SELECT * FROM emp WHERE hiredate BETWEEN '1980/01/01' AND '1980.12.31' ;
SELECT * FROM emp WHERE comm NOT IN (300,500,1400);
--LIKE 조회, 와일드카드 조회
--키워드에 괄호가 있으면 함수
SELECT * FROM emp WHERE ename LIKE 'T%';
SELECT * FROM emp WHERE ename LIKE upper('k%');
-- null이 있으면 검색 x
-- null이 있을때 검색방법
SELECT * FROM emp WHERE comm IS NULL;
--NVL(Null VAlue) 널값을 대체하는 함수
SELECT nvl(comm,0), E.* FROM emp E WHERE NVL(comm,0) >= 0 ;
--NVL2(필드명,널이아닐때 100,널일때0),NVL(필드명,널일때0)
--오라클은 표준쿼리x, ANSI쿼리가 표준
SELECT DECODE(comm,null,0,100),NVL2(comm,100,0), E.* FROM emp E WHERE NVL(comm,0) = 0;
--정렬 sort = 순서 order by 필드명 오름차순|내림차순
SELECT ROWNUM, E.* FROM ( --테이블명
SELECT * FROM emp ORDER BY sal DESC) E WHERE ROWNUM = 1;
--위 정렬에서 1등만 구할 limit는 Mysql(마리아DB)의 명령어. 오라클에 없음
--AI(AutoIncrement) 자동증가값 명령 오라클에 없음
--중복레코드(row)를 제거하는 명령어 distinct
SELECT deptno as "부서번호" FROM emp;
SELECT DISTINCT deptno as "부서번호" FROM emp;
--문자열을 연결할때 concat함수외에 ||파이프라인 2개로 겹치기.
SELECT ename ||' is a '||job As "문자열 연결" FROM emp;





