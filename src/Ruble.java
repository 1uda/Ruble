public class Ruble {

    public static void main(String[] args) {
        int start = 100;
        int dep = 300;
        int bonus;

        if (dep >= 100) {
            bonus = dep / 100;
        } else {
            bonus = 0;
        }
        int bank = start + dep;
        int x = bank + bonus;

        System.out.println("Итоговый баланс " + x);
    }
}
