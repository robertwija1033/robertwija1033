class matakuliah {
    String nama;
    String jam;
    String SKS;
    String kelas;

    public matakuliah() {
    }

    matakuliah(String nama, String jam, String SKS, String kelas) {
        this.nama = nama;
        this.jam = jam;
        this.SKS = SKS;
        this.kelas = kelas;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getSKS() {
        return this.SKS;
    }

    public void setSKS(String SKS) {
        this.SKS = SKS;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t" +
            " " + getJam() + "\t\t" +
            " " + getSKS() + "'" +
            " " + getKelas() + "'" +
            "}";
    }   
}
