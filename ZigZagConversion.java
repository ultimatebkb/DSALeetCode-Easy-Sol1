class Solution {
    public String convert(String s, int numRows) {
        
        String n="";
	        
	        List<Character>[] rows = new List[numRows];
	        for (int i = 0; i < numRows; ++i)
	            rows[i] = new ArrayList<>();


            if (numRows==0){
	        	    	   
	        	return n;
	       
	        }
	       if (numRows==1) {
	    	   return s;
	       }
	       int counter=0;
	       while(counter <=s.length()) {
                int zig=1;
                if(counter==s.length()) {
                    break;
                }
                    if(zig==1) {
                                for(int i=0;i<numRows;i++)  if(counter<s.length()){
                                rows[i].add(s.charAt(counter));
                                if(counter<s.length()) {
                                    counter++;
                                }
                            }

                            zig=0;
                    }
                    
                    if(zig==0) {
                        for(int i=(numRows-2);i>0;i--) if(counter<s.length()){
                            rows[i].add(s.charAt(counter));
                            if(counter<s.length()) {
                                counter++;
                            }
                            }
                        zig=1;
                        }
            }
            //StringBuilder ret = new StringBuilder();
	        for(int i=0;i<numRows;i++) {
	        	
	        	for(int j=0;j<rows[i].size();j++)
	        	n=n.concat(rows[i].get(j).toString());
	        }
	      
	    //   n= n.replaceAll("[^a-zA-Z0-9]", "");
          return n;
    }
}
            

        
    
