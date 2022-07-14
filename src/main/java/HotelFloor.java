import java.util.ArrayList;
import java.util.List;

public class HotelFloor implements  HotelRoomInterface{

    private List<HotelRoomInterface> hotelRooms;
    private int floorNo;

    public HotelFloor(int floorNo) {

        this.hotelRooms = new ArrayList<>();
        this.floorNo = floorNo;
    }

    @Override
    public void book(String guestName) {
      hotelRooms.forEach(child -> child.book(guestName));
    }

    @Override
    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom){
        hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom){
        hotelRooms.remove(hotelRoom);
    }


    public List<HotelRoomInterface> getHotelRooms() {
        return hotelRooms;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public HotelRoom getRoom(int num){
        return (HotelRoom) this.hotelRooms.get(num-1);
    }

    @Override
    public String toString() {
        return "FloorNo="+ floorNo   + hotelRooms ;
    }
}
