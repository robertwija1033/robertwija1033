import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    /*
        Nama : Robert Wijaya
        NIM : 03082200011

        Penyimpanan data dari Admin Daftar Tamu
    */

class readWrite {
    File tamu;
    ArrayList<Tamu> guest = new ArrayList<Tamu>();

    public readWrite() {
        tamu = createFile();    
    }

    public File createFile() {
        File tamu = new File("input.txt");
        try {
            if(tamu.createNewFile()) {
                System.out.println("File created : " + tamu.getName());
                return tamu;
            }
            else {
                System.out.println("\nTamu have already!!!");
                return tamu;
            }
        }catch(IOException exc) {
            System.out.println("ERRORRRR : ");
            exc.printStackTrace();
        }
        return tamu;
    }

    public void writeData(Tamu tamu) {
        try {
            FileWriter fileOutput = new FileWriter("input.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
            bufferedWriter.write(tamu.getNama());
            bufferedWriter.write("-" + tamu.getNoTelp());
            bufferedWriter.write("-" + tamu.getCustomerType() + " " + tamu.getDataAnda());
            bufferedWriter.write("-" + tamu.getJumlahKamar().toString());
            bufferedWriter.write("-" + tamu.getStatus().toString());
            bufferedWriter.write("-" + tamu.getJenisKamar());
            bufferedWriter.write("-" + tamu.getNoKamar());
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch(IOException exc) {
            System.out.println("Error : ");
            exc.printStackTrace();
        }
    }

    public String readData() {
        try {
            FileReader fileInput = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileInput);
            Scanner scanner = new Scanner(bufferedReader);
            String data = "";
            while(scanner.hasNext()) {
                data = scanner.nextLine() + "\n";
            }
            return data;
        }catch(IOException exc) {
            System.out.println("Error : ");
            exc.printStackTrace();
        }
        return "";
    }
    
    public void toTamuObject() {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(reader);
            boolean status = false;
            String nama = "";
            String Notelp = "";
            String type = "";
            String Data = "";
            int jumlahK = 0;
            int jenisKamar = 0;
            String noKamar = "";
            int a = 0;
            while(scanner.hasNext())  {
                String[] data = scanner.nextLine().split("-");
                for(int i = 0; i < data.length; i++) {
                    if(i == 0) nama = data[i];
                    else if(i == 1) Notelp = data[i];
                    else if(i == 2) {
                        String datas[] = data[i].split(" ");
                        type = datas[0];
                        Data = datas[1];
                    }
                    else if(i == 3) jumlahK = Integer.parseInt(data[i]);
                    else if(i == 4) status = Boolean.parseBoolean(data[i]);
                    else if(i == 5) jenisKamar = Integer.parseInt(data[i]);
                    else noKamar = data[i];
                }
                Admin CEO = new Admin();
                CEO.tambahkanTamu(nama, Notelp, type, jumlahK, jenisKamar, Data, status, noKamar);
                guest.addAll(CEO.getTamu());
            }
        }catch(IOException exc) {
            System.out.println("ERROR : ");
            exc.printStackTrace();
        }
    }
}
