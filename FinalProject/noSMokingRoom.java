public class noSMokingRoom implements Fasilitas{
    boolean noSmoking;
    public void isAcAvailable(boolean ac) {
        this.noSmoking = ac;
    }

    public void isHairDyerAvailable(boolean hairDyer) {
        this.noSmoking = hairDyer;
    }

    public void isSwimmingPoolAvailable(boolean pool) {
        this.noSmoking = pool;
    } 

    public void isWifiAvailable(boolean WIFI) {
        this.noSmoking = WIFI;
    }

    public void isNoSmokingRoomAvailable(boolean noSMokingRoom) {
        this.noSmoking = noSMokingRoom;
    }

    public Boolean getIsAcAvailable() {
        return this.noSmoking;
    }

    public Boolean getIsHairDyerAvailable() {
        return this.noSmoking;
    }

    public Boolean getIsSwimmingPoolAvailable(){
        return this.noSmoking;
    }

    public Boolean getIsWifiAvailable() {
        return this.noSmoking;
    }

    public Boolean getIsNoSmokingRoomAvailable() {
        return this.noSmoking;
    }    
}
