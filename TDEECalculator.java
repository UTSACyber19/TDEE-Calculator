//Personal java Project : TDEE Calculator © 
//© Jacob Valdez
import javax.swing.JOptionPane;
import java.util.Scanner;

public class TDEECalculator
{//Start of class Calculator
  public static void main(String[] args)
  {//Start of main method
    Scanner input = new Scanner(System.in);
    
    String gender = " ";
    int age = 0;
    double weight = 0.0;
    int height = 0;
    String activityLevel = " ";
    double kg = 0.0;
    double cm = 0.0;
    double bmr = 0.0;
    double tdee = 0.0;
    double stats = 0.0;
    
    do
    {//Repeats the question if they dont type in male or female correctly
      gender = JOptionPane.showInputDialog( "What is your gender: (male or female) ");
    }while(!isItValid(gender));//if isItValid is false than it repeats
    age = Integer.parseInt(JOptionPane.showInputDialog("What is your age: "));
    weight = Double.parseDouble(JOptionPane.showInputDialog("What is your weight in pounds: "));
    height = Integer.parseInt(JOptionPane.showInputDialog("What is your height in inches: "));
    do
    {//Repeats the question if they dont type in activity correctly correctly
      activityLevel = JOptionPane.showInputDialog("What is your activity level: (Sedentary, \nLight Exercise, Moderate Exercise, Heavy Exercise, Athlete)");
    }while(!isValid(activityLevel));
    
    if(activityLevel.equalsIgnoreCase("sedentary"))
    {
      stats = 1.2;
    }
    else if(activityLevel.equalsIgnoreCase("light exercise"))
    {
      stats = 1.375;
    }
    else if(activityLevel.equalsIgnoreCase("moderate exercise"))
    {
      stats = 1.55;
    }
    else if(activityLevel.equalsIgnoreCase("heavy exercise"))
    {
      stats = 1.752;
    }
    else if(activityLevel.equalsIgnoreCase("athlete"))
    {
      stats = 1.9;
    }
    
    kg = (double)(weight / 2.205);
    cm = (double)(height * 2.54);
    
    if(gender.equalsIgnoreCase("male"))
    {
      bmr = (double) (((10.0 * kg) + (6.25 * cm) - (5.0 * age))+5);
    }
    else if(gender.equalsIgnoreCase("female"))
    {
      bmr = (double) (((10.0 * kg) + (6.25 * cm) - (5.0 * age)) - 151);
    }
    
    tdee = (double)(bmr * stats);
    JOptionPane.showMessageDialog(null,String.format("Your Total Daily energy Expenditure is about %.2f calories per day.",tdee));
  }//End Main
  
  private static boolean isItValid( String gender)//JOptionPane ALWAYS USE .equals
  {
    if(gender.equalsIgnoreCase("male") | gender.equalsIgnoreCase("female"))
    {
      return true;
    }
    else
    {
      JOptionPane.showMessageDialog(null, "That is not a valid gender.\nTry checking your spelling.");
      return false;
    }
  }
  
  private static boolean isValid(String activityLevel)//JOptionPane ALWAYS USE .equals
  {
    if(activityLevel.equalsIgnoreCase("sedentary") | activityLevel.equalsIgnoreCase("light exercise") | activityLevel.equalsIgnoreCase("moderate exercise") |
       activityLevel.equalsIgnoreCase("heavy exercise") | activityLevel.equalsIgnoreCase("athlete"))
    { 
      return true;
    } 
    else
    {
      JOptionPane.showMessageDialog( null, "That is not a valid activity level.\nTry checking your spelling.");
      return false;
    }
  }
}//End class





