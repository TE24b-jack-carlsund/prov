public class App {

    void main() {

        Fiende[] monster = new Fiende[2];

        monster[0] = new Troll("Herr Troll", 80, 100);
        monster[1] = new Magiker("fru Magiker", 50, 25);

        System.out.println("--- Börjar striden! ---");

        for (Fiende f : monster) {
            f.förflyttning();
            f.attack();
        }
    }
}
