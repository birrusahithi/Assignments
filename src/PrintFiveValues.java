import java.util.ArrayList;
import java.util.List;

public class PrintFiveValues {
    public static void main(String[] args){
        int n =1;
        int count =0;
      while  (n>=1){
            if(n%2==0 && n%3==0 && n%5==0){
                count++;
                System.out.println(n);
            }
           if(count==5){
                return;
            }
            n = n+1;

        }
    }
}
