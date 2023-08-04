public class CheckOddOrEven {
    public void checknumber(int n){
        if(n%2==0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd");
        }
    }
    public static void main(String[] args){
        CheckOddOrEven obj = new CheckOddOrEven();
        obj.checknumber(5);
    }
}
