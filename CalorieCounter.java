import java.util.Scanner;

public class CalorieCounter
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double tdee = 0.0;
    int goal = 0;
    double weightLossGoal = 0.0;
    double weightGainGoal = 0.0;
    
    System.out.printf("What is your Total Daily Energy Expenditure: ");
    tdee = input.nextDouble();
    do{
    System.out.printf("Are you trying to lose, maintain or gain weight?%n" +
                      "Enter 1 for lose, 2 for maintain or 3 for gain: ");
    goal = input.nextInt();
      switch(goal)
      {
        case 1:
          do
        {
          System.out.printf("How much weight, in pounds, are you trying to lose in one week?%n" +
                            "Enter .5, 1, 1.5 or 2: ");
          weightLossGoal = input.nextDouble();
        }while(!isValid(weightLossGoal));
        break;
        case 2:
          System.out.printf("You are currently maintaining and wish to stay the same weight.%n");
          break;
        case 3:
          do
        {
          System.out.printf("How much weight, in pounds, are you trying to gain per week?%n" +
                            "Enter .5 or 1: ");
          weightGainGoal = input.nextDouble();
        }while(!isItValid(weightGainGoal));
        break;
        default:
          System.err.printf("That is not a valid answer. You must enter a 1, 2 or a 3.%n");
          break;
      }
    }while(!goalValid(goal));
    
    if(weightLossGoal == .5)
    {
      tdee = tdee - 250;
    }
    else if(weightLossGoal == 1)
    {
      tdee = tdee - 500;
    }
    else if(weightLossGoal == 1.5)
    {
      tdee = tdee - 750;
    }
    else if(weightLossGoal == 2)
    {
      tdee = tdee - 1000;
    }
    
    if(weightGainGoal == .5)
    {
      tdee = tdee + 250;
    }
    else if(weightGainGoal == 1)
    {
      tdee = tdee + 500;
    }
    
    System.out.printf("To reach your goals you must consume, on average, %.0f calories everyday!",tdee);
    
  }//End main
  
  private static boolean goalValid(int goal)
  {
    if(goal == 1 | goal == 2 | goal == 3)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  private static boolean isValid(double weightLossGoal)
  {
    if(weightLossGoal == .5 | weightLossGoal == 1 | weightLossGoal == 1.5 | weightLossGoal == 2)
    {
      return true;
    }
    else 
    {
      System.err.printf("That is not a valid weight loss goal. Please enter your weight exactly as presented.%n");
      return false;
    }
  }
  private static boolean isItValid(double weightGainGoal)
  {
    if(weightGainGoal == .5 | weightGainGoal == 1)
    {
      return true;
    }
    else 
    {
      System.err.printf("That is not a valid weight gain goal. Please enter your weight exactly as presented.%n");
      return false;
    }
  }
  
}//End class


        
    
    