import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayList {
    List<String >  list;
    StringArrayList(){
        list = new ArrayList<>();
    }
    public void printAll(){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public static void main(String[] args){
      StringArrayList obj = new StringArrayList();
      obj.list.add("Apple");
      obj.list.add("Mango");
      obj.list.add("Banana");
      obj.list.add("Grapes");
      obj.printAll();
    }
}
