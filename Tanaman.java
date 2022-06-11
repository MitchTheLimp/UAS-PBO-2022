public class Tanaman {
    int masaHidup;
    int lamaHidup;
    int berbuah;
    int buah;
    double perkembangan;
    double prosesBerbuah;

    void berkembang (){

    }
    void status(){
        if (lamaHidup >= masaHidup) {
            System.out.println("Tanaman Mati");
        } else {
            System.out.println("Masa Hidup Tanaman = "+ getMasaHidup());
            System.out.println("Lama hidup Tanaman = "+ getLamaHidup());
            System.out.println("Menghasilkan"+ getBerbuah()+"buah");
        }
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }
}
