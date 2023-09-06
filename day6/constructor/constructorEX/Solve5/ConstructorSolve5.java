package day6.constructor.constructorEX.Solve5;
// 문제 : 아래와 같이 출력 되도록 해주세요.
class 사람{
    팔 a왼팔;
    public 사람(int 길이){
        this.a왼팔 = new 팔(); // 팔 객체를 생성하여 초기화
        this.a왼팔.a손 = new 손(); // 손 객체를 생성하여 초기화
        this.a왼팔.a손.a엄지손가락 = new 손가락(); // 손가락 객체를 생성하여 초기화
        this.a왼팔.a손.a엄지손가락.길이 = 길이; // 길이 설정
    }
}
class 팔{
    손 a손;
}
class 손{
    손가락 a엄지손가락;

}
class 손가락{
    int 길이;
}

public class ConstructorSolve5 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람(5).a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}
