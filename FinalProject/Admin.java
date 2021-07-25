import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

class Admin {
    ArrayList<Tamu> tamu = new ArrayList<Tamu>();
    private jenisKamar jeniskamar;
    private double penghasilan;
    private Kamar kamar;
    private ArrayList<bookingKamar> booking = new ArrayList<bookingKamar>();
    private readWrite rWrite;
    
    public Admin(ArrayList<Tamu> tamu) {
        this.tamu = tamu;
    }

    public Admin() {
    }

    public ArrayList<Tamu> getTamu() {
        return this.tamu;
    }
     
    public void setTamu(ArrayList<Tamu> tamu) {
        this.tamu = tamu;
    }

    public jenisKamar getJenisKamar() {
        return this.jeniskamar;
    }
     
    public void setJenisKamar(jenisKamar jeniskamar) {
        this.jeniskamar = jeniskamar;
    }

    public Double getPenghasilan() {
        return this.penghasilan;
    }
     
    public void setPenghasilan(double ttlpenghasilan) {
        this.penghasilan += ttlpenghasilan;
    }

    public Kamar getKamar() {
        return this.kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }
    
    public void setBooking(ArrayList<bookingKamar> booking) {
        this.booking = booking;
    }

    public ArrayList<bookingKamar> getBooking() {
        return booking;
    }

    public readWrite getReadWrite() {
        return this.rWrite;
    }

    public void setReadWrite(readWrite rWrite) {
        this.rWrite = rWrite;
    }

    public String daftarTamu() {
        int i = 0;
        String tampil = "";
        for (Tamu guest : tamu) {
            i+= 1;
            Integer.toString(i);
            tampil += "==========================================" + 
            "\n" + i +
            "\nNama : " + guest.getNama() +
            "\nNo telp anda : " + guest.getNoTelp() +
            "\nAnda adalah : " + guest.getCustomerType() + " " + guest.getDataAnda() +
            "\nJumlah kamar yang dipesan : " + guest.getJumlahKamar() +
            "\nTanggal anda booking : " + booking.get(i-1).getTglBooking() +
            "\ncheck In : " + guest.getStatus() +
            "\n" + guest.getNoKamar() + "\n";
        }
        return tampil;
    }

    public String daftarTotalKamar(ArrayList<Integer> total) {
        String totalKamar = "";
        int i = 1;
        for (Integer integer : total) {
            Integer.toString(integer);
            if(i == 1 ) {
                totalKamar += "Standard Room :" + integer + "\n";
            }
            else if(i == 2 ) {
                totalKamar += "Superior Room :" + integer + "\n";
            }
            else if(i == 3 ) {
                totalKamar += "Deluxe Room :" + integer + "\n";
            }
            else if(i == 4 ) {
                totalKamar += "Suite Room :" + integer + "\n";
            }
            else if(i == 5 ) {
                totalKamar += "President Room :" + integer + "\n";
            }
            i++;
        }
        return totalKamar;
    }

    public String writeRead() {
        String read = "";
        for (Tamu guest : tamu) {
            rWrite.writeData(guest); 
            read += rWrite.readData();
            rWrite.toTamuObject(); 
        }
        return read;
    }

    public void tambahkanTamu(String Nama, String noTelp, String customerType, int jumlahKamar, int jenisKamar, String DataAnda, boolean checkIn, String noKamar) {
        tamu.add(new Tamu(Nama, noTelp, customerType, jumlahKamar, jenisKamar, DataAnda, checkIn, noKamar));
    }

    public void tambahkanBooking(String tanggalBooking, String tglCheckIn) {
        booking.add(new bookingKamar(tanggalBooking, tglCheckIn));
    }

}
