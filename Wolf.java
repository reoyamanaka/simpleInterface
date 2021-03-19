public class Wolf implements Animal {
    private int satiation;
    @Override
    public void hunt() {
        System.out.println("I'm a wolf so I have to share my meal with my other pack members. My satiation level increases by 1 point.");
        satiation += 1;
        System.out.println("Satiation level: " + satiation);
    }
    @Override
    public void move() {
        System.out.println("Run around with my four legs with my pack.");
    }
}