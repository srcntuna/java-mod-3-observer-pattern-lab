public class HotelBuilder {

    private static final int NUMBER_OF_FLOORS = 3;
    private static final int NUMBER_OF_ROOMS_PER_FLOOR = 5;



    public HotelBuilder() {
    }

    public Hotel createHotel(){
        Hotel hotel = new Hotel();
        for(int i = 1;i<=NUMBER_OF_FLOORS;i++){
             HotelFloor floor = new HotelFloor(i);
             hotel.addHotelFloor(floor);
            for(int j=1;j<=NUMBER_OF_ROOMS_PER_FLOOR;j++){

                String iNum = Integer.toString(i);
                String zeroNum = Integer.toString(0);
                String jNum = Integer.toString(j);
                String roomNoString = iNum + zeroNum + jNum;
                int roomNumber = Integer.parseInt(roomNoString);
                floor.addHotelRoom(new HotelRoom(roomNumber));
            }
        }

        return  hotel;
    }
}
