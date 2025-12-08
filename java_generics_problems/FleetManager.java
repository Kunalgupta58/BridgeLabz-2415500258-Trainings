import java.util.*;
abstract class Vehicle{ public String toString(){return getClass().getSimpleName();} }
class Truck extends Vehicle{}
class Bike extends Vehicle{}
class FleetManager<T extends Vehicle>{
    private final java.util.List<T> fleet=new java.util.ArrayList<>();
    public void addVehicle(T v){fleet.add(v);}
    public void showFleet(){for(T t:fleet)System.out.println(t);}
}
class FleetDemo{
    public static void main(String[] args){
        FleetManager<Truck> ft=new FleetManager<>(); ft.addVehicle(new Truck()); ft.showFleet();
        FleetManager<Bike> fb=new FleetManager<>(); fb.addVehicle(new Bike()); fb.showFleet();
    }
}
