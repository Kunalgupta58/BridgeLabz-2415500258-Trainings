import java.util.*;
public class HospitalMain{
    public static void main(String[] args){
        List<Patient> patients=new ArrayList<>();
        InPatient ip=new InPatient("P1","A","30",2000);
        OutPatient op=new OutPatient("P2","B",25,500);
        ip.addRecord("Surgery");
        op.addRecord("Checkup");
        patients.add(ip);patients.add(op);
        for(Patient p:patients){p.getPatientDetails();System.out.println("Bill:"+p.calculateBill());}
    }
}