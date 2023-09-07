package entity;

import javax.persistence.*;


@Entity
// 복합 기본키 사용
// JPA에서는 복합 기본키 사용할 경우 별도의 식별자 클래스를 만들고,
// 아래와 같이 식별자 클래스를 지정해야한다.
@IdClass(MemberProductId.class)
public class MemberProduct {

    // 회원과 상품의 기본키를 받아서 자신의 기본키로 사용
    // -> 식별 관계


    @Id
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member; // MemberProductId.member와 연결

    @Id
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product; // MemberProductId.product와 연결

    private int orderAmount;

}
