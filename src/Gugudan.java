public class Gugudan {
	//�迭 ���� �޼ҵ�
	public static int[] calculate(int times) {
		int[] result = new int[19];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	//��� �޼ҵ�
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
} 