package entity;


import java.io.Serializable;
import java.util.Objects;


// 복합키를 위한 식별자 클래스
// 1. 복합 키는 별도의 식별자 클래스로 만들어야 한다.
// 2. Serialzable을 구현해야한다.
// 3. equals와 hashCode 메소드를 구현해야한다.
// 4. 기본 생성자가 있어야 한다.
// 5. 식별자 클래스는 public 이어야 한다.
// 6. @IdClass를 사용하는 방법 외에 @EmbeddedId를 사용하는 방법도 있다.
public class MemberProductId implements Serializable {

    private String member;
    private String product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberProductId that = (MemberProductId) o;
        return Objects.equals(member, that.member) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, product);
    }
}
