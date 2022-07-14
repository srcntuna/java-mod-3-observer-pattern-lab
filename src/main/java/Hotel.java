import java.util.ArrayList;
import java.util.List;

public class Hotel implements HotelRoomInterface{

    List<HotelRoomInterface> hotelFloors;

    public Hotel() {
        this.hotelFloors  = new ArrayList<>();
    }

    @Override
    public void book(String guestName) {
      hotelFloors.forEach(child -> child.book(guestName));
    }

    @Override
    public void clean() {
        hotelFloors.forEach(child -> child.clean());
    }

    public void addHotelFloor(HotelRoomInterface hotelFloor){
        hotelFloors.add(hotelFloor);
    }

    public void removeHotelRoom(HotelRoomInterface hotelFloor){
        hotelFloors.remove(hotelFloor);
    }

    @Override
    public String toString() {
        return "Hotel{" + hotelFloors + '}';
    }

    public HotelFloor getFloor(int id){
        return (HotelFloor) this.hotelFloors.get(id-1);
    }



}
