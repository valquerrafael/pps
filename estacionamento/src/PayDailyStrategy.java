import java.math.BigDecimal;
import java.time.Duration;

public class PayDailyStrategy implements TotalToPayStrategy {

    private final Duration duration;

    public PayDailyStrategy(Duration duration) {
        this.duration = duration;
    }

    @Override
    public BigDecimal getTotalToPay() {
        return DAILY_VALUE.multiply(new BigDecimal(this.duration.toDays()));
    }

}
