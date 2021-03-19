public class Snake implements Animal {
    private int satiation;

    @Override  
    public void move() {
        System.out.println("I'm a snake so I slither to move.");
    }
    @Override
    public void hunt() {
        System.out.println("I'm a snake so I swallow my prey whole. When I hunt my satiation increases by 3 points.");
        satiation += 3;
        System.out.println("Satiation level: " + satiation);
    }
}