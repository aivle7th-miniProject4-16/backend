# Backend

## 📁 프로젝트 구조

<pre lang="markdown"><code>## 📁 프로젝트 구조 ``` src └── main ├── java │ └── com.aivle.miniproject3 │ ├── controller # 요청 처리 및 API 매핑 │ ├── service # 비즈니스 로직 처리 │ ├── repository # DB 접근 │ ├── domain # 엔티티 정의 │ ├── dto # 요청/응답 DTO 정의 │ └── config # 설정 관련 클래스 └── resources └── application.yml # 환경 설정 파일 ``` </code></pre>

----------------------------------------------------------------------------------------

## 🔧 기술 스택

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Gradle - Groovy

----------------------------------------------------------------------------------------

## 🚀 주요 클래스 설명

- `BookController`   : 도서 관련 요청 처리
- `BookService`      : 도서 관련 비즈니스 로직 (등록, 수정, 삭제, 목록 조회, 정보 조회)
- `BookRepository`   : 도서 엔티티 DB 접근
- `Book`             : 도서 도메인 엔티티
- `StatusDTO`        : 오류 응답 DTO
- `WebConfig`        : 리액트 연동

----------------------------------------------------------------------------------------

## 🧩 주요 API

| Method | Endpoint               | 설명              |
|--------|------------------------|-------------------|
| GET    | /book                  | 도서 목록 조회     |
| POST   | /book                  | 도서 신규 생성     |
| GET    | /book/{id}             | 도서 정보 조회     |
| GET    | /book/{id}/update      | 도서 수정 조회     |
| PUT    | /book/{id}/update      | 도서 수정 조회     |
| DELETE | /book/{id}             | 도서 정보 삭제     |

----------------------------------------------------------------------------------------

## ⚙️ 설정 정보

```yaml
# application.yml
spring:
  datasource:
    driver-class-name: org.h2.Driver
    url: jdbc:h2:~/library
    username: sa
    password: 1234
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
