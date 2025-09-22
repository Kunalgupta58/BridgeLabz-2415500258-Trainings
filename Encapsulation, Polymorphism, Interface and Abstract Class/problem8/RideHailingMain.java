import java.util.*;
public class RideHailingMain{
    public static void main(String[] args){
        List<VehicleRide> rides=new ArrayList<>();
        CarRide c=new CarRide("V1","DriverA",20);
        BikeRide b=new BikeRide("V2","DriverB",10);
        AutoRide a=new AutoRide("V3","DriverC",8);
        rides.add(c);rides.add(b);rides.add(a);
        for(VehicleRide r:rides) System.out.println(r.getVehicleId()+" Fare 10km:"+r.calculateFare(10));
    }
}