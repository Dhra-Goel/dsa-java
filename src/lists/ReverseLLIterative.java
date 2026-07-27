public class ReverseLLIterative {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void add(int data){
        Node NewNode = new Node(data);
        if (head == null){
            head = NewNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;
        }

        currNode.next = NewNode;

    }

    public void printLL(){
        if (head == null)
            return;

        Node currNode = head;
        while (currNode!= null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();


    }

    public void reverseIterative(){
        if (head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null){
            Node nextNode = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = nextNode;
        }

        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        ReverseLLIterative list = new ReverseLLIterative(); //not a good way but no option rn
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printLL();

        list.reverseIterative();
        list.printLL();
    }
}
