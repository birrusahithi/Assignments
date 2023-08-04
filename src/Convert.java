public class Convert {
    public static void main(String[] args){
        String s = args[0];
        char c = s.charAt(0);
        if(Character.isLowerCase(c)){
            System.out.println(c + "->" +Character.toUpperCase(c));
        }else{
            System.out.println(c + "->"+ Character.toLowerCase(c));
        }
    }
}
