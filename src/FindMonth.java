import java.util.HashMap;
import java.util.Map;

public class FindMonth {
    Map<Integer, String> map ;
    public void find(int n){
        switch (n){
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
    public String findind(int n){
       addValuesToMap();
       if(map.containsKey(n)){
           return map.get(n);
       }
       return "Invalid Month";
    }
    public void addValuesToMap(){
        this.map = new HashMap<>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");
    }
    public static void main(String[] args){
        FindMonth obj = new FindMonth();

    }
}
