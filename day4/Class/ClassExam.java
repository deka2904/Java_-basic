package day4.Class;

// 컴퓨터한테 내가 생각한 어떤 개념 -> 컴퓨터한테 알려줘야 함
// 클래스는 기본적으로 클래스 밖에 만든다/
// 클래스의 본질 -> 관련된 데이터의 묶음 + 해당 데이터를 사용하는 함수
class Student{
    static String Name = "홍길동";
    static int age = 25;
    static String PhoneNum = "010-1111-2222";
    static String home = "대전";

    static String BankNum;
    int[] arr = new int[]{1,2,3};
    public static void introduce(){
        System.out.println("안녕하세요." + home + "사는 " + Name + "입니다.\n나이는 " + age + "살입니다.\n전화번호는 " + PhoneNum + "입니다.");
    }
}
public class ClassExam {
    // 함수
    public static void introduce(Student student){ //-> ()안에 클래스 정의한거 쓰고 변수 명 써주면 클래스가 함수에 들어갑니다.

        // 이거는 (클래스명) (클래스명을 정의하는 이름 -> 이 이름은 아무거나 정의해줘도 무방함 근데 클래스 명과 동일하게 써주는게 좋음)
        // 클래스명을 정의할땐 앞에 있는 알파벳 대문자 그 클래스를 정의하는 이름을 만들땐 소문자로 써주는게 깔끔하고 좋음
        System.out.println("안녕하세요." + student.home + "사는 " + student.Name + "입니다.\n나이는 " + student.age + "살입니다.\n전화번호는 " + student.PhoneNum + "입니다.");
    }
    public static void main(String[] args) {
        // 1.클래스가 함수를 모아놓는 느낌
        // 2. 변수를 모아놓는 느낌

        // 변수
        // 사람 표현 -> 이름 나이 거주지

        Student student = new Student();

        student.BankNum = "1111-1111";
        String s = student.BankNum;

        System.out.println("안녕하세요." + student.home + "사는 " + student.Name + "입니다.\n나이는 " + student.age + "살입니다.\n전화번호는 " + student.PhoneNum + "입니다.");
        introduce(student);
        System.out.println(s);

        // 배열
        // 키, 몸무게, 나이
        // 175, 60, 22
        int[] person1 = {175, 60, 22};
        int[] person2 = {185, 70, 32};
        System.out.printf("키 : %d, 몸무게 : %d, 나이 : %d\n", person1[0], person1[1], person1[2]);

        // 배열을 사용하면 -> 같은 자료형 표현 가능. 0번쨰, 1번째... 각각 무엇을 가리키는지 알기가 어렵다.

        // 객체 -> 관련된 데이터를 묶는다.
        // int - 4
        // String - 8
        for (int i : student.arr) {
            System.out.print(i + " ");
        }
    }
}