import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    int id;
    String name;
    String address;
    float salary;
    List<Employee> list;
    Employee(int id, String n, String add, float s){
        this.address = add;
        this.id = id;
        this.name = n;
        this.salary = s;
        this.list = new ArrayList<>();
    }
    public int getId(){
        return id;
    }
    public Employee serach(int id){
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()){
           Employee temp = iterator.next();
           if(temp.getId()==id){
               return temp;
           }
        }
        return null;
    }
    public static void main(String[] args){
        Employee emp = new Employee(1, "Apple", "Charlotte, NC", 1000);
        Employee emp1 = new Employee(2, "Mango", "Ashburn, Virginia", 2000);
        Employee emp3  = new Employee(3, "Grapes", "Broadlands, Virginia", 3000);

    }
}
