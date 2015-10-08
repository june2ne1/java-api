package exceptions;

import java.util.concurrent.ArrayBlockingQueue;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작됨");
		int[] arr = {10,20,30};
		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.print(arr[i] +"\t");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			
			
		}
		System.out.println("프로그램이 종료됨");
	}

}
