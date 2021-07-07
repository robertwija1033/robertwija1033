import java.util.ArrayList;

class jenisKamar {
    private static int jenisK;
    private static ArrayList<Integer> totalKamar = new ArrayList<Integer>();
    private double hargaKamar;
    private Tamu tamu;
    Fasilitas AC = new AC();
    PenerimaanTamu pt;

    public jenisKamar() {        
    }

    // REVIEW PENERIMAANTAMU
    public jenisKamar(int jenisK, ArrayList<Integer> totalKamar) {
        jenisKamar.jenisK = jenisK;
        this.hargaKamar = hargaKamar();
        AddTotalKamar(totalKamar);
        setTotalKamar(totalKamar);
    }

    public jenisKamar(int jenisK, Tamu tamu) {
        setjenisK(jenisK);
        this.hargaKamar = hargaKamar();
        this.tamu = tamu;
    }

    public void AddTotalKamar(ArrayList<Integer> totalKamar) {
        totalKamar.add(500);
        totalKamar.add(300);
        totalKamar.add(100);
        totalKamar.add(10);
        totalKamar.add(10);
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

    public static ArrayList<Integer> getTotalKamar() {
        return totalKamar;
    }

    public void setTotalKamar(ArrayList<Integer> totalKamar) {
        jenisKamar.totalKamar = totalKamar;
    }

    public Tamu getTamu() {
        return this.tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    // REVIEW PENERIMAANTAMU
    public void penguranganKamar(ArrayList<Tamu> tamu) {
        // for (int is : jenisK) {
            int total;
        for (Tamu tamu2 : tamu) {
            if(tamu2.getJenisKamar() == 1) {
                total = getTotalKamar().get(0);
                if(total - tamu2.getJumlahKamar() < 0) {
                    totalKamar.set(4, 0);
                    break;
                }
                total -= tamu2.getJumlahKamar();
                totalKamar.set(0, total);
                break;
            }
            else if(tamu2.getJenisKamar() == 2) {
                total = totalKamar.get(1);
                if(total - tamu2.getJumlahKamar() < 0) {
                    totalKamar.set(4, 0);
                    break;
                }
                total -= tamu2.getJumlahKamar();
                totalKamar.set(1, total);
                break;
            }
            else if(tamu2.getJenisKamar() == 3) {
                total = totalKamar.get(2);
                if(total - tamu2.getJumlahKamar() < 0) {
                    totalKamar.set(4, 0);
                    break;
                }
                total -= tamu2.getJumlahKamar();
                totalKamar.set(2, total);
                break;
            }
            else if(tamu2.getJenisKamar() == 4) {
                total = totalKamar.get(3);
                if(total - tamu2.getJumlahKamar() < 0) {
                    totalKamar.set(4, 0);
                    break;
                }
                total -= tamu2.getJumlahKamar();
                totalKamar.set(3, total);
                break;
            }
            else if(tamu2.getJenisKamar() == 5) {
                total = totalKamar.get(4);
                if(total - tamu2.getJumlahKamar() < 0) {
                    int pengurangan = tamu2.getJumlahKamar() - 10;
                    System.out.println(pengurangan);

                    totalKamar.set(4, 0);
                    break;
                }
                total -= tamu2.getJumlahKamar();
                totalKamar.set(4, total);
                break;
            }
        }
    }

    public String FasilitasJenisK() {
        if(getJenisK() == 1) {
            AC.isAcAvailable(true);
            boolean ac = AC.getIsAcAvailable();
            Boolean.toString(ac);
            return "fasilitas AC : " + ac;
        }
        else if(jenisK == 2) {
            AC.isAcAvailable(true);
            Boolean ac = AC.getIsAcAvailable();
            Boolean.toString(ac);
            
            AC.isHairDyerAvailable(true);
            boolean HairDyer = AC.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer;
        }
        else if(jenisK == 3) {
            AC.isAcAvailable(true);
            Boolean ac = AC.getIsAcAvailable();
            Boolean.toString(ac);
            
            AC.isHairDyerAvailable(true);
            boolean HairDyer = AC.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            AC.isNoSmokingRoomAvailable(true);
            boolean room = AC.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room;
        }
        else if(jenisK == 4) {
            AC.isAcAvailable(true);
            Boolean ac = AC.getIsAcAvailable();
            Boolean.toString(ac);
            
            AC.isHairDyerAvailable(true);
            boolean HairDyer = AC.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            AC.isNoSmokingRoomAvailable(true);
            boolean room = AC.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            AC.isWifiAvailable(true);
            boolean wifi = AC.getIsWifiAvailable();
            Boolean.toString(wifi);

            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room + 
                   "\n                Wifi : " + wifi;
        }
        else if(jenisK == 5) {
            AC.isAcAvailable(true);
            Boolean ac = AC.getIsAcAvailable();
            Boolean.toString(ac);
            
            AC.isHairDyerAvailable(true);
            boolean HairDyer = AC.getIsHairDyerAvailable();
            Boolean.toString(HairDyer);

            AC.isNoSmokingRoomAvailable(true);
            boolean room = AC.getIsNoSmokingRoomAvailable();
            Boolean.toString(room);

            AC.isWifiAvailable(true);
            boolean wifi = AC.getIsSwimmingPoolAvailable();
            Boolean.toString(wifi);

            AC.isSwimmingPoolAvailable(true);
            Boolean pool = AC.getIsSwimmingPoolAvailable();
            return "fasilitas AC : " + ac  + 
                   "\n                Hair Dyer : " + HairDyer + 
                   "\n                No Smoking Room : " + room + 
                   "\n                Wifi : " + wifi + 
                   "\n                Swimming pool : " + pool;
        }
        return "ERROR";
    }
}