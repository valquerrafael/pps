import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingLot {

    private LocalDateTime entry;
    private LocalDateTime exit;
    private Vehicle vehicle;

    public ParkingLot(LocalDateTime entry, LocalDateTime exit, Vehicle vehicle) {
        this.entry = entry;
        this.exit = exit;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntry() {
        return entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public LocalDateTime getExit() {
        return exit;
    }

    public void setExit(LocalDateTime exit) {
        this.exit = exit;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public BigDecimal getTotalToPay() {
        assert(entry != null && exit != null && vehicle != null);

        Duration duration = Duration.between(entry, exit);

        return (PaymentStrategyFactory.createPaymentStrategy(duration)).getTotalToPay();
    }

}
