import java.util.ArrayList;
import java.util.InputMismatchException;

import javax.swing.*;

public class Main {
    /*
        Nama : Robert Wijaya
        NIM : 03082200011



        Exception handling memakai NumberFormatException
        Jika salah mennginput maka akan mengulang sampai menginput dengan benar.
    */
    public static void main(String[] args) {
        ArrayList<Tamu> tamuList = new ArrayList<Tamu>();
        ArrayList<Integer> total = new ArrayList<Integer>();
        ArrayList<Integer> jmlhNoKamar = new ArrayList<Integer>();

        int choice = 0;
        Admin admin = new Admin();
        
        Kamar kamar = new Kamar();
        
        jenisKamar jeniskamar = new jenisKamar();

        PenerimaanTamu pt = new PenerimaanTamu();

        Tamu tamu = new Tamu();

        alokasiKamar alokasi = new alokasiKamar();
        
        pt.setKamar(kamar);

        alokasi.AddTotalKamar(total);
        alokasi.setTotalKamar(total);

        // REVIEW
        

        kamar.AddJmlhNoKamar(jmlhNoKamar);
        kamar.setJmlhNoKamar(jmlhNoKamar);
        
        pt.setAdmin(admin);
        pt.setJenisKamar(jeniskamar);
        kamar.setJenisKamar(jeniskamar);
        // TODO add admin 

        admin.setJenisKamar(jeniskamar);

        boolean pilihan = true;
        int loop = 0;
        
        // pt.tampilkaBooking();
        while(pilihan || choice != 4) {
            boolean bool = true;
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog("1.Tamu\n2.Admin\n3.frontDesk\n4.Keluar"));        
            } catch (NumberFormatException e) {
                bool = false;
                JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                pilihan = true;                           
            }
            if(choice == 1) {
                int choiceTamu = 0;
                boolean inputTamu =  true;
                while(inputTamu) {
                    bool = true;
                    try {
                        choiceTamu = Integer.parseInt(JOptionPane.showInputDialog("1.Booking\n2.Check In\n3.Check Out\n4.Service\n5.Kembali"));
                    }
                    catch(NumberFormatException e) {
                        bool = false;
                        JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                        inputTamu = true;
                    }
                    if(choiceTamu < 1 || choiceTamu > 5) {
                        if(bool) {
                            inputTamu = true;
                            JOptionPane.showMessageDialog(null, "anda harus menginput 1-5", "salah!!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        inputTamu = false;
                    }
                }
                if(choiceTamu == 1) {
                    inputTamu = true;
                    int brpTamu = 0;
                    bool = true;
                    while(inputTamu) {
                        try {
                            brpTamu = Integer.parseInt(JOptionPane.showInputDialog("Berapa orang : "));
                        }
                        catch(NumberFormatException e) {
                            bool = false;
                            JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                            inputTamu = true;
                        }
                        if(brpTamu < 1) {
                            if(bool) {
                                inputTamu = true;
                                JOptionPane.showMessageDialog(null, "anda harus menginput 1-5", "salah!!", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else {
                            inputTamu = false;
                        }
                    }
                    int i = 1;
                    while(i <= brpTamu) {
                        tamu.setNama(JOptionPane.showInputDialog("Masukkan nama kamu :"));
                        tamu.setNoTelp(JOptionPane.showInputDialog("Masukkan No telp kamu :"));
                        tamu.setCustomerType(JOptionPane.showInputDialog("Anda adalah WNA/WNI ? "));                 
                        String tampil = tamu.setData();
                        tamu.setDataAnda(JOptionPane.showInputDialog(tampil));
                        boolean choices = true;
                        bool = true;
                        while(choices) {
                            try {
                                tamu.setJumlahKamar(Integer.parseInt(JOptionPane.showInputDialog("jumlah kamar dipesan :")));
                            }
                            catch(NumberFormatException e) {
                                bool = false;
                                JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                                choices = true;
                            }
                            if(tamu.getJumlahKamar() < 1 || tamu.getJumlahKamar() == 0) {
                                if(bool) {
                                    choices = true;
                                    JOptionPane.showMessageDialog(null, "anda harus menginput angka ", "salah!!", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                choices = false;
                            }
                        }
                        choices = true;
                        bool = true;
                        while(choices) {
                            try {
                                pt.setLama(Integer.parseInt(JOptionPane.showInputDialog("berapa hari : ")));
                            }
                            catch(NumberFormatException e) {
                                bool = false;
                                JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                                choices = true;
                            }
                            if(pt.getLama() < 1 || pt.getLama() == 0) {
                                if(bool) {
                                    choices = true;
                                    JOptionPane.showMessageDialog(null, "anda harus menginput angka ", "salah!!", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                choices = false;
                            }
                        }
                        bookingKamar booking = new bookingKamar();
                        // pt.setBooking(booking);
                        booking.setTglBooking(JOptionPane.showInputDialog("Tanggal booking anda hari ini : "));
                        booking.setTglCheckIn(JOptionPane.showInputDialog("Masukkan tanggal Check-In kamu (tanggal-bulan-tahun) : "));
                        admin.tambahkanBooking(booking.getTglBooking(), booking.getTglCheckIn());
                        pt.tambahkanBooking(booking.getTglBooking(), booking.getTglCheckIn());
                        tamu.getcheckIn();  
                        choices = true;
                        bool = true;
                        while(choices) {
                            try {
                                jeniskamar.setjenisK(Integer.parseInt(JOptionPane.showInputDialog("1.Standard Room Rp.250.000\n2.Superior Room Rp.300.000\n3.Deluxe Room Rp.350.000\n4.Suite Room Rp400.000\n5.President Room Rp.500.000")));
                            }
                            catch(NumberFormatException e) {
                                bool = false;
                                JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                                choices = true;
                            }
                            if(jeniskamar.getJenisK() < 1 || jeniskamar.getJenisK() > 5) {
                                if(bool) {
                                    choices = true;
                                    JOptionPane.showMessageDialog(null, "anda harus menginput 1-5", "salah!!", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                choices = false;
                            }
                        }
                        tamu.setJenisKamar(jeniskamar.getJenisK());
                        alokasi.setTamu(tamu);
                        if(alokasi.getTotalKamar().get(tamu.getJenisKamar()-1) < tamu.getJumlahKamar()) {
                            JOptionPane.showMessageDialog(null, "anda menginput kamar yang berlebihan!!!");            
                            break;
                        }
                        String noKmr = "No kamar : ";
                        int a;
                        int b;
                        a = jeniskamar.getJenisK();
                        b = tamu.getJumlahKamar();
                        int z = 1;
                        for(int no = kamar.getJmlhNoKamar().get(a-1) + 1; no <= b + kamar.getJmlhNoKamar().get(a-1); no++) {    
                            kamar.setNoKamar(Integer.toString(no));
                            noKmr += kamar.getNoKamar() + ",";
                        }
                        tamu.setNoKamar(noKmr);
                        pt.tambahkanTamu(tamu.getNama(), tamu.getNoTelp(), tamu.getCustomerType(), tamu.getJumlahKamar(), tamu.getJenisKamar(), tamu.getDataAnda(), tamu.getStatus(), tamu.getNoKamar());
                        admin.tambahkanTamu(tamu.getNama(), tamu.getNoTelp(), tamu.getCustomerType(), tamu.getJumlahKamar(), tamu.getJenisKamar(), tamu.getDataAnda(), tamu.getStatus(), tamu.getNoKamar());                        
                        tamuList.add(tamu);
                        pt.TotalHarga(tamu);
                        tampil = pt.tampilkanBooking();
                        JOptionPane.showMessageDialog(null, tampil);
                        kamar.pertambahanNoKamar(tamuList);
                        alokasi.penguranganKamar();
                        choices = true;
                        i++;
                    }
                }
                else if(choiceTamu == 2) {
                    // TODO input total hasil
                    String nama = "";
                    inputTamu = true;
                    bool = true;
                    while(inputTamu) {
                        try {
                            nama = JOptionPane.showInputDialog("Masukkan nama kamu :");
                        }
                        catch(NumberFormatException e) {
                            bool = false;
                            JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                            inputTamu = true;
                        }
                        if(nama.equals("")) {
                            inputTamu = true;
                            JOptionPane.showMessageDialog(null, "anda menginput kosong", "salah!!", JOptionPane.ERROR_MESSAGE);
                        }
                        else {
                            inputTamu = false;
                        }
                    }
                    String cek = pt.pengecekkanCheckIn(nama);
                    JOptionPane.showMessageDialog(null, cek);
                    System.out.println(cek);
                    if(cek.equals("Benar!!!")) {
                        String tampil = pt.tampilkanCheckIn(nama);
                        JOptionPane.showMessageDialog(null, tampil);
                    }
                }
                else if(choiceTamu == 3) {
                    inputTamu = true;
                    String nama = "";
                    bool = true;
                    while(inputTamu) {
                        try {
                            nama = JOptionPane.showInputDialog("Masukkan nama kamu :");
                        }
                        catch(NumberFormatException e) {
                            bool = false;
                            JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                            inputTamu = true;
                        }
                        if(nama.equals("")) {
                            inputTamu = true;
                            JOptionPane.showMessageDialog(null, "anda menginput kosong", "salah!!", JOptionPane.ERROR_MESSAGE);
                        }
                        else {
                            inputTamu = false;
                        }
                    }
                    pt.checkOut(nama, total, jmlhNoKamar);
                }
                else if(choiceTamu == 4) {
                    int service;
                    service = Integer.parseInt(JOptionPane.showInputDialog("1.makanan\n2.jus\n3.Snack\n4.Soda"));
                    String makanan = "1.Spaggeti Rp.250.000\n2.Fried Rice Rp.100.000\n3.Seafood Fried Rice Rp.200.000";
                    if(service == 1) {
                        int food = Integer.parseInt(JOptionPane.showInputDialog(makanan));
                        if(food == 1) admin.setPenghasilan(250000.0);
                        else if(food == 2) admin.setPenghasilan(100000.0);
                        else if(food == 3) admin.setPenghasilan(200000.0);
                    }
                    else if(service == 2) {
                        makanan = "1.Orange Juice Rp.30.000 \n2.Avocado Juice Rp.50.000\n3.Lemonade Rp.55.000";
                        int drink = Integer.parseInt(JOptionPane.showInputDialog(makanan));
                    
                        if(drink == 1) admin.setPenghasilan(30000.0);
                        else if(drink == 2) admin.setPenghasilan(50000.0);
                        else if(drink == 3) admin.setPenghasilan(55000.0);
                    }
                    else if(service == 3) {
                        makanan = "1.Cheetos Rp.10.000\n2.Lays Rp.10.000";
                        int Snack = Integer.parseInt(JOptionPane.showInputDialog(makanan));
                        if(Snack == 1) admin.setPenghasilan(10000.0);
                        else if(Snack == 2) admin.setPenghasilan(10000.0);
                    }
                    else if(service == 4) {
                        makanan = "1.Coca Cola Rp.10.000\n2.Sprite Rp.10.000";
                        int soda = Integer.parseInt(JOptionPane.showInputDialog(makanan));
                        if(soda == 1) admin.setPenghasilan(10000.0);
                        else if(soda == 2) admin.setPenghasilan(10000.0);
                    }
                }
            }
            else if(choice == 4) pilihan = false;
            else if((choice < 1 || choice > 4 || choice == 0)) {
                if(bool) {
                    pilihan = true; 
                    JOptionPane.showMessageDialog(null, "Anda harus menginput 1-4", "salah!!", JOptionPane.ERROR_MESSAGE);   
                }
            }
            else if(choice == 2) {
                boolean inputAdmin = true;
                JPasswordField pf = new JPasswordField();
                int okCxl = 0;
                okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);                 
                if (okCxl == JOptionPane.OK_OPTION) {
                    String password = new String(pf.getPassword());
                    if(password.equals("OOP")) {
                        String daftar = "";
                        int inputHasilAdmin = 0;
                        bool = true;
                        while(inputAdmin) {
                            try {
                                inputHasilAdmin = Integer.parseInt(JOptionPane.showInputDialog("1.Penghasilan\n2.Daftar Tamu\n3.Sisa Kamar\n4.Write dan Read\n5.Kembali"));                        
                            }
                            catch(NumberFormatException e) {
                                bool = false;
                                JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                                inputAdmin = true;
                            }
                            if(inputHasilAdmin < 1 || inputHasilAdmin > 5) {
                                if(bool) {
                                    inputAdmin = true;
                                    JOptionPane.showMessageDialog(null, "Anda harus menginput 1 -3", "salah!!", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                inputAdmin = false;
                            }
                        }
                        if(inputHasilAdmin == 1) {
                            JOptionPane.showMessageDialog(null, "Total Penghasilan anda : " + admin.getPenghasilan());
                        }
                        else if(inputHasilAdmin == 2) {
                            //FIXME
                            daftar = admin.daftarTamu();
                            JOptionPane.showMessageDialog(null, daftar);
                        }
                        else if(inputHasilAdmin == 3) {
                            daftar = admin.daftarTotalKamar(total);
                            JOptionPane.showMessageDialog(null, daftar);
                        }
                        else if(inputHasilAdmin == 4) {
                            readWrite rWrite = new readWrite();
                            admin.setReadWrite(rWrite);
                            JOptionPane.showMessageDialog(null, admin.writeRead());
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Password anda SALAH!!!", " ", JOptionPane.ERROR_MESSAGE);  
                        pf.removeNotify();
                    }
                    choice = 0;
                }   
            }
            else if(choice == 3) {
                boolean inputDesk = true;
                int inputHasilDesk = 0;
                bool = true;
                while(inputDesk) {
                    try {
                        inputHasilDesk = Integer.parseInt(JOptionPane.showInputDialog("1.Bubble Sort\n2.Selection Sort"));                        
                    }
                    catch(NumberFormatException e) {
                        bool = false;
                        JOptionPane.showMessageDialog(null, "ERROR : Hanya boleh input angka saja!!!", "salah!!", JOptionPane.ERROR_MESSAGE);
                        inputDesk = true;
                    }
                    if(inputHasilDesk < 1 || inputHasilDesk > 2) {
                        if(bool) {
                            inputDesk = true;
                            JOptionPane.showMessageDialog(null, "Anda harus menginput 1 -2", "salah!!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        inputDesk = false;
                    }
                }
                if(inputHasilDesk == 1) {
                    frontDesk desk = new frontDesk(admin.getTamu());
                    desk.Sorting();
                }
                else if(inputHasilDesk == 2) {
                    frontDesk desk = new frontDesk(admin.getTamu());
                    desk.Sorting(admin.getBooking());
                }
                choice = 0;
            }
            else pilihan = false;
        }
    }
}