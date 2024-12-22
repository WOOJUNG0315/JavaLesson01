package cls;

public class Person {
    // 접근 제한자 : private, protected, public (+default)
    // private : 외부에서 일체 접근 금지, 상속안됨, 클래스 내부에서만 접근 가능
    // protected : 같은 패키지의 객체들에서 접근 가능, 상속도 가능, 다른 패키지의 객체들에서 접근 불가
    // public : 제한없음, 완전공개

    // 테이터
    private int age;        // 나이 데이터(속성, Attribute, Property, Member Variable
    private String name;    // 이름 데이터
    private float height;

    // 생성자 : 클래스명과 같음, 객체가 생성될 때 한번 호출됨
    public Person(String n, float h, int a) {
        age = a;
        name = n;
        height = h;

        System.out.println("Person 클래스로부터 객체가 생성됨");
    }

    // 행위(Method, Member Function)
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "이고,");
        System.out.println("나이는 " + age + "살 입니다.");
    }
}
