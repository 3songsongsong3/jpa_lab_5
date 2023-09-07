package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    // 역방향
    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts;

    private String username;

}
