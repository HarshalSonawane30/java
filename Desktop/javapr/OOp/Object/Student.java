package OOp.Object;

public class Student {
    String name;
    int RollNo;
    int Marks;

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("RollNO:"+RollNo);
        System.out.println("Marks:"+Marks);



    }
    public static void main(String[] args) {

      
        Student s1=new Student();

        s1.name="Harshal";
        s1.RollNo=30;
        s1.Marks=55;

        Student s2=new Student();
        s2.name="DIksha";
        s2.RollNo=15;
        s2.Marks=77;
          System.out.println("=======Student Details==========");
        s1.Display();
          System.out.println("=======Student Details==========");
        s2.Display();

    }

}

