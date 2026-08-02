# Spring Legacy MVC 실습 모음

> Spring Legacy MVC 환경에서 Maven, JSP, MyBatis, Oracle DB 연동 구조를 제공 자료 기반으로 실습한 Spring 학습 저장소입니다.

<br>

## 목차

1. [프로젝트 소개](#1-프로젝트-소개)
2. [주요 실습 내용](#2-주요-실습-내용)
3. [기술 스택](#3-기술-스택)
4. [프로젝트 구조](#4-프로젝트-구조)
5. [실행 방법](#5-실행-방법)
6. [구현 및 학습 포인트](#6-구현-및-학습-포인트)
7. [테스트 및 검증](#7-테스트-및-검증)
8. [개선 예정 사항](#8-개선-예정-사항)
9. [참고 사항](#9-참고-사항)

<br>

## 1. 프로젝트 소개

이 저장소는 Spring Legacy MVC 수업 과정에서 제공된 자료를 기반으로 Spring MVC 구조와 MyBatis, Oracle DB 연동 흐름을 실습한 저장소입니다.

Spring Boot가 아닌 Spring Framework 기반의 Legacy MVC 프로젝트 구조를 다루며, Maven 의존성 관리, Controller 요청 처리, JSP View 응답, MyBatis Mapper 연동 방식을 확인했습니다.

완성된 CRUD 서비스라기보다는, Spring Legacy 환경의 기본 구조와 DB 연동 흐름을 학습하기 위한 실습 모음입니다.

주요 목표는 다음과 같습니다.

* Spring Legacy MVC 프로젝트 구조 이해
* Maven 기반 의존성 관리 방식 학습
* Controller와 View 연결 흐름 실습
* MyBatis와 Oracle DB 연동 구조 확인
* Servlet/JSP 이후 Spring MVC로 확장되는 흐름 이해

<br>

## 2. 주요 실습 내용

### Spring MVC 구조

* `@Controller`를 이용한 요청 처리
* `@RequestMapping` 기반 URL 매핑
* Model을 이용한 데이터 전달
* View 이름 반환을 통한 JSP 응답 흐름 확인

### Maven 프로젝트 구성

* `pom.xml` 기반 의존성 관리
* WAR 패키징 구조 확인
* Spring MVC, MyBatis, Oracle JDBC, JSP/JSTL 의존성 구성

### MyBatis / Oracle DB 연동

* MyBatis 설정 방식 확인
* `SqlSession`을 통한 Mapper 호출 구조 실습
* Repository 계층에서 DB 접근 흐름 확인
* Oracle JDBC를 활용한 DB 연결 실습

### JSP View 실습

* JSP를 이용한 화면 출력
* JSTL 기반 서버 데이터 표현
* Spring Controller에서 전달한 데이터를 View에서 확인

<br>

## 3. 기술 스택

| 구분 | 기술 |
|---|---|
| Language | Java 11 |
| Backend | Spring Framework 5.0.7, Spring MVC |
| View | JSP, JSTL |
| Database | Oracle DB |
| SQL Mapper | MyBatis, mybatis-spring |
| Build | Maven |
| Server | Apache Tomcat |
| Test | JUnit 4 |
| Tool | Eclipse / STS |

<br>

## 4. 프로젝트 구조

```text
spring-legacy/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── acorn/
│   │   │           └── batis/
│   │   ├── resources/
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── views/
│   └── test/
├── pom.xml
└── README.md
```

### 주요 디렉토리 설명

| 경로 | 설명 |
|---|---|
| `src/main/java` | Controller, Repository, 도메인 객체 등 Java 코드 |
| `src/main/resources` | Spring, MyBatis 등 설정 파일 위치 |
| `src/main/webapp` | JSP, WEB-INF 등 웹 리소스 |
| `WEB-INF/views` | JSP View 파일 위치 |
| `pom.xml` | Maven 의존성 및 빌드 설정 |

<br>

## 5. 실행 방법

이 저장소는 Spring Legacy MVC 실습 프로젝트입니다.  
Eclipse 또는 STS에서 Maven Project로 import한 뒤, Apache Tomcat 서버에 추가하여 실행합니다.

### 5-1. 저장소 클론

```bash
git clone https://github.com/Rustapex/spring-legacy.git
cd spring-legacy
```

### 5-2. Eclipse 또는 STS에서 Import

```text
File → Import → Existing Maven Projects
```

### 5-3. Maven 의존성 갱신

```text
Project 우클릭 → Maven → Update Project
```

### 5-4. Tomcat 서버 설정

```text
Servers → New → Server → Apache Tomcat
```

### 5-5. DB 설정

Oracle DB 연동이 필요한 실습은 로컬 Oracle DB 환경과 접속 설정이 필요합니다.

README에는 실제 DB 계정, 비밀번호, 접속 정보는 포함하지 않습니다.  
필요한 경우 예시 값으로 별도 설정 파일을 작성합니다.

```properties
DB_URL=jdbc:oracle:thin:@localhost:1521:xe
DB_USERNAME=your-username
DB_PASSWORD=your-password
```

### 5-6. 프로젝트 실행

```text
Run on Server
```

접속 주소는 프로젝트 context path에 따라 달라질 수 있습니다.

```text
http://localhost:8080/[context-path]
```

<br>

## 6. 구현 및 학습 포인트

### 6-1. Spring MVC 요청 처리 흐름

* `@Controller`와 `@RequestMapping`을 사용하여 클라이언트 요청을 처리하는 흐름을 실습했습니다.
* Controller에서 Model에 데이터를 담고 View 이름을 반환하는 구조를 확인했습니다.
* Servlet/JSP에서 직접 처리하던 흐름이 Spring MVC에서 어떻게 분리되는지 학습했습니다.

### 6-2. Maven 기반 의존성 관리

* `pom.xml`을 통해 Spring MVC, MyBatis, Oracle JDBC, JSP/JSTL, JUnit 등의 의존성을 관리했습니다.
* 라이브러리를 직접 추가하는 방식이 아니라 Maven을 통해 프로젝트 의존성을 구성하는 흐름을 확인했습니다.
* WAR 패키징 구조의 Spring Legacy 프로젝트를 다루는 경험을 정리했습니다.

### 6-3. MyBatis와 Oracle DB 연동

* `SqlSession`과 Mapper namespace를 사용하여 DB 접근 구조를 실습했습니다.
* Repository 계층에서 SQL Mapper를 호출하는 흐름을 확인했습니다.
* 완성된 CRUD 서비스보다는 Spring과 MyBatis가 연결되는 기본 구조를 학습하는 데 초점을 두었습니다.

### 6-4. JSP View 응답

* Spring Controller에서 전달한 데이터를 JSP에서 출력하는 흐름을 실습했습니다.
* View Resolver와 JSP 경로 구조를 확인했습니다.
* Spring MVC에서 Controller와 View가 분리되는 방식을 학습했습니다.

<br>

## 7. 테스트 및 검증

이 저장소는 제공 자료 기반 실습 프로젝트이므로, 자동화 테스트보다는 실행과 화면 확인 중심으로 검증했습니다.

### 주요 검증 범위

* Maven 의존성 로딩 확인
* Tomcat 서버 실행 확인
* Controller 요청 매핑 확인
* JSP View 응답 확인
* Oracle DB 연결이 필요한 실습의 경우 DB 조회 결과 확인
* MyBatis Mapper 호출 흐름 확인

<br>

## 8. 개선 예정 사항

현재 저장소를 기준으로 앞으로 개선하면 좋은 사항입니다.

* 제공 자료 기반 실습 코드와 직접 수정한 코드 구분
* DB 접속 정보 예시화
* 실습별 실행 순서 문서화
* Service 계층 분리 연습
* 예외 처리 구조 보강
* 완성 CRUD 프로젝트가 아니라 학습용 실습임을 README에 명확히 표시

<br>

## 9. 참고 사항

### 프로젝트 형태

* 프로젝트 형태: 개인 학습 / Spring 수업 실습 모음
* 실행 기준: Spring Legacy MVC, Maven, Apache Tomcat
* 저장소 성격: 제공 자료 기반 Spring Legacy 구조 학습 기록

### 참고

* 이 저장소는 완성된 CRUD 서비스가 아니라 Spring Legacy MVC 구조와 DB 연동 흐름을 학습하기 위한 실습 저장소입니다.
* 실제 DB 접속 정보, 계정, 비밀번호 등 민감 정보는 README에 포함하지 않습니다.
