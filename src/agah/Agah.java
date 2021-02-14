
package agah;
import java.util.Scanner;
import java.util.Random;

public class Agah {
 public static boolean bool=false ;
 public static String[] user=new String[2];
 
    public static void main(String[] args) {


       Random rdm=new Random();
     
        
        
        user();
        System.out.println("Enter number");   
          check(rdm.nextInt(100));

    
    }
    
public static void check(int r)
{for (int m=0;m<2;m++){
    
            System.out.println(user[m]+" turn");
   if (m==1)
   {m=-1;
   
   }

   
    for(int i=0;true;i++)  {
        Scanner scan=new Scanner(System.in);
                 int input=scan.nextInt();
                 System.out.println("");

    if (r==input)
          {
              System.out.println("Congratulation "+user[m]+"\n\n"); 
              bool=true;
              break;
              
          }else
          {if(r>input)
          {
              System.out.println("Please Enter larger number");
          }
           else
                  System.out.println("please enter a smaller number");
              break;
          }
    }
    if (bool==true){
        System.out.println("*************************************");
        System.out.println("winner winner chiken Dinner");
        break;
    }
    

}
}
public static void user() {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter first name");
            user[0]=scan.next();
            System.out.println("enter secound name");
            user[1]=scan.next();

}
}
