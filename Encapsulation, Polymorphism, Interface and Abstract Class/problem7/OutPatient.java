public class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private String records="";
    public OutPatient(String id,String name,int age,double fee){super(id,name,age);this.consultationFee=fee;}
    public double calculateBill(){return consultationFee;}
    public void addRecord(String record){records+=record+";";}
    public String viewRecords(){return records;}
}