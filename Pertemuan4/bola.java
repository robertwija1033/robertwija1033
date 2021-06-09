class bola extends tabung {
    private double volumeBola, luasBola;
    
    bola(double r) {
        super(r);
        this.volumeBola = ((double) 4/3) * ((double) 22/7) * (r * r * r);
        this.luasBola = ((double) 4) * ((double) 22/7) * (r * r);
    }

    //Membuat Getter
    public String getBola() {
        return "volume = " + volumeBola + "\nLuas = " + luasBola;
    }

    // Membuat Setter
    public void setBola(Double r) {
        this.volumeBola = ((double) 4/3) * ((double) 22/7) * (r * r * r);
        this.luasBola = ((double) 4) * ((double) 22/7) * (r * r);
    }
} 