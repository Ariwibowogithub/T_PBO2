public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "Balap", "Polygon");
        System.out.println("Jumlah gear " + sepedaBalap.gear);
        sepedaBalap.ngerem();

        Sepeda sepedaBayi = new Sepeda(3, "Bayi", "Pacific");
        System.out.println("Jumlah gear " + sepedaBayi.gear);
        sepedaBayi.ngerem();

        Sepeda sepedaGunung = new Sepeda(2, "Gunung", "Wimcycle");
        System.out.println("Jumlah gear " + sepedaGunung.gear);
        sepedaGunung.ngerem();

    }
}
