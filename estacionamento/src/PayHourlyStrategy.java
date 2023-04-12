import java.math.BigDecimal;
import java.time.Duration;

public class PayHourlyStrategy implements TotalToPayStrategy {
    private final Duration duration;

    public PayHourlyStrategy(Duration duration) {
        this.duration = duration;
    }

    @Override
    public BigDecimal getTotalToPay() {
        return HOUR_VALUE.multiply(new BigDecimal(this.duration.toHours()));
    }
    
}
