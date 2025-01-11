package cls.inside;

public class OuterClass {
    private String name;    // 멤버 변수
    public OuterClass(String name) {
        this.name = name;
    }

    // 가장 기본적인 내부 클래스
    public class InnerClass {
        private String name;
        public InnerClass(String name) {
            this.name = name;
        }
    }

    // 내부 스태틱(static) 클래스
    public static class InnerStaticClass {

        public void display(OuterClass outer) {
            System.out.println("Outer Class : " + outer.name);
        }
    }
}
