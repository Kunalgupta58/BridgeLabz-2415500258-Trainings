import java.util.*;
public class VehicleRentalMain{
    public static void main(String[] args){
        List<Vehicle> v=new ArrayList<>();
        v.add(new Car("CAR123",2000,"POL123"));
        v.add(new Bike("BIKE11",500,"POLB1"));
        v.add(new Truck("TRK9",4000,"POLT9"));
        for(Vehicle vehicle:v){
            System.out.println(vehicle.getVehicleNumber()+" Rent:"+vehicle.calculateRentalCost(3));
            if(vehicle instanceof Insurable) System.out.println("Insurance:"+((Insurable)vehicle).calculateInsurance());
        }
    }
}