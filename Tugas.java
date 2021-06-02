import java.util.Scanner;

class kubus {
    // Membuat private biar tidak gampang diaccess
    private int volume, luas;

    // Membuat Constructor
    kubus(int s) {
        this.volume = s * s * s;
        this.luas = 6 * s * s;
    }

    // Membuat Getter
    public String getKubus() {
        return "volume = " + volume + "\nLuas = " + luas;
    }

    // Membuat Setter
    public void setKubus(Integer s) {
        this.volume = s * s * s;
        this.luas = 6 * s * s;
    }
}

public class Tugas {
    public static void main(String[] args) {
        Scanner rw = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int Sisi = rw.nextInt();
        rw.nextLine();
        rw.close();
        
        kubus sisi = new kubus(Sisi);

        sisi.setKubus(Sisi);
        System.out.println(sisi.getKubus());
    }
}