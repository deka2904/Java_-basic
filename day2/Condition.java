package day2;

public class Condition {
    public static void main(String[] args) {
        // 조건문
        
        // 실행이 될 수도 있고 안될 수도 있는
        System.out.println("창문 닫기");

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
        System.out.println("야식 뭐 먹을까?");
        int money = 10000; // 소지금
        
        if(money >= 20000){
            System.out.println("치킨 먹자!");
        } else if (money < 20000){
            System.out.println("포카칩 먹자!");
        }

        System.out.println("=======================================================");
    }
}
