class CountNodes
{
   
    public static int getCount(Node head)
    {
        
     
        Node temp=head;
        int count=0;
        while(temp!=null){
        temp=temp.next;
        count++;
        }
        return count;
    
    }
}