package stringcoding;


import java.text.SimpleDateFormat;
import java.util.Date;

public class stringtodate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String strDate = "29/12/96";
		 
        // Creating an object of Date class with reference
        // to SimpleDateFormat class and
        // lately parsing the above string into it
        Date date = new SimpleDateFormat("dd/mm/yyyy")
                        .parse(strDate);
 
        // Print and display the date corresponding
        // to above input string
        System.out.print(strDate + " " + date);
 
		
	}

}
