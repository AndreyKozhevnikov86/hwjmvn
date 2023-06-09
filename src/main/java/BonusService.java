public class BonusService {

    public long calcBonus(int amount, boolean registered) {
        int percent = registered ? 3 : 1;
        int bonus = amount * percent / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
