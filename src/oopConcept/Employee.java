package oopConcept;

public class Employee {

    // create the variabales

    int eid;
    String ename;
    String job;
    int sal;

    // create the methods
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }
    /*

    public static void main(String[] args)
    {
        Employee emp1= new Employee();// object
        emp1.eid= 101;
        emp1.ename= "john";
        emp1.job= "Manager";
        emp1.sal= 5000;
        // display data by call display method
        emp1.display();
        Employee emp2= new Employee();
        emp2.eid= 102;
        emp2.ename= "jama";
        emp2.job= "supperviser";
        emp2.sal= 6000;
        emp2.display();
    }*/

}
