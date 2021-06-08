import java.util.Scanner;

public class Tugas2 {
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
