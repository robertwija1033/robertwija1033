public class Tugas6 {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);

        
        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        // matakuliah mataKuliah1 = new matakuliah("Struktur", "12.20", "3");
        // matakuliah mataKuliah2 = new matakuliah("Struktur", "12.20", "3");
        // matakuliah mataKuliah3 = new matakuliah("Struktur", "12.20", "3");

        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);

        // JadwalKuliah.tambahMataKuliah(mataKuliah1);
        // JadwalKuliah.tambahMataKuliah(mataKuliah2);
        // JadwalKuliah.tambahMataKuliah(mataKuliah3);

        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println();

    }
}