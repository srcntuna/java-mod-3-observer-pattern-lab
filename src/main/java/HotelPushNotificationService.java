class HotelPushNotificationService implements RoomCheckInObserver {
    public void update(Object guestName) {
        Logger.Logger.getInstance().log("Registered " + guestName + " for push notification updates");
    }
}