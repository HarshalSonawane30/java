package OOp.Object;
import java.util.*;
class calculator{
    int a;
    public int add(int n1,int n2){
        int r=n1+n2;
        System.out.println("Enter two numbers to add:");
        return r;
    }
}
public class ObjBasiuc{
    //jsabh
  public static void main(String[] args) {
      int num1=4;
    int num2=5;
    // int result=num1+num2;
    // System.out.println("The result is: "+result);
    calculator calc = new calculator();//Object created
    int result=calc.add(num1,num2);//calling the method with object  reference
    System.out.println("The result is: "+result);
  }


}