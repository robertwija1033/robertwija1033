public class AC implements Fasilitas{
    boolean ac;
    public void isAcAvailable(boolean ac) {
        this.ac = ac;
    }

    public void isHairDyerAvailable(boolean hairDyer) {
        this.ac = hairDyer;
    }

    public void isSwimmingPoolAvailable(boolean pool) {
        this.ac = pool;
    } 

    public void isWifiAvailable(boolean WIFI) {
        this.ac = WIFI;
    }

    public void isNoSmokingRoomAvailable(boolean noSMokingRoom) {
        this.ac = noSMokingRoom;
    }

    public Boolean getIsAcAvailable() {
        return this.ac;
    }

    public Boolean getIsHairDyerAvailable() {
        return this.ac;
    }

    public Boolean getIsSwimmingPoolAvailable(){
        return this.ac;
    }

    public Boolean getIsWifiAvailable() {
        return this.ac;
    }

    public Boolean getIsNoSmokingRoomAvailable() {
        return this.ac;
    }
}

