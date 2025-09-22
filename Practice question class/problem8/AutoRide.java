public class AutoRide extends VehicleRide implements GPS{
    private String location="Unknown";
    public AutoRide(String id,String driver,double rate){super(id,driver,rate);}
    public double calculateFare(double distance){return getRatePerKm()*distance*0.6;}
    public String getCurrentLocation(){return location;}
    public void updateLocation(String loc){location=loc;}
}