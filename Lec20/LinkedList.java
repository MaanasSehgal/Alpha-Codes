public class LinkedList {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1: create a new node
        Node newNode = new Node(data);
        size++;
        //empty
        if (head == null) {
            //all become equal to newNode
            head = tail = newNode;
            return;
        }

        //step2: newNode ka next => head
        newNode.next = head;

        //step3
        head = newNode;
    }

    public void addLast(int data) {
        //step1: create a new node
        Node newNode = new Node(data);
        size++;

        //empty
        if (head == null) {
            //all become equal to newNode
            head = tail = newNode;
            return;
        }
        //tail ka next => newnode
        tail.next = newNode;

        //newNode set to tail
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        //i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        //prev: i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;
        return;
    }

    // iterative
    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { //condition for 0 or 1 node
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next; //store next node
            curr.next = prev; //reverse current nodes pointer
            prev = curr; //move prev and curr one step forwards
            curr = next;
        }
        head = prev;
    }

    public void removeNthEndNode(int idx) {
        //calculate size
        int sizeOfLL = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sizeOfLL++;
        }

        //logic

        if (idx == sizeOfLL) {
            head = head.next; //remove first;
            return;
        }

        Node prev = head;
        int i = 1;

        while (i != sizeOfLL - idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    // public boolean checkPalindrome() {
    //     //O(n) space
    //     Node temp = head;

    //     ArrayList<Integer> list = new ArrayList<>();

    //     while (temp != null) {
    //         list.add(temp.data);
    //         temp = temp.next;
    //     }
    //     // System.out.println(list);
    //     int i = 0, j = list.size() - 1;

    //     while (i < j) {
    //         if (list.get(i) != list.get(j)) {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    //Slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is midNode
    }

    public boolean checkPalindrome() {
        //basecase
        if (head == null || head.next == null) {
            return true;
        }
        //step 1: find mid
        Node midNode = findMid(head);

        //step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step 3: check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1;
            fast = fast.next.next; //+2
            if (slow == fast) {
                return true; //cycle exists
            }
        }
        return false;
    }

    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                //cycle detected
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle => last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();

        // ll.addInMiddle(3, 2);
        // ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println("Index of 3 is: " + ll.recSearch(3));

        // System.out.println("Size of LL: " + LinkedList.size);

        // ll.removeNthEndNode(3);
        // ll.print();

        // System.out.println("Palindrome: " + ll.checkPalindrome());
        // ll.reverse();
        // ll.print();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // ll.print();
        // System.out.println(ll.isCycle());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        ll.zigZag();

        ll.print();
    }
}
