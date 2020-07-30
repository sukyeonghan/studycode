--��ũ��Ʈ���� ��ɾ �����Ϸ��� ctrl+enter�� ����. �����(�Ķ���) �빮�ڷ� ���� ��
select * from DBA_USERS; 

--�̰� �ּ�ǥ��
--�Ҷ�Ҷ� -�ڹٶ� ����Ű ����
--�⺻������ DB�� ������ �Ϸ��� DBA(system/sys as dba)�������κ��� ������ �����ؾ��� ������ ������.
--������ ���� �� ������ ���� ������ �־�� DB�� �̿��� �� ����

--���� �����ϱ�
--���� ���� ��ɾ� : CREATE USER ������ IDENTIFIED BY ��й�ȣ
--�������� ��ҹ��� ������ ���� ����. ������ ��й�ȣ�� ��ҹ��� ������ �Ѵ�!
CREATE USER KH IDENTIFIED BY kh;
--������ �����ϰ� DB�� �̿��ϰ� �Ϸ��� �ݵ�� ���ѱ��� �ο��� ������Ѵ�
--GRANT ���Ѹ�,ROLE�� TO ������;
GRANT CONNECT, RESOURCE TO KH; --��ɾ� �ҹ��ڷ� �ᵵ ��
SELECT * FROM TAB; --������ ������ �ִ� �������(���̺�) ��ȸ�ϴ� ��ɾ�
--KH�� �ٲٰ� �����ϸ� �ƹ��͵� �ȶ�. ����Ҹ� ���� �� �����ϱ�

--TEST/TEST������ ����� �����ؼ� SELECT * FROM TAB;��ɾ� �����ϱ�
--������ �������� �����ؾ���. KH�������� ����ϱ� �ȵ�..
CREATE USER TEST IDENTIFIED BY test;
GRANT RESOURCE, CONNECT TO TEST;

CREATE USER WORK IDENTIFIED BY work;
GRANT RESOURCE, CONNECT TO WORK;

--�⺻ Database ��ġ �Ϸ�!!
--�⺻���� ������ �ǽ��� DB���� ����!
--������ �ִ� ���̺�� ���� F5
SELECT * FROM TAB; --Tab-table(�����.�����͵��� ����Ǵ� ����)�� ����

--�⺻ ��ġ ��� EMLPOYEE,DEPARTMENT,JOB,LOCATION,NATIONAL,SAL_GRADE�����(TABLE)�� ����
--EMPLOYEE ���̺� ������ ��ȸ�غ���
SELECT * FROM EMPLOYEE;
--DEPARTMENT ���̺� ������ ����
SELECT * FROM DEPARTMENT;
--JOB���̺� ���̹� ����
SELECT * FROM JOB;
--���̺��� ���� �ϳ��� ������. �÷��� �����͵��� ���� �� ������ �� ����. �迭�̳� ����Ʈ�� ����� ����
--���̺� �ִ� �÷�Ȯ���ϱ�
--DESC ���̺��;
DESC EMPLOYEE;


--������ ������ ���� �˾ƺ��� ���� -> DB�����Ͼ �ϴ� ��!
--SYSTEM / SYS AS SYSDBA
--SYS : ���۰����ڰ��� ���� �� �� �� �ִ� ����. DB�� ������ ��Ʈ�� �� �� �ִ� ������ ����
--SYSTEM  : �Ϲ� ������ ����. �����ͺ��̽��� ����,������ ������ ����! ����ڸ� ������ �� �ִ� ������ ����

--SELECT�� Ȱ���ϱ�
--TABLE�� ����Ǿ� �ִ� �����͸� ��ȸ�ϴ� ��ɾ�
--SELECT �÷���,�÷���,.... FROM ���̺�� [WHERE ���ǽ�];-��������
SELECT EMP_ID, EMP_NAME, SALARY, HIRE_DATE
FROM EMPLOYEE;

--TEST������ SCOTT_EN ������ ��ġ�ϰ�
--TEST�������� �����ؼ� ��ġ�� ���̺��� ��ȸ�ϰ�
--�� ���̺� �� 3���� ���̺��� ������ �÷��� �� ���� �����ؼ� ��ȸ�ϱ�

-- �׽�Ʈ�� ����� table�� ��ȸ.��ü���� Ÿ���� ����
SELECT * FROM TAB;  --���̺���� ���� ��!!
--tale�� �÷��� Ȯ���ϱ�
DESC BONUS;

SELECT ENAME,JOB,SAL
FROM BONUS;

SELECT * FROM TAB;

DESC DEPT;  
--�÷��� ���� ����

SELECT DEPTNO,DNAME,LOC
FROM DEPT;

SELECT * FROM TAB;

DESC  EMP;

SELECT EMPNO,ENAME,JOB
FROM EMP;

--SELECT���� ���� �˾ƺ���
--SELECT�� �ۼ���-��ɾ� ���� ����
--SELECT �÷���,�÷���,�÷���...
--FROM ���̺�� ->�⺻SELECT��. �����͸� ��ȸ�ϴ� ����
SELECT * FROM TAB;

--EMLOYEE�� ��ȸ�ϱ����� �÷��� ��ȸ�غ���
DESC EMPLOYEE;

SELECT EMP_NAME,PHONE,SALARY
FROM EMPLOYEE;

--DEPARTMENT���̺� �ִ� �÷� ��� ��ȸ�ϱ�
DESC DEPARTMENT;

SELECT DEPT_ID,DEPT_TITLE,LOCATION_ID
FROM DEPARTMENT;

--���̺� �ִ� ��ü �÷��� ��ȸ�Ϸ��� * ����ϸ� ��
--EMPLOYEE���̺��� ��ü�÷��� ��ȸ�غ���
SELECT *
FROM EMPLOYEE;

--SELECT ���� ��������ϱ�(+,-,/,*)
SELECT 10+20 FROM DUAL; --����Ŭ�� �����ϴ� �׽�Ʈ�� �⺻ ���̺�
SELECT EMP_NAME,SALARY,20+30 FROM EMPLOYEE; --����ó������� EMPLOYEE ���� ����ŭ ��

--�������ó���� ���ͷ����� �Ǵ� ���� �ƴ϶� �������÷��� ������
SELECT SALARY+100000 FROM EMPLOYEE;
SELECT EMP_NAME,DEPT_CODE,SALARY,SALARY+100000 --�����ִ� �����Ϳ� ���ϱ� ����. �������� ������ ����. RESULTSET���� ��� �� ��ü.
FROM EMPLOYEE;

--�÷������� ���� ��������� ������
SELECT EMP_NAME,BONUS,SALARY*BONUS --NULL�ߴ� �� ���ʽ��� NULL. �����Ⱚ
FROM EMPLOYEE;

--�� ����� ������ ���غ���
--�����,�μ��ڵ�,��å�ڵ�,����
--���ʽ��� ������ �������� �ٲ㺸��
SELECT EMP_NAME,DEPT_CODE,JOB_CODE,SALARY,(SALARY+(BONUS*SALARY))*12
FROM EMPLOYEE;
--NULLó�� �Լ� -> NVL(�÷�,�÷����� NULL�� �� ��ü�� ��)
SELECT EMP_NAME,DEPT_CODE,JOB_CODE,SALARY,BONUS,(SALARY+(NVL(BONUS,0)*SALARY))*12
FROM EMPLOYEE;

--����Ÿ���� �÷��� +�� �� �� ����
--SELECT EMP_NAME+EMAIL FROM EMPLOYEE; ��������� ������ ���ڸ� ��!

--RESULTSET�� �÷��� ��Ī�� �ο��� �� ����
--1. AS���� ����Ͽ� ��Ī�ο�
--2. ����� �����Ͽ� ��Ī�ο�
SELECT EMP_NAME,SALARY FROM EMPLOYEE;
--��Ī�ο��ϱ�
SELECT EMP_NAME AS �����, SALARY AS ���� FROM EMPLOYEE;
SELECT EMP_NAME �����, SALARY ���� FROM EMPLOYEE;
SELECT EMP_NAME,SALARY,SALARY*12 AS YEARSALARY FROM EMPLOYEE;
--��Ī�� Ư����ȣ�� ����� �����Ѱ�?? ��Ī�� ""�� ��밡��. ���ڿ���""�� �Ⱦ�
SELECT EMP_NAME,SALARY "���� ����" FROM EMPLOYEE; 
SELECT EMP_NAME,SALARY ����$���� FROM EMPLOYEE; 
SELECT EMP_NAME,SALARY "����^.~����" FROM EMPLOYEE; 
--SELECT���� �̿��ؼ� RESULTSET ���ͷ����� ���� �� ����.  ���ڸ��ͷ��� '' ���. ''���� �÷������� ��
SELECT EMP_NAME,SALARY, '��' FROM EMPLOYEE;
SELECT EMP_NAME, SALARY, '��', 20 FROM EMPLOYEE;

--�÷�(���ͷ�)�� �����ϴ� ���Ῥ���� Ȱ���ϱ� -->||
SELECT EMP_NAME||SALARY||'��' FROM EMPLOYEE; --�÷��� �ϳ��� ����Ǽ� ����

--SELECT�� RESULTSET���� �ߺ����� �����ϴ� �����
--DISTINCT
--SELECT DISTINCT�÷��� FROM ���̺�
SELECT DEPT_CODE FROM EMPLOYEE;
SELECT DISTINCT DEPT_CODE FROM EMPLOYEE; --NULL�� �ϳ��� ������ ����
--DISTINCT���� ����ϸ� �ٸ� �÷��� ����� �Ұ���
--SELECT EMP_NAME, DISTINCT DEPT_CODE FROM EMPLOYEE;
SELECT DISTINCT DEPT_CODE,JOB_CODE FROM EMPLOYEE; 
--���� �� ��� ����.DISTINCT���� ����. 13���� ����. ���� �׷����� ��� ����-�� ���� ���ļ� �ߺ���
SELECT DISTINCT DEPT_CODE,EMP_NAME FROM EMPLOYEE; --�̸��� �ߺ����� ��� �̷��� ���� �ǹ̾���
--SELECT DISTINCT DEPT_CODE, DISTINCT JOB_CODE FROM EMPLOYEE; --DISTINCT 2���� �� ��

--���̺��� DATA�� FILTERING�غ��� -> ���ϴ� ROW�� ������ �� �ְ� �����غ���
--���ǽ� DATA �����غ���
--WHERE���� ����ϸ� ������
--SELECT �÷���,�÷���,��..FROM ���̺�� WHERE ���ǽ�(�񱳿�����) TRUE/FALSE
--EMPLOYEE ���̺��� ����� ������ ��ȸ�غ���
SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_NAME='������'; 
SELECT EMP_NAME FROM EMPLOYEE;

--EMPLOYEE���̺��� DEPT_CODE�� D5�� ����� ��� ������ ����ϼ���
SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE='D5';--d5�� �ϸ� �ȵ�. �����ʹ� ��ҹ��� ������

--EMPLOYEE���̺��� ������ 300���� �̻��� ����� ��ȸ�ϼ���!
--�����,�μ��ڵ�,����,�Ի���
SELECT EMP_NAME, DEPT_CODE,SALARY, HIRE_DATE 
FROM EMPLOYEE
WHERE SALARY>=3000000;

--EMPLOYEE���̺��� �μ��� ��D5���� �ƴ� ����� ��ȸ�ϼ���
SELECT *
FROM EMPLOYEE
--WHERE DEPT_CODE != 'D5';
--WHERE DEPT_CODE <> 'D5';
--WHERE DEPT_CODE ^= 'D5';
WHERE NOT DEPT_CODE='D5';

--������ : AND,OR
--������ 300���� �̻��̰� �μ��� D5�� ����� �̸�,�����,�μ��ڵ�,���� ��ȸ�ϱ�
SELECT EMP_NAME,DEPT_CODE,SALARY
FROM EMPLOYEE
WHERE SALARY>=3000000 AND DEPT_CODE = ��D5��;
--������ 200���� �̻��̰� 500���� ������ ����� �����, �μ��ڵ�,��å�ڵ�,������ ��ȸ�ϱ�
SELECT EMP_NAME, DEPT_CODE,JOB_CODE,SALARY
FROM EMPLOYEE
WHERE SALARY>=2000000 AND SALARY<=5000000;
--��Һ񱳴� DATE �����Ѱ���?
--�Ի����� 2000/01/01 ���� �Ի��� ����� �̸�,�μ�,��å,�Ի��� ����ϱ�
SELECT EMP_NAME, DEPT_CODE, JOB_CODE,HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE>='00/01/01'; --'�� �� ��'�� �ȵ�(00-00-00,000101,00 01 01,0000 01 01 �� �ȴ�)
--����� �������� ����� ���ڿ��� �ڵ����� DATE������ ��������
--WHERE HIRE-DATE>=TO DATE('200000101','YYYYMMDD');--������ �̷��� ����ȯ�� �ؼ� ���ؾ���

--BETWEEN AND �����ڸ� �̿��� ���� ������ ��Ÿ�� �� ����
--������ 300���� �̻� 500���� ������ ��� ���ϱ�
SELECT *
FROM EMPLOYEE
WHERE SALARY BETWEEN 3000000 AND 5000000;

--EMPLOYEE���̺��� �Ի����� 90/01/01���� 01/01/01���� ����� �̸�,�޿�,�Ի��� ��ȸ
SELECT EMP_NAME,SALARY,HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE NOT BETWEEN '90/01/01' AND '01/01/01';

-- LIKE : ������������ ������ ���� ã�� �� ����ϴ� ������
-- ���ϵ�ī�� : %,_
-- % : 0�� �̻��� ���ڸ� �ǹ�->'%��' ��,����,������������...->������ ������ ��� ���ڸ� ã��
-- %��% : ���� �����ϰ� �ִ� ���ڿ�
-- _ : ���� �� �� -> '_��' -> ������ ������ �� ���� / '��_'->������ ����
-- �� ���� ���� ��� ������
-- EMPLOYEE���̺��� �Ͼ� ���� ���� ����� �˻��ϱ�
SELECT EMP_NAME 
FROM EMPLOYEE
WHERE EMP_NAME LIKE '��%';
--�̸��� �߰����ڰ� ���� ����� �˻��ϱ�
SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_NAME LIKE '_��_';
--WHERE EMP_NAME LIKE '_��_'; ���ڿ��� ���� �����ϴ� �ǹ̿��� ���������� �� ����. ������ ���ϸ� _��_�� �����

--EMAIL @�տ� ���ڰ� 5������ ����� �̸�,�̸��� ��ȸ�ϱ�
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE '_____@%';
--EMAIL _�տ� ���ڰ� 4������ ����� �����, �̸����ּ� ��ȸ
SELECT EMP_NAME, EMAIL
FROM EMPLOYEE
WHERE EMAIL LIKE'____#_%'ESCAPE'#'; -- _�տ� Ư����ȣ+ESCAPE �ؼ���������� ���� ��

--��ȭ��ȣ�� 010���� �������� �ʴ� ������ϱ�
SELECT *
FROM EMPLOYEE
WHERE PHONE NOT LIKE '010%';

--�����ּҰ� _���� 4�ڸ��̸鼭 DEPT_CODE�� D9 D6�̰�
--������� 90/01/01~00/12/01�̸鼭 ������ 270���� �̻��� ����� ��ü���� ����ϱ�
SELECT *
FROM EMPLOYEE
--WHERE EMAIL LIKE'____^_%'ESCAPE'^' AND
-- (DEPT_CODE='D9' OR DEPT_CODE='D6') AND   --OR������ �켱���� �� ����!
WHERE EMAIL LIKE '____^_%'ESCAPE'^' AND DEPT_CODE IN('D9','D6') AND --IN���� �ٲ㼭 ����
 HIRE_DATE BETWEEN '90/01/01' AND '00/12/01' AND SALARY >=2700000 ;

--NULL���� ���ϱ�
--NULL �ƹ� �ǹ̾��� ��
--����ó���� �ȵ�!
SELECT EMP_NAME, SALARY, BONUS
FROM EMPLOYEE
--WHERE BONUS='(null)'; �ȵ�
--IS NULL/IS NOY NULL
--WHERE BONUS IS NULL;
WHERE BONUS IS NOT NULL;

--�μ��� ���� ����� �����, �μ��ڵ�,���� ��ȸ
SELECT EMP_NAME, NVL(DEPT_CODE,'����'), SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IS NULL;

--���ʽ��� �����鼭 ������ 300���� �̻��� ����� ������̵�,�����,����,���ʽ� ���ϱ�
SELECT EMP_ID,EMP_NAME,SALARY,BONUS
FROM EMPLOYEE
WHERE SALARY >=3000000 AND BONUS IS NULL;

--�ټ��� ������ϱ�
--IN/NOT IN
--�÷��� IN(�񱳰�, �񱳰�2, �񱳰�3,�񱳰�4...)
--�μ��ڵ尡 D6�̰ų� D5,D9�� ��� ��� ��ȸ
SELECT *
FROM EMPLOYEE
--WHERE DEPT_CODE='D6' OR DEPT_CODE='D5' OR DEPT_CODE='D9';
WHERE DEPT_CODE IN('D6','D5','D9');

--��å�� J1,J2�� �ƴ� ����� ��� ��ȸ�ϼ���
SELECT *
FROM EMPLOYEE
WHERE JOB_CODE NOT IN('J1','J2');

SELECT *
FROM EMPLOYEE
WHERE DEPT_CODE IN(SELECT DISTINCT DEPT_CODE FROM EMPLOYEE WHERE SALARY >= 3000000);
--IN�� �̷������� ���� ��. ��������
--WHERE�� ��

--������ ���� -> FOR��,COLLECTIONS.SORT..���ص� ��
--����Ŭ���� ������ �����ϱ�
--ORDER BY �÷��� [���Ŀɼ�(ASC||DESC)NULL�����ɼ�]
--SELECT�÷���..�÷���...FROM ���̺� [WHERE ���ǽ�] [ORDER BY �÷���]
SELECT * FROM EMPLOYEE;
--�̸� ������ �����ϱ�
SELECT EMP_NAME, SALARY, DEPT_CODE, JOB_CODE
FROM EMPLOYEE
--ORDER BY EMP_NAME;--DEFAULT �� ��������(ASC)
ORDER BY EMP_NAME DESC; --��������

--NULL ���� ������?
SELECT DEPT_CODE, SALARY, BONUS
FROM EMPLOYEE
--ORDER BY BONUS DESC; --NULL�� ���� �ö��
ORDER BY BONUS DESC NULLS LAST; --���������ε� NULL�� ������ ��

--ORDER BY�������� ��Ī�� ����� �� ����
SELECT EMP_NAME ���
FROM EMPLOYEE
--WHERE ���='���ؼ�'; --�ȵ�
ORDER BY ���;--��

--RESULTSET�� �÷����� Ư�� �ε������� 1������ �ο�
SELECT * FROM EMPLOYEE;

SELECT EMP_NAME,SALARY*12
FROM EMPLOYEE
--ORDER BY SALARY*12 DESC;
ORDER BY 2 DESC;


--�������� �� �� Ȱ���� �� �ְ� �ϴ� �Լ��� ���� �������
--���� ó�� �Լ�
--1.LENGTH : �־��� �÷� �Ǵ� ���ڿ��� ���̸� ��ȯ���ִ� �Լ�-�������Լ����� ���� ���� ����
SELECT EMP_NAME, LENGTH(EMP_NAME),EMAIL, LENGTH(EMAIL) FROM EMPLOYEE;
SELECT LENGTH('������ �� ���� �´�. �������...') FROM DUAL; --�׽�Ʈ�� ���̺�
--2.LENGTHB : ������ ����Ʈ ũ�⸦ ��ȯ
SELECT EMP_NAME, LENGTHB(EMP_NAME) FROM EMPLOYEE;
--EXPRESS���������� �ѱ� �� ���ڴ� 3����Ʈ/ENTER���������� 2����Ʈ
--3.INSTR : ã�� ���ڿ�||�÷��� ������ ��ġ���� ������ Ƚ����°�� ��Ÿ�� ������ ��ġ���� ��ȯ(�ڹ� INDEXOF)
--���� INSTR(����ڿ�(�÷�||���ڿ�),ã�� ����[, POSITION(������ġ),OCCURENCE(Ƚ��)])
--������ ��ġ���� ��ȯ�ϴµ� ����Ŭ���� ���ڿ� �����ε����� 1�̴�!
SELECT INSTR('KH���������� ���������� ������ȭ��','����') FROM DUAL;
SELECT INSTR('KH���������� ���������� ������ȭ��','����',4) FROM DUAL;
SELECT INSTR('KH���������� ���������� ������ȭ��','����',4,2) FROM DUAL;
SELECT INSTR('KH���������� ���������� ������ȭ��','����',-1) FROM DUAL; --�ڿ������� ã��
SELECT INSTR('KH���������� ���������� ������ȭ��','����',-6,2) FROM DUAL;

--EMPLOYEE�� EMAIL�÷����� @�� ��ġ�� ã�� ����ϱ�
SELECT EMAIL,INSTR(EMAIL,'@') FROM EMPLOYEE;

--4. LPAD/RPAD : ���ڿ��� Ư�� ���̸�ŭ ��������� Ȯ���ϰ� ���̰� �� ä������ ���� ������ ������ ���ڸ� �ִ� �Լ�
--LPAD(����||�÷�,����(����Ʈ��)[, ��������])--�Լ����� ���ڿ� ó���� �� �ѱ� 2����Ʈ, ����,����,����,Ư����ȣ�� 1����Ʈ 
SELECT LPAD('�ۿ� ��´� �ָ��ָ�',23,'$') FROM DUAL; --����
SELECT LPAD('�ۿ� ��´� �ָ��ָ�',50,'|') FROM DUAL;
SELECT RPAD('���� �� ����',20) FROM DUAL; --������
SELECT RPAD('1�� �� ����',20,'��') FROM DUAL;
--�������̶�� ������ �յڿ� #�� 10���� �߰��ϱ�
SELECT LPAD(RPAD('������',16,'#'),26,'#') FROM DUAL;

--5. LTRIM/RTRIM : ����/�����ʿ� Ư�����ڸ� �����ϴ� �Լ�, ���ڸ� �������� ������ ��������
--LTRIM(���ڿ�[,��������])
SELECT '          KH ',LTRIM('          KH ')FROM DUAL;
SELECT '000001234', LTRIM('000001234','0') FROM DUAL;
SELECT '0010001234', LTRIM('0010001234','0') FROM DUAL; --�ٸ� ���� ������ ����
SELECT '121212121����',LTRIM('121212121����','12') FROM DUAL;
SELECT '123321123321����',LTRIM('123321123321����','123') FROM DUAL;--������ �ϳ��� ���� ����
--12309814271237427���¿��� �տ� �ִ� ���� �����
SELECT '12309814271237427����',LTRIM('12309814271237427����','0123456789')FROM DUAL;--�߰��� ���ڰ� �ִٸ� ����
--123152134151243����123132094872134
--���¸� �����
SELECT '123152134151243����123132094872134', LTRIM(RTRIM('123152134151243����123132094872134','0123456789'),'0123456789') FROM DUAL;

--TRIM : �����ִ� ���ڸ� �����ϴ� ��
SELECT '     KH     ',TRIM('     KH    '),LTRIM('     KH    ')FROM DUAL;
--TRIM([LEADING||TRAILING||BOTH][���� �� ��] [FROM] ����ڿ�) 
--���ʸ�,���ʸ�,���� �� 
SELECT 'XXXXXXXXKHXXXXXX',TRIM(LEADING 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
SELECT 'XXXXXXXXKHXXXXXX',TRIM(TRAILING 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
SELECT 'XXXXXXXXKHXXXXXX',TRIM(BOTH 'X' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL;
--SELECT 'XXXXXXXXKHXXXXXX',TRIM(LEADING 'XI' FROM 'XXXXXXXXKHXXXXXX')FROM DUAL; --���� �� ���� �ȴ�!
SELECT 'XXXXX1XXXKHXXX1XXX',TRIM(BOTH 'X' FROM 'XXXXX1XXXKHXXX1XXX')FROM DUAL; --1������������ ����
--INSERT INTO TEMP VALUES(TRIM(BOTH'X' FROM 'XXXXXXXXKHXXXXXX')); --�̷������� INSERT�� WHERE������ �� �� ����

--SUBSTR : ���ڿ��� Ư���κ��� �߶󳻴� ���
--SUBSTR(�����||�÷���,������ġ[,����])--���� �����ϸ� ó������ ������ ��
SELECT '�̿���������ƿ�?',SUBSTR('�̿���������ƿ�?',5) FROM DUAL;
SELECT '�̿���������ƿ�?',SUBSTR('�̿���������ƿ�?',2,3) FROM DUAL;
SELECT '�̿���������ƿ�?',SUBSTR('�̿���������ƿ�?',INSTR('�̿���������ƿ�?','��'),3) FROM DUAL;

SELECT EMAIL, SUBSTR(EMAIL,INSTR(EMAIL,'@'))FROM EMPLOYEE;

--EMP_NAME ���� ��ȸ�ϴµ� �ߺ������� ����ϱ�
SELECT DISTINCT SUBSTR(EMP_NAME,1,1) FROM EMPLOYEE
ORDER BY 1; --���⼭ EMP_NAME�̶�� �ϸ� �ȵ�. ORDER BY�� FROM-SELECT-ORDER BY������ ���� �������� �����
--�÷����� SUBSTR(EMP_NAME,1,1) �����ϱ� EMP_NAME�� ����. �̰� �״�� ������ 1�� ���� ��.

--���ĺ� ���� ó��
--UPPER/LOWER/INITCAP
SELECT 'Hello, My name is Han. How are you? Fine Thank you',
    UPPER('Hello, My name is Han. How are you? Fine Thank you'),--�� �빮��
    LOWER('Hello, My name is Han. How are you? Fine Thank you'),--�� �ҹ���
    INITCAP('Hello, My name is Han. How are you? Fine Thank you')--�����ϰ� ������ ù���ڸ� �빮�ڷ�
FROM DUAL;

--CONCAT : ���ڿ��� �����ִ� �Լ�
SELECT EMP_NAME ||'��'||SALARY||'��' FROM EMPLOYEE;
SELECT CONCAT (EMP_NAME,'��') FROM EMPLOYEE; -- �� �� ����
--REPLACE : ���ڿ�, ���ڸ� �����ϴ� ��
--REPLACE(��� ����, ã�� ����, ������ ����)
SELECT REPLACE('I HATE U','HATE','LOVE') FROM DUAL;
SELECT REPLACE(EMAIL, 'kh.or.kr', 'KH.COM') FROM EMPLOYEE; --�̰� �ߴٰ� �������� �ٲ��� ����.��ȸ��
--UPDATE EMPLOYEE SET EMAIL = REPLACE((EMAIL, 'kh.or.kr', 'KH.COM') ; --�̷��� �ؾ� ���� DATA �ٲ�
SELECT EMAIL FROM EMPLOYEE;

--REVERSE : ���ڿ��� �ݴ�� ������ִ� ��
SELECT 'ABCDE',REVERSE( REVERSE ('ABCDE') ) FROM DUAL; --2���ϸ� �������
SELECT '�̼��������',REVERSE( REVERSE('�̼��������')) FROM DUAL; --2���ϸ� ���ƿ��������� �� ���ϸ� ����

--TRANSLATE : ���ڿ��� ������ ���ڷ� ����
SELECT TRANSLATE('010-3644-6259','0123456789','�����̻�����ĥ�ȱ�') FROM DUAL;
--����ó���Լ� ��


--����ó���Լ�
--�Ҽ����� ���� ó�� ������ �˰� �־�� ��
--ABS : ���밪 -> ������ ���� ���ڰ�
SELECT 10,-10,ABS(10),ABS(-10) FROM DUAL;

--MOD : �������� ���ϴ� �Լ�
SELECT MOD(10,3), MOD(10,2),MOD(10,4) FROM DUAL; 

--�Ҽ��� ó���Լ�
--ROUND : �Ҽ����� �ݿø��ϴ� �Լ�
--ROUND(��� [,�ݿø��� ��ġ] )
SELECT ROUND(123.556) FROM DUAL; --�׳� �ϸ� ������ �ݿø��ؼ� ����
SELECT ROUND(123.556, 2) FROM DUAL; --2�ڸ����� ǥ��
SELECT ROUND(123.456, 0) FROM DUAL;
SELECT ROUND(123.456, -1) FROM DUAL; --�Ҽ��� �������� -�� �� �ڸ��� ��

--FLOOR : �Ҽ����� ������ �Լ�
SELECT FLOOR(123.456) FROM DUAL;
SELECT FLOOR(123.556) FROM DUAL;

--TRUNC : �Ҽ����� ������ �Լ�, ������ ��ġ�� ����
SELECT TRUNC(123.456, 2) FROM DUAL;
SELECT TRUNC(123.456, 1) FROM DUAL;

--CEIL : �Ҽ����� ������ �ø� -> ������ �������� �ʰ� �ø�
SELECT CEIL(123.456) FROM DUAL;
SELECT CEIL(123.556) FROM DUAL;
--���� ó�� �Լ� ��


--��¥ ó�� �Լ�
--��¥���� ������� -> NUMBER��
--��¥�� ���ڸ� ���� -> ��¥�� ���� ���ڸ�ŭ ������ ���� ��-DATE��

--SYSDATE : ���� ��¥ ���ϱ�
--�ý��ۿ� ����Ǿ��ִ� ��¥�� ǥ��
SELECT SYSDATE FROM DUAL;

--SYSTIMESTAMP : �ð����� ǥ���ϴ� �����
SELECT SYSTIMESTAMP FROM DUAL;

--SYSDATE�� �̿��ؼ� �ð��� ��Ÿ������ ���ڿ��� ��ȯ�Ͽ� ���
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;

--���� �ð��� �˷��ִ� ��ɾ�. ����
SELECT CURRENT_DATE, LOCALTIMESTAMP, CURRENT_TIMESTAMP FROM DUAL;

--��¥���� ������ �ϸ� NUMBR�� ���� -> �ϼ�
SELECT FLOOR( SYSDATE-HIRE_DATE)||'��' AS �ٹ��ϼ� FROM EMPLOYEE;

--��¥�� ���ڸ� �����ϸ�(+,-) �ϼ��� ���ϰų� �� ���� ��
SELECT SYSDATE-1, SYSDATE, SYSDATE+1 FROM DUAL;

--�� �޾� ��� �� ��
--ADD_MONTHS : ���� ���� ���ϴ� �Լ�
--ADD_MONTHS(��¥, ��)
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 4) FROM DUAL;
-- �����, �Ի���, �Ի� �� 3���� ��ȸ
SELECT EMP_NAME, HIRE_DATE, ADD_MONTHS(HIRE_DATE, 3) FROM EMPLOYEE;

--MONTHS_BETWEEN : ��¥ �� ���� ���� �˷��ִ� �Լ�
--MONTHS_BETWEEN(��¥1, ��¥2)
SELECT FLOOR(MONTHS_BETWEEN( '20/12/25', SYSDATE)) FROM DUAL;
SELECT CEIL(MONTHS_BETWEEN( SYSDATE,  '20/12/25')) FROM DUAL; --�������� FLOOR�ϴϱ� -6���� ����

--NEXT_DAY : ������ �����ϸ� ���� �Ͽ��� ���� ����� ������ ��¥�� ����
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '�ݿ���') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, 'MON') FROM DUAL; --����� �ȵ�
SELECT * FROM V$NLS_PARAMETERS;--�ڵ����� �ѱ۷� ��� ������ �Ǿ�����
ALTER SESSION SET NLS_LANGUAGE=KOREAN;--��� ������ ���� �ٲ�

--LAST_DAY : ���� ���� ������ ��¥ 
SELECT LAST_DAY(ADD_MONTHS(SYSDATE,1)) FROM DUAL;

--EXTRACT : ��, ��, �� ���� ����� �� �ִ� �Լ�
--EXTRACT(YEAR||MONTH||DAY FROM ��¥) -> NUMBER������ ��ȯ
SELECT
    EXTRACT(YEAR FROM SYSDATE),
     EXTRACT(MONTH FROM SYSDATE),
     EXTRACT(DAY FROM SYSDATE)
 FROM DUAL;
 
 SELECT 
    EXTRACT(YEAR FROM SYSDATE)|| '��'
    || EXTRACT(MONTH FROM SYSDATE)|| '��'
    || EXTRACT(DAY FROM SYSDATE)|| '��' AS ������
 FROM DUAL;
    
--�Ի����� 0000�� 00�� 00�Ϸ� ��ȸ�ϼ���
SELECT
    EXTRACT(YEAR FROM HIRE_DATE)||'��'
    ||EXTRACT(MONTH FROM HIRE_DATE)||'��'
    ||EXTRACT (DAY FROM HIRE_DATE)||'��'
    AS �Ի���
FROM EMPLOYEE;

SELECT
    TO_CHAR(HIRE_DATE, 'YYYY "��" MM "��" DD "��" ') AS �Ի���
FROM EMPLOYEE;

--EXTRACT�� �̿��ؼ� �ð��� ���� ���� �� �����Ѱ�? ����ȯ�ؾ� ��
SELECT 
    EXTRACT(HOUR FROM CAST(SYSDATE AS TIMESTAMP)) || '��' ||
    EXTRACT(MINUTE FROM CAST(SYSDATE AS TIMESTAMP)) || '��' ||
    EXTRACT (SECOND FROM CAST(SYSDATE AS TIMESTAMP)) || '��'
FROM DUAL;
--��¥ ó�� �Լ� ��

--�ڷ����� ��ȯ�ϴ� �Լ�
--TO_CHAR, TO_DATE, TO_NUMBER

--TO_CHAR : ���������� �������ִ� �Լ�
--1. ��¥�� ���ڷ� : TO_CHAR(��¥, '����')
--2. ���ڸ� ���ڷ� : TO_CHAR(����, '����')

SELECT 
    SYSDATE, TO_CHAR(SYSDATE, 'YY-MM-DD'),
    TO_CHAR(SYSDATE, 'YY-MM-DD D'), --�Ͽ����� 1��
    TO_CHAR(SYSDATE, 'YY-MM-DD (DY)'),
    TO_CHAR(SYSDATE, 'YY-MM-DD DAY'),
    TO_CHAR(SYSDATE, 'YY "��" MM "��" DD "��"  DY HH "��" MI "��" SS"��" ')
FROM DUAL;

--EMPLOYEE���̺��� �����, �Ի��� ���  (1990/2/19 (ȭ) )
SELECT
    EMP_NAME, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD (DY)')
FROM EMPLOYEE;

--���ڸ� ���������� ��ȯ
--���Ͽ� ���̸� ǥ���ϴµ� �� ���̰� ��ȯ�� ���ں��� ������ ���� �߻�
--9,0 ����
-- 9 : ���ڰ��� �ش� ��ġ�� ������ �������� ǥ��
-- 0 ; ���ڰ��� �ش� ��ġ�� ������ 0���� ǥ��
-- $ : ���� �տ� $ǥ�ø� ��
-- L : �����Ͽ� �ش��ϴ� ��ȭ(/)ǥ��
-- , : ���ڸ� �����ϴ� ������
-- . : �Ҽ��� �ڸ� ǥ���ϴ� ǥ��

SELECT 
    TO_CHAR(1234567,'999,999,999'),
    TO_CHAR(1234567, '999,999'), --���̰� ª���� ������
    TO_CHAR(1234567, 'L999,999,999')
FROM DUAL;

SELECT 
    TO_CHAR(1234567,'000,000,000'),
    TO_CHAR(1234567, '000,000'), --���̰� ª���� ������
    TO_CHAR(1234567, 'L000,000,000')
FROM DUAL;

SELECT
    TO_CHAR(123.45,'9999.999'),--, �ƴϰ� . -�Ҽ����� 9�� �ص� 0ǥ�õ�
    TO_CHAR(123.45,'0000.000'),
    TO_CHAR(123.2, '9999.00') -- �Ҽ����� 0, ������ 0���� �̷��� ����� ����
FROM DUAL;

--EMPLOYEE���̺��� SALARY�� ��ȭ�� ǥ���ϰ� 3�ڸ����� ��ǥ �־ ���
--�����, �μ��ڵ�, ����, ������ ���� �������� �߰�
SELECT EMP_NAME, DEPT_CODE,
    TO_CHAR(SALARY, 'L999,999,999') AS ����,
    TO_CHAR(SALARY*12, 'L999,999,999') AS ����
FROM EMPLOYEE;

--TO_DATE : ��¥�� �������ִ� �Լ�
--���ڸ� ��¥��
--���ڸ� ��¥��
--TO_DATE(���� || ����, '��¥����')

SELECT TO_DATE('20201225', 'YY/MM/DD'),
    TO_DATE('20201225', 'YYYYMMDD') --���� ���� ���·� ����
FROM DUAL;

SELECT TO_DATE(20201225, 'YY/MM/DD') FROM DUAL;
SELECT '00/12/25' FROM DUAL;

--TO_NUMBER : ���ڸ� ���ڷ� ����
SELECT TO_NUMBER('10,200', '9,999,999')+200 FROM DUAL;--��ǥ ������ ��ǥ���� ��ȯ�϶�� ��
--����ȯ �Լ� ��

--�����Լ�-�б⹮�� SELECT�� �ȿ��� �� �� ����
--�ڹٿ��� SWITCH ���� ����� ���
--DECODE : �����
--���� : DECODE(ǥ����(�÷�,���ڿ�,��) , ����1, ���1(TRUE�� �ش�), ����2, ���2...���3,���00(����Ʈ�� ���� �޹�, �� ���� �� �ش���� ������))
--EMPLOYEE ���� �÷� ����. �ֹι�ȣ�� Ȯ��
SELECT EMP_ID, EMP_NAME, 
    EMP_NO, DECODE(SUBSTR(EMP_NO, 8, 1), '1', '��', '2', '��', '3', '��', '4', '��')
FROM EMPLOYEE
ORDER BY 4;

--�����, �����ڵ忡 ���� �ش� ���޸� ���
--J1 ���� J2 �λ��� J3���� �������� ���
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, JOB_CODE, DECODE(JOB_CODE,'J1', '����', 'J2', '�λ���', 'J3', '����', '���')
FROM EMPLOYEE
ORDER BY 2;

--CASE�� 
-- SELECT
--  CASE
--      WHEN ���ǽ� THEN ������ ����
--      WHEN ���ǽ� THEN ����
--      ELSE ������ ����
--     END AS ��Ī

SELECT
    EMP_NAME,
    JOB_CODE,
    CASE
        WHEN JOB_CODE='J1' THEN '����'
        WHEN JOB_CODE='J2' THEN '�λ���'
        ELSE '���'
    END
 FROM EMPLOYEE;
 
 --��,�� ������ �ٲ㺸��
 SELECT
    EMP_ID,
    EMP_NAME,
    CASE
        WHEN SUBSTR(EMP_NO, 8, 1) = '1'  THEN '��'
        WHEN SUBSTR(EMP_NO, 8, 1) = '2' THEN '��'
        WHEN SUBSTR(EMP_NO, 8, 1) = '3' THEN '��'
        WHEN SUBSTR(EMP_NO, 8, 1)= '4' THEN '��'
    END
FROM EMPLOYEE;


-- ���糪�� = ����⵵ -�¾ �⵵ +1
SELECT
    EMP_ID AS �����ȣ,
    EMP_NAME AS �����,
    RPAD(SUBSTR(EMP_NO,1,8),14,'*') AS �ֹι�ȣ, 
    --SUBSTR(EMP_NO,1,8)||'******' Ȥ�� CONCAT(SUBSTR(EMP_NO,1,8),'******')
    CASE
         WHEN SUBSTR(EMP_NO, 8, 1) IN( '1','3')  THEN '��'
        WHEN SUBSTR(EMP_NO, 8, 1) IN( '2','4') THEN '��'
    END AS ����,
     EXTRACT(YEAR FROM SYSDATE)-EXTRACT(YEAR FROM TO_DATE(SUBSTR(EMP_NO,1,2),'YY'))+1 AS ���糪�� , 
--YY�� ��ȯ�ϸ� ������ ���� ���� 20 �� ����
     EXTRACT(YEAR FROM SYSDATE)-EXTRACT(YEAR FROM TO_DATE(SUBSTR(EMP_NO,1,2),'RR'))+1 AS ���糪�� , 
--RR�� 50 �������� ���Ⱑ �޶���..47�� ���̸� ���̰� �޶��� -26����
    TO_NUMBER( EXTRACT(YEAR FROM SYSDATE)) -( TO_NUMBER(SUBSTR(EMP_NO,1,2)) +
    CASE 
        WHEN SUBSTR(EMP_NO,8,1) IN('1','2') THEN 1900
        ELSE 2000
        END)+1 ���糪��
FROM EMPLOYEE;

--Ȯ���ϱ� ���� 47��� ������ �߰�
INSERT INTO EMPLOYEE VALUES (250, '�̼���','471225-1234123','HYUN@HYUN.COM',NULL, 'D5', 'J2', 'S5', 150, NULL,
NULL,SYSDATE,DEFAULT,DEFAULT);
SELECT * FROM EMPLOYEE;    
--�������Լ� �߿� �����Լ��� �ִ� ��.

--�׷��Լ�
--�������� �Ѱ� ���� ������ �Լ�
--�հ�, ���, �ִ밪, �ּҰ� ���� �����ϴ� �Լ���
--SUM,AVG,COUNT,MAX,MIN

--SUM : �հ� -> ��ü ROW�� Ư���÷� �հ踦 ���ϴ� �Լ�
SELECT SUM(SALARY) FROM EMPLOYEE;
--SELECT EMP_NAME, SUM(SALARY) FROM EMPLOYEE; --���⼱ �ٸ� �÷��� �� �� ����. �ڿ��� �׷����� ���� ��ɾ� ��� ����

--���ڻ���� ���� �հ踦 ���ϼ���
SELECT SUM(SALARY) FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) IN('2','4');

--AVG : RESULTSET�� Ư�� �÷����� ����� ���ϴ� �Լ�
-- ��ü ����� �������
SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE;
--���ʽ� ���
SELECT AVG(BONUS) FROM EMPLOYEE;
--�׷��Լ��� �÷��� NULL�� �ִ� ROW�� �����ϰ� �����!
SELECT EMP_NAME, BONUS FROM EMPLOYEE;
SELECT AVG(NVL(BONUS,0)) FROM EMPLOYEE; --��Ȯ�� ��� �� ���

--COUNT : RESULTSET�� ROW ���� ���
SELECT COUNT(*) FROM EMPLOYEE;
SELECT COUNT(EMP_NAME) FROM EMPLOYEE;
--���� ��� ��
SELECT COUNT(*) FROM EMPLOYEE WHERE SUBSTR(EMP_NO,8,1) IN('2','4');
--D5 �μ� ��� ��
SELECT COUNT(*) FROM EMPLOYEE WHERE DEPT_CODE='D5';

SELECT COUNT(DEPT_CODE) FROM EMPLOYEE;--�÷��� �����ϸ� �ش� �÷��� NULL�� ���� ������

--GROUP BY��
--�׷캰�� �����Ͽ� �׷��Լ��� �����ϰ� �ϴ� ��
--��å�� �޿��� ���
SELECT JOB_CODE, AVG(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

SELECT DISTINCT JOB_CODE FROM EMPLOYEE; --�ߺ� ������ 7�� ��ŭ ����

--GROUP BY ��ġ
--SELECT �÷�, �÷�....
--FROM ���̺��
--[WHERE ���ǽ� AND || OR]
--[GROUP BY �÷���]
--[ORDER BY �÷���]

--�μ��� �ӱ��� �հ��?
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL--NULL ����.RESULTSET�������� ���͸�
GROUP BY DEPT_CODE;--NULL�� ������ ����

--�μ��� �ο��� ���ϱ�
SELECT DEPT_CODE, COUNT(*), COUNT(DEPT_CODE)
--*�� ��ü�� NULL�� �ƴ� �̻� ���� ��, DEPT_CODE�� �����ϸ� �ش� �÷��� NULL�� �ƴϸ� ���
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--EMP_NAME�� �������� ������ �հ� ���ϱ�--GROUP BY �׷����� ���� �� ���� �� ����ؾ���
SELECT EMP_NAMEM, SUM(SALARY)
FROM EMPLOYEE
GROUP BY EMP_NAME;

--GROUP BY ���� �ΰ��� �÷� ��� ����?
SELECT DEPT_CODE, JOB_CODE, AVG(SALARY), SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE;

SELECT EMP_NAME, DEPT_CODE, AVG(SALARY), SUM(SALARY)--�ߺ����� ���� �׷��� ������ �ǹ̰� ����
FROM EMPLOYEE
GROUP BY EMP_NAME, DEPT_CODE;

--EMPLOYEE ���̺��� ������ J1�� ����� �����ϰ� ���޺� ��� �� �� ��� �޿� ���ϱ�(����, ��ȭǥ��)
SELECT * FROM EMPLOYEE;

SELECT JOB_CODE, COUNT(JOB_CODE), TO_CHAR(FLOOR(AVG(SALARY)),'L999,999,999')
FROM EMPLOYEE
WHERE JOB_CODE != 'J1'
GROUP BY JOB_CODE;

--�⵵�� �ο� �� ���ؼ� �Ի�� �������� �������� ����
SELECT EXTRACT(YEAR FROM HIRE_DATE) AS �⵵, COUNT(*) AS �ο���
FROM EMPLOYEE
GROUP BY EXTRACT(YEAR FROM HIRE_DATE)
ORDER BY 1;

--�μ��� ��� �޿��� 300���� �̻��� �μ��� ���� �μ��ڵ�, ��� �޿� ���
SELECT DEPT_CODE, AVG(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING AVG(SALARY)>=3000000;

--HAVING : GROUP �Լ��� ���� ������ ������ �� ���. WHERE���� �ȵ�
--GRUOP BY  �ٷ� �ڿ� ��ġ��
--SELECT �÷�, �÷�..
--FROM ���̺��
--[WHERE ���ǽ�]
--[GROUP BY �÷���...]
--[HAVING ���ǽ�]
--[ORDER BY �÷�]--FROM, WHERE, GROUP BY, HAVING, SELECT, ORDER BY����

--�μ��� �ο��� 3���� ���� �μ� ����ϱ�
SELECT DEPT_CODE, COUNT(DEPT_CODE)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING COUNT(DEPT_CODE) > 3;

--ROLLUP, CUBE : �׷��Լ� ���� �� ��ü�� ���� �׷��Լ��� �����ϴ� �����Լ�
SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY ROLLUP(DEPT_CODE);--��ü�Ѱ赵 ������ ��
GROUP BY CUBE(DEPT_CODE) --�Ȱ����� �Ѱ谡 ���� ����
ORDER BY DEPT_CODE; ---�ϸ� ROLLUP�̶� ����


SELECT SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL;--�� ���հ谡 �߰��Ǵ� ��

--�� �� �̻��� �÷��� ROLLUP, CUBE�� �־��� ��
--ROLLUP : �� �÷��� ���� �׷캰�� �׷��Լ��� ����, ù ��° ���ڷ� �� �÷��� ���� �׷��Լ� ����(�Ұ�),  �Ѱ�
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY ROLLUP(DEPT_CODE, JOB_CODE);--DEPT ���� �Ұ�, �Ѱ�
GROUP BY ROLLUP(JOB_CODE, DEPT_CODE);--���ڵ� ���� �Ұ�, �Ѱ�

--CUBE : ������ �÷��� ��� ���� ��
SELECT DEPT_CODE, JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
GROUP BY CUBE(DEPT_CODE, JOB_CODE)--DEPT_CODE, JOB_CODE �Ұ赵 �� �ϰ� �Ѱ�
ORDER BY 1;

--�� ������ �� �Ѳ����� ó���� ��
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

--GROUPING : CUBE, ROLLUP�� ���� ����� �������, �Ϲ� �׷��Լ��� ������� Ȯ�����ִ� �Լ�
--ROW�� �÷��� CUBE, ROLLUP�� ���� ����Ǿ����� 1�� ��ȯ, �ƴϸ� 0�� ��ȯ
SELECT DEPT_CODE, GROUPING (DEPT_CODE)
FROM EMPLOYEE
WHERE DEPT_CODE IS NOT NULL
--GROUP BY DEPT_CODE;
GROUP BY ROLLUP(DEPT_CODE);

--�����Լ��� ���� ����� : DECODE, CASE
SELECT DECODE(GROUPING(DEPT_CODE),0,NVL(DEPT_CODE,'����'),'��ü�ο�') �μ��ڵ�,
    COUNT(*)
FROM EMPLOYEE
GROUP BY ROLLUP(DEPT_CODE);
    
--�� �� �̻� �÷����� ������ RESULTSET
SELECT DECODE(GROUPING(JOB_CODE), 0, JOB_CODE, '������ü') �����ڵ�,
    DECODE(GROUPING(DEPT_CODE), 0, NVL(DEPT_CODE,'����'), '�μ���ü') �μ��ڵ�,
    CASE 
    WHEN GROUPING (DEPT_CODE) = 0 AND GROUPING (JOB_CODE) = 0 THEN '�׷캰�հ�'
        WHEN GROUPING (DEPT_CODE) = 1 AND GROUPING (JOB_CODE) = 0 THEN '���޺��հ�'
        WHEN GROUPING (DEPT_CODE) = 0 AND GROUPING (JOB_CODE) = 1 THEN '�μ����հ�'
        WHEN GROUPING (DEPT_CODE) = 1 AND GROUPING (JOB_CODE) = 1 THEN '���հ�'
    END ���
FROM EMPLOYEE
GROUP BY CUBE(DEPT_CODE, JOB_CODE)
ORDER BY 1,2;
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--���� ���� : �� �� �̻��� RESULTSET�� ����ó�� �ϴ� ��(���ϱ�, ����, �ߺ���) ���
--���� ���� ���� 
--1. �� ���� RESULTSET�� �÷��� ����, Ÿ���� ��ġ
--2. Ÿ�Ը� ������ �÷���� ������� ���̶� �� �� ����
--3. ù ��° ������ RESULTSET�� ������ ��

--1. UNION / UNIONALL: �� ���� RESULTSET�� ��ġ�� ��
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION
--SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
--SELECT EMP_ID, EMP_NAME, DEPT_CODE, JOB_CODE --ù��° RESULTSET�̶� �÷� ���� �� ������ ���ƾ� ��
SELECT EMP_ID, EMP_NAME, DEPT_CODE, 0 --�ڷ��� ���缭 0���� �ᵵ ����.
FROM EMPLOYEE
WHERE SALARY> 3000000
UNION
SELECT DEPT_ID, DEPT_TITLE, LOCATION_ID, 0 --Ÿ�԰� ������ �´ٸ� �ٸ� ���̺� ����!
FROM DEPARTMENT;

--UNIONALL
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
UNION ALL
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3000000;

--INTERSECT : �ߺ����� ���
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
INTERSECT 
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY>= 3000000;

--MINUS : �ٸ� RS�� �� ������ ROW�� ���. �ߺ����� ���� �� ������
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'
MINUS
SELECT EMP_ID, EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE SALARY >= 3000000
UNION
--SELECT DEPT_ID, DEPT_TITLE, '����',NULL
SELECT '����',  DEPT_TITLE, DEPT_ID,0
FROM DEPARTMENT;

--GROUPING SETS : GROUP BY ���� ����ϰ� ���� GROUP BY�� ������ SELECT���� ������
SELECT DEPT_CODE, JOB_CODE, MANAGER_ID, FLOOR(AVG(SALARY))
FROM EMPLOYEE
GROUP BY GROUPING SETS(
    (DEPT_CODE, JOB_CODE, MANAGER_ID),
    (JOB_CODE, MANAGER_ID),
    (DEPT_CODE, MANAGER_ID)
);
--3���� �� ���� �� ���� ��

--�߿�!!!
--JOIN : �� �� �̻��� ���̺��� �� ���� ���̺�� ��ħ(������ ��ħ) / UNION�� RESULTSET��ħ
--�� ���� ���̺��� ��� ���� ��ġ�ϴ� ���� ������ ����(�����ڰ� �ʿ���)
--��� PRIMARY KEY�� FOREIGN KEY(�ٸ� ���̺� �����ϴ� ��)�� ����Ǿ� ����

--����Ŭ ����, ANSIǥ�� ������ ����� �� ����
--����Ŭ ���� ����
--SELECT �÷�, �÷�...
--FROM ���̺��1, ���̺��2 WHERE ���̺��1.�÷� = ���̺��2.�÷�

--�����, �μ��� ���
SELECT DEPT_CODE, EMP_NAME FROM EMPLOYEE;--�����
SELECT DEPT_ID, DEPT_TITLE FROM DEPARTMENT;--�μ���

--SELECT EMP_NAME, DEPT_TITLE
SELECT * --��ü ���̺��� ������
FROM EMPLOYEE, DEPARTMENT
WHERE EMPLOYEE.DEPT_CODE = DEPARTMENT.DEPT_ID; --��ü�� ���� . �� ��� EMPLOYEE���̺��� DEPT_CODE�� ����

--�����, �����å��, �μ��ڵ�, ���� ���
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE, JOB
WHERE EMPLOYEE.JOB_CODE=JOB.JOB_CODE;

--ANSI�� �����غ���
SELECT  EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;
    --���̺� �����ϴ� ������ ������ ��
    --�÷����� �ٸ��� �÷� ���� ���̺���� ���� ������. ����Ŭ ���������� ��������

--SELECT EMP_NAME, JOB_NAME, DEPT_CODE, SALARY
SELECT EMP_NAME, J.JOB_CODE, DEPT_CODE, SALARY --������ �÷��� ���� �� ���⼭�� ���� �ʿ�!
FROM EMPLOYEE E --���̺� ���� ��Ī�ο�
    JOIN JOB J ON E.JOB_CODE=J.JOB_CODE;
    --�� ���̺��� �÷����� �����ϸ� �÷� �տ� ���̺���� �ۼ��Ͽ� .���� �����Ѵ�

--���࿡ �� ���̺� �÷����� ���� �÷��� ������ �� ���̺��� JOIN�� �� 
--USING ���� ����� �� ����. ON�� �����
SELECT JOB_CODE
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE);--JOB_CODE 1���� ����
    
SELECT * 
FROM EMPLOYEE E
    JOIN JOB J ON(E.JOB_CODE = J.JOB_CODE); --JOB_CODE 2�� ����

--EQUI JOIN : �÷��� ������ ���� ���Ͽ� ROW�� ����-���ݱ��� ��� ��
--NON-EQUI JOIN : �÷��� ������ ������ ���� ROW�� ����

--EQUI JOIN
--INNER JOIN / OUTER JOIN�� ����
--INNER JOIN : ON������ ���� �÷��� ��ġ�ϴ� ���� ���� ���� ����. ������ �� ROW�� ����-���ݱ��� ��� ��
SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;

SELECT * 
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID;--�׳� JOIN ���� INNER JOIN���� ��
    
SELECT COUNT(*)
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE);--���� Ǯ �� ����. INNER JOIN�̸� ��ġ���� �ʴ� ���� ������

--��ġ���� �ʴ� ���� ����ϰ� �ʹٸ�?    
--OUTER JOIN : �� ���� ���̺� �������� �����Ͽ� ������ �� ���̺��� ��� ������ ���. 
--��ġ�ϴ� ���� ������ ���յ� ��� �÷� NULLó����

SELECT *
FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;--EMPLOYEE ���̺��� ����

SELECT *
FROM EMPLOYEE
    RIGHT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID; -- DEPARTMENT ���̺��� ����

--OUTER ���� - ����Ŭ ���� ����
SELECT * 
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+);--������ ���� �ʴ�,�ٿ����� �ʿ� + �ϸ� LEFT JOIN�� ��

SELECT * 
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE(+) = DEPT_ID;--RIGHT JOIN

--JOIN ������ �Ϲ����� FROM �����̶� �����ϱ� ������
--WHERE, GROUP BY, HAVING, ORDER BY �� ���� ����

--�����, �μ���,������ ����ϴµ� �μ����� '�ѹ���'�� ����� ���
SELECT EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
   JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
 WHERE DEPT_TITLE = '�ѹ���';
--�μ���, ������(LOCAL_NAME)�� ���
SELECT DEPT_TITLE, LOCAL_NAME
FROM DEPARTMENT
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE;

--CROSS JOIN : īƼ�ǰ�. ��ü ROW�� ��Ī
SELECT EMP_NAME, DEPT_CODE,DEPT_TITLE
FROM EMPLOYEE
    CROSS JOIN DEPARTMENT
ORDER BY 1;
 
 SELECT * FROM EMPLOYEE;   
 
 --SELF JOIN : ���̺��� �ڱ� ���̺�� �����ϴ� JOIN ������ ����
 --���̺� �ȿ� ������ ���� ������ ���̺��� �� ���� �����ؾ� ��,
 --�ش� ROW�� ���� ���� �־�� �ϴ� �� �ƴ϶� ��ü�� �������� ��
 
 --�� ����� �Ŵ��� �̸��� Ȯ������
 SELECT E.EMP_ID, E. EMP_NAME, E.MANAGER_ID, M.EMP_ID, M.EMP_NAME
 --column ambiguously ����. SELECT �÷��鵵 �����ؾ� ��
 FROM EMPLOYEE E
    JOIN EMPLOYEE M ON E.MANAGER_ID = M.EMP_ID;
 
 --����JOIN
 --���� ���� ���ι��� �� ���� ����� �� ���� -> 2�� �̻��� ���̺��� �� ���� ���̺�� ���� �� �ִ�
 --�����, �μ���, �ٹ������� ��ȸ�Ϸ���?
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
    
--���� ���� �� ���� ����! �̷��� �ϸ� ������
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE--1��
    JOIN LOCATION ON LOCATION_ID=LOCAL_CODE--2��
     JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID;--3�� ����. ���� ���� �� �����ؾ� ��
 
 --������ �븮�鼭 ASIA ������ �ٹ��ϴ� ���� ��ȸ
 --���, �̸�, ���޸�, �μ���, �ٹ�������, �޿�
 SELECT * FROM JOB;
 
  SELECT EMP_ID, EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME, SALARY
 FROM EMPLOYEE 
    JOIN JOB USING(JOB_CODE)
--  JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID -- INNER JOIN .�ϳ��� NULL�� �־� ��ġ�ϴ� �� ������ ������.22�� ���� 
    LEFT JOIN DEPARTMENT ON DEPT_CODE=DEPT_ID
    LEFT JOIN LOCATION  ON LOCATION_ID=LOCAL_CODE 
WHERE JOB_NAME='�븮' AND LOCAL_NAME LIKE 'ASIA%';   

--1.�ֹι�ȣ�� 1970��� ���̸鼭 ������ ���ڰ�, ���� ������ ��������
--�����, �ֹι�ȣ, �μ���, ���޸� ��ȸ
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, EMP_NO, DEPT_TITLE, JOB_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN JOB USING( JOB_CODE)
WHERE SUBSTR(EMP_NO,1,2) BETWEEN '70' AND '79' AND --substr(emp_no,1,1) = 7--70��� ���̴ϱ� 7�� ����!!
    SUBSTR(EMP_NO, 8,1) = '2' AND
    SUBSTR(EMP_NAME,1,1) = '��'; --emp_name like '��%';

--2. �̸��� '��'�ڰ� ���� �������� ���, �����, �μ��� ��ȸ
SELECT EMP_ID, EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
WHERE EMP_NAME LIKE '%��%';

--3.�ؿܿ����ο� �ٹ��ϴ� �����, ���޸�, �μ��ڵ�, �μ��� ��ȸ
SELECT * FROM DEPARTMENT;
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
--    JOIN JOB USING(JOB_CODE)
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
     JOIN JOB USING(JOB_CODE)
WHERE DEPT_TITLE LIKE '�ؿܿ���%';

--4. ���ʽ� ����Ʈ�� �޴� �������� �����, ���ʽ����ε�, �μ���, �ٹ��������� ��ȸ
SELECT EMP_NAME, BONUS, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
WHERE BONUS IS NOT NULL;

--5.�μ��ڵ尡 D2�� �������� �����, ���޸�, �μ���, �ٹ��������� ��ȸ
SELECT EMP_NAME, JOB_NAME, DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
WHERE DEPT_CODE = 'D2';

--6. �޿�������̺��� �ִ�޿�(MAX_SAL)���� ���� �޴� �������� �����, ���޸�, �޿�, ������ ��ȸ�Ͻÿ�.
-- (������̺�� �޿�������̺��� SAL_LEVEL�÷��������� ������ ��)
SELECT * FROM SAL_GRADE;

SELECT EMP_NAME, JOB_NAME, SALARY, SALARY*12+SALARY*NVL(BONUS,0),MAX_SAL 
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    JOIN SAL_GRADE USING (SAL_LEVEL)
WHERE MAX_SAL < SALARY;

--7. �ѱ�(KO)�� �Ϻ�(JP)�� �ٹ��ϴ� �������� �����, �μ���, ������, �������� ��ȸ�Ͻÿ�.
SELECT * FROM NATIONAL;
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME, NATIONAL_NAME
FROM EMPLOYEE
    JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN LOCATION ON LOCATION_ID = LOCAL_CODE
    JOIN NATIONAL USING( NATIONAL_CODE )
WHERE NATIONAL_NAME IN('�ѱ�', '�Ϻ�');

--8. ���� �μ��� �ٹ��ϴ� �������� �����, �μ���, �����̸��� ��ȸ�Ͻÿ�. (self join ���)--�ٽ�
SELECT E.EMP_NAME, DEPT_TITLE, P.EMP_NAME 
FROM EMPLOYEE E
    JOIN EMPLOYEE P ON E.DEPT_CODE = P.DEPT_CODE
    LEFT JOIN DEPARTMENT ON E.DEPT_CODE = DEPT_ID
--    JOIN DEPARTMENT D ON DEPT_CODE = DEPT_ID
--    JOIN EMPLOYEE P ON E.EMP_NAME = P.EMP_NAME;
WHERE E.EMP_NAME != P.EMP_NAME
ORDER BY 1;
    
--�⺻ ����Ʈ ��-��������
--�� �ٸ� ����Ʈ �� - ��������
--��������
--�ϳ��� SELECT�� �ȿ� �� �ٸ� SELECT���� �ִ� �� 
--�ܺ� SELECT�� : ���� ����, ���� SELECT�� : ��������
--���������� ���������� ��������
--���������� ������������ ���� ������ �Ǿ��ϱ� ������ ()�����

--�������� ������ �̸��� ����ϱ�(JOIN���� ����)
SELECT MANAGER_ID FROM EMPLOYEE WHERE EMP_NAME='������';
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_ID = '214';

SELECT EMP_NAME
FROM EMPLOYEE
WHERE EMP_ID = (SELECT MANAGER_ID
                            FROM EMPLOYEE
                            WHERE EMP_NAME = '������');
                                        
--��ü ����� ��� �޿����� ���� �޴� ��� ��ȸ
--�����, �μ���, ��å��, �޿�
SELECT EMP_NAME, DEPT_TITLE, JOB_NAME, SALARY
FROM EMPLOYEE
    JOIN JOB USING(JOB_CODE)
    LEFT JOIN DEPARTMENT ON DEPT_ID = DEPT_CODE
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE);

--���������� ����->���������� RESULTSET�� �������� ����
--1. ������ : ���������� RS�� �� �� ��, �� �� �÷��� ��� -- SELECT AVG(SALARY) FROM EMPLOYEE;
--2. ������ : ���������� RS�� ���� ��, �� �� �÷��� ���
--3. ���߿� : ���������� RS�� �� �� ��, ���� �÷��� ���
--4. ������ ���߿� : ���������� RS�� ���� ��, ���� �÷��� ���
--5. ��� �������� : ���������� ������ MAIN������ ���� �������� �� ���������� ����� ������ �ְ�, 
--            �� ���������� RS�� MAIN������ ������ �ִ� ���. ���� ������ �ش� 
--6. ��Į�� �������� : ���� ������������� ����� ������(����� �� ��)�� ��������

--1. ������ �������� 
--������̶� ���� �μ��� ����� ��ȸ�ϱ�
--�����, �μ���, ���޸�
SELECT EMP_NAME, DEPT_TITLE, JOB_NAME
FROM EMPLOYEE
    LEFT JOIN DEPARTMENT ON DEPT_CODE = DEPT_ID
    JOIN JOB USING(JOB_CODE)
 WHERE DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME = '�����');
--WHERE DEPT_CODE = 'D6'; �� ����

--1.�����ؿ� �޿��� ���� ����� �˻�. �����ȣ, ����̸�, �޿� ���
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME = '������')
            AND EMP_NAME <> '������';--�����ش� ���� ���

--2. �⺻�޿��� ���� ���� ����� ���� ���� ����� ������ ���. �����ȣ, ����̸�, �޿� ���
SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE) OR
                SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);

--3. D1,D2 �μ����� �ٹ��ϴ� ����� �߿��� �⺻ �޿��� D5�μ� �������� ��� �޿����� ���� ��� ��ȸ
--�μ���ȣ, �����ȣ, �����, ����
SELECT DEPT_CODE, EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE DEPT_CODE IN('D1','D2') AND
    SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE WHERE  DEPT_CODE = 'D5');
    
--2. ������ ��������
--���������� ����� �� �� �÷�, ���� ������ ������ ��������
--���� �� �� : IN, ��Һ� : ANY, ALL
--��, ����� �ֳ������� ���� EXIST 

--������, �ڳ��� ���� �μ��� ��� �������
SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME IN('������','�ڳ���');

SELECT * 
FROM EMPLOYEE
WHERE DEPT_CODE IN (SELECT DEPT_CODE FROM EMPLOYEE WHERE EMP_NAME IN('������','�ڳ���'));
--IN - OR�� ���ϴ� ��. D5�Ǵ� D9, 2������ ' ='�� �ȵ�! ������ �϶� ����񱳸� = �� �� �� ����

--1.���¿�, ������ ����� �޿� ��ް� ���� ����� ���޸�, ����� ���
--���¿�, ������ ����
SELECT JOB_NAME, EMP_NAME
FROM JOB
    JOIN EMPLOYEE USING(JOB_CODE)
WHERE SAL_LEVEL IN (SELECT SAL_LEVEL FROM EMPLOYEE WHERE EMP_NAME IN('���¿�','������'))
 AND EMP_NAME NOT IN ('���¿�', '������'); 
 
 --2. ������ ��ǥ, �λ����� �ƴ� ��� ����� �μ����� ���
 SELECT *
 FROM EMPLOYEE
 WHERE JOB_CODE NOT IN (SELECT JOB_CODE FROM JOB WHERE JOB_NAME IN ( '��ǥ',  '�λ���'))
 ORDER BY DEPT_CODE;
 
 SELECT NVL(DEPT_TITLE, '����') �μ���, EMP_NAME �����
FROM EMPLOYEE E 
    LEFT JOIN DEPARTMENT D ON E.DEPT_CODE = D.DEPT_ID
WHERE NOT JOB_CODE IN (SELECT JOB_CODE FROM JOB WHERE JOB_NAME IN ( '��ǥ',  '�λ���'))
ORDER BY 1,2;

 --3. ASIA1 ������ �ٹ��ϴ� ��� ���� ���. �μ��ڵ�, �����
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

--������ ��������
--ANY : ���߰��� ���� ��Һ� - OR
-- � 
--X < ANY(��������) : X���� ���������� � ������ ������ TRUE(�ִ밪���� ������ TRUE)
-- X > ANY(��������) : X���� ���������� � ������ ũ�� TRUE( �ּҰ����� ũ�� TRUE)
--X < 10 OR X < 20 OR X <30  -> 30���� ������ TRUE. �� �� �ϳ��� TRUE���� TRUE

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE SALARY > ANY(2000000,5000000); --200���� ū �����
--WHERE SALARY > 2000000 OR SALARY > 5000000; --���� �̰Ŷ� ����
--WHERE SALARY < ANY (2000000,5000000); -- 500���� ���� ����� �� ����

--J3 �ڵ带 ���� ������� �޿��� ���ϱ�
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
--WHERE SALARY > ANY(SELECT SALARY FROM EMPLOYEE WHERE JOB_CODE='J3');
--�� ���������� �ּҰ����� ū ��
WHERE SALARY > (SELECT MIN(SALARY) FROM EMPLOYEE WHERE JOB_CODE='J3');

--ALL : ��� ������
--X < ALL(��������) : X���� ��� ������ ������ TRUE(�ּҰ����� ������ )- AND
--X > ALL(��������) : X���� ��� ������ ũ�� TRUE(�ִ밪���� ũ��)

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
--WHERE SALARY > ALL(2000000,5000000);
--WHERE SALARY < ALL(2000000,5000000);
--WHERE SALARY < 2000000 AND SALARY < 5000000;
--WHERE SALARY < ALL(SELECT SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D2');
--���������� �ּҰ����� ���� ��
WHERE SALARY > ALL(SELECT SALARY FROM EMPLOYEE WHERE DEPT_CODE = 'D2');
--���������� �ִ밪���� ū ��

--EXIST : ���������� ����� ������ ������ TRUE-��������������� ���� ��
SELECT *
FROM EMPLOYEE
WHERE EXISTS (SELECT EMP_NAME FROM EMPLOYEE WHERE DEPT_CODE = 'D10');

--3.���߿� �������� : �÷��� ������ ���� ���� ��
--����� �������� �μ�,���� ��ȸ�ϱ�
SELECT DEPT_CODE, JOB_CODE
FROM EMPLOYEE
WHERE SUBSTR(EMP_NO,8,1) = '2' AND ENT_YN = 'Y';
--����� �������� �μ��� ������ ���� ����� ���ϱ�
SELECT *
FROM EMPLOYEE
WHERE (DEPT_CODE, JOB_CODE) IN(SELECT DEPT_CODE, JOB_CODE FROM EMPLOYEE 
                                                                                WHERE SUBSTR(EMP_NO,8,1) = '2' AND ENT_YN = 'Y');
                                                                                
--�������� ���� ���� OR �Ǵ¶Ǵ�..--���¸��̰ų� �������̰ų� ������-���� OR��
--���߿��� ���� ���� AND �׸��� �׸��� --�÷� D8�̸鼭 J6�� ��

--����������̸鼭 �޿��� 2000000���� ����� �̸�, �μ��ڵ�, �޿� ���
SELECT * FROM EMPLOYEE;
SELECT * 
FROM DEPARTMENT 
    JOIN EMPLOYEE ON DEPT_CODE=DEPT_ID
WHERE DEPT_TITLE = '���������' AND SALARY=2000000;

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE(DEPT_CODE, SALARY) IN (SELECT DEPT_CODE, SALARY FROM DEPARTMENT 
                                                                    JOIN EMPLOYEE ON DEPT_CODE=DEPT_ID
                                                                    WHERE DEPT_TITLE = '���������' AND SALARY=2000000);
--4.������ ���߿� ��������
--���޺� �ּұ޿��� �޴� ����� ����̸�, ���� �޿� ��ȸ
SELECT JOB_CODE, MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE;

SELECT  EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE
WHERE (JOB_CODE, SALARY) IN (SELECT JOB_CODE, MIN(SALARY) FROM EMPLOYEE GROUP BY JOB_CODE);
--�μ��� �ִ�޿��� �ް� �ִ� ����� �̸�,�μ��ڵ�, �޿�
SELECT DEPT_CODE, MAX(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE;

SELECT EMP_NAME, DEPT_CODE, SALARY
FROM EMPLOYEE
WHERE (DEPT_CODE, SALARY) IN(SELECT DEPT_CODE, MAX(SALARY) FROM EMPLOYEE GROUP BY DEPT_CODE);

--5. ��(ȣ��)�� ��������
--�������� ���� ���������� �ְ� ���������� ������ ����� �������� ����� ������ �ִ� ����������
--���α׷��� ����for���� ����ϰ� ���ư�

--����� �Ŵ��� �̸� ��ȸ
--�����, �Ŵ��� ���̵�,�Ŵ��� �̸�
SELECT EMP_NAME, MANAGER_ID, 
    (SELECT EMP_NAME 
    FROM EMPLOYEE
    WHERE EMP_ID=E.MANAGER_ID)
    --��Į�� ���������� �ش�
    --���� ������ŭ �������� ����
    --TRUE ���� ���� RS�� ���
FROM EMPLOYEE E;

SELECT MANAGER_ID FROM EMPLOYEE;
SELECT * FROM EMPLOYEE;

--�ɺ��� ����� ���� �μ��� ����� �μ��ڵ�, ����ձ޿��� ��ȸ
SELECT DEPT_CODE, TRUNC(AVG(SALARY)) ��ձ޿�
FROM EMPLOYEE E
--WHERE DEPT_CODE = (SELECT DEPT_CODE FROM EMPLOYEE  
--                            WHERE DEPT_CODE=E.DEPT_CODE 
--                            AND EMP_NAME = '�ɺ���')
--EXISTS Ȯ�� �뵵. �μ��ڵ尡 �ɺ��� �μ� �ڵ�� ������ �� ���
WHERE EXISTS (SELECT DEPT_CODE FROM EMPLOYEE  --����� ��� �ٲ�ϱ� EXISTS�� �׻� �ִ°� �ƴ�
                            WHERE DEPT_CODE=E.DEPT_CODE 
                            AND EMP_NAME = '�ɺ���')
GROUP BY  DEPT_CODE;

--6.��Į�� �������� : ����������� �߿��� ������� ������ ���������� ��.
--�μ��� ��պ��� ���� �޿��� �޴� ����� �̸�, �޿�, ��ձ޿��� ���
SELECT EMP_NAME, SALARY, 
    (SELECT FLOOR(AVG(SALARY))
    FROM EMPLOYEE
    WHERE DEPT_CODE = E.DEPT_CODE) ��ձ޿�
--WHERE�� �ܺο��� �� �ϳ� �����ͼ� 
-- E.DEPT_CODE =D1���� ����
--���͸��� ������ ��� ����
--EMPLOYEE E ������ŭ ROW�� ���
FROM EMPLOYEE E;

SELECT EMP_NAME, DEPT_CODE,SALARY
FROM EMPLOYEE
WHERE DEPT_CODE= 'D9';

--�ڽ��� ���� ������ ��� �޿����� ���� �޴� ����� �̸� ���� �޿� ��ȸ
SELECT EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE E
WHERE SALARY >= (SELECT AVG(SALARY) FROM EMPLOYEE 
                        WHERE JOB_CODE=E.JOB_CODE);
    
 --�����, �μ��ڵ�, ����, �ڱ� �μ� �ο� ��                       
SELECT EMP_NAME, DEPT_CODE, SALARY ,
    (SELECT COUNT(*) 
    FROM EMPLOYEE 
    WHERE DEPT_CODE=E.DEPT_CODE) "�ڱ�μ� �ο� ��"
FROM EMPLOYEE E;

--�ζ��� �� : ���������� �ϳ��� ���̺�� �̿�� �� �ְ� �ϴ� ��
--FROM���� ���������� ����ϴ� �� 
--VIEW 
--INLINE VIEW : 1ȸ������ RS�� ���̺�� �̿��ϴ� ��
--STORED VIEW : �����ϰ� ���������� ����ϰ� �ϴ� ��

--EMPLOYEE ���̺� ��/�� ���� �÷� ����
SELECT EMP_NAME, EMP_NO, EMAIL, PHONE,
    DECODE(SUBSTR(EMP_NO,8,1),'1','��','2','��') AS GENDER
FROM EMPLOYEE
WHERE DECODE(SUBSTR(EMP_NO,8,1),'1','��','2','��')='��';
--INLINE VIEW�� �����ϸ�
SELECT *
 FROM (SELECT EMP_NAME AS ���� , EMP_NO AS �ֹι�ȣ, EMAIL AS �̸��� , PHONE AS ��ȭ��ȣ,
        DECODE(SUBSTR(EMP_NO,8,1),'1','��','2','��' ) AS ����
        FROM EMPLOYEE)
--WHERE ���� = '��' AND SALARY >= 3000000; invalid identifier����. RS�� �ִ� ��(EMP_NAME, EMP_NO, EMAIL, PHONE,����)�� �� �� ����. 
--WHERE ���� = '��' AND EMP_NAME = '�̼���'; �ȴ�
WHERE ���� = '��' AND �̸��� LIKE '____@%'; --��Ī�ο��ϸ� ��Ī���� ���缭 �����! ��Ī��� ���̺��� �ٲ�� ����

--�ڱ�μ� ��պ��� ���� �޴� ���
SELECT EMP_NAME, DEPT_CODE, SALARY, (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE WHERE E.DEPT_CODE=DEPT_CODE)
FROM EMPLOYEE E
WHERE SALARY >  (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE  WHERE JOB_CODE=E.JOB_CODE);
--INLINE VIEW�� �����ϸ�
SELECT *
FROM(
    SELECT EMP_NAME, DEPT_CODE, SALARY, (SELECT FLOOR(AVG(SALARY)) FROM EMPLOYEE WHERE E.DEPT_CODE=DEPT_CODE) AS AVGSAL
    FROM EMPLOYEE E
    )
WHERE SALARY >  AVGSAL;

--���� TOP3���ϱ�
--���� 3��~5�� ���ϱ�
--ROWNUM �÷��� �̿��ϴ� ��� -> ORACLE���� �����ϴ� ROW�� ��ȣ�� �ο��ϴ� �÷� (RS�� �÷��ƴ�!!)
--RANK() OVER()�Լ��� �̿��ϴ� ��� -> ORACLE�� �����ϴ� �Լ�

--1. ROWNUM : ����Ŭ�� ��� ���̺� �ڵ����� �����Ǵ� �÷�
SELECT ROWNUM, EMPLOYEE.* FROM EMPLOYEE
WHERE ROWNUM < 5;
--ROWNUM�� RESULTSET�� �߻��ϸ� �����Ǵ� �÷�
SELECT ROWNUM, EMPLOYEE.* 
FROM EMPLOYEE
WHERE DEPT_CODE = 'D5'; 
--FROM�� �����ڸ��� ���,���Ŀ� ���� ��ȣ�� ��ο���. RS����
--FROM -> SELECT -> ORDER BY����

--�޿� ���� ������ �����ϰ� ROWNUM����غ���
SELECT ROWNUM, E.*
FROM EMPLOYEE E
ORDER BY SALARY DESC; --�޿�������� ��ȣ�� �ο��� �ȵ�

SELECT ROWNUM, E.* 
FROM (SELECT *
                FROM EMPLOYEE
                ORDER BY SALARY DESC) E; --����� ����

--�޿��� ���� ���� �޴� 3�� ���ϰ�
--�޿� ���� ���� �޴� 3�� ���ϱ�
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

--�޿��� ���� �޴� ����� 5����� 10���� ���ϱ�
SELECT * 
FROM ( -- �̸�ŭ ���̺�� ����. ������ RNUM�� ������ WHERE�� ��
    SELECT ROWNUM AS RNUM, E.* --ROWNUM���� �ζ��κ�� ������Ŵ. �ϳ��� �÷����� ��. ����¡(���ϴ� �����͸� �߶�) �� ���� ��
    --�� SELECT���� ROWNUM�ο�. ���ĵ� ä�� ���� �ο�.
    FROM (
                    SELECT *
                    FROM EMPLOYEE
                    ORDER BY SALARY DESC
                ) E
)
WHERE RNUM BETWEEN 5 AND 10; 
--���� ���۰�(1)�� �Է����� ������ ROWNUM�� �߰����� �� ã��

--�ζ��κ� ����
SELECT *
FROM (
                SELECT EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO,8,1),'1','��','��') AS ����
                FROM EMPLOYEE
)
WHERE ���� = '��';

--1. D5�μ����� ���� ���� 3���� ������ ���
--����, ���,�����,����(*12)
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

--2.�μ��� ��ձ޿� TOP3 �μ��� �μ��ڵ�, �μ���, ��ձ޿� ��ȸ
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
 
 --RANK() OVER()�Լ� �̿��ϱ�
 --���� ���� 1~3�� ��� ���ϱ�
SELECT *
FROM (
                SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY DESC) AS ����
                FROM EMPLOYEE)
WHERE ���� BETWEEN 5 AND 10;

 --���� ���� 1~3�� ���
 SELECT *
FROM (
                SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY ASC) AS ����
                FROM EMPLOYEE)
WHERE ���� <=3;

SELECT EMP_NAME, SALARY, RANK() OVER(ORDER BY SALARY ASC) AS ����
FROM EMPLOYEE;
--�ߺ��� ������ �� ���� ������ �ο��ϰ� ���� ��ȣ�� �ǳʶٰ� �Ѿ(5�� 2��, ���� 7��)
SELECT EMP_NAME, SALARY, DENSE_RANK() OVER(ORDER BY SALARY ASC) AS ����
FROM EMPLOYEE;
--���� ��ȣ�� �ǳʶ��� �ʰ� �ο���(5�� 2��, 6��)

--������ ����
--FROM���� �ɼ��� �ο��Ͽ� �� �� ����
--START WITH : �θ�ROOT���
--CONNECT BY : �θ�-�ڽ� ���踦 ����
--PRIOR : �θ������ ������ �� �ؿ� �ڽ����� ������ �ϴ� �ɼ�
--LEVEL : �ڵ����� �ο��Ǵ� ��ȣ, ROOT��尡 LEVEL 1
SELECT LEVEL, EMP_ID, EMP_NAME, MANAGER_ID
FROM EMPLOYEE
START WITH EMP_ID=200 --�̰� LEVEL1
CONNECT BY PRIOR EMP_ID = MANAGER_ID;

--�����ֱ� ���� �� ��
SELECT LPAD( ' ', (LEVEL-1)*5, ' ') || EMP_NAME || NVL2(MANAGER_ID, '(' || MANAGER_ID || ')', ' ') AS ������
FROM EMPLOYEE
START WITH EMP_ID=200
CONNECT BY PRIOR EMP_ID = MANAGER_ID;

--DDL 
--CREATE : ���̺�(�����͸� �����ϴ� ����)�� ����. 
--CREATE TABLE ���̺�� (�÷��� �ڷ���(ũ��))
--����Ŭ�������� : VARCHAR2(����Ʈ ũ��)- ���ڿ�. �ִ� 2000BYTE. �ѱ� 3����Ʈ. ������� CLOB����
--, NUMBER, DATE �ܿ��

--1. ������ �ڷ��� NUMBER
--�⺻������ ������ ���� �׳� NUMBER�� ����ص� ������
--NUMBER(PRECISION, SCALE)
--PRECISION : ǥ���� �� �ִ� ��ü �ڸ� ���� �ǹ� -> ����(1~38)
--SCALE : �Ҽ������� �ڸ��� -> ����(-84~127)���� ���� �� ����
CREATE TABLE TBL_NUMBERTEST(
    A NUMBER, --�⺻ ���
    B NUMBER(5), --���� 5������ Ȯ��. 5�ڸ� �� 
    C NUMBER(5,1), --����5�ڸ� �Ҽ��� 1�ڸ�-�ڸ����� �ٸ� �ݿø��ؼ� ��
    D NUMBER(5,-2) --�Ҽ������� ������ 2ĭ �ű�� �ݿø��ؼ� 0 ó��
);
DROP TABLE TBL_NUMBERTEST;--���̺� ����

INSERT INTO TBL_NUMBERTEST
VALUES (1234.567, 1234.567, 1234.567, 1234.567);

INSERT INTO TBL_NUMBERTEST
VALUES (1234.567, 1234.567, 1234.567, 1264.567);

INSERT INTO TBL_NUMBERTEST
VALUES (123400.567, 123400.567, 123400.567, 126400.567); --�� ū ���� ������ ������

SELECT * FROM TBL_NUMBERTEST;

--������ : ���ڴ� ���� ���� ���ڿ��� ��
--CHAR : ��������, �ִ� 2000����Ʈ, 
--VARCHAR2 : �������� ���� ������, �ִ� 4000����Ʈ ����
--NCHAR, NVARCHAR2(�����ڵ尪)
--VARCHAR2 ������

CREATE TABLE TBL_STRTEST(
    NAME VARCHAR2(6),
    ADDRESS VARCHAR(20)
); --������ �� ũ�⸦ ��������� ��. �ִ� ũ��� ��������. ���߿� �� �ø����� ����
DROP TABLE TBL_STRTENT;

INSERT INTO TBL_STRTEST VALUES('�ȳ�','��⵵ �����');
--INSERT INTO TBL_STRTEST VALUES('�ȳ���','��⵵ �����'); 9����Ʈ���� ������

SELECT * FROM TBL_STRTEST;

--��¥�� : DATE
--��/��/�� * ��, ��, ��
CREATE TABLE TBL_DATETEST(
    DAY DATE
);

INSERT INTO TBL_DATETEST VALUES('20/01/01');
INSERT INTO TBL_DATETEST VALUES('2020/01/01'); --������ ��Ĵ�� ��µ�
INSERT INTO TBL_DATETEST VALUES(TO_DATE('20200101', 'YYYYMMDD'));

SELECT * FROM TBL_DATETEST;

--���̺��� �����غ���!
--CREATE TABLE [��ü��] ���̺��(
--      �÷��� �ڷ��� [��������    ], �÷��� �ڷ���, �÷��� �ڷ���
--);
CREATE TABLE MEMBER(
    MEMBER_ID VARCHAR2(20), --�÷������� , ���� / �ڷ����� �÷��� ���̴� ����� ������
    MEMBER_PWD VARCHAR2(20),
    MEMBER_NAME VARCHAR2(30),
    MEMBER_AGE NUMBER
);
SELECT * FROM MEMBER;

--�÷����� �ּ��� �޾Ƴ��� �� ����
COMMENT ON COLUMN MEMBER.MEMBER_ID IS 'ȸ�����̵�';
COMMENT ON COLUMN MEMBER.MEMBER_PWD IS '��� 8�ڸ� �̻� Ư����������';

SELECT * FROM USER_COL_COMMENTS; --��ü �ּ�Ȯ��
SELECT * FROM USER_COL_COMMENTS WHERE TABLE_NAME = 'MEMBER'; --MEMBER���̺� ��ȸ

--�����͸� ���������� �����ϱ� ���� ��ġ. ������ ���Ἲ�� �����ϱ� ���� 
--���� ���� - ���̺� �ۼ� �� ����
--NOT NULL : �÷��� �⺻���� NULL�������� ������. ���̵�, �н����� ���� �� NULL��� �� ��
CREATE TABLE USER_NN (
    USER_NO NUMBER,
    USER_ID VARCHAR2(20),
    USER_PW VARCHAR2(20)
);
SELECT * FROM USER_NN;
INSERT INTO USER_NN VALUES(1, 'USER01', '1234');
INSERT INTO USER_NN VALUES(NULL,NULL,NULL);
--NOT NULL �������� �����ϱ�
CREATE TABLE USER_NN2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) NOT NULL,
    USER_PW VARCHAR2(20) NOT NULL
);
INSERT INTO USER_NN2 VALUES(1,'USER01','1234');
INSERT INTO USER_NN2 VALUES(2,NULL,NULL); --�ȵ�
INSERT INTO USER_NN2 VALUES(3,NULL,'1234'); --�ȵ�
INSERT INTO USER_NN2 VALUES(NULL,'USER02','1234');
SELECT * FROM USER_NN2;
INSERT INTO USER_NN2 VALUES(1,'USER01','1234'); --���������� ���� ���¿��� ��

--UNIQUE : �÷��� �ߺ��� ������� �ʴ� ��������
CREATE TABLE USER_UQ(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) UNIQUE, --�÷� ������ �������� ����
    USER_PW VARCHAR2(20)
);
INSERT INTO USER_UQ VALUES(1,'USER01','1234');
SELECT * FROM USER_UQ;
INSERT INTO USER_UQ VALUES(2,'USER01','1234');--ID �ߺ��̾ �ȵ�
INSERT INTO USER_UQ VALUES(1,'USER02','1234'); --ID�� �ٸ���
--���̺� �������� �����ϱ�
CREATE TABLE USER_UQ2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20), 
    USER_PW VARCHAR2(20),
    UNIQUE(USER_ID) --���̺��� ����
);
INSERT INTO USER_UQ2 VALUES(1,'USER01','JINHO');
INSERT INTO USER_UQ2 VALUES(2,'USER01','CHOHYUN');
--UNIQUE���������� ������ �÷����� NULL���� �� �� ������?
INSERT INTO USER_UQ2 VALUES(3,NULL,'�Ǵ�?'); --��. �ߺ���
SELECT * FROM USER_UQ2;
--UNIQUE�� �÷� �� �� ������ �� ������?
CREATE TABLE USER_UQ3(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20), 
    USER_PW VARCHAR2(20),
    UNIQUE(USER_ID, USER_PW) -- 2�� ���� �ϳ��� ����, �� �� ���� ���� �ߺ������� ��
);
INSERT INTO USER_UQ3 VALUES(1,'USER01','1234');
INSERT INTO USER_UQ3 VALUES(1,'USER01','1235'); --PW�� �޶� ����
SELECT * FROM USER_UQ3;

--PRIMARY KEY : NULL�� �ߺ��� ������� ���� (�÷��� ���� �ĺ��ڷ� ����ϱ�����) �ε����� �ο���- ���� �˻� ����
--���̺��� �� ROW�� ������ �� �ִ� �÷����� ����
--NOT NULL, UNIQUE ���ÿ� ���� ��.
--���̺� ��� �� �� �÷��� ����
--����Ű : PK�� �� �� ����. ���� �׷�ȭ�Ͽ� �� �� ���� ���� ������� ����
CREATE TABLE USER_PK (
    USER_NO NUMBER PRIMARY KEY,
    USER_ID VARCHAR2(20) NOT NULL UNIQUE, -- �� ���̺� ���� �� �������� �� �� ����
    USER_PW VARCHAR2(20) NOT NULL
);

INSERT INTO USER_PK VALUES(1,'USER01','1234');
INSERT INTO USER_PK VALUES(1,'USER02','4567'); -- �ߺ��� �� ��
INSERT INTO USER_PK VALUES(NULL,'USER02','4567'); --NULL �� ��

SELECT * FROM USER_PK;
--PRIMARY KEY  ���̺��������� ���������� ������ �� ����
CREATE TABLE USER_PK2(
    USER_NO NUMBER,
    USER_ID VARCHAR2(20) NOT NULL UNIQUE,
    USER_PW VARCHAR2(20) NOT NULL,
    PRIMARY KEY(USER_NO)
);
INSERT INTO USER_PK2 VALUES(1,'USER01','1234');
INSERT INTO USER_PK2 VALUES(1,'USER02','4567'); -- �ߺ��� �� ��
INSERT INTO USER_PK2 VALUES(NULL,'USER02','4567'); --NULL �� ��
--PK�� �� �� �÷��� ����(����Ű)
CREATE TABLE ORDER_PK (
    PRODUCT_NO VARCHAR2(20),
    USER_ID VARCHAR2(20),
    ORDER_DATE DATE,
    ORDER_NUM NUMBER,
    PRIMARY KEY(PRODUCT_NO, USER_ID, ORDER_DATE) --����Ű�� ���̺��������� ����
);

INSERT INTO ORDER_PK VALUES('P1','USER01',SYSDATE,1);
INSERT INTO ORDER_PK VALUES('P1','USER02',SYSDATE,2);
INSERT INTO ORDER_PK VALUES('P2','USER01',SYSDATE,2);
INSERT INTO ORDER_PK VALUES('P1','USER01',SYSDATE,10);
INSERT INTO ORDER_PK VALUES('P2','USER01','20/07/30',1);
INSERT INTO ORDER_PK VALUES('P2','USER01','20/07/31',1);
INSERT INTO ORDER_PK VALUES('P3','USER01',NULL,1);--NULL �ȵ�
INSERT INTO ORDER_PK VALUES('P3','USER01','99/12/24',1);

SELECT * FROM ORDER_PK;

--�߿�!!!
--FOREIGN KEY : �����Ǵ� ���̺��� �÷��� ���� �����ϸ� ���. ����Ű
--�ܷ�Ű. �ٸ� ���̺��� Ư�� �÷��� �ִ� �����͸� ������ �� �ְ� �ϴ� ��
--��������� �Ǵ� �÷��� UNIQUE ���������� �־�� ��. NULL ����
--PRIMARY KEY�� �����ص� ��(UNIQUE �������� �� ����). NOT NULL�� ���̰� ����
CREATE TABLE SHOP_MEMBER(
    USER_NO NUMBER UNIQUE,
    USER_ID VARCHAR2(20) PRIMARY KEY,
    USER_PW VARCHAR2(20) NOT NULL,
    USER_NAME VARCHAR2(30)
);
INSERT INTO SHOP_MEMBER VALUES(1,'USER01','1234', '����ȣ');
INSERT INTO SHOP_MEMBER VALUES(2,'USER02','2222', '����');
INSERT INTO SHOP_MEMBER VALUES(3,'USER03','3333', '�����');
INSERT INTO SHOP_MEMBER VALUES(4,'USER04','4444', '�̼���');
COMMIT; --������ �����
SELECT * FROM SHOP_MEMBER;

CREATE TABLE SHOP_BUY(
    BUY_NO NUMBER PRIMARY KEY,
    USER_ID VARCHAR2(20) REFERENCES SHOP_MEMBER(USER_ID), 
    --REFERENCES �����ϴ� ���̺��(�÷���)
    --ȸ�������̷��̹Ƿ� SHOP_MEMBER�� ����� ID�� ���ƾ� ��.ȸ������  ���ϸ� �� ���.
    PRODUCT_NAME VARCHAR2(20),
    REG_DATE DATE
);
INSERT INTO SHOP_BUY VALUES(1,'USER01','�ڵ���','20/07/30');
INSERT INTO SHOP_BUY VALUES(2,'USER02','��ȸ','21/07/30');
INSERT INTO SHOP_BUY VALUES(2,'USER00','��ȸ','21/07/30');--�� ��
SELECT * FROM SHOP_BUY;
--���̺� ���� �������谡 ������ �Ǹ�
--�����Ǵ� �θ����̺��� ���� �Ժη� ������ �� ����! -> �ڽ����̺��� ���� �� ���� �Ǵ� �����Ǹ� NULL�� ó���ϴ� �ɼ� ���� �� �� ����
--�ڽ����̺� �θ�  �����ϰ� �ִ� ROW�� �ϳ��� ������ ���� �� ����
DELETE FROM SHOP_MEMBER WHERE USER_ID = 'USER01';
DELETE FROM SHOP_MEMBER WHERE USER_ID = 'USER04'; --���� ��. �ڽ��� �����ϰ� ���� �ʾƼ�
DROP TABLE SHOP_MEMBER; --���̺� �� ������.

--CHECK : ���� ������ ������ ���� ������ ������ ����
