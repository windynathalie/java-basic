package tugas3;

public class Kubus extends Persegi {
    public Kubus(int sisi) {
        super(sisi);
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.getSisi();
    }

    @Override
    public int hitungKeliling() {
        return (12 * this.getSisi());
    }

    @Override
    public double hitungLuas() {
        return super.hitungLuas() * 6;
    }

    public void getKubus() {
        super.getPersegi();
        System.out.println("Volume: " + this.hitungVolume() + " cm^3");
    }
}
