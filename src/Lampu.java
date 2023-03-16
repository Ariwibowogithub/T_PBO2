public class Lampu {
    boolean nyala;

    void nyalakanLampu() {
        nyala = true;
    }

    void matikanLampu() {
        nyala = false;
    }

    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        lampu.nyalakanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.nyala);
        lampu.matikanLampu();
        System.out.println("Apakah lampu menyala? " + lampu.nyala);
    }
}
