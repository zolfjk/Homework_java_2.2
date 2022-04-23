public class Main {
    public static void main(String[] args) {

        int initialMoney = 1580;
        int moneyTransferred = 1450;

        int limitToBonus = 1000;
        int moneyOverLimit = moneyTransferred - limitToBonus;
        int bonus = 0;
        int finalScore = moneyTransferred + initialMoney;

        if (moneyOverLimit > 0) {
            bonus = moneyOverLimit / 100;
            if (bonus > 0) {
                finalScore = initialMoney + moneyTransferred + bonus;
                System.out.println("Итоговая сумма на счете: " + finalScore + " руб." + ", сумма бонуса: " + bonus + " руб.");
            } else {
                System.out.println("Итоговая сумма на счете: " + finalScore + " руб." + ", бонусов не зачисленно");
            }
        } else {
            System.out.println("Итоговая сумма на счете: " + finalScore + " руб." + ", бонусов не зачисленно");
        }


    }
}
