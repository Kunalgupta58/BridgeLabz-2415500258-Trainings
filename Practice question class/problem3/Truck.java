public class Truck extends Vehicle implements Insurable{
    private String policyNumber;
    public Truck(String vehicleNumber,double rentalRate,String policyNumber){super(vehicleNumber,"Truck",rentalRate);this.policyNumber=policyNumber;}
    public double calculateRentalCost(int days){return getRentalRate()*days*2.0;}
    public double calculateInsurance(){return 1000;}
    public String getInsuranceDetails(){return policyNumber;}
}