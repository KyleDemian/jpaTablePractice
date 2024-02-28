# JPA Table Practice

> JAVA 1.7, Spring Data JPA ( Query DSL ), MariaDB, SpringWeb
>
> ![스크린샷 2024-02-28 오후 3 56 21](https://github.com/KyleDemian/jpaTablePractice/assets/11342191/385f31fb-5f9a-4e68-a1ac-ae26f2f8a55f)

기본 구조 여러개의 연관 관계에 대해서 확인해보는 구조 확인용

> 단방향 연관관계: 
단방향 연관관계는 어느 한쪽 엔티티에서만 참조를 가지는 관계를 의미합니다. 예를 들어, Member 엔티티가 Team 엔티티를 참조하는 경우, Member의 관점에서는 연관관계가 존재하지만 Team의 관점에서는 연관관계가 존재하지 않음
단방향 연관관계는 @ManyToOne 또는 @OneToOne 어노테이션으로 생성할 수 있음.
> 양방향 연관관계:
양방향 연관관계는 두 엔티티가 서로를 참조하는 관계를 의미합니다. 이 관계를 선언할 때는 관리 주체인 owner와 반대 측인 mapped by를 분명히 해야 함.
양방향 연관관계는 @OneToMany 또는 @ManyToMany 어노테이션으로 선언할 수 있음.

- @ManyToMany 의 경우 @OneToMany, @ManyToOne 의 관계로 풀어서 작성.

- 트랜잭션관리 ( 더티체킹 ) : JPA에서는 해당 엔티티가 영속성 컨텍스트가 정상 동작하는지 확인이 필요로 함  

ref. 자바 ORM 표준 JPA 프로그래밍
