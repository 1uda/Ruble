public class Ruble {

    public static void main(String[] args) {
        int start = 100;
        int dep = 1120;
        int bonus;

        if (dep > 1000) {
            bonus = dep / 100;
        } else {
            bonus = 0;
        }
        int bank = start + dep;
        int total = bank + bonus;

        System.out.println("Итоговый баланс " + total);
        System.out.println("Бонус " + bonus);
    }
}
