public class Main {
    public static void main(String[] args) {

        boolean buy = true;
        int wallet = 100;
        int replenishmentAmount = 1100;

        int percent;
        if (buy) {
            percent = 11;
        } else {
            percent = 0;
        }

        int totalBonus = wallet + replenishmentAmount + percent;

        if (replenishmentAmount < 1000) {
            totalBonus = 0;
        }
        System.out.println("Ваш Бонус>: " + totalBonus);
    }
}