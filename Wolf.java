public class Wolf implements Animal {
    private int satiation;
    public Wolf() {
        Main.numAnimals += 1;
    }
    public int getSatiation() {
        return this.satiation;
    }
    @Override
    public void hunt() {
        System.out.println("I'm a wolf so I have to share my meal with my other pack members. My satiation level increases by 1 point.");
        satiation += 1;
        System.out.println("This wolf's new satiation level: " + satiation);
    }
    @Override
    public void move() {
        System.out.println("Run around with my four legs with my pack.");
    }
}