public class searchKeyLL {
    public static class Node {  //creating class
        int data;
        Node next;

        public Node(int data) {  //creating constructer
            this.data = data;
            this. next = null;
        }
    }

    public int findKey(int key) {
        Node temp = head;
        int i =0;
        while(i<size) {
            if(temp.data == key) {
                return i;
            }
            else{
                temp = temp.next;
                i++;
            }
        }
        return -1; 
    }
    
    public void print() {
        Node temp = head;
        while( temp != null) {
            System.out.print(temp.data+ " "+ "->"+ " ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        searchKeyLL ll = new searchKeyLL();
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(size);
        int value = ll.findKey(4);
        System.out.println(value);

        
    }
}
