public class Main {
	//Задание 1.
    public static void main(String[] args) {
	}

	//Задание 2.
	public static void task2(){
    	byte b = 127;
    	short s = 12000;
    	int i = 25;
    	long l = 120120;
    	float f = 15.23456;
    	double d = 555.5555;
    	char c = '$';
    	boolean bl = true;
	}

	//Задание 3.
	public static double calc(double a, double b, double c, double d){
    	return a * (b + (c / d));
	}

	//Задание 4.
	public static boolean range(int a, int b){
    	int sum = a + b;
    	return sum > 9 && sum < 21;
	}

	//Задание 5.
	public static void writePositivOrNegative(int number){
    	String word = "Положительное";
    		if (number < 0) word = "Отрицательное";
    		System.out.println(word);
	}

	//Задание 6.
	public static boolean isNegative(int number){
    	return number < 0;
	}

	//Задание 7.
	public static void hello(String name){
    	System.out.println("Привет, " + name);
	}

	//Задание 8. Затруднился выполнить. Просьба подсказать.

}
