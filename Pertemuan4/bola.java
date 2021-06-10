class bola {
    private double volumeBola, luasBola;
    
    bola(double r) {
        this.volumeBola = ((double) 4/3) * ((double) 22/7) * (r * r * r);
        this.luasBola = ((double) 4) * ((double) 22/7) * (r * r);
    }

    //Membuat Getter
    public String getBola() {
        return "volume Bola di dalam Tabung = " + volumeBola + "\nLuas Bola di dalam Tabung = " + luasBola;
    }

    // Membuat Setter
    public void setBola(Double r) {
        this.volumeBola = ((double) 4/3) * ((double) 22/7) * (r * r * r);
        this.luasBola = ((double) 4) * ((double) 22/7) * (r * r);
    }
} 
