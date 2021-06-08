import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        char Lanjut = 'y';
        Scanner rw = new Scanner(System.in);
        
        do{
            System.out.print("Masukkan nilai : ");
            int Sisi = rw.nextInt();
            rw.nextLine();

            kubus sisi = new kubus(Sisi);
            
            sisi.setKubus(Sisi);
            System.out.println(sisi.getKubus());

            
            System.out.print("Lanjut ? [y/n] : ");
            Lanjut = rw.next().charAt(0);
            rw.nextLine();
        }while(Lanjut =='y' || Lanjut == 'Y');
        rw.close();
    }
}

