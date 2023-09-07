import entity.Member;
import entity.MemberProduct;
import entity.MemberProductId;
import entity.Product;

public class Main {

    public static void  main(String[] args) {

    }

    public void save() {
        // 회원 저장
        Member member1 = new Member();
        member1.setId("member1");
        member1.setUserName("회원1");
        em.persist(member1);

        // 상품 저장
        Product productA = new Product();
        productA.setId("productA");
        productA.setName("상품1");
        em.persist(productA);

        // 회원 상품 저장
        MemberProduct memberProduct = new MemberProduct();
        memberProduct.setMember(member1);
        memberProduct.setProduct(productA);
        memberProduct.setOrderAmount(2);

        em.persist(memberProduct);
    }

    public void find() {
        // 기본 키 값 생성
        MemberProductId memberProductId = new MemberProductId();
        memberProductId.setMember("member1");
        memberProductId.setProduct("productA");

        // 식별자 클래스로 엔티티를 조회
        MemberProduct memberProduct = em.find(MemberProduct.class, memberProductId);

        Member member = memberProduct.getMember();
        Product product = memberProduct.getProduct();
    }

}
