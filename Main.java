public class Main {

    public static int numAnimals = 0;

    public static void main (String[] args) {
        Wolf aWolf  = new Wolf();
        Wolf anotherWolf = new Wolf();
        Snake aSnake = new Snake();
        aWolf.hunt();
        aWolf.hunt();
        anotherWolf.hunt();
        aSnake.hunt();
        System.out.println("aWolf's final satiation is " + aWolf.getSatiation());
        System.out.println("anotherWolf's final satiation is " + aWolf.getSatiation());
        System.out.println("aSnake's final satiation is " + aSnake.getSatiation());

        System.out.println("The total number of animals out there is " + Main.numAnimals + ".");
    }
}