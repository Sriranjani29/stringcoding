package stringcoding;

import java.util.StringJoiner;

public class stringjoiner {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		
		   StringJoiner joinStrings = new StringJoiner(",", "[", "]");
	       // passing comma(,) and square-brackets as delimiter   
	         
	       // Adding values to StringJoiner  
	       joinStrings.add("Scaler");  
	       joinStrings.add("By");  
	       joinStrings.add("InterviewBit");            
	       System.out.println(joinStrings);  
	}

}
