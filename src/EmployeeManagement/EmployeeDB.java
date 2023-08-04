package EmployeeManagement;

import java.util.*;

public class EmployeeDB {
    List<Employee> list;
    Set<Employee> set;
    EmployeeDB(){
        list = new ArrayList<>();
        this.set =  new TreeSet<>();
    }
    public boolean addEmployye(Employee e){
       boolean b1 = list.add(e);
       boolean b2 = set.add(e);
       if(b1 && b2){
           return  true;
       }
       return  false;
    }
    public boolean deleteEmployee(int EmpId) {
        //Type 1
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee temp = iterator.next();
            if (temp.getEmpId() == EmpId) {
                list.remove(temp);
                set.remove(temp);
                return true;
            }
        }
        return false;
    }
    public void show(){
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee temp = iterator.next();
            System.out.println("id : " + temp.EmpId + " " + temp.EmpEmail + " " + temp.EmpName + " " + temp.EmpSalary);
        }
    }
    public String showPayslip(int empId){
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext()){
            Employee emp = iterator.next();
            if(emp.getEmpId()==empId){
                return "Pay slip of employee " + empId + " : " + emp.EmpSalary;
            }
        }
        return "Employee Id not found";
    }
    public Employee[] listAll(){
     return   list.toArray(new Employee[0]);
    }
    public void print(){
        Iterator<Employee> listIterator = list.listIterator();
        Iterator<Employee> iterator = set.iterator();
        System.out.println("List Iterator");
        while(listIterator.hasNext()){
            Employee temp = listIterator.next();
            System.out.println(" ID :" + temp.EmpId + " "+"Name : "+  temp.EmpName + " " + "Gender : " + " "+   temp.EmpGender + " Salary : "+ temp.EmpSalary +" " +"Email : " +  temp.EmpEmail);
        }
        System.out.println("TreeSet Iterator");
        while (iterator.hasNext()){
            Employee temp = iterator.next();
            System.out.println(" ID :" + temp.EmpId + " "+"Name : "+  temp.EmpName + " " + "Gender : " + " "+   temp.EmpGender + " Salary : "+ temp.EmpSalary +" " +"Email : " +  temp.EmpEmail);
        }
    }
}
