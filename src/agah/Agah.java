
package agah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Agah implements ActionListener { JFrame frame;
JPanel panel;
public static int r=0;
JButton btn;
JLabel label;
private static JLabel slabel;
JTextField txt;
 public static int input=0;
 public static boolean bool=false ;
 public static String[] user=new String[1];
 
    public static void main(String[] args) {
new Agah();

       Random rdm=new Random();
     
        
       r=rdm.nextInt(100);
       //user();
      //  System.out.println("Enter number");   
       //   check(rdm.nextInt(100));

    
    }
    
/*public static void check(int r)
{
   
    for(int i=1;true;i++)  {
        Scanner scan=new Scanner(System.in);
                  input=scan.nextInt();
            

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
           
      

}*/
Agah(){
    frame=new JFrame("game");
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel=new JPanel();
    
    frame.add(panel);
    panel.setLayout(null);
    label=new JLabel("guess the number");
    label.setBounds(10,20,800,25);
    panel.add(label);
    txt=new JTextField(3);
    txt.setBounds(10,50,70,20);
    panel.add(txt);
    btn=new JButton("check");
    btn.setBounds(0, 100, 500, 50);
    btn.addActionListener(this);
    panel.add(btn);
    slabel=new JLabel();
    slabel.setBounds(10, 150, 500, 50);
    slabel.setText("");
    panel.add(slabel);
   

    frame.setVisible(true);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        input=Integer.parseInt(txt.getText());
         if (r ==input)
          {
              System.out.println("Congratulation "+"\n\n"); 
              
             slabel.setText("Winner Winner Chicken Dinner");
              System.out.println(r);
             /*  JLabel user=new JLabel("enter your name");
               JLabel record=new JLabel("");
    user.setBounds(10, 190, 500, 70);
    JTextField usertxt=new JTextField();
    usertxt.setBounds(130,210, 70, 35);
    panel.add(user);
    panel.add(usertxt);
    panel.add(record);
    frame.setVisible(true);
  */
              
          }else
          {if(r>input)
          {
              System.out.println("Please Enter larger number");
              System.out.println(r);
              slabel.setText("Please Enter larger number");
          }
          else{
                  System.out.println("please enter a smaller number");
          System.out.println(r);
          slabel.setText("Please Enter smaller number");
          }
          }
   
    
    
    }
   
}
