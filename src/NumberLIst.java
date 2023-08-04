import java.util.ArrayList;
import java.util.List;

public class NumberLIst {
    public static void main(String[] args){
        List<Number> list = new ArrayList<>();
        list.add(12);
        list.add(1.2286787f);
        list.add(3.44);
        list.add(1231424242422424l);
        for(Number n : list){
            System.out.println(n);
        }

    }
}
