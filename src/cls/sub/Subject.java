package cls.sub;

// 모든 클래스들은 Object 클래스로부터 파생된다.
public class Subject {
    // private 문자열 title
    private String title;

    public Subject(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        // return super.toString(); ---> Object class의 toString() 호출
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Subject) {
            Subject sub = (Subject) obj;
            if( sub.toString().equals(title) )
                return true;
        }

        return false;
    }
}
