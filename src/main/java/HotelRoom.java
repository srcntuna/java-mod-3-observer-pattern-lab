import java.util.ArrayList;
import java.util.List;

public class HotelRoom implements HotelRoomInterface{

    private List<RoomCheckInObserver> checkInObserverList = new ArrayList<RoomCheckInObserver>();

    private int roomId;

    public HotelRoom(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public void book(String guestName) {
        Logger.Logger.getInstance().log("Booked Room " +roomId+ " for " + guestName);

    }

    @Override
    public void clean() {
        Logger.Logger.getInstance().log("Cleaned Room " + roomId);

    }

    public void checkIn(String guestName){
        Logger.Logger.getInstance().log(guestName + " checked in to Room: " + roomId);
        checkInObserverList.forEach(roomCheckInObserver -> roomCheckInObserver.update(guestName));
    }

    public void addCheckinObserver(RoomCheckInObserver checkinObserver) {
        checkInObserverList.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckInObserver checkinObserver) {
        checkInObserverList.remove(checkinObserver);
    }

    public int getRoomId() {
        return roomId;
    }

    @Override
    public String toString() {
        return "roomId= " + roomId ;
    }
}
