import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OregonTrail {
  public static void main(String[] args){
    //create a console object to get user feedback
    Console myConsole = System.console();

    //create our threats
    //create a arraylist
    List<Threat> oregonTrailThreats = new ArrayList<Threat>();
    //create each threat
    Threat newThreat1 = new Threat("A snake lunges at you and...",.1);
    Threat newThreat2 = new Threat("You get smallpox and...",.1);
    Threat newThreat3 = new Threat("A get attacked by a bear and...",.3);
    Threat newThreat4 = new Threat("A get dysentry and...",.1);
    Threat newThreat5 = new Threat("You're running low on water and...",.2);
    Threat newThreat6 = new Threat("You get struck by lightning and...",.7);
    Threat newThreat7 = new Threat("A accidently shoot yourself and...",.5);

    //add threats to ArrayList
    oregonTrailThreats.add(newThreat1);
    oregonTrailThreats.add(newThreat2);
    oregonTrailThreats.add(newThreat3);
    oregonTrailThreats.add(newThreat4);
    oregonTrailThreats.add(newThreat5);
    oregonTrailThreats.add(newThreat6);
    oregonTrailThreats.add(newThreat7);

    //run though 10 threats
    for(int i=1; i<10; i++){

      //pick a threat
      Random rand = new Random();
      int randThreat = rand.nextInt((oregonTrailThreats.size() - 1) + 1);
      //show user the threat
      System.out.print(oregonTrailThreats.get(randThreat).description);
      System.out.print("press <<return>> to see your results");
      String trailChoice = myConsole.readLine();

      //logic for if they live or die
      int max = 1;
      int min = 0;

      int survive = rand.nextInt((max - min) + 1) + min;

      if (survive > oregonTrailThreats.get(randThreat).deathPercent){
        //you survive
        System.out.println("...YOU SURVIVED!");
      } else {
        System.out.println("...YOU DIED! So SAD.");
      }
      // oregonTrailThreats.get(randThreat).deathPercent;
    }


    //test it

  }
}
