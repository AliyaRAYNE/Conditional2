public class Main {
    public static void main(String[] args) {
        int balance = 500; // изначальный баланс
        int amountDeposit = 1500; // сумма пополнения
        int bonus;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else  {
            bonus = 0;
        }
        System.out.println(bonus);

    }
}