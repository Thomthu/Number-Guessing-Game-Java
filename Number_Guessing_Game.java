import java.util.*;//to use "util" libraries
public class Number_Guessing_Game {
    public int getRandomNumber(int mi,int mx){//method to create random number from given range
        return (int)((Math.random()*(mx-mi+1))+mi);//return the random number as integer type to main method
    }
    public static void main(String[] args) {
        int allowedRounds=3;//maximum allowed rounds
        int allowedAttempts=5;//maximum allowed attempts
        int score=15;//the initial score is 5 now
        int countRounds=1;//assigned 1 to print the number of rounds from 1 to 3
        int countAttempts=1;//assigned 1 to count from 1 to 5

        Number_Guessing_Game game = new Number_Guessing_Game();// Creating an object of the class
        Scanner Obj = new Scanner(System.in);// Create a Scanner object for user input

        int minimum_Value=1;
        int maximum_Value;//variable to store the maximum range value from user
        int userGuessedNumber;
        System.out.println("----------'NUMBER GUESSING GAME'----------");
        System.out.println("----------Welcome-Back----------");
        System.out.println("----------enjoy-the-game-with-me----------");
        System.out.println("Total rounds=3");
        System.out.println("Total attempts in one round=5");

        System.out.print("Enter maximum value for range:");
        maximum_Value=Obj.nextInt();

        if (maximum_Value>=minimum_Value && maximum_Value<=100) {
            while(countRounds<=allowedRounds){//checking num of rounds less than or equal to 3(max rounds=3)
                System.out.println("--------------------Round:"+countRounds+"--------------------------");
                countRounds++;//increasing no of rounds by 1
                while(countAttempts<=allowedAttempts){//checking num of attempts less than or equal 5(max attempts=5)
                        countAttempts++;//increasing the number of attempts by 1
                        int generatedRandomNumber=game.getRandomNumber(minimum_Value,maximum_Value);//passing the min and max values to random number generating method
                        System.out.print("Enter your guessing number between 1 to "+maximum_Value+":");
                        userGuessedNumber=Obj.nextInt();
                        if(userGuessedNumber==generatedRandomNumber){//checking the user entered number is equal to generated number
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("Congratulations! You have eared 2 points in Attempt "+countAttempts);
                                System.out.println("Generated number:"+generatedRandomNumber);
                                score+=2;
                                System.out.println("Score:"+score);

                        }
                        else if(userGuessedNumber<generatedRandomNumber){//checking the user entered number is less than generated number
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("Your number is lower than generated number.Try in next Attempt");
                                System.out.println("Generated number:"+generatedRandomNumber);
                                score-=1;//reducing 1 point for wrong guess
                                System.out.println("Losing 1 point from score!!");
                                System.out.println("Score:"+score);

                        }
                        else{//the user entered number is greater than generated number
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("Your number is higher than generated number.Try in next Attempt");
                                System.out.println("Generated number:"+generatedRandomNumber);
                                score-=1;//reducing 1 point for wrong guess
                                System.out.println("Losing 1 point from score!!");
                                System.out.println("Score:"+score);
                        }
                }
                countAttempts=1;//assigning 0 for next round counting from 1 to 5
            }
        }
        else{
            System.out.println("Maximum value is less than minimum value or greater than 100");
        }
        System.out.println("----------------------------End of Rounds-----------------------------------");
        System.out.println("Total score:"+score);
        System.out.println("---------------------------Well-played--------------------------------------");
    }
}
