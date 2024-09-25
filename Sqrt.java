
public class Sqrt {
    public static int mySqrt(int x) {
    	long left = 0;
    	long right = (x/2) +1;
    	
    	while(left<right) {
    		long mid = left + (right - left) / 2 + 1;
    		long sq = mid * mid;
    		if(sq == x) {
    			return (int) mid;
    		}else if(mid*mid < x) {
    			left = mid;
    		}else {
    			right = mid - 1;
    		}
    	}
    	
    	return (int) left;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147395599));
	}

}
