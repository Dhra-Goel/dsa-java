public class ReverseLLRecursive {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data){
            Node newNode = new Node(data);
            if(head == null ){
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
    }

    public void printLL(){
            Node curr = head;
            if(curr == null){
                return;
            }

            while (curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }

            System.out.println();
    }

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ReverseLLRecursive list = new ReverseLLRecursive();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printLL();

        list.head = list.reverseRecursive(list.head);
        list.printLL();
    }
}
