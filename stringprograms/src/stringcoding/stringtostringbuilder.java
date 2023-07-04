package stringcoding;

public class stringtostringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = {"Capgemini", "at", "Bangalore"};
	     StringBuilder sb = new StringBuilder();
	     sb.append(strs[0]);
	     sb.append(" "+strs[1]);
	     sb.append(" "+strs[2]);
	     System.out.println(sb.toString());
	}

}
