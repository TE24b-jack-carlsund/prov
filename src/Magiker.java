public class Magiker extends Fiende {

    private int mana;

    Magiker(String namn, int hälsa, int mana) {
        super(namn, hälsa);
        this.mana = mana;
    }

    public void förflyttning() {
        System.out.println("Fru Magiker rör sig mot spelaren");
    };

    public void attack() {
        System.out.println("Fru Magiker skjuter mana-blixtar");
    };

}
