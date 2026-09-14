package BuilderPattern;

public class RideService {

    public static void main(String[] args) {
        RideBuilder rideBuilder = new RideBuilder();
        Ride ride1 = rideBuilder
                .setPickup("A")
                .setDrop("B")
                .setRiderId("123")
                .build();

        Ride ride2 = rideBuilder
                .setPickup("C")
                .setDrop("D")
                .setRiderId("456")
                .setIsPoolRide(true) // added this line to set isPoolRide to true
                .build();

        System.out.println(ride1);
        System.out.println(ride2);
    }
}
