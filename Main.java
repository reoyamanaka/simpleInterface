public class Main {

    public static int numAnimals = 0;

    public static void main (String[] args) {
        Wolf aWolf  = new Wolf();
        Snake aSnake = new Snake();
        aWolf.hunt();
        aWolf.hunt();
        aSnake.hunt();
        System.out.println("The wolf's final satiation is " + aWolf.getSatiation());
        System.out.println("The snake's final satiation is " + aSnake.getSatiation());

        System.out.println("The total number of animals out there is " + Main.numAnimals + ".");
    }
}