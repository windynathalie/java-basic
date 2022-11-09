package tugas3;

public class Prisma extends Segitiga {
    private int tinggiPrisma;

    // constructor with parameter
    public Prisma(int alas, int tinggi, int tinggiPrisma) {
        super(alas, tinggi);
        this.tinggiPrisma = tinggiPrisma;
    }

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public int hitungVolume() {
        return super.hitungLuas() * this.tinggiPrisma;
    }

    @Override
    public int hitungKeliling() {
        return super.hitungKeliling();
    }

    @Override
    public int hitungLuas() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * this.tinggiPrisma);
    }

    public void getPrisma() {
        super.getSegitiga();
        System.out.println("Volume: " + this.hitungVolume() + " cm^3");
    }
}