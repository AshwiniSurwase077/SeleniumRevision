package method_with_returntype;

public class Example1 
{
public static void main(String[] args) 
{
	int num1=5;
	int num2=add(10, 20);
	System.out.println(num1+num2);
	System.out.println(num1*num2);
	System.out.println(num2);
	
	

}

public static int add(int a,int b)
{ int c=a+b;
	
   return c;
}
}
