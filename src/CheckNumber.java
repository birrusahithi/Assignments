public class CheckNumber {
    public void check(int n){
        if(n>0){
            System.out.println("It is Positive");
        }else if(n<0){
            System.out.println("It is negative");
        }
        System.out.println("The number is 0");
    }
    public static void main(String[] args){
        CheckNumber obj = new CheckNumber();
        obj.check(7);
        obj.check(-2);
        obj.check(0);
    }
}
