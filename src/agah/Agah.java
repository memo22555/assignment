
package agah;
import java.util.Scanner;
import java.util.Random;

public class Agah {
 public static boolean bool=false ;
 public static String[] user=new String[1];
 
    public static void main(String[] args) {


       Random rdm=new Random();
     
        
        
       user();
        System.out.println("Enter number");   
          check(rdm.nextInt(100));

    
    }
    
public static void check(int r)
{
   
    for(int i=1;true;i++)  {
        Scanner scan=new Scanner(System.in);
                 int input=scan.nextInt();
                 System.out.println(i);

    if (r==input)
          {
              System.out.println("Congratulation "+user[0]+"\n\n"); 
              bool=true;
              System.out.println("number of attempts for "+user[0]+" = "+i);
              break;
              
          }else
          {if(r>input)
          {
              System.out.println("Please Enter larger number");
          }
           else
                  System.out.println("please enter a smaller number");
             
          }
    }
    if (bool==true){
        System.out.println("*************************************");
        System.out.println("winner winner chiken Dinner");
        
    }
    


}
public static void user() {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter name");
            user[0]=scan.next();
           
      

}
}
