
import java.util.Scanner;

public class Calculator {
 
 private int X,Y,R;
 
 public void init(int X,int Y)
 {
  this.X=X;
  this.Y=Y;
 }
 public void add()
 {
  R = X + Y;
 }
 public void multiply()
 {
  R = X * Y;
 }
 public void power()
 {
  R = 1;
  while(Y!=0)
  {
   R*=X;
   --Y;
  }
 }
 public void mod()
 {
  R = X % Y;
 }
 
 public void display()
 {
  System.out.println("Result "+R);
 }

 public static void main(String[] args) {
  int n=0;
  Calculator m1 = new Calculator();
  Scanner s = new Scanner(System.in);
  //System.out.println("Enter X and Y");
  //int x = s.nextInt();
  //int y = s.nextInt();
  int x = 5;
  int y = 4;
  m1.init(x, y);
    m1.add();
    m1.display();
    m1.multiply();
    m1.display();
    m1.power();
    m1.display();

 }
}
