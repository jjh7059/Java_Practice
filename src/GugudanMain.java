import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String inputValue = in.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		in.close();
		
		System.out.println(first + " " + second);
		
		for(int i = 2; i <= 19; i++) {
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result);
		}	
	}
}
