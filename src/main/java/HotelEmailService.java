class HotelEmailService implements RoomCheckInObserver {
    public void update(Object guestName) {
        Logger.Logger.getInstance().log("Sent email update to " + guestName);
    }
}