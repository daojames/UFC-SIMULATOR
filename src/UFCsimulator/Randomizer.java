package UFCsimulator;

public class Randomizer {

	public static int randomizer_1() {
		long num = System.currentTimeMillis() % 19;
		int num1 = (int) num;
		return Math.abs(num1);
	}
	
	public static int randomizer_2() {
		long num = System.nanoTime() % 19;
		int num1 = (int) num;
		return Math.abs(num1);
	}
	
	public static int randomizer_3() {
		long num1 = (int) (System.currentTimeMillis() / 1000);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer_4() {
		long num1 = (int) (System.nanoTime() / 1000);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer_5() {
		long num1 = (int) (System.currentTimeMillis() / 100);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer_6() {
		long num1 = (int) (System.nanoTime() / 100);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer_7() {
		long num1 = (int) (System.currentTimeMillis() / 10);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer_8() {
		long num1 = (int) (System.nanoTime() / 10);
		long num = num1 % 19;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_1() {
		long num = System.currentTimeMillis() % 99;
		int num1 = (int) num;
		return Math.abs(num1);
	}
	
	public static int randomizer100_2() {
		long num = System.nanoTime() % 99;
		int num1 = (int) num;
		return Math.abs(num1);
	}
	
	public static int randomizer100_3() {
		long num1 = (int) (System.currentTimeMillis() / 1000);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_4() {
		long num1 = (int) (System.nanoTime() / 1000);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_5() {
		long num1 = (int) (System.currentTimeMillis() / 100);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_6() {
		long num1 = (int) (System.nanoTime() / 100);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_7() {
		long num1 = (int) (System.currentTimeMillis() / 10);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	
	public static int randomizer100_8() {
		long num1 = (int) (System.nanoTime() / 10);
		long num = num1 % 99;
		int num2 = (int) num;
		return Math.abs(num2);
	}
	

}
