


class Program4{
	public static void main(String[] args){
		Program4 p4 = new Program4();
		p4.evenOdd(10);
	}

	void evenOdd(int num){
		if(num%2 == 0){
			System.out.println("even");
			System.out.println(num*num);
		}
		else {
			System.out.println("odd");
			System.out.println(num*num*num);
		}
	}
}