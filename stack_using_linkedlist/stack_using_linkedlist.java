import java.util.*;
class node{
	int data;
	node next;
	public node(int d)
	{
		data=d;
		next=null;
	}
}
class stackUsing_linkedlist{
	node head;
	public int is_stack_empty()
	{
		if(head==null)                 //stack is empty
		{
			return 1;
		}
		return 0;
	}
	public void push(int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
		}
		else{
			node temp1=head;
			while(temp1.next!=null)             //traverse till end of linked list
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
		}
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
		}
		else if(head.next==null)
		{
			System.out.println("popped data is:"+head.data);      //if only 1 element is present
			head=null;
		}
		else{
			node temp=head;
			while(temp.next.next!=null)           //traverse list to get top of stack
			{
				temp=temp.next;
			}
			System.out.println("popped data is:"+temp.next.data);     
			temp.next=null;
			
		}
	}
}
public class stack_using_linkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
stackUsing_linkedlist s1=new stackUsing_linkedlist();
int choice;
int ans;
Scanner sc=new Scanner(System.in);
do{
	System.out.println("enter choice\n1push\n2pop");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:System.out.println("enter data to be inserted in stack");
	int data_pushed=sc.nextInt();
	s1.push(data_pushed);
	break;
	case 2:s1.pop();
	break;
	}
	System.out.println("do you want to continue stack operations\n1yes\n2no");
	ans=sc.nextInt();
}while(ans==1);
	}

}
/*enter choice
1push
2pop
1
enter data to be inserted in stack
34
do you want to continue stack operations
1yes
2no
1
enter choice
1push
2pop
1
enter data to be inserted in stack
76
do you want to continue stack operations
1yes
2no
1
enter choice
1push
2pop
1
enter data to be inserted in stack
23
do you want to continue stack operations
1yes
2no
1
enter choice
1push
2pop
1
enter data to be inserted in stack
98
do you want to continue stack operations
1yes
2no
1
enter choice
1push
2pop
2
popped data is:98
do you want to continue stack operations
1yes
2no
1
enter choice
1push
2pop
2
popped data is:23
do you want to continue stack operations
1yes
2no
*/