public class Wolf implements Animal {
    public Wolf(int satiation) {
        Main.numAnimals += 1;
        this.wolfSatiation = satiation;
        this.wolfSatiation = 0;
    }
    private int getSatiation() {
        return this.wolfSatiation;
    }
    private void increaseSatiation() {
        this.wolfSatiation++;
    }

    @Override
    public void hunt() {
        System.out.println("I'm a wolf so I have to share my meal with my other pack members. My satiation level increases by 1 point.");
        this.wolfSatiation++;
        System.out.println("This wolf's new satiation level: " + this.wolfSatiation);
    }
    @Override
    public void move() {
        System.out.println("Run around with my four legs with my pack.");
    }
}