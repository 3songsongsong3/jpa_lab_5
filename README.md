# 다대다 매핑, 연결 엔티티 사용 (복합 기본 키 식별자 클래스 사용) jpa_lab_5
![image](https://github.com/3songsongsong3/jpa_lab_5/assets/73326851/838e2f8d-abb5-46c4-ad74-46e9ab0e0840)
![image](https://github.com/3songsongsong3/jpa_lab_5/assets/73326851/698f7048-395e-412a-ba99-e7839f0d99b9)

다대다 관계를, 연결 테이블을 두어 일대다, 다대일 관계로 풀어야 한다. <br>
&nbsp;
<br><br>
복합키를 위한 식별자 클래스<br>
1. 복합 키는 별도의 식별자 클래스로 만들어야 한다.<br>
2. Serialzable을 구현해야한다.<br>
3. equals와 hashCode 메소드를 구현해야한다.<br>
4. 기본 생성자가 있어야 한다.<br>
5. 식별자 클래스는 public 이어야 한다.<br>
6. @IdClass를 사용하는 방법 외에 @EmbeddedId를 사용하는 방법도 있다.<br>
