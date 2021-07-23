import javax.print.attribute.standard.MediaSize.NA;
import javax.xml.crypto.Data;
import javax.swing.JOptionPane;
import java.util.ArrayList;
// import jdk.javadoc.internal.doclets.formats.html.markup.TagName;

import java.util.Scanner;
class Tamu {
    private boolean checkIn;
    private String Nama;
    private String noTelp;
    private String customerType;
    private String DataAnda;
    private int jumlahKamar;
    private String noKamar;
    private int jenisKamar;
    
    public Tamu() {
    }

    public Tamu(String Nama) {
        this.Nama = Nama;
    }

    // REVIEW jumlah kamar
    public Tamu(String Nama, String noTelp, String customerType, int jumlahKamar, int jenisKamar, String DataAnda, boolean checkIn, String noKamar) {
        this.Nama = Nama;
        this.noTelp = noTelp;
        this.customerType = customerType;
        this.jumlahKamar = jumlahKamar;
        this.jenisKamar = jenisKamar;
        this.DataAnda = DataAnda;
        this.checkIn = checkIn;
        this.noKamar = noKamar;
    }

    public Boolean getStatus() {
        return this.checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    // STUB check in    
    public void getcheckIn() {
        setCheckIn(true);
    }

    public void setJenisKamar(int jenisKamar) {
      this.jenisKamar = jenisKamar;
    }

    public int getJenisKamar() {
      return this.jenisKamar;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    
    public String getDataAnda() {
        return this.DataAnda;
    }

    public void setDataAnda(String DataAnda) {
        this.DataAnda = DataAnda;
    }

    public String setData() {
        if(this.customerType.equals("WNA")) {
            String Passport = "";
            Passport = "Anda adalah WNA, Input Passport anda : ";
            return Passport;
        }
        else {
            String KTP = "";
            KTP = "Anda adalah WNI, Input KTP anda : ";
            return KTP;
        }
    }

    public Integer getJumlahKamar() {
        return this.jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public String getNoKamar() {
        return this.noKamar;
    }

    public void setNoKamar(String noKamar) {
        this.noKamar = noKamar;
    }
}