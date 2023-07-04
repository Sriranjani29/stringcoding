package stringcoding;

public class splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "Split String By Split Method";
		   // split string from space
		   String[] result = str.split(" ");
		   for (int i=0; i < result.length; i++)
		   {
		     System.out.println(result[i]);
		   }

	}

}
