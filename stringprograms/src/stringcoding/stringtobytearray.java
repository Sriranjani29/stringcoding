package stringcoding;

import java.util.Arrays;

public class stringtobytearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Capgemini";
		 byte[] byteArray = str.getBytes();
		 // print the byte[] elements
		 System.out.println("String to byte array: " + Arrays.toString(byteArray));

	}

}
