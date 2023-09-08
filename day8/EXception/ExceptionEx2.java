package day8.EXception;
class Person{

    public void hi() {
        System.out.println("hi");
    }
}
public class ExceptionEx2 {
    public static void main(String[] args) {
        try{
            Person p1 = null;

            p1.hi();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
