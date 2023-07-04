package stringcoding;

public class concatenationinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       StringBuilder stbu=new StringBuilder();
	       //Initial object size
	       System.out.println(stbu.capacity());
	       String str="Scaler";
	       System.out.println(str);
	       String str1 = new String("InterviewBit");
	       System.out.println(str1);
	       str1 += " Articles";         //string update
	       System.out.println(str1);

	}

}
