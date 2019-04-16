public class StudentInformation {
  public static void main(String[] args) {
    String Task_Done = "Total 8 DataTypes Use For This Task Also use If and Else Statment\n";
    String name = "Abdul Azeem";
    byte   number_of_students = 1;
    short  Total_Marks_in_Major_subjects = 98;
    int   Total_getting_marks_of_practical = 45;
    float Total_marks_of_practical = 45;
    float pass_marks_of_practical  = 30;
    float Total_percentage_of_practical = 1.5f;
    float pass_percentage_of_practical  = 1.2f;
    long Total_getting_marks_of_semister = 930;
    long Pass_marks_of_semister  = 840;
    double Total_percentage_of_semister = 80;
    double Pass_percentage_of_semister  = 60;
    char grade = 'A';
    boolean pass = true;
  

   
        System.out.println(Task_Done);
        System.out.println("Name Of Student " + (name) );
        System.out.println("number of students " + (number_of_students) );
        System.out.println("Total Marks in Major subjects " + (Total_Marks_in_Major_subjects) );
        
        System.out.println("Total getting marks of practical " + (Total_getting_marks_of_practical) );
      
        if (Total_marks_of_practical > pass_marks_of_practical ) {
      System.out.println("Pass in practical because pass marks is 30 ");
    } else {
      System.out.println("Fail.");
    }  

     if (Total_percentage_of_practical > pass_percentage_of_practical  ) {
      System.out.println("Percentage of a practical is good for pass because pass percenatge required is 1.2");
    } else {
      System.out.println("Fail.");
    }  
  

    System.out.println("Total getting marks of semister " + (Total_getting_marks_of_semister) );
    
    if (Total_getting_marks_of_semister > Pass_marks_of_semister ) {
      System.out.println(" So Pass in Semister because for pass marks is required 840");
    } else {
      System.out.println("Fail.");
    }  

      System.out.println(" Total percentage in Semister " +  (Total_percentage_of_semister) );

     if (Total_percentage_of_semister > Pass_percentage_of_semister  ) {
      System.out.println("Percentage of a Semister is good for pass because for pass percentage is required 60");
    } else {
      System.out.println("Fail.");
    }  
    
     System.out.println("So The Getting Grade is " + (grade) );

       if (true==pass)
       System.out.println("pass");
    else 
    System.out.println("fail");


  }
}
