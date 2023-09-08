public class main {
    public static void main(String[] args) {
//        int num = 10;
//        double d = 3.14;
//
//        num = (int) d;
//        System.out.println(num);

        // 문자형 -> 숫자
        String str = "12345";
        int num = 10;
//        num = (String)str;
        num = Integer.parseInt(str);
        System.out.println(num);
        str = String.valueOf(num);
        System.out.println(str);
    }
}
