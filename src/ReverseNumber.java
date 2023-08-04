public class ReverseNumber {
    public static void main(String[] args){
        int number = 1234;
        int result = 0;
        while(number>0){
            int temp = number%10;
            result = result*10+temp;
            number = number/10;
        }
        System.out.println(result);
    }
}
