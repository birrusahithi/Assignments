public class FloydsFormat {
    public static void main(String[] args){
        for (int i=1 ; i<=5; i++){
            for(int j =0; j<i; j++){
                System.out.print('*' + "\t");
            }
            System.out.println();
        }
    }
}
