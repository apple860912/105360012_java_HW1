package sample10;

public class sample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a=10;
			int b=5;
			
			System.out.println("變數a和b的各種運算:");
			System.out.println("a+b="+(a+b));
			System.out.println("a-b="+(a-b));
			System.out.println("axb="+(a*b));
			System.out.println("a/b="+(a/b));
			System.out.println("a%b="+(a%b));
			
			int d=0;
			int e=0;
			int f=0;
			
			e=d++;
			f=++d;
			System.out.println("因為是在指定值之後才遞增，所以e="+e);
			System.out.println("因為是在遞增之後才指定值，所以f="+f);
	}

}
