

class Program5 {
	public static void main(String[] args){
		Program5 p5 = new Program5();
		p5.checkPositiveNegative(10);

	}

	public void checkPositiveNegative(int num){
		if(num < 0){
			System.out.println("negative");
			if(num%2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		else {
			System.out.println("positive");
		}
	}
}