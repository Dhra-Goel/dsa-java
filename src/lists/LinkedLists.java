class LinkedLists {
    Node head;
    private int size;

     class Node{
         String data;
         Node next;

         Node(String data){
             this.data = data;
             this.next = null;

             //jb bhi koi new node bnegi toh size ++ hojaega
             size++;
         }
     }
     //Four major opertaions for ll:
     //1. add: first , last

    //add at start: new node.next point krega next node ki side(which is pointed by head initially) and then head point new node
    public void addFirst(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }

         newNode.next = head;
         head = newNode;
    }

    //add at last: new node.next points to null or jo phle last node thi uska .next point krega new node ko
    public void addLast(String data){
         Node newNode = new Node(data);
         if (head == null){
             head = newNode;
             return;
         }
         //curr isliye bnai kuki hm original head ko change nhi krna chahte
         Node currNode = head;
         //basically jb currnode ka next point krde null ko its mean vo last node h
         while (currNode.next != null){
             currNode = currNode.next;
         }
         //jb hm last node pe phoch gye toh use new node pe point krdenge or new node to null ko point kr hi rhi h due to node class property
         currNode.next = newNode;
    }

    //2. printing ll is similar to last node addition
    public void printList(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        //having curr instead of curr.next bcoz we want to print last node also
        while (currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    //3. delete:first, last

    //delete first: simply change the head position from first to its next
    public void deleteFirst(){
         if (head == null) {
             System.out.println("List is empty");
             return;
         }

         size--;
         head = head.next;
    }

    //delete last: main moto is to point the second last as null
    public void deleteLast(){
         if (head == null) {
             System.out.println("List is empty");
             return;
         }

         size--;
         //mean there is only one element so we'll make it empty
         if(head.next == null){
            head = null;
            return;
         }

        //visualize things to understand more clearly
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //4. size : doesn't include NULL
    public int getSize(){
         return size;
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.addLast("LinkedList");
        list.printList();
        System.out.println(list.getSize());
    }

}

//for LinkedList
//Insertion : O(1)
//Search : O(n)

//while for  arraylist it is opposite.
