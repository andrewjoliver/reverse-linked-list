class ReverseLinkedList{
	static class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	public static Node reverseList(Node head) {
        if (head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = head.next;
        
        while (curr.next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
	public static void main(String[] args){
		Node fourthNode = new Node(4, null);	  // Tail
		Node thirdNode = new Node(3, fourthNode);
		Node secondNode = new Node(2, thirdNode);
		Node firstNode = new Node(1, secondNode); // Head
		Node reversedHead = reverseList(firstNode);
		
		while (reversedHead != null ){
			System.out.println(reversedHead.data);
			reversedHead = reversedHead.next;
		}
	}
}


