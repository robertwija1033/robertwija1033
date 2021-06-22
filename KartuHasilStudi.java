import java.util.ArrayList;

public class KartuHasilStudi {
    Integer semester;
    Mahasiswa mahasiswa;
    ArrayList<NilaiStudi> listNilaiStudi = new ArrayList<NilaiStudi>();

    public KartuHasilStudi(Mahasiswa mahasiswa, Integer semester) {
        this.mahasiswa = mahasiswa;
        this.semester = semester;
    }

    public Integer getSemester() {
        return this.semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public Integer hitungTotalSks() {
        Integer totalSks = 0;
        for (int i = 0; i < this.listNilaiStudi.size(); i++) {
            totalSks += this.listNilaiStudi.get(i).getMatakuliah().getSks();
        }
        return totalSks;
    }

    public Double getIpk() {
        Double result = 0.0;
        Integer totalSks = hitungTotalSks();

        for (int i = 0; i < this.listNilaiStudi.size(); i++) {
            result += (this.listNilaiStudi.get(i).getNilaiAngka() * this.listNilaiStudi.get(i).getMatakuliah().getSks()) / totalSks;
        }
        return result;
    }

    public void tampilkanKhs() {
        Integer totalSks = hitungTotalSks();

        System.out.println("Nama Mahasiswa\t: " + this.mahasiswa.getNama());
        System.out.println("Semester\t\t: " + this.semester);
        System.out.printf("IPK\t\t\t: %.2f\n", getIpk());
        System.out.println("Total SKS\t\t: " + totalSks + "\n");
        System.out.println("Nilai : ");
        System.out.println("\tNo.\t\tKode Matakuliah\t\tNama Matakuliah\t\tSkS\t\tNilai");
        for (int i = 0; i < listNilaiStudi.size(); i++) {
            System.out.printf("%10d%22s%25s%17d%16c\n", i+1, this.listNilaiStudi.get(i).getMatakuliah().getKodeMatakuliah(), this.listNilaiStudi.get(i).getMatakuliah().getNamaMatakuliah(), this.listNilaiStudi.get(i).getMatakuliah().getSks(), this.listNilaiStudi.get(i).nilaiHuruf);
        }
    }

    public void tambahkanNilai(Matakuliah matakuliah, char nilaiHuruf) {
        NilaiStudi nilaiMtk = new NilaiStudi(matakuliah, nilaiHuruf);
        this.listNilaiStudi.add(nilaiMtk);
    }
}