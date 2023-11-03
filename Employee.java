public class Employee{
    // instance data memeber
    int id;
    String name;
    double salery;
    {
        System.out.println("Pre constructor call (int block)");
    }
    Employee(){
        System.out.println("Contructor call");
    }

    public static void main(String[] args) {
      //  Employee amit=new Employee();
    }
}