
public class Player1 extends Player 
{
   public Player1(){
         super();
     }
  
   @Override
   public Roshambo generateRoshambo()
   {
        if (response.compareTo("R") == 0 || response.compareTo("r") == 0) return Roshambo.ROCK;
        if (response.compareTo("P") == 0 || response.compareTo("p") == 0) return Roshambo.PAPER;
        return Roshambo.SCISSORS;
   }
}
