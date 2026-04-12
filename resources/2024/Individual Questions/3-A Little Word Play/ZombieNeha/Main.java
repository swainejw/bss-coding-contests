
public class Main
{
    public static void main (String[] args)
    {
        Zombie z1 = new Zombie(3, 70, 15.0, "Jaime");
        z1.decreaseHealth();
        System.out.println(z1.getHealth);
        z1.increaseFerocity(1.5);

        for (int x = 0; x < 5; x++) 
        {
            String moan = z1.zMoan(20);
            System.out.println("Zombie moan " + (x+1) + ": " + moan);
        }

        System.out.println(z1.scrambleName());
        System.out.println(z1.newName());
    }
}









