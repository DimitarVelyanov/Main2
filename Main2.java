
public class Main2 {

	public static void main(String[] args) {
		boolean tr=true;
		boolean fl=false;
		
		boolean c= tr && fl;
		System.out.print("true && false:");
		System.out.println(c);
		
		boolean d=tr||fl;
		System.out.print("tr||fl:");
		System.out.println(d);
		
		boolean opositeOfTrue=!tr;
		System.out.print("!tr:");
		System.out.println(opositeOfTrue);
		
		int a=3;
		int b=4;
		boolean result= a == 3 && b == 4;
		System.out.print("a==3&& b==4:");
		System.out.println(result);
		
		int x= 5;
		int y= 100;
		
		boolean operationPriority=(a==3||a==6)&&(x==18||x<y);
		System.out.print("(a==3||a==6)&&(x==18||x<y):");
		System.out.println(operationPriority);
		
				
		

	}

}
