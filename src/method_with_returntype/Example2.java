package method_with_returntype;

public class Example2 
{
public static void main(String[] args) 
{
	Example2 s2=new Example2();
	
	String strl=s2.convertNametouppercase("ashwini");
	System.out.println(strl);
}

public String convertNametouppercase(String inp) 
{
return inp.toUpperCase();

}

}
