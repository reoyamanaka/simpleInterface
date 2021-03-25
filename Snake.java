public class Snake implements Animal {
    public Snake() {
        Main.numAnimals += 1;
        this.satiation = 0;

    }

    public int getSatiation() {
        return this.satiation;
    }

    @Override  
    public void move() {
        System.out.println("I'm a snake so I slither to move.");
    }
    @Override
    public void hunt() {
        System.out.println("I'm a snake so I swallow my prey whole. When I hunt my satiation increases by 3 points.");
        this.satiation += 3;
        System.out.println("This snake's new satiation level: " + this.satiation);
    }
}