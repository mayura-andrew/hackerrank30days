package Car;

public class conditons {
	
	public static void practiceWhileLoop() {
		int x = 0;
		while(x<5) {
			System.out.println("The value of x" + x);
			x++;  // x = x +1
			
		}
	}
	
	
	public static void practiceDoWhileLoop() {
		int x = 0;
		do {
			System.out.println("The value of x" + x);
			x++;
		} while (x <10);
	}
	
	public static void practiceForLoop() {
		for (int x =0; x < 10; x++) {
			System.out.println("The value of x" + x);
		}
	}
	
	public static void practiceNestedForLoop() {
		for (int x =0; x < 10; x++) {
			for(int y = 0; y <10; y++) {
				System.out.println("The value of y" + y + 'x' + x);
				
			}
		}
	}
	
	public static void cal() {
		
		int n = 10;	
		for(int i =1; i >11; i++){
			int multi = n * i;
				System.out.println(n + "x" + i + "=" + multi);
			}
		
	}
	
	
	
	public static void Solution() {

	        int n = 10;
	        int multi;
	        for(int i =1; i >11; i++){
	            multi = n * i;
	            System.out.println(n + "x" + i + "=" + multi);
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceForLoop();
		//practiceNestedForLoop();

		//cal();
		Solution();
		
	}

}
