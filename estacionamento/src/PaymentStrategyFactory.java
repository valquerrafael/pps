import java.time.Duration;

public abstract class PaymentStrategyFactory {

    public static TotalToPayStrategy createPaymentStrategy(Duration duration) {
        if (duration.toHours() <= 12)
            return new PayHourlyStrategy(duration);

        if (duration.toDays() <= 15)
            return new PayDailyStrategy(duration);

        return new PayMonthlyStrategy();
    }

}
