package test;

public class Gugudan {

	public static void main(String[] args) {

		int dan;
		int i;
		System.out.println("****구구단****");
		for (dan = 2; dan < 10; dan++) {
			System.out.println("-----------" + dan + "단----------");
			for (i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		}
		
		
			
		}
	}

