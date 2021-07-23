public interface Fasilitas {
    void isAcAvailable(boolean ac);
    void isHairDyerAvailable(boolean hairDyer);
    void isSwimmingPoolAvailable(boolean pool);
    void isWifiAvailable(boolean WIFI);
    void isNoSmokingRoomAvailable(boolean noSMokingRoom);

    Boolean getIsAcAvailable();
    Boolean getIsHairDyerAvailable();
    Boolean getIsSwimmingPoolAvailable();
    Boolean getIsWifiAvailable();
    Boolean getIsNoSmokingRoomAvailable();   
}