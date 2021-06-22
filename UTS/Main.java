class Main {
    /* 
        Nama : Robert Wijaya
        Studentid : 03082200011
    */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Robert Wijaya", "03082200011", false);
        Matakuliah mtk1 = new Matakuliah("Database", "ISYS6123", 2);

        Matakuliah mtk2 = new Matakuliah("PBO", "ISYS1111", 4);
        Matakuliah mtk3 = new Matakuliah("User Experience", "ISYS6596", 4);

        KartuHasilStudi khs = new KartuHasilStudi(mhs, 2);

        khs.tambahkanNilai(mtk1, 'A');
        khs.tambahkanNilai(mtk2, 'C');
        khs.tambahkanNilai(mtk3, 'D');    

        khs.tampilkanKhs();
    }
}