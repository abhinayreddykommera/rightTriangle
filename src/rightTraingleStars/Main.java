package rightTraingleStars;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(5);
	}
	
	
	public static void printSquareStar(int number) {
		if(number<5) {
			System.out.println("Invalid Value");
		}
		int row=0;
		int column=0;
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
