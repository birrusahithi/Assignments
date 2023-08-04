public class LinkedList {
    Node headA1;
    Node newListA2;
    LinkedList(){
        this.headA1= null;

    }
    public Node saveEvenNumbers(int n){
        System.out.println("Saved Numbers in A1");
        this.headA1= new Node(0);
        Node current = headA1;
        for(int i=2; i<=n; i++){
            if(i%2==0){
                current.data = i;
                System.out.print(current.data + " ");
                current.next = new Node(0);
                current = current.next;
            }
        }
        return headA1;
    }
    public Node printEvenNumbers(){
        System.out.println();
        System.out.println("A2");
        this.newListA2 = new Node(1);
        Node temp = newListA2;
        Node current = headA1;
        while(current!=null){
            int number = current.data*2;
            temp.data = number;
            System.out.print(temp.data + " ");
            temp.next = new Node(1);
            temp = temp.next;
            current = current.next;

        }
        return newListA2;
    }
    public int printEvenNumbers(int n){
        System.out.println();
        Node temp = headA1;
        while(temp!=null){
            if(temp.data==n){
                System.out.println("N Value : " + n);
                return n;
            }
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.saveEvenNumbers(50);
        list.printEvenNumbers();
        list.printEvenNumbers(14);
    }
}
