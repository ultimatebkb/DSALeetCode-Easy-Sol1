class Solution {
    public int maxArea(int[] height) {
        
        int max=0;
		int area=0;
	        for (int i=0; i<=height.length/2;i++){
	            for (int j=height.length-1;j>=height.length/2;j--){
	                 int len=j-i;
	                 int temp= Math.min(height[i], height[j]);
	                 
	                 if((temp*temp*len)>area){
                         area=temp*temp*len;
                         //if(len)
                         max=temp*len;
                     }
	                	 

	            }
	        }

        return max;
    }
}
