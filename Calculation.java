import java.util.Scanner;
public class Calculation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1,num2,calc,result;
 System.out.println("calculator ...chosse "
 		+ "Add for 1"
 		+ " subtract  2 "
 		+ "divide 3"
 		+ " multiply 4");
 
 Scanner in = new Scanner(System.in);
 calc = in.nextInt();
 System.out.println("enter two numbers");
 num1 = in.nextInt();
 num2 = in.nextInt();
 switch (calc) {
 case 1 :
	 result = num1 + num2;
	 System.out.println("the vaue of addition is" +result);
	 break;
case 2 :
	result = num1 - num2;
   System.out.println("the vaue of subraction is " +result);
   break;
   
 case 3 :
	 result = num1 / num2;
	 System.out.println("the value of division is" +result);
	 break;
	 
 case 4 :
	 result = num1 * num2;
	 System.out.println("the value of multiplication is" +result);
	 break;
	 default :
		 System.out.println("please choose the valid number from calculator");
 }
 in.close();
	}
}
