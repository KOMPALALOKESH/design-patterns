package BuilderPattern;

public class RideBuilder {
    String pickup;
    String drop;
    String riderId;
    private boolean isPoolRide;

    public RideBuilder setPickup(String pickup) {
        this.pickup = pickup;
        return this;
    }

    public RideBuilder setDrop(String drop) {
        this.drop = drop;
        return this;
    }

    public RideBuilder setRiderId(String riderId) {
        this.riderId = riderId;
        return this;
    }

    public RideBuilder setIsPoolRide(boolean isPoolRide) {
        this.isPoolRide = isPoolRide;
        return this;
    }

    public Ride build() {
        Ride ride = new Ride(pickup, drop, riderId);
        ride.setIsPoolRide(this.isPoolRide);
        return ride;
    }
}
