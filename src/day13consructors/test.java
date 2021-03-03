package day13consructors;

public class test {
    public static void main(String[] args) {
    	

		String s = new String("Hi there!");

		int pos = s.indexOf("t");

		int idx =0;

		while(idx<s.length()) {

			if(s.charAt(idx)=='e') {

				pos++;

			}

			idx++;

		}

		String result = s.substring(0, pos);

		System.out.println(result);

}
}