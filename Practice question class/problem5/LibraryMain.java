import java.util.*;
public class LibraryMain{
    public static void main(String[] args){
        List<LibraryItem> items=new ArrayList<>();
        items.add(new Book("B1","Java","Author A"));
        items.add(new Magazine("M1","Tech","Editor X"));
        items.add(new DVD("D1","Movie","Director Y"));
        for(LibraryItem it:items){it.getItemDetails();System.out.println("Loan days:"+it.getLoanDuration());}
    }
}