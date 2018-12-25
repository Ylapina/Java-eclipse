
public class Bart extends Player
{
    public Bart()
    {
        name = "Bart";
    }
     
    //implements the generateRoshambo method from the Player class
    @Override
    public Roshambo generateRoshambo()
    {     
       return Roshambo.ROCK;    
    }
}
