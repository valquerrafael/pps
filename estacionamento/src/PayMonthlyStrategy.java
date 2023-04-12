import java.math.BigDecimal;
import java.time.Duration;

public class PayMonthlyStrategy implements TotalToPayStrategy {

    public PayMonthlyStrategy() {
    }

    @Override
    public BigDecimal getTotalToPay() {
        return MONTHLY_VALUE;
    }

}
