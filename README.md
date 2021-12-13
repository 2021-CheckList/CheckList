# ✔ Check-List

#### 🔗 [전자제품 구경하기](http://j5checklist.p.ssafy.io/)

#### 💻 [포팅 매뉴얼]()



<br>

# 📋 Intro
#### Hadoop을 이용한 가전제품 성능 비교 플랫폼
> \# 빅데이터 분산 도메인 <br>
> 서울 4반 6팀 🙋이영주, 권영린, 김윤주, 김선혜, 이상현


![image](https://user-images.githubusercontent.com/61124319/145806295-ca67ff04-5353-491b-9793-a697573f8f9a.png)

<br>


<br>



<br><br>

## 🗂 Content

1. [🔈 프로젝트 소개](#-프로젝트-소개)
   <br>
   - [📑 타겟 및 목표](#-타겟-및-목표)
   - [📑 개발 환경](#-개발-환경)
   - [📑 기술 스택](#-기술-스택)
   - [📑 서버 아키텍처](#-서버-아키텍처)
   - [📑 ERD](#-erd)
   - [📑 컴포넌트](#-컴포넌트)
   - [📑 와이어프레임](#-와이어프레임)
   - [📑 스토리보드](#-스토리보드)
   - [📑 핵심 기능](#-핵심-기능)
     <br>
2. [🔈 구현 결과](#-구현-결과)
   <br>
   - [📑 Frontend](#frontend)
   - [📑 Backend](#backend)
     <br>
3. [🔈 팀원 소개 및 역할](#-팀원-소개-및-역할)
   <br><br>
4. [🔈 개발 문서](#-개발-문서)

<br><br><br><br>

---

## 🥜 프로젝트 소개

### 🔔 타겟 및 목표

#### 🧿 타겟

    ☝ 어떤 게 좋은거지..? 제품간 성능비교가 어려운 사람
    ✌ 상품에 대한 실제 후기를 한 눈에 보고 싶은 사람
    🤟 최저가로 상품을 구매하고 싶은 사람

#### 🏃‍ 목표

    ✔ 상품별 성능 비교를 통한 합리적 소비 증대
    ✔ 워드클라우드를 통한 리뷰 분석 및 시각화
    ✔ 고객의 관심도를 기반으로 한 상품 추천
   
<br><br>

### 🔨 개발 환경

- OS : Windows 10

- Server : AWS EC2

  - Ubuntu 20.04.1
  - Docker 20.10.8
  - Jenkins

- Backend

  - Java : Java 1.8.0
  - Framework : SpringBoot 2.5.4
  - ORM : JPA(Hibernate)
  - Nginx : 1.18.0 (Ubuntu)
  - IDE : Intellij 2021.1.3 / Visual Studio Code 1.59
  - Dependency tool : gradle-7.1
  - Database : MySQL 8.0.26

- Frontend 

    - HTML5, CSS3, Javascript(Es6) 
    - Vue 3.0.0 
    - Bootstrap 5
    - IDE : Visual Studio Code
    
  <br><br>

### 🔨 기술 스택

![image](https://user-images.githubusercontent.com/61124319/144753709-93e5b641-1e48-4886-89bc-33af90ce5b77.png)

<br><br>

### 🎈 서버 아키텍처

![image](https://user-images.githubusercontent.com/61124319/144753715-42510231-7ffa-4c1f-a103-c703bfe416e3.png)

<br><br>

### 🔍 ERD

![image](https://user-images.githubusercontent.com/61124319/144753721-5f8fb1a9-ac9f-4955-8492-dc54750cf9d4.png)

<br><br>

### 💌 기능명세서

[📁 기능명세서 보러가기](https://wistful-turret-af0.notion.site/8ac01f5f9c8e4cb49488e760b9b9d5e9)
<br><br>

### 🎨 와이어프레임

[📁 와이어프레임 보러가기]()

<br><br>

### 📖 스토리보드

[📁 스토리보드 보러가기]()

<br><br>

### 💎 핵심 기능

    🔑 MapReduce 기반의 상품 성능 분석
    🔑 리뷰 키워드 분석
    🔑 성능 기반의 상품 추천

![image](https://user-images.githubusercontent.com/61124319/144753724-ee04f316-1a05-4b3b-a4bb-cefd125c8eb9.png)
<br><br>

## 🥜 구현 결과

#### 🔗 [전자제품 구경하기](http://j5checklist.p.ssafy.io/)

<br><br>

## 🥜 실행 가이드

#### 💻 [포팅 매뉴얼](https://wistful-turret-af0.notion.site/6736c123cb7e4a959a69462c7e5e6f47)


<br><br>

## 🥜 팀원 소개 및 역할

<br><br>
|Name|권영린|김윤주|김선혜|이영주|이상현|
|-----|-----|-----|------|----|-----|
|Profile|![image](https://user-images.githubusercontent.com/61124319/144753739-4b84eb5c-92bd-4d07-a244-f630b660e37e.png)|![image](https://user-images.githubusercontent.com/61124319/144753750-a28c7ce9-b532-463e-ba7f-f94d42cb3d3e.png)|![image](https://user-images.githubusercontent.com/61124319/144753756-a0c65b60-dddf-4090-8fa6-9187bf96aefb.png)|![image](https://user-images.githubusercontent.com/61124319/144753772-8550c10c-77d6-4868-9c98-3dcde861c2c3.png)|![image](https://user-images.githubusercontent.com/61124319/144753788-fec0103f-3f69-4488-a490-7da4a82685c3.png)|
|Position|Frontend, Backend, Data Analysis & Crawling |Frontend, Backend, Data Analysis & CI/CD| Frontend, Backend, Data Analysis & Crawling|👑팀장 , Frontend, Backend, Data Analysis & Crawling |Frontend, Backend, Data Analysis & CI/CD |
|Git|@sqk8657| @yjyjk20|@wkadnsj | @0JUUU| @zxd9857|

<br><br>

## 🥜 개발 문서

#### [ 🧾 기능명세서 ](https://lab.ssafy.com/s05-webmobile1-sub3/S05P13A501/-/blob/master/documents/function/DogLive_%EA%B8%B0%EB%8A%A5%EB%AA%85%EC%84%B8%EC%84%9C.pdf)

#### [ 📑 Git 컨벤션 ](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/wikis/Git-Rule)

#### [ 📖 Code 컨벤션 ](https://wistful-turret-af0.notion.site/b5142cb027ea463c9c10f722cfd02111)

<br><br><br><br>

## 👊 공부한 흔적

#### [:fire: 영린](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/tree/pjt-sub1/younglin)

#### [:elephant: 선혜](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/tree/pjt-sub1/sunhye)

#### [:pizza: 윤주](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/tree/pjt-sub1/yoonju)

#### [:beer: 상현](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/tree/pjt-sub1/sanghyun)

#### [🌄 영주](https://lab.ssafy.com/s05-bigdata-dist/S05P21A406/-/tree/pjt-sub1/youngju)

<br>

#### 📝 그 외 공부한 내용

[노션 바로가기](https://wistful-turret-af0.notion.site/a4f3b619484544daa5330c3674d4c26e)

