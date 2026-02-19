SELECT * FROM emp;

SELECT empno, ename, deptno FROM emp;

SELECT
	sal,
	ename,
	123,
	'문자eng123'
FROM emp;

SELECT deptno FROM emp;
SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT job FROM emp;

SELECT ename, sal, sal*12+comm, comm FROM EMP;
SELECT ename, sal, sal*12+comm AS "ann sal", comm FROM EMP;
SELECT ename, sal, sal*12+comm AS annsal, comm FROM EMP;
SELECT ename, sal, sal*12+comm annsal, comm FROM EMP;
SELECT ename name FROM emp;
SELECT ename as name FROM emp;
SELECT ename as 이름 FROM emp;

SELECT * FROM emp 
ORDER BY sal;
SELECT * FROM emp 
ORDER BY sal asc;

SELECT * FROM emp 
ORDER BY sal desc;

SELECT * FROM emp 
ORDER BY empno DESC;

SELECT * FROM emp
ORDER BY deptno, sal, empno;

SELECT * FROM emp
ORDER BY deptno asc, sal desc, empno;

SELECT DISTINCT job FROM emp;

SELECT 
	empno AS employee_no, 
	ename employee_name 
FROM emp
ORDER BY deptno DESC, ename ASC;

SELECT * 
FROM emp
WHERE deptno = 30;

SELECT * FROM emp
WHERE deptno = 30 AND job = 'SALESMAN';

SELECT * FROM emp
WHERE empno = 7499 AND deptno = 30;

SELECT * FROM emp
WHERE mgr = 7839 AND deptno = 20;

SELECT * FROM emp
WHERE deptno = 30 OR job = 'CLERK';


-- 한줄 주석
/*
	범위 주석
 */
SELECT * FROM emp
WHERE
	/*(deptno = 30
	OR deptno = 20)
	AND*/ job = 'CLERK'
ORDER BY deptno;

SELECT * FROM emp
WHERE sal >= 3000;

SELECT * FROM emp
WHERE sal >= 2500 AND job = 'ANALYST'; 

SELECT * FROM emp
--WHERE sal != 3000;
WHERE sal <> 3000;

SELECT * FROM emp
WHERE NOT sal <= 3000;



--문제1
--급여가 1500 이상이고 3000 미만인 사원을 출력
SELECT * FROM emp
WHERE 1500 <= sal AND sal < 3000;

--문제2
--job이 CLERK 이거나 급여가 2000 초과 이면서 부서번호 10번인 사원 출력
SELECT * FROM emp
WHERE
	job = 'CLERK'
	OR sal > 2000
	AND deptno = 10;

SELECT * FROM emp
WHERE
	job = 'CLERK'
	OR (sal > 2000 AND deptno = 10);

SELECT * FROM emp
WHERE
	(job = 'CLERK' OR sal > 2000)
	AND deptno = 10;

--문제3
--deptno가 10 또는 20인 모든 사원
SELECT * FROM emp
WHERE
	deptno = 10
	OR deptno = 20;

--문제4
--부서번호가 20또는 30인 사원 중에서 급여가 2000~3000 사이(포함)인 사람의
--연봉이 작은 순으로 출력. 단, 연봉이 같은 경우 이름이 빠른 순으로 정렬하여 출력
SELECT * FROM emp
WHERE
	(deptno = 20 OR deptno = 30)
	AND (sal >= 2000 AND sal <= 3000)
ORDER BY sal ASC, ename;

SELECT * FROM emp
WHERE deptno IN (10, 20);

SELECT * FROM emp
WHERE deptno not IN (10, 20);

-- 2000 이상이고 3000 이하
-- between은 미만, 초과는 표현할 수 없다
SELECT * FROM emp
WHERE (sal BETWEEN 2000 AND 3000);

-- 2000 이상이고 3000 이하
-- 2000 >= sal and sal <= 3000
-- 2000 미만이거나 3000 초과
-- not (2000 >= sal and sal <= 3000)
-- 2000 < sal or sal > 3000
SELECT * FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000);

SELECT * FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000)
AND deptno = 30;

SELECT * FROM emp
WHERE ename LIKE 'S%';

-- N으로 끝나는 이름
SELECT * FROM emp
WHERE ename LIKE '%N';

SELECT * FROM emp
WHERE ename LIKE '_L%';

-- 이름이 다섯 글자인 사람
SELECT * FROM emp
WHERE ename LIKE '_____';

SELECT * FROM emp
WHERE ename LIKE '%AM%';

SELECT * FROM emp
WHERE ename NOT LIKE '%A%';

SELECT * FROM emp
WHERE ename LIKE '%A%S%';


SELECT comm FROM emp;

SELECT * FROM emp
WHERE comm = NULL;

SELECT * FROM emp
WHERE comm IS NULL;

SELECT * FROM emp
WHERE comm IS NOT NULL;


SELECT * FROM emp
WHERE ename LIKE '%A%' AND deptno IN (10,20);

SELECT * FROM EMP WHERE deptno = 10;	-- 3명
SELECT * FROM EMP WHERE deptno = 20;	-- 5명

SELECT * FROM EMP WHERE deptno = 10
union
SELECT * FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION 
SELECT sal, job, deptno, sal FROM emp WHERE deptno = 20;

SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION all
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10;

-- Q1
SELECT * FROM emp
WHERE ename LIKE '%S';
-- Q2
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE deptno = 30 AND job = 'SALESMAN';
-- Q3-1
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno IN (20, 30) AND sal > 2000;
-- Q3-2
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno = 20 AND sal > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno FROM emp
WHERE deptno = 30 AND sal > 2000;
-- Q4
SELECT * FROM emp
WHERE NOT (sal >= 2000 AND sal <= 3000);
-- Q5
SELECT ename, empno, sal, deptno FROM emp
WHERE 
	ename LIKE '%E%'
	AND deptno = 30
	AND sal NOT BETWEEN 1000 AND 2000;
-- Q6




/* 함수 */
SELECT ename, upper(ename), lower(ename), initcap(ename)
FROM emp;

SELECT 1 FROM dual;
SELECT upper('aBc'), lower(123), upper( lower('aBc') ) FROM dual;

SELECT * FROM emp
WHERE lower(ename) LIKE lower('%aM%');

SELECT ename, length(ename) FROM emp;

SELECT * FROM emp
WHERE length(ename) = 5;

SELECT length('a'), length('한'), lengthb('a'), lengthb('한') FROM dual;

-- substr(대상, 시작하는 곳, 몇 개)
SELECT 
	job, 
	substr(job, 1, 2), 
	substr(job, 3, 3), 
	substr(job, 5)
FROM emp;
-- 사원 이름을 두번째부터 3글자만 출력
SELECT substr(ename, 2, 3) FROM emp;
SELECT substr(ename, 2, 3000) FROM emp; -- 마지막 숫자가 커도 끝까지만 출력
SELECT substr(ename, 20, 3) FROM emp; -- 실제 길이보다 시작이 크면 null

SELECT ename, substr(ename, -3, 2) FROM emp;
SELECT ename, substr(ename, -30, 2) FROM emp;

-- replace(대상, 바뀔 문자, 바꿀 문자)
-- "모든" 바뀔 문자를 바꿀 문자로 변경
SELECT 
	'a-b-c',
	replace('a-b-c', '-', ' '),
	replace('a-b-c', '-', ';'),
	replace('a-b-c', '-'),
	replace('a-b-c', '-', '')
FROM dual;

-- 사원 이름에 A를 모두 'abc'로 교체
SELECT ename, replace(ename, 'A', 'abc') FROM emp;

-- lpad, rpad
-- 모자르면 채우고
-- 넘치면 자른다
-- 즉, 두번째 값의 길이로 만들어준다
SELECT lpad(ename, 10, '#'), lpad(ename, 5, '#') FROM emp;



-- 문제1
--	ename에서 앞에 두 글자만 출력
--	substr, lpad, replace
--	WARD >> WA, SMITH >> SM
SELECT 
	ename, 
	substr(ename, 1, 2), 
	lpad(ename, 2, ' '),
	-- 원본에서 
	-- 3번째 부터 끝까지 문자를 
	-- 없애자
	replace(ename, substr(ename, 3), '' )
FROM emp;

-- 문제2
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 4개의 *로 표시
--	WARD >> WA****, SMITH >> SM**** 
SELECT
	substr(ename, 1, 2),
	rpad(substr(ename, 1, 2), 6, '*')
FROM emp;
-- 문제3
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 *로 출력
-- 	단, 전체 길이는 원래 이름의 길이만큼
--	WARD >> WA**, SMITH >> SM*** 

SELECT
	substr(ename, 1, 2),
	rpad(substr(ename, 1, 2), LENGTH(ename), '*')
FROM emp;
-- 문제 4
-- 앞 두글자만 *처리
SELECT
	ename,
	substr(ename, 3),
	lpad(substr(ename, 3), LENGTH(ename), '*')
FROM emp;
	
SELECT 'ab' || 'cd' || 'efg' FROM dual;
SELECT empno || ':' || ename FROM emp;

SELECT 
	'[' || '  _ _oracle_ _   ' || ']',
	'[' || trim('  _ _oracle_ _   ') || ']'
FROM dual;

SELECT
	round(14.46),
	round(14.46, 0),
	round(14.46, 1), -- 14.5
	round(14.46, -1)
FROM emp;

SELECT
	trunc(14.46),
	trunc(14.46, 0),
	trunc(14.46, 1),
	trunc(14.46, -1),
	trunc(-14.46)
FROM emp;

SELECT
	ceil(3.14),
	floor(3.14),
	ceil(-3.14),
	floor(-3.14),
	trunc(-3.14)
FROM emp;

SELECT
	mod(15, 6), mod(15, 0)
FROM dual;

SELECT 15/6, 15/0 FROM dual;

SELECT 
	mod(6, 3), 
	mod(7, 3), 
	mod(8, 3), 
	mod(9, 3)
FROM dual;

SELECT sysdate FROM dual;

SELECT to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') FROM dual;
SELECT * FROM emp;
SELECT to_char(
         sysdate,
         'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"'
       )
FROM dual;

SELECT * FROM emp
WHERE hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

SELECT 
	sal, comm, 
	nvl(comm, 0), 
	sal+nvl(comm, 0), 
	sal+comm,
	nvl(to_char(comm), 'N/A')
FROM emp;

SELECT job,sal,
	decode(job,						-- job이
			'MANAGER', sal*1.1,		-- 정확히 MANAGER라면
			'SALESMAN', sal*1.05,
			'ANALYST', sal,
			sal*1.03				-- 위 조건에 없다면
			) AS upsal
FROM emp;

SELECT job, sal,
	CASE job
		WHEN 'MANAGER' THEN sal*1.1
		WHEN 'SALESMAN' THEN sal*1.05
		WHEN 'ANALYST' THEN sal
		ELSE sal*1.03
	END AS upsal
FROM emp;

SELECT
	comm,
	CASE 
		WHEN comm IS NULL THEN '원래 없어요'
		WHEN comm = 0 THEN '수당 없음'
		WHEN comm > 0 THEN '수당: ' || comm
	END AS text
FROM
	emp;
	

SELECT ename, LENGTH(ename) FROM emp;

SELECT sum(comm) FROM emp;

SELECT sum(sal) FROM emp;
--SELECT sum(sal),sal FROM emp; 못 쓴다

SELECT count(sal) FROM emp;
SELECT count(comm) FROM emp;
SELECT count(*) FROM emp;

SELECT count(*) FROM emp 
WHERE deptno =30;

SELECT max(sal) FROM emp;
SELECT min(sal) FROM emp;

SELECT 
	max(sal),min(sal) , min(hiredate), min(comm),
	count(*), sum(sal)  
	FROM emp;

SELECT avg(sal) FROM emp;

-- 이름에 a가 들어가는 사람은 몇명? 
-- 'a'
SELECT count(*) FROM emp
WHERE lower(ename) LIKE lower ('%a%'); 
-- lower 를 앞에도 붙여야한다  count sum은 where 에서 못쓴다 지금은, 

SELECT DISTINCT deptno FROM emp;

------------------
-- group by 
/*
 *  제약 1. select에는 group by에 적은 컬럼 명만 가능하다 
 * 	제약 2. select에 집계 함수는 가능하다 
 */
SELECT deptno
FROM emp
GROUP BY deptno;

SELECT deptno, count(*) ,sum(sal)
FROM emp
GROUP BY deptno;

SELECT deptno, job
FROM emp
GROUP BY deptno, job

SELECT deptno, job, count(*)
FROM emp
GROUP BY deptno, job

/*
SELECT * FROM emp 
WHERE avg(sal) <sal;
*/

SELECT deptno, job  
FROM emp
WHERE deptno=10
GROUP BY deptno, job;

SELECT deptno, job 
FROM emp
--WHERE deptno=10   
GROUP BY deptno, job
	HAVING deptno = 10;

SELECT deptno, job, avg(sal)
FROM emp
GROUP BY deptno, job;

SELECT deptno, job, avg(sal)
FROM emp
GROUP BY deptno, job
	HAVING avg(sal) > 2000;  -- group by 없이 having 쓸 수 없다
	
-- job 별로 3명 이상인 job 과 count (*)를 출력 
SELECT job , count(*) --cnt
FROM EMP 
-- where cnt >=3 ;  as로 별칭을 줘도 작동 안함
-- where count(*) >=3; where에는 집계함수 못씀.
GROUP BY JOB 
	HAVING count(*) >=3 ;

-- 실행 순서 
/* 5 */SELECT job, 1 AS cnt
/* 1 */FROM emp
/* 2 */WHERE sal> 1000
/* 3 */GROUP BY job
/* 4 */HAVING count(*) >=3
/* 6 */ORDER BY cnt DESC;

SELECT * FROM dept;
SELECT * FROM emp;

--모든 조합 뽑기 
SELECT * FROM emp,dept;

SELECT * FROM emp,dept
ORDER BY empno;

--- emp에서 smith의 deptno만 출력
SELECT deptno FROM emp WHERE ename = 'SMITH';
--dept에서 deptno가 20인 모든 컬럼 출력
SELECT * FROM dept WHERE deptno =20; 

--where로 필요한 것만 뽑는다 
SELECT * 
FROM emp ,dept 
WHERE emp.deptno = dept.deptno;

SELECT *
FROM emp e,dept d
--WHERE emp.deptno = dept.deptno
WHERE e.deptno = d.deptno; --별칭으로 쓰기 

--SELECT ename, * FROM emp; 사용불가 
SELECT ename, emp.*FROM emp;
--scheme - 테이블이 만들어지는 공간 오라클은 id에 붙어있다?

--column ambiguously defined error
SELECT ename, deptno
FROM emp e,dept d
WHERE e.deptno = d.deptno;

SELECT ename, e.deptno,e.*
FROM emp e,dept d
WHERE e.deptno = d.deptno;

SELECT * FROM salgrade;

--800
SELECT sal FROM emp WHERE ename ='SMITH'; 

SELECT ename,sal,grade,losal,hisal
FROM EMP e, salgrade s
WHERE e.sal >=s.losal AND e.sal<=s.hisal

--7902
SELECT MGR FROM emp WHERE ename ='SMITH'; 
SELECT * FROM EMP WHERE EMPNO=7902;

--king은 mgr이 null 이어서 결과에서 빠졌다
SELECT e1.empno, e1.ename, e1.mgr,
	   e2.empno, e2.ename, e2.mgr
FROM EMP e1,emp e2
WHERE e1.mgr = e2.empno;

SELECT *
FROM emp e NATURAL JOIN dept d;  -- 중요하진 않음 .

SELECT deptno
FROM emp e NATURAL JOIN dept d;

SELECT deptno    
FROM emp e JOIN dept d USING (deptno); -- using을 쓸떄는 테이블 지정 하지않기! 

-- join과 on은 같이 써야한다
SELECT d.deptno,d.*
FROM emp e JOIN dept d ON(e.deptno=d.deptno) -- ()는 조건식 true/false
WHERE sal <=2000;

SELECT *
FROM emp e1 JOIN emp e2 ON(e1.mgr = e2.empno);

SELECT *
FROM emp e1 LEFT OUTER JOIN emp e2 ON(e1.mgr = e2.empno); --왼쪽에 나오는 것을 보장해준다?

SELECT *
FROM emp e1 right OUTER JOIN emp e2 ON(e1.mgr = e2.empno);

SELECT *
FROM emp e1 full OUTER JOIN emp e2 ON(e1.mgr = e2.empno);

--
--각 부서별로 
-- 가장 높은 급여, 
-- 가장 낮은 급여,
-- 급여 차액,
-- 부서 번호
-- HINT : 결과는 총 3줄 
 SELECT max(sal) , min(sal),max(sal)-min(sal), deptno
 FROM emp
 GROUP BY deptno;
 
 -- 226p. 1~4번까지 풀기
SELECT d.deptno, dname, empno, ename ,sal
FROM emp e,dept d
WHERE sal>2000 AND e.deptno =d.deptno
GROUP BY d.deptno, d.dname, e.empno, e.ename ,e.sal
ORDER BY d.deptno;

SELECT d.deptno, d.dname, e.empno, e.ename ,e.sal
FROM emp e LEFT OUTER JOIN dept d ON e.deptno=d.DEPTNO 
WHERE sal> 2000
ORDER BY e.deptno,job;

--2번

SELECT d.deptno,d.dname, floor(avg(sal)),max(sal),min(sal),count(*)
FROM emp e, dept d 
WHERE e.deptno=d.deptno
GROUP BY d.deptno,d.dname;

--3번 
SELECT d.deptno, d.dname,e.empno,e.ename,e.job,e.sal
FROM dept d left OUTER JOIN emp e on(e.deptno=d.deptno)
ORDER BY d.deptno,ename;
--4번 
 -- salgrade , emp e , dept d 
SELECT d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal,e.deptno AS deptno_1,s.losal,s.hisal,s.grade,
e1.empno AS mgr_empno,e1.ename AS mgr_ename
FROM dept d LEFT OUTER JOIN emp e ON(e.deptno=d.deptno) 
	 		LEFT OUTER JOIN salgrade s ON(e.sal>=s.losal AND e.sal <=s.hisal)
	 		LEFT OUTER JOIN emp e1 ON (e.mgr=e1.empno)
    ORDER BY d.deptno, e.empno;

-------------
--서브쿼리
-------------

SELECT * 
FROM emp 
--WHERE sal >2975;
WHERE sal > ( SELECT SAL 
				FROM EMP 
				WHERE ename= 'JONES'); -- ()안 결과가 2975 

SELECT *
FROM EMP 
WHERE hiredate< (SELECT hiredate 
				 FROM EMP 
				 WHERE ename ='SCOTT');

SELECT *FROM EMP 
WHERE sal > (SELECT avg(sal) FROM emp);

SELECT max(sal) FROM emp 
GROUP BY deptno;

SELECT * FROM emp 
WHERE sal IN (2850,3000,5000);

SELECT * FROM emp 
WHERE sal IN (SELECT max(sal) FROM emp 
			  GROUP BY deptno);

SELECT *
FROM (SELECT *
	  FROM EMP 
	  WHERE deptno=10) e10, dept d 
WHERE e10.deptno = d.deptno;
	  
SELECT job, count(*)
FROM emp 
GROUP BY job
HAVING count(*)>=3;

--cnt는 select에서 동작하고
-- where은 그 전에 실행 된다 
SELECT job, count(*) cnt
FROM emp 
--WHERE cnt >=3
GROUP BY job

SELECT * 
FROM (SELECT job, count(*) cnt
	  FROM emp 
	  GROUP BY job)
WHERE cnt >=3;

SELECT rownum, e.*  -- 줄 번호 매기기 
FROM emp e;

SELECT rownum, e.*  
FROM emp e
ORDER BY sal;

SELECT rownum,e.*
FROM (
	SELECT * FROM emp
	ORDER BY sal 
) e;

SELECT rownum,e.*
FROM (
	SELECT * FROM emp
	ORDER BY sal 
) e
WHERE rownum =6;  -- rownum 자체가 의미가 있다...

SELECT rownum rnum,e.*
FROM (
	SELECT * FROM emp
	ORDER BY sal 
) e
WHERE rnum =6; -- select절이 가장 나중에 실행되서 rnum을 모름 

SELECT * 
FROM (
	SELECT rownum rnum,e.*
	FROM (
		SELECT * FROM emp
		ORDER BY sal 
	) 	e
)
WHERE rnum >=6 AND rnum<=10;

WITH e10 AS (
	SELECT *FROM emp WHERE deptno =10
)
 SELECT * FROM e10;

SELECT   --select절에 사용하는서브 쿼리 
	sal,
	ename,
	(SELECT 
		grade
	 FROM SALGRADE
	 WHERE e.sal BETWEEN losal AND hisal) grade
FROM emp e;

-- 문제1 
-- comm이 null 인 사원을 급여 내림차순으로 정렬
SELECT COMM ,SAL ,ENAME
FROM EMP
WHERE COMM IS NULL
ORDER BY SAL DESC;

-- 문제2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬 
-- 등급, 몇명 출력 
SELECT s.grade ,count(*) 
FROM salgrade s , emp e 
WHERE  e.sal BETWEEN losal AND hisal
GROUP BY s.GRADE 
ORDER BY s.grade

--문제3
--출력: 이름 , 급여 ,급여 등급 , 부서 이름 조회 
--급여 등급 3 이상 ,급여 등급 내림차순 , 
-- 급여 등급이 같은경우 급여 내림차순 

SELECT e.ename,e.sal,s.grade,d.dname
FROM emp e,salgrade s,dept d
WHERE s.grade>=3 AND e.deptno =d.deptno AND e.sal BETWEEN losal AND hisal
ORDER BY s.grade DESC,sal DESC;

--문제4 
-- 부서명이 SALES인 사원중 
--급여 등급이 2 또는 3인 사원의 급여를 내림차순으로 정렬   

SELECT d.dname ,e.sal,s.grade
FROM dept d,salgrade s, emp e
WHERE s.grade  IN (2,3) AND e.sal BETWEEN losal AND hisal AND d.dname='SALES'

GROUP BY d.DNAME,e.sal,s.grade
ORDER BY sal DESC;

--Q1
SELECT  e.job,e.empno, e.ename,e.sal,d.deptno,d.dname
FROM emp e,dept d 
WHERE job = (SELECT job FROM emp WHERE ename ='ALLEN')
AND e.deptno=d.deptno
ORDER BY SAL DESC ;

--Q2
SELECT e.empno,e.ename,d.dname,e.hiredate,d.loc,e.sal,s.grade
FROM emp e , salgrade s , dept d
WHERE e.deptno =d.deptno AND e.sal BETWEEN losal AND hisal 
AND e.sal >(SELECT avg(sal) FROM emp)
ORDER BY sal DESC,empno

--Q3
SELECT e.empno,e.ename,e.job,e.deptno,d.dname,d.LOC
FROM emp e, dept d
WHERE e.DEPTNO =d.DEPTNO AND e.deptno=10 AND e.job NOT IN (SELECT job FROM emp
WHERE deptno=30);

SELECT job,ename FROM emp
WHERE deptno=10;

SELECT e.empno, e.ename, e.sal ,s.grade
FROM emp e, salgrade s 
WHERE e.sal BETWEEN losal AND hisal AND e. SAL > 
(SELECT max(sal) FROM emp WHERE job ='SALESMAN')

--SELECT e.empno, e.ename, e.sal ,s.grade
--FROM emp e, salgrade s 
--WHERE e.sal BETWEEN losal AND hisal 
-- 	AND E.SAL > ALL  (SELECT SAL FROM EMP WHERE JOB ='SALESMAN')
--	ORDER BY EMPNO; 이거 안씀 

 
--NEW YORK 근무 사원 중 지피티 문제1
--급여(SAL)가 3000 이상인 사원의
--사원명, 부서명, 급여를 조회하시오
SELECT e.ename , d.dname , e.sal
FROM emp e , dept d
WHERE e.deptno = d.deptno AND d.loc = 'NEW YORK' AND SAL >=3000
ORDER BY sal DESC;

--부서별로 지피티 문제2 
--사원 수, 평균 급여, 최고 급여, 최저 급여를 조회하시오.
--평균 급여는 소수점 둘째 자리에서 반올림
SELECT count(*), round(avg(sal),1), max(sal), min(sal) ,DEPTNO 
FROM emp
GROUP BY deptno










---------------------
-- 12장
--------------------
DESC emp; -- dbeaver에서 안된다
SELECT *FROM emp;

SELECT lengthb('한')FROM dual;

CREATE TABLE emp_ddl ( 
	empno NUMBER(4),
	ename varchar2(10),
	job   varchar2(9),
	mgr	  number(4),
	hiredate DATE,
	sal NUMBER(7,2),
	comm number(7,2),
	deptno NUMBER(2)
);

SELECT * FROM emp_ddl;

CREATE TABLE dept_ddl
AS SELECT * FROM dept;

SELECT * FROM dept_ddl;

CREATE TABLE emp_ddl_30
AS SELECT * FROM emp WHERE deptno =30;

SELECT * FROM emp_ddl_30;

CREATE TABLE empdept_ddl 
AS SELECT empno, ename, job job2, d.deptno,dname 
FROM emp e, dept d 
WHERE 1 <> 1;   -- 내용물 비우기 

SELECT * FROM empdept_ddl;

CREATE TABLE emp_alter
	AS SELECT * FROM emp;

SELECT * FROM EMP_alter;

ALTER TABLE emp_alter
ADD hp varchar2(20); 	  -- 테이블에 열을 추가하는 ADD

SELECT * FROM EMP_alter;

ALTER TABLE emp_alter 
RENAME COLUMN hp TO tel;  -- 컬럼명 이름을 바꾸는 RENAME 

SELECT * FROM emp_alter; 

ALTER TABLE emp_alter
MODIFY empno NUMBER (5);  -- 열의 자료형을 변경하는 MODIFY  
-- 크기는 늘어나는 경우만 가능,줄어들지 못함
-- 다른 타입으로 변경할 때는 모든 값이 NULL일때만 가능하다! 

ALTER TABLE emp_alter
DROP COLUMN tel;  		  -- 특정 열을 삭제할 떄 사용하는 DROP
SELECT * FROM emp_ALTER;  

RENAME emp_alter TO emp_rename;
SELECT * FROM emp_rename;

TRUNCATE TABLE emp_rename;  -- 테이블 데이터삭제

DROP TABLE emp_rename;    -- 테이블 삭제 

-------------
--10장----
-------------

CREATE TABLE dept_temp 
AS SELECT * FROM dept;

SELECT * FROM dept_temp;

INSERT INTO dept_temp (deptno, dname, loc)
VALUES (50, 'DATABASE', 'SEOUL');
SELECT * FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP 
VALUES (60, 'NETWORK' , 'BUSAN');
SELECT * FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP 
VALUES (70, 'WEB', NULL);
SELECT * FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP 
VALUES (80, 'MOBILE', '');
SELECT * FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP (deptno, loc)
VALUES (90	, 'INCHEON');
SELECT * FROM DEPT_TEMP;

CREATE TABLE emp_temp 
AS SELECT * FROM emp WHERE 1<> 1;
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno,ename,hiredate)
VALUES (9999, '홍길동','2026/01/27');
SELECT * FROM emp_temp;

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (7051, '최민수',to_date('2026-01-27', 'yyyy-mm-dd'));
SELECT * FROM emp_temp; 

INSERT INTO emp_temp (empno, ename, hiredate)
VALUES (3111,'심청이',sysdate);
SELECT * FROM emp_temp;   

INSERT INTO EMP_TEMP 
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp_temp; 

INSERT ALL 
INTO emp_temp (empno, ename, hiredate)
	VALUES (3112,'심청이2',sysdate)
INTO emp_temp (empno, ename, hiredate)
	VALUES (3113,'심청이3',sysdate)
SELECT * FROM dual;

SELECT * FROM emp_temp;

----------------------------
-- update
----------------------------

CREATE TABLE dept_temp2
	AS SELECT * FROM dept;

SELECT * FROM dept_temp2;

UPDATE dept_temp2	
set loc = 'seoul';
SELECT * FROM dept_temp2;

ROLLBACK;
SELECT * FROM dept_temp2;

-- update, delete 실행 하기 전에 
-- where를 무조건 검증해보기!!!
SELECT * FROM dept_temp2
WHERE deptno= 40;

UPDATE dept_temp2
SET dname = 'DATABASE' , loc = 'SEOUL' 
WHERE DEPTNO =40;
SELECT * FROM dept_temp2;

UPDATE dept_temp2
SET dname = (SELECT dname 
			 FROM dept 
			 WHERE deptno=40) ,
	loc = (SELECT loc
			 FROM dept 
			 WHERE deptno=40)	
WHERE deptno =40;
SELECT * FROM dept_temp2;

CREATE TABLE emp_tmp
AS SELECT * FROM emp;
SELECT * FROM emp_tmp;

SELECT sal, sal * 1.08 FROM EMP_TmP 
WHERE sal< 1000;

UPDATE EMP_Tmp
SET sal =sal * 1.2
WHERE sal < 1000;

SELECT * FROM EMP_Tmp
WHERE ename IN ('SMITH', 'JAMES');

CREATE TABLE emp_temp2
AS SELECT * FROM emp;

SELECT * FROM emp_temp2;

DELETE FROM emp_temp2
WHERE job = 'MANAGER';

SELECT * FROM emp_temp2;

DELETE  FROM EMP_TEMP2;
SELECT * FROM emp_temp2;

ROLLBACK;
DELETE FROM emp_temp2
WHERE job = 'MANAGER';

SELECT * FROM emp_temp2;

COMMIT;

SELECT * FROM emp_temp2;
ROLLBACK;
SELECT * FROM emp_temp2;


--------------------
--13장---
--------------------

SELECT * FROM dict;
SELECT * FROM USER_TABLES;

----------
-- index-- 
----------

CREATE INDEX idx_emp_salalter
ON emp (sal asc);

SELECT * FROM user_indexes;
SELECT * FROM user_ind_columns;

SELECT /*+ index(e idx_emp_salalter)  */ -- 강제 hint
	ename, sal 
FROM emp e 
WHERE sal =3000;

CREATE VIEW vw_emp20
AS (SELECT empno,ename,job,deptno 
	FROM emp 
	WHERE deptno = 20);

SELECT * FROM vw_emp20;

SELECT * FROM vw_emp20
WHERE job = 'CLERK';

CREATE TABLE dept_seq
AS SELECT * FROM dept WHERE 1 != 1;
SELECT * FROM dept_seq;

CREATE SEQUENCE seq_dept;

SELECT * FROM user_sequences;
-- 다음 값
SELECT seq_dept.nextval FROM dual;
SELECT seq_dept.nextval FROM dual;

-- 현재 값 
-- 생성 후에 nextval이 한번은 실행하고 나서 
-- currval 사용 가능 
SELECT seq_dept.currval FROM dual;

CREATE SEQUENCE seq_dept_10
START WITH 10
INCREMENT BY 10;

SELECT seq_dept_10.currval FROM dual;
SELECT seq_dept_10.nextval FROM dual;


INSERT INTO dept_seq (deptno , dname ,loc)
VALUES (seq_dept_10.nextval,'DATABASE','SEOUL');
SELECT * FROM DEPT_SEQ;

INSERT INTO dept_seq (deptno , dname ,loc)
VALUES (seq_dept_10.nextval,'DATABASE2','SEOUL2');
SELECT * FROM DEPT_SEQ;  
 
-------------
-- 제약조건 
------------

-- 방법1 
-- primary key를 두개 이상 줄 수 없다 
CREATE TABLE table_pk ( 
	login_id varchar2(20) PRIMARY KEY ,
	login_pw varchar2(20) NOT NULL,
	tel varchar2(20) 
);
SELECT *FROM TABLE_pk;

-- pk를 지정하면 index 자동 생성 
SELECT * FROM user_indexes;

INSERT INTO table_pk 
VALUES ('id1', 'pw1', null);

-- id 중복
INSERT INTO table_pk 
VALUES ('id1', 'pw1', null);

-- not null에 null 추가 
INSERT INTO table_pk 
VALUES ('id2', null, null);

INSERT INTO table_pk  (login_id)
VALUES ('id3');

INSERT INTO table_pk  (login_id)
VALUES (null);

SELECT * FROM table_pk;
-- pk나 not null을 null로 변경 
UPDATE TABLE_pk
SET login_id = NULL
WHERE login_id = 'id1';

INSERT INTO table_pk 
VALUES ('id2', 'pw2', null);
SELECT * FROM table_pk;

-- pk를 중복되는 값으로 변경 
UPDATE table_pk
SET login_id = 'id1'
WHERE login_id = 'id2';

-- 방법2 
-- pk 하나 이상 지정 가능 
CREATE TABLE table_pk2 ( 
	login_id varchar2(20) ,
	login_pw varchar2(20),
	tel varchar2(20),
	
	PRIMARY KEY (login_id,login_pw) 
);
SELECT * FROM table_pk2;
-- 방법3 

CREATE TABLE table_pk3 ( 
	login_id varchar2(20),
	login_pw varchar2(20),
	tel varchar2(20)
); 
ALTER TABLE TABLE_pk3 
ADD PRIMARY KEY (login_id, login_pw);
SELECT * FROM table_pk3;

ALTER TABLE TABLE_pk3
MODIFY login_id PRIMARY KEY;

-- foreign key 
CREATE TABLE dept_fk (
	deptno number(2) PRIMARY KEY,
	dname varchar2(14),
	loc varchar2(13)
);
CREATE TABLE emp_fk (
	empno NUMBER (4) PRIMARY KEY,
	ename varchar2(10),
	deptno number(2) REFERENCES dept_fk(deptno)
);
--null 됨  (항상 됨 )
INSERT  INTO emp_fk
VALUES (1,'이름',null);

-- 없는 값 안됨 
INSERT  INTO emp_fk
VALUES (2,'이름2',1)

INSERT INTO dept_fk
VALUES (10,'부서', '위치');

SELECT * FROM dept_fk;

INSERT  INTO emp_fk
VALUES (2,'이름2',10);

INSERT  INTO emp_fk
VALUES (3,'이름3',10);
SELECT * FROM emp_fk;

-- 없는 값으로 update 안됨 
UPDATE emp_fk
SET deptno =20
WHERE deptno =10;

-- 쳐다보고 있는 원본 값 삭제 안됨
DELETE dept_fk 
WHERE deptno=10;

DROP TABLE dept_fk;

UPDATE dept_fk
SET deptno =20
WHERE deptno =10;

TRUNCATE TABLE dept_fk;

DELETE emp_fk 
WHERE deptno=10;

UPDATE dept_fk
SET deptno =20
WHERE deptno =10;

DELETE dept_fk
WHERE deptno = 20;

SELECT * FROM dept_fk;

SELECT * FROM salgrade;
SELECT * FROM emp; 

COMMIT;





