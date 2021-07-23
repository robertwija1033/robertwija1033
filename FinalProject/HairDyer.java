public class HairDyer implements Fasilitas {
    private boolean HairDyer;
    public void isAcAvailable(boolean ac) {
        this.HairDyer = ac;
    }

    public void isHairDyerAvailable(boolean hairDyer) {
        this.HairDyer = hairDyer;
    }

    public void isSwimmingPoolAvailable(boolean pool) {
        this.HairDyer = pool;
    } 

    public void isWifiAvailable(boolean WIFI) {
        this.HairDyer = WIFI;
    }

    public void isNoSmokingRoomAvailable(boolean noSMokingRoom) {
        this.HairDyer = noSMokingRoom;
    }

    public Boolean getIsAcAvailable() {
        return this.HairDyer;
    }

    public Boolean getIsHairDyerAvailable() {
        return this.HairDyer;
    }

    public Boolean getIsSwimmingPoolAvailable(){
        return this.HairDyer;
    }

    public Boolean getIsWifiAvailable() {
        return this.HairDyer;
    }

    public Boolean getIsNoSmokingRoomAvailable() {
        return this.HairDyer;
    }
}
