package tugas3;

public class Bola extends Lingkaran {

    public Bola(int r) {
        super(r);
    }

    public double hitungVolume() {
        return super.hitungLuas() * this.getR() * 4 / 3;
    }

    @Override
    public double hitungLuas() {
        return super.hitungLuas() * 4;
    }

    @Override
    public double hitungKeliling() {
        return super.hitungLuas() * 4 / 3;
    }

    public void getBola() {
        super.getLingkaran();
        System.out.println("Volume: " + this.hitungVolume() + " cm^3");
    }
}
