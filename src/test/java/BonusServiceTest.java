import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        int expected = 30;
        boolean registered = true;
        int amount = 1000;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        int amount = 1_000_000;
        boolean registered = true;
        int expected = 500;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        int amount = 1000;
        boolean registered = false;
        int expected = 10;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        int amount = 1_000_000;
        boolean registered = false;
        int expected = 500;
        long actual = service.calcBonus(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
}



