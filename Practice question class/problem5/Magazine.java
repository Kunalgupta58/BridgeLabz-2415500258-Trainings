public class Magazine extends LibraryItem implements Reservable{
    private boolean available=true;
    public Magazine(String id,String title,String author){super(id,title,author);}
    public int getLoanDuration(){return 7;}
    public boolean reserveItem(String user){if(available){available=false;return true;}return false;}
    public boolean checkAvailability(){return available;}
}