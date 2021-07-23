import java.util.ArrayList;

class alokasiKamar {
    private static ArrayList<Integer> totalKamar = new ArrayList<Integer>();
    private Tamu tamu;

    public alokasiKamar() {
    }

    public void AddTotalKamar(ArrayList<Integer> totalKamar) {
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
        totalKamar.add(50);
    }

    public static ArrayList<Integer> getTotalKamar() {
        return totalKamar;
    }

    public void setTotalKamar(ArrayList<Integer> totalKamar) {
        alokasiKamar.totalKamar = totalKamar;
    }

    public Tamu getTamu() {
        return this.tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public void penguranganKamar() {
        int total;
        total = totalKamar.get(tamu.getJenisKamar()-1);
        total -= tamu.getJumlahKamar();
        totalKamar.set(tamu.getJenisKamar()-1, total);
    }
}
