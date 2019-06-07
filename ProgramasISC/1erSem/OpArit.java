public class OpArit{
	public static void main(String[] Args){
	
		int m = 3, n = 2, a = 9;
		double x = 7.5, b = 0.5;
		double resA;
		double resB;
		double resC;
		double resD;
		double resE;
		double resF;
		
		System.out.println("(a)	(7-n)%2*7.5+9");
		resA = (7-n)%2*7.5+9;
		System.out.println(+ resA );
		
		System.out.println("b)	(4+n/m)/6.0*x");
		resB = (4+n/m)/6.0*x;
		System.out.println(+ resB );
		
		System.out.println("c) a+3/a");
		resC = a+3/a;
		System.out.println(+ resC );
		
		System.out.println("(d) 25/((a-4)*b)");
		resD = 25/((a-4)*b);
		System.out.println(+ resD );
		
		System.out.println("(e) a/b*a ");
		resE = a/b*a;
		System.out.println(+ resE );
		
		System.out.println("f) a%2 - 2%a ");
		resF = a%2 - 2%a;
		System.out.println(+ resF );
		
		}
}		