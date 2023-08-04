import java.util.Scanner;

public class AddSub {
    public static int add(int num1, int num2){
        int result = num1+num2;
        return result;
    }
    public static int sum(int num1, int num2){
        int result = num1-num2;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        System.out.println("Now Choose the Options");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        int option = sc.nextInt();
        if(option==1){
          int answer =   AddSub.add(num1, num2);
            System.out.println("Answer : " + answer);
        }else{
            int answer = AddSub.sum(num1, num2);
            System.out.println("Answer: " + answer);
        }
    }
}
