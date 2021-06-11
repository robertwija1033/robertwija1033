class tabung extends kubus {
    private double volumeTabung, luasTabung;

    tabung(Double s) {
        super(s);
        this.volumeTabung = ((double) 22/7) * (s * s * 30);
        this.luasTabung = 2 * ((double) 22/7) * s * (s + 30);
    }
    // Membuat Getter
    public String getTabung() {
        return "volume Tabung di dalam Kubus= " + volumeTabung+ "\nLuas Tabung di dalam Kubus= " + luasTabung;
    }

    // Membuat Setter
    public void setTabung(double s) {
        this.volumeTabung = ((double) 22/7) * (s * s * 30);
        this.luasTabung = 2 * ((double) 22/7) * s * (s + 30);
    }
}