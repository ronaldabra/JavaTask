import java.util.Scanner;


class Circle{
	double areaOfCircle(int r){
		return 3.14*(r*r);
	}


}

class Program2{
	public static void main(String[] args){
		Circle c = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input radius: ");
		
		int rad = scan.nextInt();

		

		double area = c.areaOfCircle(rad);
		System.out.println("Area of Cirle is: " + area);

	}
}