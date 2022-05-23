/**
 * @author (Joel Bannister)
 * @version (10.5.22)
 */
import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.IOException;

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
            + "This is the run down:\n");

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
                new board();
            }
        }

        switch  (keyin.nextLine()){
            case"random":
            int row=10;
            int col= 15;

            int[][] mygrid = new int[row][col];

            // place random numbers into the array 'mygrid'
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    //mygrid[i][j] = rand() % 2;
                    Random rand = new Random(); 
                    int int_random = rand.nextInt(2);
                    // print the values out, just for debugging 
                    System.out.print(int_random);
                    mygrid[i][j] = int_random ;
                }
            }

            // ++++++++++++++++++++++++++++++++++++++++++++++++++
            // Displaying the grid  

            System.out.println();
            System.out.println("Original generation");
            for (int i=0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    if (mygrid[i][j] == 0)
                        System.out.print(".");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            break;
            
            case "file": //if using pre-made file
            System.out.println("please enter the exact name of your custom file (must be in game directory)");
            File customFile=new File (keyin.nextLine());
            try{
                Scanner fileRead = new Scanner(customFile);
                while(fileRead.hasNextLine()){
                    //reading the 0's and 1's of custom file
                    String num;
                    num = fileRead.nextLine();
                    System.out.println(fileRead.nextLine());
                    if (num == "1"){
                        System.out.println("*");
                    }else{
                        System.out.println(".");
                    }
                    
                    
                }
            }
            catch(IOException e) {
                //in case anything goes wrong
                e.printStackTrace();
            }
            break;
            
            case "b1":
            
        }
        

    }                       
}                                

