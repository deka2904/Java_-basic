package day2;

public class Condition {
    public static void main(String[] args) {
        // 조건문
        
        // 실행이 될 수도 있고 안될 수도 있는
        System.out.println("<<창문 닫기>>");

        // 비가 올 떄만 창문을 닫기
        boolean isRain = false;

        if(isRain == true){
            System.out.println("창문 닫기");
        } else if(isRain == false) {
            System.out.println("창문 열기");
        }
        System.out.println("=======================================================");
        // 야식
        // <<조건>>
        // 치킨 : 소지금이 2만원 이상일때
        // 포카칩 : 소지금이 2만원 미만일때
        System.out.println("<<야식 뭐 먹을까?>>");
        int money = 10000; // 소지금
        
        if(money >= 20000){
            System.out.println("치킨 먹자!");
        } else if (money < 20000){
            System.out.println("포카칩 먹자!");
        }
        System.out.println("=======================================================");

        // 문제
        // 포카칩이 대략 2천원 이상하는데 소지금이 0원이도 포카칩이 나온다. 해결해라.
        System.out.println("<<야식 뭐 먹을까?>>");
        int money1 = 2500; // 소지금

        if(money1 >= 20000){
            System.out.println("치킨 먹자!");
        } else if (money1 < 20000 && money1 >= 2000) {
            System.out.println("포카칩 먹자!");
        } else {
            System.out.println("굶자...ㅜㅜ");
        }
        System.out.println("=======================================================");

        // 할인 대상 -> 19세 이하, 60세 이상 할인 대상
        System.out.println("<<할인 대상자인지 아닌지. 판별>>");
        int age = 10;

        if (age >= 60 || age <= 19){
            System.out.println("할인 대상자 입니다.");
        }else {
            System.out.println("할인 대상자가 아닙니다.");
        }

        System.out.println("=======================================================");
    }
}
