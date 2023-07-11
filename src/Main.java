// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int wasOnTheAccount = 500; // Было на счете
        int replenishmentAmount = 1000; // сумма пополнения
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int total = wasOnTheAccount + replenishmentAmount + bonus; // итог

        System.out.println("Итоговая сумма:" + (total));
        System.out.println("Бонусы:" + (bonus));
    }
}