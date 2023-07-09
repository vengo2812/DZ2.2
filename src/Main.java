// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x = 500; // Было на счете клиента
        int y = 1000; // сумма пополнения
        int bonus;
        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        int z = x + y + bonus; // итоговая сумма

        System.out.println("Итоговая сумма:" + (z));
        System.out.println("Бонусы:" + (bonus));
    }
}