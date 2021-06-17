import java.util.Scanner;

public class DoWhile0 {
	public static void main(String[] args) {  
	    int i;
	    Scanner h=new Scanner(System.in);
	    i = h.nextInt();
	    do{  
	        System.out.println(i);  
	      i++;
	    }while(i<=100);  
	    h.close();}
}
