import java.util.*;
class node
{
	int data;
	node next;
	public node(int d)
	{
		data=d;
		next=null;
	}
	
}
class Linkedlist_implementation
{
	node head;
	Scanner sc=new Scanner(System.in);
	public void create_list()
	{
		int data_to_insert;
		System.out.println("enter data to be inserted");
		data_to_insert=sc.nextInt();
		node insert_data=new node(data_to_insert);
		if(head==null)                     //if linked list is empty 
		{
			head=insert_data;
		}
		else{
			node temp=head;
			while(temp.next!=null)           //traverse linked list till end
			{
				temp=temp.next;
			}
			temp.next=insert_data;
		}
	}
	
	public void display_list(){
		node temp=head;
		System.out.println("list is:");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void insert_at_position(){
		int pos,data_at_position;
		System.out.println("enter position where data is to be inserted");
		pos=sc.nextInt();
		System.out.println("enter data to be inserted");
		data_at_position=sc.nextInt();
		if(pos==1 && head==null) //if position is 1 and linked list is empty
		{
			node temp=new node(data_at_position);
			head=temp;
		}
		else if(head!=null)
		{
			if(pos==1)           //insert at position 1 & linked list is not empty
			{
				node temp=new node(data_at_position);
				temp.next=head;
				head=temp;
			}
			else if(pos<=count_nodes())  //insert at any position in between
			{
				node temp=head;
				node temp1=null;
				int count=1;
				while(temp!=null && count!=pos)
				{
					temp1=temp;
					temp=temp.next;
					count++;
				}
				if(count==pos)
				{
				node insert_at_pos=new node(data_at_position);
				temp1.next=insert_at_pos;
				insert_at_pos.next=temp;
				}
				
			}
			else if(pos==count_nodes()+1)     //inserting at end of linkedlist
			{
				node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				node insert_at_pos=new node(data_at_position);
				temp.next=insert_at_pos;
			}
			else{
				System.out.println("position entered is not valid for created list!!");
			}
		}
		display_list();
	}
	public int count_nodes()
	{
		node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		return count;                  //return no of nodes in linked list
	}
	public void delete_at_position()
	{
		int pos;
		System.out.println("enter pos from which data is to be deleted");
		pos=sc.nextInt();
		if(pos==1 && head!=null) //if pos is 1 and linkedlist is not empty
		{
			node temp=head;
			head=head.next;
			temp=null;
			display_list();
		}
		else if(pos<=count_nodes())   //delete data at any position in between
		{
			int count=1;
			node temp=head;
			node temp1=null;
			while(temp.next!=null && pos!=count)
			{
				temp1=temp;
				temp=temp.next;
				count++;
			}
			if(pos==count)
			{
				temp1.next=temp.next;
				temp.next=null;
			}
		
		System.out.println("after deletion");
			display_list();
		}
		else if(pos>count_nodes())
		{
			System.out.println("position you entered is out of bounds for given linked list size");
		}
		
		}
	
}
public class Linkedlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linkedlist_implementation l1=new Linkedlist_implementation();
Scanner sc=new Scanner(System.in);
int choice;
int ans;
do{
	System.out.println("enter choice\n1insert data\n2display data\n3insert_at_any_position\n4delete at position");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:l1.create_list();
	break;
	case 2:l1.display_list();
	break;
	case 3:l1.insert_at_position();
	break;
	case 4:l1.delete_at_position();
	break;
	}
	
	System.out.println("\ndo you want to continue operations on list\n1yes\n2no");
	ans=sc.nextInt();
}while(ans==1);
	}

}
/*enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
1
enter data to be inserted
12

do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
1
enter data to be inserted
56

do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
1
enter data to be inserted
89

do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
1
enter data to be inserted
4

do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
1
enter data to be inserted
654

do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
2
list is:
12 56 89 4 654 
do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
3
enter position where data is to be inserted
3
enter data to be inserted
27
list is:
12 56 27 89 4 654 
do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
4
enter pos from which data is to be deleted
2
after deletion
list is:
12 27 89 4 654 
do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
4
enter pos from which data is to be deleted
5
after deletion
list is:
12 27 89 4 
do you want to continue operations on list
1yes
2no
1
enter choice
1insert data
2display data
3insert_at_any_position
4delete at position
4
enter pos from which data is to be deleted
1
list is:
27 89 4 
do you want to continue operations on list
1yes
2no
*/