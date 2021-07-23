import java.util.ArrayList;

class Kamar  {
    private String noKamar;
    private jenisKamar jeniskamar;
    private ArrayList<Integer> jmlhNoKamar;
    private Tamu tamu;
        
    public Kamar() {
    }

    public Kamar(String noKamar, jenisKamar jeniskamar) {
        this.noKamar = noKamar;

        if(jeniskamar.getJenisK() == 1) { 
            this.noKamar = "STA ";  
        }
        else if(jeniskamar.getJenisK() == 2) {
            this.noKamar = "SUP ";
        }
        else if(jeniskamar.getJenisK() == 3) {
            this.noKamar = "DEL ";   
        }
        else if(jeniskamar.getJenisK() == 4) {
            this.noKamar = "SUI ";   
        }
        else {
            this.noKamar = "PRE ";
        }       
        this.noKamar += noKamar;
    }   

    public String getNoKamar() {
        return this.noKamar;
    }

    public void setNoKamar(String noKamar) {
        if(jeniskamar.getJenisK() == 1) {
            // tamu.getJumlahKamar() > 500;            
            this.noKamar = "STA ";  
        }
        else if(jeniskamar.getJenisK() == 2) {
            this.noKamar = "SUP ";
        }
        else if(jeniskamar.getJenisK() == 3) {
            this.noKamar = "DEL ";   
        }
        else if(jeniskamar.getJenisK() == 4) {
            this.noKamar = "SUI ";   
        }
        else if(jeniskamar.getJenisK() == 5) {
            this.noKamar = "PRE ";
        }       
        this.noKamar += noKamar;
    }      

    public jenisKamar getJenisKamar() {
        return this.jeniskamar;
    }

    public void setJenisKamar(jenisKamar jeniskamar) {
        this.jeniskamar = jeniskamar;
    }
     
    public void AddJmlhNoKamar(ArrayList<Integer> jmlhNoKamar) {
        jmlhNoKamar.add(0); 
        jmlhNoKamar.add(0);
        jmlhNoKamar.add(0);
        jmlhNoKamar.add(0);
        jmlhNoKamar.add(0);
    }

    public ArrayList<Integer> getJmlhNoKamar() {
        return this.jmlhNoKamar;
    }

    public void setJmlhNoKamar(ArrayList<Integer> jmlhNoKamar) {
        this.jmlhNoKamar = jmlhNoKamar;
    }

    public void pertambahanNoKamar(ArrayList<Tamu> tamu) {
        for (Tamu tamu2 : tamu) {
            if(tamu2.getJenisKamar() == 1  && jmlhNoKamar.get(0) <= 500) {
                int jmlh = jmlhNoKamar.get(0);
                jmlh += tamu2.getJumlahKamar();
                jmlhNoKamar.set(0, jmlh);
                break;
            }
            else if(tamu2.getJenisKamar() == 2 && jmlhNoKamar.get(1) <= 300) {
                int jmlh = jmlhNoKamar.get(1);
                jmlh += tamu2.getJumlahKamar();
                jmlhNoKamar.set(1, jmlh);
                break;
            }
            else if(tamu2.getJenisKamar() == 3 && jmlhNoKamar.get(2) <= 100) {
                int jmlh = jmlhNoKamar.get(2);
                jmlh += tamu2.getJumlahKamar();
                jmlhNoKamar.set(2, jmlh);
                break;
            }
            else if(tamu2.getJenisKamar() == 4 && jmlhNoKamar.get(3) <= 90) {
                int jmlh = jmlhNoKamar.get(3);
                jmlh += tamu2.getJumlahKamar();
                jmlhNoKamar.set(3, jmlh);
                break;
            }
            else if(tamu2.getJenisKamar() == 5 && jmlhNoKamar.get(4) <= 10) {
                int jmlh = jmlhNoKamar.get(4);
                jmlh += tamu2.getJumlahKamar();
                if(jmlh > 10) {
                    jmlhNoKamar.set(4, 10);
                    System.out.println(jmlhNoKamar);
                    break;
                }
                jmlhNoKamar.set(4, jmlh);
                break;
            }
        }
    }
}