import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        char Lanjut = 'y';
        Scanner rw = new Scanner(System.in);
        do{
            System("cls");
            System.out.print("Masukkan nilai : ");
            double Jari_Jari = rw.nextDouble();
            rw.nextLine();
            bola jari_jari = new bola(Jari_Jari);
            
            System.out.println("Kubus : ");
            jari_jari.setKubus(Jari_Jari);
            System.out.println(jari_jari.getKubus());

            System.out.println("Tabung di dalam kubus : ");
            jari_jari.setTabung(Jari_Jari);
            System.out.println(jari_jari.getTabung());

            System.out.println("Bola di dalam tabung : ");
            jari_jari.setBola(Jari_Jari);
            System.out.println(jari_jari.getBola());

            System.out.print("Lanjut ? [y/n] : ");
            Lanjut = rw.next().charAt(0);
            rw.nextLine();
        }while(Lanjut =='y' || Lanjut == 'Y');
        rw.close();
    }
}