public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber,String type,double rentalRate){this.vehicleNumber=vehicleNumber;this.type=type;this.rentalRate=rentalRate;}
    public String getVehicleNumber(){return vehicleNumber;}
    public void setVehicleNumber(String v){vehicleNumber=v;}
    public String getType(){return type;}
    public void setType(String t){type=t;}
    public double getRentalRate(){return rentalRate;}
    public void setRentalRate(double r){rentalRate=r;}
    public abstract double calculateRentalCost(int days);
}