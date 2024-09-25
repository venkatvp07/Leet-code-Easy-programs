
public class ClimbingStairs {
    public static int climbStairs(int n) {
    	
    	int ans = 1;
    	int previous = 1;
    	for(int i=1;i<n;i++) {
    		int temp = ans + previous;
    		previous = ans;
    		ans = temp;
    	}
        return ans;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(5));
	}

}
