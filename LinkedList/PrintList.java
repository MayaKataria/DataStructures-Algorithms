class PrintList
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void printlist(Node head)
    {
        //add code here.
        Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        
    }
}