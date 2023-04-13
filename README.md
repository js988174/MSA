# SpringCloud로 개발하는 마이크로서비스 애플리케이션(MSA)

# Cloud Native Acrhitecture
* **확장 가능한 아키텍처**
  * 시스템의 수평적 확정에 유연
  * 확장된 서버로 시스템의 부하 분산, 가용성 보장
  * 시스템 또는, 서비스 애플리케이션 단위의 패키지
  * 모니터링

* **탄력적 아미텍처**
  * 서비스 생성 - 통합 - 배포, 비즈니스 환경 변화에 대응 시간 단축
  * 분활 된 서비스 구조
  * 무상태 통신 프로토콜
  * 서비스의 추가와 삭제 자동으로 감지
  * 변경된 서비스 요청에 따라 사용자 요청 처리

* **장애 격리**
  * 특정 서비스에 오류가 발생해도 다른 서비스에 영향 주지 않음

# Cloud Native Application
* **지속적인 통합, CI**
  * ex) Jenkins, Team CI, Travis CI
  * 통합 서버, 소스 관리, 빌드 도구, 테스트 도구

* **지속적 배포**
  * Pipe line
  * Continuous Delivery

  
# Factors(https://12factor.net/) 
<img src="https://user-images.githubusercontent.com/76925402/230910833-f3a5a0cb-736e-4b7a-a78c-24f7ff6aba54.png">


# Monolith vs MSA
* Monolith: 하나의 서비스 또는 애플리케이션이 **하나의 거대한** 아키텍쳐를 가질 때
* MSA: 애플리케이션을 느슨하게 결합된 **서비스의 모임으로** 구조화하는 서비스 지향 아키텍처(SOA) 스타일의 일종인 소프트웨어 개발 기법

<img src="https://user-images.githubusercontent.com/76925402/230914245-50074fc8-c05e-44f1-bf2d-563ed20f63da.png">


# API Gateway Service
* 어떤 규모에서든 개발자가 API를 손쉽게 생성, 게시, 유지 관리, 모니터링 및 보안 유지할 수 있도록 하는 완전관리형 서비스

## 기능
* 인증 및 권한 부여
* 서비스 검색 통합
* 응답 캐싱
* 속도 제한
* 부하 분산
* 로깅, 추적, 상관 관계
* 헤더, 쿼리 문자열 및 청구 변환
* IP 허용 목록에 추가

