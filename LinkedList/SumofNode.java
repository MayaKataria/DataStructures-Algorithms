class SumofNode
{
   
    void Sum(Node head)
    {
        //add code here.
        int sum=0;
        Node temp=head;
        while(temp!=null){
        sum+=temp.data;
        temp=temp.next;
        }
        System.out.println(sum);
        
    }
}