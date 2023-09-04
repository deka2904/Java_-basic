package day4.Scope.ScopeEx;
class Account {
    int Account_Money;
    int Withdraw_Money;
    public void deposit(int money){
        System.out.println(money + "원을 예급했습니다.");
        Account_Money += money;
    }
    public int withdraw(int money) {
        Withdraw_Money = money;
        return Withdraw_Money;
    }
    public int getRemainder() {
        Account_Money = Account_Money - Withdraw_Money;
        return Account_Money;
    }
}
public class ScopeSolve {
    public static void main(String[] args) {
        Account a1 = new Account();

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200
    }
}
