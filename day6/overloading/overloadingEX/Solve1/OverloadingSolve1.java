package day6.overloading.overloadingEX.Solve1;
class 사람{
    int age;

    public 사람(){
        System.out.println("사람이 태어났습니다.");
    }
    public 사람(int age){
        this.age = age;
        System.out.printf("태어나서부터 %d살인 사람이 태어났습니다.\n", this.age);
    }
}
public class OverloadingSolve1 {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}
