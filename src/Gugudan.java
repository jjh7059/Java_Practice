public class Gugudan {
	//배열 저장 메소드
	public static int[] calculate(int times) {
		int[] result = new int[19];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	//출력 메소드
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
} 