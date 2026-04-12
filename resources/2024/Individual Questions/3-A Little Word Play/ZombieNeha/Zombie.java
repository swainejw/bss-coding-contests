
public class Zombie
{
    private int health = 3;
    private int speed = 50;
    private double ferocity = 1.5;
    private String name ="";
    private boolean isDead = false;

    public Zombie(int h, int s, double f, String n, boolean i)
    {
        health = h;
        speed = s;
        ferocity = f;
        name = n;
        isDead = i;
    }

    public Zombie(String n)
    {
        name = n;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public boolean getIsDead()
    {
        return isDead;
    }

    public void setIsDead(boolean isDead)
    {
        this.isDead = isDead;
    }

    public void decreaseHealthFerocity( int health)
    {
        health--;

        if( health == 0)
        {
            isDead = true;
            System.out.println("Dead Zpmbie");
        }
    }

    public void increaseFerocity( double num)
    {
        System.out.println( ferocity * num);
    }

    public String zMoan(int n)
    {
        String moan ="";
        String allowed = "ZKLMNO";

        for (int x = 0; x < n; x++)
        {
            int random = (int)(Math.random() * allowed.length());
            char myChar = (char)random;
            character.toString(mychar);
            moan += allowed.mychar();
        }
    }

    public String scrambleName()
    {
        String already="";
        int random = (int)(Math.random() * (name.length()));
        for(int x = 0; x < name.length(); x++)
        {
            while(already.contains(random))
            {
                int random = (int)(Math.random() * (name.length()));
            }
            already += random;
        }
        return already;

    }

    public void newName()
    {

        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";
        boolean isConsonant = true;

        // I'm not sure about this part.
        int random = (int) (Math.random() * consonants.length);
        //char randomConsonant = consonant.random();
        //char upperCaseConsonant = Character.toUpperCase(randomConsonant);
       
        for (int x = 0; x < 9; x++) {
            if (isConsonant)
            { 
                newName += consonants((int) (Math.random() * consonants.length));
            }
            else 
            { 
                newName += vowels((int) (Math.random() * vowels.length));
            }
        }
        this.name = newName;
    }

