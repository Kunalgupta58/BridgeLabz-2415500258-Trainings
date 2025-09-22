public interface Reservable{
    boolean reserveItem(String user);
    boolean checkAvailability();
}