import java.util.ArrayList;

class PenerimaanTamu {
    private ArrayList<Tamu> tamu = new ArrayList<Tamu>();
    ArrayList<Integer> total = new ArrayList<Integer>();
    ArrayList<Integer> jmlhNoKamar = new ArrayList<Integer>();
    private jenisKamar jeniskamar;
    private int lama;
    private Admin admin;
    private int service;
    private int choice;
    private Kamar kamar;
    private ArrayList<bookingKamar> booking = new ArrayList<bookingKamar>();
    // NOTE Contructor
    public PenerimaanTamu() {
    }

    //REVIEW jumlah kamar
    public PenerimaanTamu(int lama, Admin admin, jenisKamar jeniskamar) {
        this.lama = lama;
        this.admin = admin;
        this.jeniskamar = jeniskamar;
    }

    // REVIEW jumlah kamar
    public PenerimaanTamu(int lama, jenisKamar jeniskamar) {
        this.lama = lama;
        this.jeniskamar = jeniskamar;
    }

    // NOTE get tamu
    public ArrayList<Tamu> getTamu() {
       return this.tamu;
    }
    
    public void setTamu(ArrayList<Tamu> tamu) {
        this.tamu = tamu;
    }
    
    // NOTE get check in
    //FIXME 
    public void checkOut(String nama, ArrayList<Integer> total, ArrayList<Integer> jmlhNoKamar) {
        int i = 0;
        for (Tamu guest : tamu) {
            if(guest.getNama().equals(nama)) {
                int tambah = total.get(guest.getJenisKamar()-1) + guest.getJumlahKamar();
                total.set(guest.getJenisKamar()-1, tambah);
                int kurang = jmlhNoKamar.get(guest.getJenisKamar()-1) - guest.getJumlahKamar();
                jmlhNoKamar.set(guest.getJenisKamar()-1, kurang);
                guest.setCheckIn(false);           
                tamu.remove(i);
                admin.getTamu().remove(i);
                break;
            }
            i += 1;
        }
    }
    
    // NOTE Kamar
    public jenisKamar getJenisKamar() {
        return this.jeniskamar;
    }

    public void setJenisKamar(jenisKamar jeniskamar) {
        this.jeniskamar = jeniskamar;
    }

    // NOTE lama tinggal
    public Integer getLama() {
        return this.lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    // NOTE Admin
    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    // NOTE Service
    public Integer getService() {
        return this.service;
    }

    public Integer getChoice() {
        return this.choice;
    }

    public void setChoice(int choice){
        this.choice = choice;
    }

    public Kamar getKamar() {
        return this.kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    // public void setBooking(ArrayList<bookingKamar> booking) {
    //     this.booking = booking;
    // }

    // public ArrayList<bookingKamar> getBooking() {
    //     return this.booking;
    // }

    // NOTE Total harga
    public Double TotalHarga(Tamu tamu) {
        admin.setPenghasilan(jeniskamar.hargaKamar() * (double)getLama() * (double)tamu.getJumlahKamar());
        return jeniskamar.hargaKamar() * (double)getLama() * (double) tamu.getJumlahKamar();
    }

    // TODO no kamar dll
    public String tampilkanBooking() {
        int i = 0;
        String Tampil = "";
        for (Tamu guest : tamu) {
            Tampil ="==========================================" +
            "\nHasil Booking Anda : " +
            "\nNama : " + guest.getNama() +
            "\nNo telp anda : " + guest.getNoTelp() +
            "\nAnda adalah : " + guest.getCustomerType() + " " + guest.getDataAnda() +
            "\nJumlah kamar yang dipesan : " + guest.getJumlahKamar() +
            "\nhari : " + getLama() +
            "\nTanggal anda booking : " + booking.get(i).getTglBooking() +
            "\nTanggal Check-In anda : " + booking.get(i).getTglCheckIn() +
            "\nTotal harga : " + TotalHarga(guest) +
            "\ncheck In : " + guest.getStatus() +
            "\n" + jeniskamar.FasilitasJenisK();
            i += 1;
        }
        return Tampil;
    }

    public String pengecekkanCheckIn(String checkIn) {
        for (Tamu tamu2 : tamu) {
            System.out.println(tamu2.getNama());
            if(tamu2.getNama().equals(checkIn)) return "Benar!!!";
            else if(tamu2.getDataAnda().equals(checkIn)) return "Benar!!!";
        }
        return "salah!!!";
    }

    public String tampilkanCheckIn(String nama) {
        int i = 0;
        String tampil = "";
        for (Tamu guest : tamu) {
            if(nama.equals(guest.getNama())) {
                tampil = "Hasil Check-In Anda : " +
                "\nNama : " + guest.getNama() +
                "\nAnda adalah : " + guest.getCustomerType() + " NIK anda : " + guest.getDataAnda() +
                "\nTanggal Check-In anda : " +  booking.get(i).getTglCheckIn() +
                "\nJumlah kamar : " + guest.getJumlahKamar() +
                "\n" + guest.getNoKamar();
            }
            i += 1;
        }
        return tampil;
    }

    // STUB tambahkan tamu di arraylist
    public void tambahkanTamu(String Nama, String noTelp, String customerType, int jumlahKamar, int jenisKamar, String DataAnda, boolean checkIn, String noKamar) {
        tamu.add(new Tamu(Nama, noTelp, customerType, jumlahKamar, jenisKamar, DataAnda, checkIn, noKamar));
    }

    public void tambahkanBooking(String tanggalBooking, String tglCheckIn) {
        booking.add(new bookingKamar(tanggalBooking, tglCheckIn));
    }
}