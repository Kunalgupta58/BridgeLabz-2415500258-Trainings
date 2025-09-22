public class Car extends Vehicle implements Insurable{
    private String policyNumber;
    public Car(String vehicleNumber,double rentalRate,String policyNumber){super(vehicleNumber,"Car",rentalRate);this.policyNumber=policyNumber;}
    public double calculateRentalCost(int days){return getRentalRate()*days*1.0;}
    public double calculateInsurance(){return 500;}
    public String getInsuranceDetails(){return policyNumber;}
    public String getPolicyNumber(){return policyNumber;}
    public void setPolicyNumber(String p){policyNumber=p;}
}