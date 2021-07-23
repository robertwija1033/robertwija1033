import java.util.ArrayList;

class frontDesk extends Admin{
    int a;
    int b;

    public frontDesk(ArrayList<Tamu> tamu) {
        super(tamu);
    }

    public void Sorting() {
        boolean status;
        String nama;
        String Notelp;
        String type;
        String Data;
        int jumlahK;
        String noKamar;

        for(int i = 0; i < super.getTamu().size(); i++) {
            for(int j = 0; j < super.getTamu().size()-1; j++) {
                status = super.getTamu().get(j).getStatus();
                nama = super.getTamu().get(j).getNama();
                Notelp = super.getTamu().get(j).getNoTelp();
                type = super.getTamu().get(j).getCustomerType();
                Data = super.getTamu().get(j).getDataAnda();
                jumlahK = super.getTamu().get(j).getJumlahKamar();
                noKamar = super.getTamu().get(j).getNoKamar();

                if(nama.charAt(0) > 
                   super.getTamu().get(j+1).getNama().charAt(0)) {
                    // NOTE ini adalah status Check In
                    super.getTamu().get(j).setCheckIn(super.getTamu().get(j+1).getStatus());
                    super.getTamu().get(j+1).setCheckIn(status);
                    // NOTE ini adalah Nama
                    super.getTamu().get(j).setNama(super.getTamu().get(j+1).getNama());
                    super.getTamu().get(j+1).setNama(nama);
                    // NOTE ini adalah No Telp
                    super.getTamu().get(j).setNoTelp(super.getTamu().get(j+1).getNoTelp());
                    super.getTamu().get(j+1).setNoTelp(Notelp);
                    // NOTE ini adalah type Customer
                    super.getTamu().get(j).setCustomerType(super.getTamu().get(j+1).getCustomerType());                    
                    super.getTamu().get(j+1).setCustomerType(type);
                    // NOTE ini adalah data anda
                    super.getTamu().get(j).setDataAnda(super.getTamu().get(j+1).getDataAnda());
                    super.getTamu().get(j+1).setDataAnda(Data);
                    // NOTE ini adalah jumlah kamar
                    super.getTamu().get(j).setJumlahKamar(super.getTamu().get(j+1).getJumlahKamar());
                    super.getTamu().get(j+1).setJumlahKamar(jumlahK);
                    // NOTE ini adalah no kamar
                    super.getTamu().get(j).setNoKamar(super.getTamu().get(j+1).getNoKamar());
                    super.getTamu().get(j+1).setNoKamar(noKamar);
                    // TODO jenis kamar
                } 
            }
        }
    }

    public void Sorting(ArrayList<bookingKamar> booking) {
        boolean status;
        String nama;
        String Notelp;
        String type;
        String Data;
        int jumlahK;
        String noKamar;
        String tglBook;
        for(int i = 0; i < super.getTamu().size(); i++) {
            for(int j = i; j < super.getTamu().size()-1; j++) {
                status = super.getTamu().get(j).getStatus();
                nama = super.getTamu().get(j).getNama();
                Notelp = super.getTamu().get(j).getNoTelp();
                type = super.getTamu().get(j).getCustomerType();
                Data = super.getTamu().get(j).getDataAnda();
                jumlahK = super.getTamu().get(j).getJumlahKamar();
                noKamar = super.getTamu().get(j).getNoKamar();
                tglBook = booking.get(j).getTglBooking();

                if(nama.charAt(0) > 
                   super.getTamu().get(j+1).getNama().charAt(0)) {
                    // NOTE ini adalah status Check In
                    super.getTamu().get(j).setCheckIn(super.getTamu().get(j+1).getStatus());
                    super.getTamu().get(j+1).setCheckIn(status);
                    // NOTE ini adalah Nama
                    super.getTamu().get(j).setNama(super.getTamu().get(j+1).getNama());
                    super.getTamu().get(j+1).setNama(nama);
                    // NOTE ini adalah No Telp
                    super.getTamu().get(j).setNoTelp(super.getTamu().get(j+1).getNoTelp());
                    super.getTamu().get(j+1).setNoTelp(Notelp);
                    // NOTE ini adalah type Customer
                    super.getTamu().get(j).setCustomerType(super.getTamu().get(j+1).getCustomerType());                    
                    super.getTamu().get(j+1).setCustomerType(type);
                    // NOTE ini adalah data anda
                    super.getTamu().get(j).setDataAnda(super.getTamu().get(j+1).getDataAnda());
                    super.getTamu().get(j+1).setDataAnda(Data);
                    // NOTE ini adalah jumlah kamar
                    super.getTamu().get(j).setJumlahKamar(super.getTamu().get(j+1).getJumlahKamar());
                    super.getTamu().get(j+1).setJumlahKamar(jumlahK);
                    // NOTE ini adalah no kamar
                    super.getTamu().get(j).setNoKamar(super.getTamu().get(j+1).getNoKamar());
                    super.getTamu().get(j+1).setNoKamar(noKamar);
                    // NOTE ini adalah tgl booking3
                    booking.get(j).setTglBooking(booking.get(j+1).getTglBooking());
                    booking.get(j+1).setTglBooking(tglBook);
                } 
            }
        }
    }

}
