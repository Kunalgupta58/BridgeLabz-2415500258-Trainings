public class DVD extends LibraryItem implements Reservable{
    private boolean available=true;
    public DVD(String id,String title,String author){super(id,title,author);}
    public int getLoanDuration(){return 3;}
    public boolean reserveItem(String user){if(available){available=false;return true;}return false;}
    public boolean checkAvailability(){return available;}
}