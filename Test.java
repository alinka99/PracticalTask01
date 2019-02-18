import java.util.Scanner;

class TriangleAction{
	
	boolean checkIfTriangle(double a, double b, double c){
		
		/*if (a >= b + c)
			return false;
		
		if (b >= a + c)
			return false;
		
		if (c >= a + b)
			return false;
		
		return true;*/
		
		return (a < b + c) && (b < a + c) && (c < a + b);

	}
	
}

class Input{

	double[] addData(){

		Scanner in = new Scanner(System.in);
		double[] sizes = new double [3];

		new Output().printData("Please, input length of the sides:");
		
		for (int i = 0; i < 3; i++)
			sizes[i] = in.nextDouble();
		
		in.close();

		return sizes;
	}
	
}

class Output{
	
	public void printData(String s){
		
		System.out.println(s);
		
	}
	
}

public class Test{
	
	public static void main(String args[]){
		
		double[] sizes = new Input().addData();
		new Output().printData(new TriangleAction().checkIfTriangle(sizes[0], sizes[1], sizes[2]) ? "Is a triangle" : "Is not a tringle");
		
	}
	
}