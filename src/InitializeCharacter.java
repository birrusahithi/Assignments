public class InitializeCharacter {
    public void characters(char c){
        if(Character.isAlphabetic(c)){
            System.out.println("It is Alphabet");
        }else if(Character.isDigit(c)){
            System.out.println("It is Digit");
        }else{
            System.out.println("Special Character");
        }
    }
    public static void main(String[] args){
        char a = 'k';
        char b = '2';
        char c = '/';
        InitializeCharacter obj = new InitializeCharacter();
        obj.characters(a);
        obj.characters(b);
        obj.characters(c);
    }
}
