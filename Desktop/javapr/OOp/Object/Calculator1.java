package OOp.Object;
import java.util.*;
public class Calculator1 {
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }public int div(int a, int b){
        if(b==0){
            System.out.println("Cannot Divide");
            return 0;
        }
        return a/b;
    }
    void display(int a,int b){
        System.out.println("===Addition====");
        System.out.println(add(a,b));
        System.out.println("===Substraction====");
         System.out.println(sub(a,b));
          System.out.println("===Multiplication====");
         System.out.println(mul(a,b));
          System.out.println("===Division====");
          System.out.println(div(a,b));;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the second Number");
        int b=sc.nextInt();
        Calculator1 c1=new Calculator1();
        c1.display(a,b);
        
        
    }
    
}
