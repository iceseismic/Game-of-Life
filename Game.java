/**
 * @author (Joel Bannister)
 * @version (10.5.22)
 */
import java.util.Scanner; //get rid of slashes  at bottom when connected this file to online file
public class Game
{
    //reading input from the user
    Scanner keyin = new Scanner(System.in);
    String modeChoice;
    boolean gameModePick=false;
    boolean offline;

    //variables begin/set up gamne

    public Game()
    {
        System.out.println("Heeeelloo!.. today, I introduce to you Joel's Game of Life! /n"
            + "This is the run down:\n"
            + "\n");

            

        //Game's rules explanation
        System.out.println("Now, what do you feel like playing? \n"
            +"Singleplayer is by yourself, and online is against a friend \n"
            +"type 'Single' for Singleplayer, or 'Multi' for Multiplayer");

        while(!gameModePick){
            modeChoice=keyin.nextLine().toLowerCase();
            if(modeChoice.equals("multi")){
                gameModePick = true;
                offline=false;
            }else if (modeChoice.equals("single")){
                gameModePick = false;
                offline=true;
            }
            else {
                System.out.println("Please choose either mode");
            }

            if(offline){
                  //new Singleplayer"();
            }else{  
                  //new online"();
            }
            
        }                       
    }                                
}

