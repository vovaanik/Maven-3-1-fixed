import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndLimit() {
        BonusService service = new BonusService();
        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndLimit() {
        BonusService service = new BonusService();
        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndAmount0() {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 200060;
        boolean registered = true;
        long expected = 60;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 200060;
        boolean registered = false;
        long expected = 20;

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
        @org.junit.jupiter.api.Test
        void shouldCalculateRegisteredAndAmount0() {
            BonusService service = new BonusService();
            long amount = 0;
            boolean registered = true;
            long expected = 0;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
        }
    }
