package day7.DataType.DataTypeEx.Solve6;
// 3개의 자료형을 저장하기 위해 3개의 class를 만들었습니다. 그러나 저장소의 기능이 다 동일하므로 하나의 class만 만들어 3 자료형을 모두 저장하고 싶습니다. 가능하게 구현해주세요.
class Object저장소 {
    private Object data;

    Object getData() {
        return this.data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}
class 사과{
    사과(){

    }
}
public class DataTypeSolve6 {
    public static void main(String[] args) {
        Object저장소 a저장소1 = new Object저장소();
        a저장소1.setData(30);
        Object a = a저장소1.getData();

        System.out.println(a);

        a저장소1.setData(new 사과());
        사과 c = (사과) a저장소1.getData();

        System.out.println(c);
    }
}
