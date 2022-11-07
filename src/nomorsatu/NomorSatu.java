package nomorsatu;

public class NomorSatu {
    public void print(String string) {
        System.out.println(string);
    }

    public static void main(String[] args) throws Exception {
        String firstName = "Windy Nathalie";
        String lastName = "Ong";
        String birthPlace = "Makassar";
        String birthYear = "2000";
        String progLangFav = "Javascript";

        NomorSatu nomorsatu = new NomorSatu();
        nomorsatu.print(firstName);
        nomorsatu.print(lastName);
        nomorsatu.print(birthPlace);
        nomorsatu.print(birthYear);
        nomorsatu.print(progLangFav);
    }
}
