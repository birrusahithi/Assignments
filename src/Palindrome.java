public class Palindrome {
    public boolean findPalindrome(int n){
        int reverse =0;
        int temp = n;
        while(temp>=1){
            reverse = reverse*10 + temp%10;
            temp = temp/10;
        }
       if(reverse==n){
           return  true;
       }
       return false;
    }
    public static void main(String[] args){
Palindrome obj = new Palindrome();
boolean result = obj.findPalindrome(110011);
        System.out.println(result);

    }
}
