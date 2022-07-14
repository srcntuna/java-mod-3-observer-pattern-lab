public class HotelManager {

    private static final int NUMBER_OF_FLOORS = 3;
    private static final int NUMBER_OF_ROOMS_PER_FLOOR = 5;

    public static void main(String[] args) {

        Logger.Logger.getInstance().log("Managing hotel...");


        Hotel hiltonHotel = new Hotel();

        HotelEmailService emailService = new HotelEmailService();
        HotelPushNotificationService notificationService = new HotelPushNotificationService();

        for(int i = 1;i<=NUMBER_OF_FLOORS;i++){
            HotelFloor floor = new HotelFloor(i);
            hiltonHotel.addHotelFloor(floor);
            for(int j=1;j<=NUMBER_OF_ROOMS_PER_FLOOR;j++){

                String iNum = Integer.toString(i);
                String zeroNum = Integer.toString(0);
                String jNum = Integer.toString(j);
                String roomNoString = iNum + zeroNum + jNum;
                int roomNumber = Integer.parseInt(roomNoString);
                HotelRoom room = new HotelRoom(roomNumber);
                room.addCheckinObserver(emailService);
                room.addCheckinObserver(notificationService);
                floor.addHotelRoom(room);
            }
        }


        //Sercan checks in floor 1 & room 1 --> 101
        hiltonHotel.getFloor(1).getRoom(1).checkIn("Sercan");

        //Ronaldo checks in floor 1 & room 1 --> 103
        hiltonHotel.getFloor(1).getRoom(3).checkIn("Ronaldo");

        //Sercan checks in floor 2 & room 1 --> 203
        hiltonHotel.getFloor(2).getRoom(3).checkIn("Messi");

        //Sercan checks in floor 3 & room 1 --> 301
        hiltonHotel.getFloor(3).getRoom(1).checkIn("Zlatan");






    }
}
