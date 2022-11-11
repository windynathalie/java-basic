package tugas5_coba;

public class Person {
    private String fullName;
    private String domicile;
    private String identityCard;

    public Person() {

    }

    public Person(String fullName, String domicile, String identityCard) {
        this.fullName = fullName;
        this.domicile = domicile;
        this.identityCard = identityCard;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
