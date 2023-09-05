package day5.composition;

// 이순신주식회사는 직접 파이썬 개발을 할 능력이 없지만 파이썬 개발자인 홍길순을 직원으로 채용했다.
class 이순신주식회사{
    홍길순 a홍길순 = new 홍길순();

    public void Python_프로그래밍() {
        a홍길순.Python_프로그래밍();
    }
}

// 홍길동 -> C, Java
// 조합, 구성 -> 객체들의 조합을 통해 클래스를 만드는 방식
class 홍길동{
    int age = 20;
    String name = "홍길동";
    홍길순 a홍길순 = new 홍길순();

    public void C언어_프로그래밍(){
        System.out.println("C언어 프로그램 개발");
    }
    public void Java_프로그래밍(){
        System.out.println("Java 프로그램 개발");
    }
    public void Python_프로그래밍(){
        a홍길순.Python_프로그래밍();
    }
}

// 홍길순 -> Java, Python
class 홍길순{
    public void Java_프로그래밍(){
        System.out.println("Java 프로그램 개발");
    }
    public void Python_프로그래밍(){
        System.out.println("Python 프로그램 개발");
    }
}
public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.Java_프로그래밍();
        a홍길동.Python_프로그래밍(); // 홍길동에게 파이썬 프로그래밍을 요청할 수 있다.
        a홍길동.a홍길순.Python_프로그래밍(); // 홍길동이 가지고 있는 a홍길순 변수로 홍길순이 가지고 있는 파이썬_프로그래밍()에 접근

        홍길순 a홍길순 = new 홍길순();
        a홍길순.Java_프로그래밍();

        이순신주식회사 a이순신주식회사 = new 이순신주식회사();
        a이순신주식회사.Python_프로그래밍();  // 이순신주식회사에 파이썬 프로그래밍을 요청할 수 있다.
    }
}