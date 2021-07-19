import java.util.ArrayList;

class jenisKamar {
    private static int jenisK;
    private double hargaKamar;
    private Tamu tamu;
    Fasilitas fasilitas = new AC();
    PenerimaanTamu pt;

    public jenisKamar() {        
    }

    // REVIEW PENERIMAANTAMU
    public jenisKamar(int jenisK) {
        jenisKamar.jenisK = jenisK;
        this.hargaKamar = hargaKamar();
    }

    public jenisKamar(int jenisK, Tamu tamu) {
        setjenisK(jenisK);
        this.hargaKamar = hargaKamar();
        this.tamu = tamu;
    }

    public Double hargaKamar() {
        if(jenisK == 1) {
            hargaKamar = 250000.0;
            return hargaKamar;
        }
        else if(jenisK == 2) {
            hargaKamar = 300000.0;
            return hargaKamar;
        }
        else if(jenisK == 3) {
            hargaKamar = 350000.0;
            return hargaKamar;
        }
        else if(jenisK == 4) {
            hargaKamar = 400000.0;
            return hargaKamar;
        }
        else if(jenisK == 5){
            hargaKamar = 500000.0;
            return hargaKamar;
        }
        return 0.0;
    }

    public Double getHargaKamar() {
        return this.hargaKamar;
    }

    public void setHargaKamar() {
        if(getJenisK() == 1) {
            this.hargaKamar = 250000.0;
        }
        else if(getJenisK() == 2) {
            this.hargaKamar = 300000.0;
        }
        else if(getJenisK() == 3) {
            this.hargaKamar = 350000.0;
        }
        else if(getJenisK() == 4) {
            this.hargaKamar = 400000.0;
        }
        else {
            this.hargaKamar = 500000.0;
        }
    }    

    public int getJenisK() {
        return jenisK;
    }

    public String setjenisK(int jenisK) {
        if(jenisK == 1) {
            jenisKamar.jenisK = jenisK;
            return "Standard Room";
        }
        else if(jenisK == 2) {
            jenisKamar.jenisK = jenisK;
            return "Superior Room";
        }
        else if(jenisK == 3) {
            jenisKamar.jenisK = jenisK;
            return "Deluxe Room";
        }
        else if(jenisK == 4) {
            jenisKamar.jenisK = jenisK;
            return "Suite Room";
        }
        else if(jenisK == 5) {
            jenisKamar.jenisK = jenisK;
            return "President Room";
        }
        return "ERROR!!!";
    }

    public Tamu getTamu() {
        return this.tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public String FasilitasJenisK() {
        if(getJenisK() == 1) {
            fasilitas.isAcAvailable(true);
            boolean ac = fasilitas.getIsAcAvailable();
            Boolean.toString(ac);
            return "fasilitas AC : " + ac;
        }
        else if(jenisK == 2) {
            fasilitas.isAcAvailable(true);
            Boolean ac = fasilitas.getIsAcAvailable();
            Boolean.toString(ac);
            
            fasilitas.isHairDyerAvailable(true);
            boolean HairDyer = fasilitas.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer;
        }
        else if(jenisK == 3) {
            fasilitas.isAcAvailable(true);
            Boolean ac = fasilitas.getIsAcAvailable();
            Boolean.toString(ac);
            
            fasilitas.isHairDyerAvailable(true);
            boolean HairDyer = fasilitas.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            fasilitas.isNoSmokingRoomAvailable(true);
            boolean room = fasilitas.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room;
        }
        else if(jenisK == 4) {
            fasilitas.isAcAvailable(true);
            Boolean ac = fasilitas.getIsAcAvailable();
            Boolean.toString(ac);
            
            fasilitas.isHairDyerAvailable(true);
            boolean HairDyer = fasilitas.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            fasilitas.isNoSmokingRoomAvailable(true);
            boolean room = fasilitas.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            fasilitas.isWifiAvailable(true);
            boolean wifi = fasilitas.getIsWifiAvailable();
            Boolean.toString(wifi);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room + 
                   "\n                Wifi : " + wifi;
        }
        else if(jenisK == 5) {
            fasilitas.isAcAvailable(true);
            Boolean ac = fasilitas.getIsAcAvailable();
            Boolean.toString(ac);
            
            fasilitas.isHairDyerAvailable(true);
            boolean HairDyer = fasilitas.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            fasilitas.isNoSmokingRoomAvailable(true);
            boolean room = fasilitas.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            fasilitas.isWifiAvailable(true);
            boolean wifi = fasilitas.getIsSwimmingPoolAvailable();
            Boolean.toString(wifi);

            fasilitas.isSwimmingPoolAvailable(true);
            Boolean pool = fasilitas.getIsSwimmingPoolAvailable();
            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room + 
                   "\n                Wifi : " + wifi + 
                   "\n                Swimming pool : " + pool;
        }
        return "ERROR";
    }
}