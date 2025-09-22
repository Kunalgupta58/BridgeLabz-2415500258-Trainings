public class Bike extends Vehicle implements Insurable{
    private String policyNumber;
    public Bike(String vehicleNumber,double rentalRate,String policyNumber){super(vehicleNumber,"Bike",rentalRate);this.policyNumber=policyNumber;}
    public double calculateRentalCost(int days){return getRentalRate()*days*0.6;}
    public double calculateInsurance(){return 200;}
    public String getInsuranceDetails(){return policyNumber;}
}