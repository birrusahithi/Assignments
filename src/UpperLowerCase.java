public class UpperLowerCase {
    public void convert(char c){
        if(Character.isLowerCase(c)){
           c = Character.toUpperCase(c);
            System.out.println("Converting to UpperCase " + c);
        }else{
            c = Character.toLowerCase(c);
            System.out.println("Converting to LowerCase " + c);
        }
    }
    public static void main(String[] args){
        UpperLowerCase obj = new UpperLowerCase();
        char c = 'S';
        obj.convert(c);

    }
}
