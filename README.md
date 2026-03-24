# 🎵 LP - 음반 쇼핑몰

> Java / JSP 기반의 음반(LP) 전문 이커머스 웹사이트

---

## 📌 프로젝트 소개

다양한 장르의 음반을 구매할 수 있는 쇼핑몰입니다.
회원 취향 기반 추천, 장바구니, 주문/배송 조회, 리뷰, 1:1 문의 등 쇼핑몰의 핵심 기능을 구현하였습니다.

---

## 🛠 기술 스택

| 분류 | 기술 |
|------|------|
| Language | Java 17 |
| Server | Apache Tomcat 10.1 |
| Frontend | JSP, JSTL, Bootstrap 4.6, JavaScript |
| Database | Oracle DB (JDBC) |
| Security | SHA-256, AES-256 |
| Email | Jakarta Mail (Google SMTP) |
| API | Daum 주소 API, YouTube API |
| IDE | Eclipse |

---

## ⚙️ 시스템 아키텍처

```
FrontController (*.lp) → Command.properties → Controller → DAO → Oracle DB
```

- **FrontController 패턴**: 모든 요청을 단일 서블릿에서 처리
- **Command 패턴**: URL과 Controller 클래스를 properties 파일로 매핑
- **DAO 패턴**: 데이터베이스 접근 계층 분리

---

## 💡 주요 기능

### 👤 회원
- 회원가입 / 로그인 / 로그아웃
- 아이디·비밀번호 찾기
- 비밀번호 3개월 주기 변경 강제
- 1년 미접속 시 휴면 계정 처리
- 회원 탈퇴

### 🎶 음반
- 카테고리별 탐색 (POP / ROCK / JAZZ / CLASSIC / ETC)
- 음반 검색 및 상세 페이지
- 취향 기반 맞춤 추천
- 유튜브 미리듣기 연동

### 🛒 주문
- 장바구니 담기 / 수량 변경 / 삭제
- 위시리스트
- 주문 및 결제
- 주문 내역 및 배송 상태 조회
- 포인트 적립·사용

### 💬 고객지원
- 상품 리뷰 (별점 1~5)
- 1:1 문의 및 관리자 답변

### 🔧 관리자
- 회원 / 상품 / 주문 / 리뷰 / 문의 관리

---

## 🗂 프로젝트 구조

```
LP_SemiProject/
├── src/main/java/
│   ├── admin/          # 관리자 컨트롤러 및 모델
│   ├── common/         # FrontController, AbstractController
│   ├── login/          # 로그인, 아이디/비번 찾기
│   ├── member/         # 회원가입, 도메인, DAO
│   ├── my_info/        # 마이페이지
│   ├── order/          # 장바구니, 주문, 결제
│   ├── product/        # 상품, 위시리스트
│   ├── mail/           # 이메일 발송
│   └── util/           # 보안 유틸 (AES256, SHA256)
└── src/main/webapp/
    ├── WEB-INF/        # JSP 뷰, SQL, Command.properties
    ├── css/            # 스타일시트
    ├── js/             # 자바스크립트
    └── images/         # 이미지 리소스
```

---

## 🗃 DB 테이블

| 테이블 | 설명 |
|--------|------|
| tbl_member | 회원 정보 |
| tbl_loginhistory | 로그인 이력 |
| tbl_product | 상품(음반) |
| tbl_category | 카테고리 |
| tbl_track | 트랙 목록 |
| tbl_cart | 장바구니 |
| tbl_wishlist | 위시리스트 |
| tbl_order | 주문 |
| tbl_orderdetail | 주문 상세 |
| tbl_review | 리뷰 |
| tbl_inquiry | 1:1 문의 |
| tbl_member_preference | 회원 취향 |
| tbl_admin | 관리자 |

---

## 🚀 실행 방법

1. Oracle DB 생성 후 `/WEB-INF/SQL/` 스크립트 실행
2. Tomcat 서버에 JNDI DataSource (`SemiProject`) 설정
3. Apache Tomcat 10.1에 프로젝트 배포
4. `http://localhost:8080/LP_SemiProject` 접속

---

## 👥 팀원

| 이름 | 담당 |
|------|------|
|  |  |
|  |  |
|  |  |
