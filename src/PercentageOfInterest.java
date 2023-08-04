public class PercentageOfInterest {
    public static void main(String[] args){
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(gender.equals("female") && age>=1 && age<=58){
            System.out.println("Interest is 8.2%");
        }else if(gender.equals("female") && age>=59 && age<=120){
            System.out.println("Interest is 7.6%");
        }else if(gender.equals("Male")&& age<=60 && age>=1){
            System.out.println("Interest is 9.2%");
        }else if(gender.equals("Male")&& age>=61 && age<=120){
            System.out.println("Interest is 8.3%");
        }else {
            System.out.println("Invalid entries");
        }

    }
}
