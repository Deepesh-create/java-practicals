//Code of Package
//Make a Folder of any name eg. Fibpackage
//Under that folder put code of package with any name eg.Fibpackage.java

package Fibpackage;

public class Fibpackage {
    protected int num1 = 0, num2 = 1, num3;

}

//Code to import Package
//import the code of package file you put in your folder
//in my case folder is MultiFile and name of code file is Fibpackage.java so import Fibpackage.Fibpackage.java

import java.util.Scanner;
import Fibpackage.*;
public class Fibonacci {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How Many Number Do you want of Fibonacci Series");
    int num = sc.nextInt();
    Fib p1 = new Fib();
    p1.fibonacci(num);
    sc.close();
  }
}

class Fib extends Fibpackage {
  void fibonacci(int n) {
    if (n == 1) {
      System.out.print(num1);
    } else if (n == 2) {
      System.out.print(num1 + " , " + num2);
    } else if (n > 2) {
      System.out.print(num1 + " , " + num2 + " , ");
      for (int i = 0; i < n - 2; i++) {
        num3 = num1 + num2;
        System.out.print(num3 + " , ");
        num1 = num2;
        num2 = num3;
      }
    }
  }
}
