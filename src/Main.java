public class Main {
    public static void main(String[] args) {
        int currentBalanceRub = 300;
        int transferRub = 1500;
        int bonusRub;

        if (transferRub > 1000) {
            bonusRub = transferRub / 100;
        } else {
            bonusRub = 0;
        }
        int finalBalance = currentBalanceRub + transferRub + bonusRub;

        System.out.println("итоговый счёт");
        System.out.println(finalBalance);
        System.out.println("количество бонусных рублей");
        System.out.println(bonusRub);

    }
}
