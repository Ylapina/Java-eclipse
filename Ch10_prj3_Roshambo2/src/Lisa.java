import java.util.Random;

public class Lisa extends Player 
{
    public Lisa()
    {
        name = "Lisa";
    }

    
    @Override
    public Roshambo generateRoshambo()
    {              
        //randomly selects rock,paper, or scissors 
        //(a one in three chance)
        
       Random r=new Random();
       int ch=r.nextInt(3);
       if(ch==0) return Roshambo.ROCK;
       else if(ch==1) return Roshambo.PAPER;
       else return Roshambo.SCISSORS;
    }
}
