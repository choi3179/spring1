# 스프링 기초
순수 자바로 작성해보는 객체지향 코드

## 비즈니스 요구사항

1. 회원
  - 회원을 가입하고 조회할 수 있다.
  - 회원은 일반과 VIP 두 가지 등급이 있다.
  - 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다. (미확정
2. 주문과 할인 정책
  - 회원은 상품을 주문할 수 있다.
  - 회원 등급에 따라 할인 정책을 적용할 수 있다.
  - 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용해달라. (나중에 변경 될 수있다.)
  - 할인 정책은 변경 가능성이 높다. 회사의 기본 할인 정책을 아직 정하지 못했고, 오픈 직전까지 고민을 미루고 싶다. 최악의 경우 할인을 적용하지 않을 수 도 있다. (미확정)
3. 새로운 할인 정책의 확장
  - 서비스 오픈 직전에 할인 정책을 지금처럼 고정 금액 할인이 아니라 좀 더 합리적인 주문금액당 할인하는 정률% 할인으로 변경하고 싶다. 
  예를 들어서 기존 정책은 VIP가 10000원을 주문하든 20000원을 주문하든 항상 1000원을 할인했는데, 이번에 새로 나온 정책은 10%로 지정하도록 변경한다.
  
## 이 프로젝트로 확인할 것

1. 객체 지향 설계를 이용한 비즈니스의 변경 사항 반영
2. 인터페이스를 만들고 구현체를 언제든지 바꿀 수 있는 설계와 코드 작성
3. SOLID 객체 지향 설계에 위반되는 상황을 파악하고 이에 따른 스프링의 필요성을 확인한다.  
4. 순수 자바 코드로 구현한 것을 스프링 기반으로 변경할 수 있다.
