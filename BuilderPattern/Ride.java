package BuilderPattern;

public class Ride {
    String pickup;
    String drop;
    String riderId;

    boolean isPoolRide;

    public Ride(String pickup, String drop, String riderId) {
        this.pickup = pickup;
        this.drop = drop;
        this.riderId = riderId;
    }

    public void setIsPoolRide(boolean isPoolRide) {
        this.isPoolRide = isPoolRide;
    }

    public String toString() {
        return "Ride{" +
                "pickup='" + pickup + '\'' +
                ", drop='" + drop + '\'' +
                ", riderId='" + riderId + '\'' +
                ", isPoolRide=" + isPoolRide +
                '}';
    }
}
