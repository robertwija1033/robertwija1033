import java.util.concurrent.FutureTask;

public class Pool implements Fasilitas {
    boolean pool;

    public void isAcAvailable(boolean ac) {
        this.pool = ac;
    }

    public void isHairDyerAvailable(boolean hairDyer) {
        this.pool = hairDyer;
    }

    public void isSwimmingPoolAvailable(boolean pool) {
        this.pool = pool;
    } 

    public void isWifiAvailable(boolean WIFI) {
        this.pool = WIFI;
    }

    public void isNoSmokingRoomAvailable(boolean noSMokingRoom) {
        this.pool = noSMokingRoom;
    }

    public Boolean getIsAcAvailable() {
        return this.pool;
    }

    public Boolean getIsHairDyerAvailable() {
        return this.pool;
    }

    public Boolean getIsSwimmingPoolAvailable(){
        return this.pool;
    }

    public Boolean getIsWifiAvailable() {
        return this.pool;
    }

    public Boolean getIsNoSmokingRoomAvailable() {
        return this.pool;
    }
}