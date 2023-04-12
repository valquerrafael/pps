import java.time.LocalDateTime;

class MainParkingLot {

	public static void main(String[] args) {
		
        Vehicle vehicle = new Vehicle("ABC-123",  "Chevrolet Onix", "Azul");

        LocalDateTime entry = LocalDateTime.of(2022, 8, 1, 11, 0, 0);
        LocalDateTime exit = LocalDateTime.of(2022,8, 1, 12, 10, 0);
        ParkingLot parkingLot = new ParkingLot(entry, exit, vehicle);
        
        System.out.println("Pagamento por Hora");
        System.out.println("-------------------");
        System.out.println(parkingLot.getTotalToPay());
        
        entry = LocalDateTime.of(2022, 8, 1, 0, 0, 0);
        exit = LocalDateTime.of(2022,8, 5, 0, 0, 0);
        parkingLot.setEntry(entry);
        parkingLot.setExit(exit);
        parkingLot.setVehicle(vehicle);

        System.out.println("\nPagamento por Diaria");
        System.out.println("---------------------");
        System.out.println(parkingLot.getTotalToPay());

        entry = LocalDateTime.of(2022, 7, 1, 0, 0, 0);
        exit = LocalDateTime.of(2022,8, 5, 0, 0, 0);
        parkingLot.setEntry(entry);
        parkingLot.setExit(exit);
        parkingLot.setVehicle(vehicle);

        System.out.println("\nPagamento por Mensalidade");
        System.out.println("---------------------");
        System.out.println(parkingLot.getTotalToPay());

	}
}
