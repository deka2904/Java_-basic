package day2;

public class ConditionEx {
    public static void main(String[] args) {
        // 조건문 -> 택일구조

        // 양자택일(이지선다)
        // 남녀, 할인대상, 홀짝
        boolean isMale = false;

        if(isMale){
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }

        System.out.println("=======================================================");

        // 삼자택일(삼지선다)
        // 초중고, 직좌우
        int age = 10;
        if (age>=8 && age <=13) {
            System.out.println("초등학교");
        } else if (age <=16) {
            System.out.println("중학교");
        } else if (age <= 19) {
            System.out.println("고등학교");
        }

        System.out.println("=======================================================");

        // 오자택일(오지선다)
        // 대학성적 (A,B,C,D,F)
        int score = 78;

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
