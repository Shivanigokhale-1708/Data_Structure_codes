import java.util.Scanner;
class stack{
	int MAX=10;
	int stack_array[]=new int[MAX];
	int top=-1;
	public int is_stack_full()
	{
		if(top==(MAX))                  //stack full condition
		{
			return 1;
		}
		return 0;
	}
	public int is_empty()
	{
		if(top==-1)
		{
			return 1;
		}
		return 0;
	}
	public void push(int data)
	{
		if(is_stack_full()!=1)
		{
			if(top==-1)
			{
				top++;             //increment top and insert data at 1st position
				stack_array[top++]=data;
			}
			else{
				stack_array[top++]=data;         //insert data in stack when stack is not initially empty
			}
		}
		else{
			System.out.println("stack is full can't push the data");
		}
	}
	public int pop()
	{
		if(is_empty()!=1)
		{
			
			if(top!=0){            //check if stack contain only 1 element which is popped already
			return stack_array[--top];     
			}
			else{
				return -1;            //stack empty
			}
		}
		else{
			return -1;             //stack empty
		}
	}
	public void display_stack()
	{
		for(int i=top-1;i>=0;i--)
		{
			System.out.println(stack_array[i]);
		}
	}
}
public class Stack_implementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
stack s=new stack();
int choice;
int ans;
Scanner sc=new Scanner(System.in);
do{
	System.out.println("enter choice\n1push data\n2pop data\n3display stack");
	choice=sc.nextInt();
	switch(choice)
	{
	
	case 1:System.out.println("enter data to be pushed on stack");
	int data_pushed=sc.nextInt();
		s.push(data_pushed);
	break;
	case 2:int popped_data=s.pop();
	if(popped_data!=-1){
	System.out.println("popped data is:"+popped_data);
	}
	else{
		System.out.println("stack is empty");
	}
	break;
	case 3:s.display_stack();
	break;
	}
	System.out.println("do you want to continue stack operations\n1yes\n2no");
	 ans=sc.nextInt();
}while(ans==1);
	}

}
/*enter choice
1push data
2pop data
3display stack
1
enter data to be pushed on stack
4
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
1
enter data to be pushed on stack
67
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
1
enter data to be pushed on stack
89
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
1
enter data to be pushed on stack
123
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
1
enter data to be pushed on stack
2
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
2
popped data is:2
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
2
popped data is:123
do you want to continue stack operations
1yes
2no
1
enter choice
1push data
2pop data
3display stack
3
89
67
4
do you want to continue stack operations
1yes
2no
*/
