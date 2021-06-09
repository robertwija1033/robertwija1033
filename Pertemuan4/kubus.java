class kubus {
    // Membuat private biar tidak gampang diaccess
    private double volumeKubus, luasKubus;

    // Membuat Constructor
    kubus(Double s) {
        this.volumeKubus = ((s*2) * (s*2) * (s*2));
        this.luasKubus = 6 * ((s*2) * (s*2));
    }

    // Membuat Getter
    public String getKubus() {
        return "volume = " + volumeKubus + "\nLuas = " + luasKubus;
    }

    // Membuat Setter
    public void setKubus(Double s) {
        this.volumeKubus = ((s*2) * (s*2) * (s*2));
        this.luasKubus = 6 * ((s*2) * (s*2));
    }
}