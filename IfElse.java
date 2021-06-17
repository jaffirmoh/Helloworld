import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numA,numB;
System.out.println("number comparing");
Scanner h= new Scanner(System.in);
numA = h.nextInt();
numB = h.nextInt();
if (numA > numB)
{
	System.out.println("NUM1 IS GREATER ");
	System.out.println("<(\")");
}
else if(numA==numB)
{

	System.out.println("both are equal");

}
else
{
	System.out.println("NUM2 IS GREATER");
}
h.close();
	}

}
