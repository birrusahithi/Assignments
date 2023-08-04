package EmployeeManagement;

public class Employee implements Comparable<Employee> {
    int EmpId;
    String EmpName;
    String EmpEmail;
    char EmpGender;
    float EmpSalary;
    Employee(int id, String empName, String email, char gender, float empSalary){
        this.EmpId = id;
        this.EmpName = empName;
        this.EmpEmail = email;
        this.EmpGender = gender;
        this.EmpSalary = empSalary;
    }
    public int compareTo(Employee e){
       if(e.EmpId>this.EmpId){
           return -1;
       }else if(e.EmpId==this.EmpId){
           return 0;
       }
       return 1;
    }
    public int getEmpId(){
        return EmpId;
    }
    public static void main(String[] args){
        Employee obj = new Employee(1, "Apple", "training1@gmail.com", 'f', 1000.00f);
        Employee obj2 = new Employee(2, "Mango", "training2@gmail.com", 'M', 2000.00f);
        Employee obj3 = new Employee(3, "Berry", "training3@gmail.com", 'f', 3000.00f);
       Employee obj4 = new Employee(4, "Lucky", "training4@gmail.com", 'f', 2000);
       Employee obj5 = new Employee(5, "Blue", "training5@gmail.com", 'M', 5000);
       Employee obj6 = new Employee(6,"Cake", "training6@gmail.com", 'F', 6000);
        Employee obj7 = new Employee(7,"Coffee", "training7@gmail.com", 'F', 6000);


        EmployeeDB db = new EmployeeDB();

        db.addEmployye(obj);
        db.addEmployye(obj2);
        db.addEmployye(obj3);
        db.addEmployye(obj4);
        db.addEmployye(obj5);
        db.addEmployye(obj6);
        db.addEmployye(obj7);
        System.out.println("List Of Employees");
        db.print();
        db.deleteEmployee(3);
        System.out.println("List of Employees after deleting");
        db.print();


    }

}
