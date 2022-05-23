/**
 * @author (Joel Bannister)
 * @version (10.5.22)
 */
import java.util.Scanner; 
public class Game
{
    //reading input from the user
    Scanner keyin = new Scanner(System.in);
    String modeChoice;
    boolean gameModePicked=false;
    boolean random;
    boolean board1;
    boolean board2;
    boolean board3;
    boolean fileBoard;

    //variables begin/set up gamne

    public Game()
    {
        System.out.println("Heeeelloo!.. today, I introduce to you Joel's Game of Life! /n"
            + "This is the run down:\n"
            + "\n"); 

        //Game's rules explanation
        System.out.println("Now, what do you feel like playing? \n"
            +"Randomized beginning"
            +"Board 1 (type  B1)"
            +"Board 2 (type  B2)"
            +"Board 3 (type  B3)"
            +"Choose own map from file (type File)");

        while(!gameModePicked){
            modeChoice=keyin.nextLine().toLowerCase();
            if(modeChoice.equals("random")){
                gameModePicked = true;
                random = true;

            }else if (modeChoice.equals("b1")){
                gameModePicked = true;
                board1 = true;
            }
            else if (modeChoice.equals("b2")){
                gameModePicked = true;
                board2 = true;
            }
            else if (modeChoice.equals("b3")){
                gameModePicked = true;
                board3 = true;
            }
            else if (modeChoice.equals("file")){
                gameModePicked = true;
                fileBoard = true;
            }
            else {
                gameModePicked = false;
                System.out.println("Please choose a valid option from above");
            }

            if(gameModePicked){
                new PreBoard();
            }
        }

    }                       
}                                

