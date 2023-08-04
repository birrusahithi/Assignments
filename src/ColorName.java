import java.util.HashMap;
import java.util.Map;

public class ColorName {
    //Method 1
    public void findName(char r){
        switch (r){
            case 'R' :
                System.out.println("It is Red");
                break;
            case 'Y' :
                System.out.println("It is Yellow");
                break;
            case 'B' :
                System.out.println("It is Blue");
                break;
            case 'G':
                System.out.println("It is Green");
                break;
            case 'O' :
                System.out.println("It is Orange");
                break;
            case 'W' :
                System.out.println("It is White");
                break;
            default :
                System.out.println("Invalid Code");

        }

    }
    //Method 2 using Map
    public String find(char r){
        Map<Character, String> map = new HashMap<>();
        map.put('R', "red");
        map.put('W', "white");
        map.put('Y', "Yellow");
        map.put('O', "Orange");
        map.put('B', "Blue");
        map.put('G', "Green");
        if(map.containsKey(r)){
            return map.get(r);
        }
        return "Invalid Code";
    }
    public static void main(String[] args){
        ColorName obj = new ColorName();
        obj.findName('W');
    }
}
