public class InPatient extends Patient implements MedicalRecord{
    private double roomCharge;
    private String records="";
    public InPatient(String id,String name,int age,double roomCharge){super(id,name,age);this.roomCharge=roomCharge;}
    public double calculateBill(){return roomCharge*5;}
    public void addRecord(String record){records+=record+";";}
    public String viewRecords(){return records;}
}