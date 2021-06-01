import java.util.Scanner;

class kubus {
    int volume, luas;
    kubus(int s) {
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
        System.out.println("Volume Kubus = " + sisi.volume);
        System.out.println("Luas Kubus = " + sisi.luas);
    }
}