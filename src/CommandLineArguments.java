public class CommandLineArguments {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("No Values");
        }else{
            String result = "";
           for(String s : args){
               result = result+s+",";

           }
            System.out.println("Result : " + result);
        }

    }
}
