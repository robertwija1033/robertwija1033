public class Wifi implements Fasilitas{
    boolean wifi;

    public void isAcAvailable(boolean ac) {
        this.wifi = ac;
    }

    public void isHairDyerAvailable(boolean hairDyer) {
        this.wifi = hairDyer;
    }

    public void isSwimmingPoolAvailable(boolean pool) {
        this.wifi = pool;
    } 

    public void isWifiAvailable(boolean WIFI) {
        this.wifi = WIFI;
    }

    public void isNoSmokingRoomAvailable(boolean noSMokingRoom) {
        this.wifi = noSMokingRoom;
    }

    public Boolean getIsAcAvailable() {
        return this.wifi;
    }

    public Boolean getIsHairDyerAvailable() {
        return this.wifi;
    }

    public Boolean getIsSwimmingPoolAvailable(){
        return this.wifi;
    }

    public Boolean getIsWifiAvailable() {
        return this.wifi;
    }

    public Boolean getIsNoSmokingRoomAvailable() {
        return this.wifi;
    }
    
}
