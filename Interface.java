interface Student
  {
  void showAcademicScore();
  }

interface Sports
  {
  void showSportsScore();
  }


class Result implements Student, Sports 
   {
    private int academicScore = 85;  
    private int sportsScore = 90;    
 
    public void showAcademicScore() 
        {
        System.out.println("Academic Score: " + academicScore);
        }

   
    public void showSportsScore() 
        {
        System.out.println("Sports Score: " + sportsScore);
        }

    
    public void displayResult()
        {
        showAcademicScore();
        showSportsScore();
        }
        }


public class Interface 
    {
    public static void main(String[] args) 
        {
        Result studentResult = new Result();
        studentResult.displayResult();
        }
    }


output:-

(base) ksb@ksb-H410M-H-V2:~/frina/oops$ javac Interface.java
(base) ksb@ksb-H410M-H-V2:~/frina/oops$ java Interface
Academic Score: 85
Sports Score: 90

