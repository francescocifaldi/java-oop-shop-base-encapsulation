import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto p1 = new Prodotto("Caffè", "Lavazza", 2.5, 22);
        Prodotto p2 = new Prodotto();

        System.out.println("Prodotto 1: " + p1.getFullName() + ", Prezzo finito: " + p1.getPrezzoFinale());
        System.out.println("Prodotto 2: " + p2.getFullName() + ", Prezzo finito: " + p2.getPrezzoFinale());
    }
}
