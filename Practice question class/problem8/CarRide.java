public class CarRide extends VehicleRide implements GPS{
    private String location="Unknown";
    public CarRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance;}
    public String getCurrentLocation(){return location;}
    public void updateLocation(String loc){location=loc;}
}