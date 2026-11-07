package OOp.Object;

public class Employee {
    int employeeId;
    String employeeName;
    int salary;
    void Display(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Salary: "+salary);


    }
    public static void main(String []args){
        Employee e1=new Employee();
        e1.employeeId=101;
        e1.employeeName="Harshal";
        e1.salary=50000;
            System.out.println("=======Employee Details==========");
            e1.Display();
        Employee e2=new Employee();
        e2.employeeId=102;      
        e2.employeeName="Diksha";
        e2.salary=60000;
        System.out.println("=======Employee Details==========");
        e2.Display();

            System.out.println("=======Employee Details==========");

        Employee e3=new Employee();
        e3.employeeId=103;
        e3.employeeName="Rohit";
        e3.salary=70000;
        e3.Display();
    }

}
