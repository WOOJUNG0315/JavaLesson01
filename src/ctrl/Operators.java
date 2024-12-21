package ctrl;

public class Operators {

    public static void main(String[] args) {
        System.out.println("연산자 공부");

        // 산술연산자 : +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)
        // 대입연산자 : =, +=, -=, *=, /=, %
        // 비교연산자 : >, >=, <, ==, <=, == !=
        // 논리연산자 : &&(and), ||(or), !(not)
        // 증감연산자 : ++, --
        // 부호연산자 : +(양수), -(음수)
        // 비트연산자 : &, |, ~, <<, >>, ^
        // 기타연산자 : instanceof, 조건식 ? A : B

        // 산술 연산
        int sum;
        int a = 10;
        int b = 3;
        sum = a + b;
        System.out.println("sum = " + sum);

        sum = a - b;
        System.out.println("sum = " + sum);

        sum = a * b;
        System.out.println("sum = " + sum);

        sum = a / b;
        System.out.println("sum = " + sum);

        sum = a % b;
        System.out.println("sum = " + sum);


        float f1 = 10.0f; // float형 상수에는 반드시 F(f)를 붙여준다.
        float f2 = 3.0f;
        float result;
        result = f1 / f2;
        System.out.println("result = " + result);

        result = f1 % f2;
        System.out.println("result = " + result);

        result = f1 / b;        // 실수와 정수간의 연산 결과는 실수이다.
        System.out.println("result = " + result);

        result = f1 % b;
        System.out.println("result = " + result);

        sum = (int)(f1 / b);    // 실수와 정수의 연산 결과를 정수형으로 변환하여 대입해준다.
        System.out.println("sum = " + sum);

        result = (float) a / b;
        System.out.println("result = " + result);

        // 국어 : 88, 수학 : 79, 영어 : 97 <--- 이 자료형들은 모두 정수형 변수로 선언하세요
        // 총점(정수형)과 평균(실수형)을 구하여 각각 출력하세요

        a = -b;     // 부호를 바꾼다.
        System.out.println("a의 값 : " + a);

        a = -a;     // 부호를 바꾼다.
        System.out.println("a의 값 : " + a);

        // 대입 연산자
        a = 10;
        sum = 0;
        sum += a;   // sum = sum + a
        System.out.println("sum = " + sum);

        sum += a;   // sum = sum + a
        System.out.println("sum = " + sum);

        sum -= a;   // sum = sum - a
        System.out.println("sum = " + sum);

        sum *= a;   // sum = sum * a
        System.out.println("sum = " + sum);

        sum /= a;   // sum = sum / a
        System.out.println("sum = " + sum);

        sum %= a;   // sum = sum % a
        System.out.println("sum = " + sum);


        // 관계(비교) 연산자
        a = 10;
        b = 3;

        boolean res;
        res = a > b;
        System.out.println("a > b의 결과 : " + res);

        res = a >= b;
        System.out.println("a >= b의 결과 : " + res);

        res = a <= b;
        System.out.println("a <= b의 결과 : " + res);

        res = a == b;
        System.out.println("a == b의 결과 : " + res);

        res = a != b;
        System.out.println("a != b의 결과 : " + res);

        // 논리 연산자 : &&(and), ||(or), !(not)
        boolean flag1 = a > b;      // ture
        boolean flag2 = a == b;     // false
        res = flag1 && flag2;   // true && false
        System.out.println( flag1 + " && " + flag2 + " ==> " + res );

        res = flag1 || flag2;   // true || false
        System.out.println( flag1 + " || " + flag2 + " ==> " + res );

        res = !flag1;
        System.out.println("!" + flag1 + " ==> " + res );


        a = 10;
//        a++;    // a += 1, a = a + 1  Post fix
//        a--;    // a -= 1, a = a - 1
//        ++a;    // a += 1, a = a + 1  Pre fix
//        --a;    // a -= 1, a = a - 1
        System.out.println(a++);
        System.out.println(++a);

//        // 콘솔로부터 값 입력받기
//        Scanner sc = new Scanner(System.in);
//        System.out.print("a에 들어갈 값을 입력하세요 >>> ");
//        a = sc.nextInt();   // Int형 정수를 콘솔로부터 입력받아서 변수 a에 대입하기
//
//        b = a % 10;
//        System.out.println("a의 값 : " + a);
//        System.out.println("a의 1의자리의 값 : " + b);
//
//        // 삼항 연산자
//        String strOut = "";
//
//        System.out.print("a에 들어갈 값을 입력하세요 >>> ");
//        a = sc.nextInt();   // Int형 정수를 콘솔로부터 입력받아서 변수 a에 대입하기
//
//        strOut = a % 2 == 0 ? "짝수" : "홀수";  // 조건식 ? 조건식이 참일때 : 조건식이 거짓일때;
//        System.out.println(a + "는 " + strOut + "입니다.");
//
//        sc.close();
//
//        // 기타 연산자 : instanceof
//        flag1 = strOut instanceof String;

        // 비트 연산자 :&, |, ~, ^, <<, >>
        a = 3;  // & 0011
        b = 5;  // & 0101
        //           0001
        sum = a & b;
        System.out.println("a & b : " + sum);

        sum = a | b;    // 0111
        System.out.println("a | b : " + sum);

        sum = ~a;   // 0011 --> 1100
        System.out.println("~a : " + sum);

    }
}
