public class AddBinary {
	
    public static String addBinary(String a, String b) {
    	
    	int carry = 0;
    	int a_len = a.length() - 1;
    	int b_len = b.length() - 1;
    	StringBuilder output = new StringBuilder();
    	while(a_len>=0 || b_len>=0) {
    		int ans =  0;
    		if(a_len>=0) {
    			ans+= a.charAt(a_len) - '0';
    		}
    		if(b_len>=0) {
    			ans+= b.charAt(b_len) - '0';
    		}
    		ans+=carry;
    		output.append(ans%2);
    		carry = ans/2;
    		a_len--;
    		b_len--;
    	}
    	if(carry != 0) {
    		output.append(carry);
    	}
    	return output.reverse().toString();
    }
	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}

}
