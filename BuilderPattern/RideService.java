package BuilderPattern;

public class RideService {

    public static void main(String[] args) {
        RideBuilder rideBuilder = new RideBuilder();
        Ride ride1 = rideBuilder
                .setPickup("A")
                .setDrop("B")
                .setRiderId("123")
                .build();

        Ride ride2 = new RideBuilder()
                .setPickup("C")
                .setDrop("D")
                .setRiderId("456")
                .setIsPoolRide(true)
                .build();

        Ride ride3 = new RideBuilder()
                .setPickup("E")
                .setDrop("F")
                .setRiderId("789")
                .build(); // still a pool ride

        System.out.println(ride1);
        System.out.println(ride2);
        System.out.println(ride3);
    }
}
