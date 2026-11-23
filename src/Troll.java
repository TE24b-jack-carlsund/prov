public class Troll extends Fiende {

    private int styrka;

    Troll(String namn, int hälsa, int styrka) {
        super(namn, hälsa);
        this.styrka = styrka;
    }
    
    public void förflyttning() {
        System.out.println("Herr Troll rör sig mot spelaren.");
    };

    public void attack() {
        System.out.println("Herr Troll slår mot dig!");
    };
}
