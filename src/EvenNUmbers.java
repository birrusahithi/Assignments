import java.util.ArrayList;
import java.util.List;

public class EvenNUmbers {
    List<Integer> A1;
    List<Integer> A2;
    public List saveEvenNumbers(int from, int to){
        this. A1 = new ArrayList<Integer>();
        for(int i = from; i<=to; i++){
            if(i%2==0){
                A1.add(i);
            }
        }
        return A1;
    }
    public List printEvenNumbers(){
        this.A2 = new ArrayList<>();
        for(int i=0; i< A1.size(); i++){
            int number = A1.get(i)*2;
            A2.add(number);
        }
        return A2;
    }
    public int printEvenNumbers(int n){
        for(int i=0; i<A1.size(); i++){
            if(A1.get(i)==n){
                return n;
            }
        }
        return 0;
    }

    public static void main(String[] args){
EvenNUmbers obj = new EvenNUmbers();
obj.saveEvenNumbers(0, 100);
obj.printEvenNumbers();
obj.printEvenNumbers(16);
    }
}
