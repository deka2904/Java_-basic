package day5.casting.castingEx.Solve2;
class 전사{
    전사 a무기;
    int 나이;
}
class 활 extends 전사{
}
class 칼 extends 전사{
}
public class ObjectCastingSolve2 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.나이 = 20;
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼();
    }
}
