import com.sun.corba.se.spi.activation.ActivatorHelper;

public class PrimeNUmber {
    public boolean check(int i){
        if(i<=1){
            return false;
        }
        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    public void printNumbers(int f, int l){
        for(int i=f; i<=l; i++){
            boolean result = check(i);
            if(result){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args){
        PrimeNUmber obj = new PrimeNUmber();
       boolean result =  obj.check(17);
       if(result){
           System.out.println("True");
       }else{
           System.out.println(false);
       }
       obj.printNumbers(3, 50);
       obj.check(15);
    }

}
