public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        boolean registered = true;
        int amount = 1000;
        long actual = service.calcBonus(amount, registered);

    }
}
