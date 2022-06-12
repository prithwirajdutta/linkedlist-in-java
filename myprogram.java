class myprogram
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        while(lastnode.next!=null)
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public static void main(String args[]){
        myprogram list = new myprogram();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        list.printlist();
        list.deletelast();
        list.printlist();
    }
}
