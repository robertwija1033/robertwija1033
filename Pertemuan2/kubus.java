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