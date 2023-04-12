import java.math.BigDecimal;
import java.time.Duration;

public interface TotalToPayStrategy {
    BigDecimal HOUR_VALUE = new BigDecimal("5.00");
    BigDecimal DAILY_VALUE = new BigDecimal("30.00");
    BigDecimal MONTHLY_VALUE = new BigDecimal("300.00");

    BigDecimal getTotalToPay();
}
