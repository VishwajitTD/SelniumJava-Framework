package jeet;

public class DateRplaceHyphrn {

	public static void main(String[] args) {
		java.util.Date d= new java.util.Date();
		System.out.println(d);
		String d1=d.toString();
		String d2 =d1.replaceAll(":", "-");
		System.out.println(d2);

	}

}
