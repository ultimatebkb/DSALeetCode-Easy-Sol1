class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<=s.length()-1;i++)
			if(isvowel(s.charAt(i)))
				sb.append(s.charAt(i));
		
		
		sb=sb.reverse();
		StringBuilder sb2=new StringBuilder();
		
		int j=0;
		for (int i=0;i<=s.length()-1;i++) {
			if(isvowel(s.charAt(i))) {
				sb2.append(sb.charAt(j++));
			}else {
				sb2.append(s.charAt(i));
			}
		}
		
		
		//System.out.println(sb2.toString());
		return sb2.toString();
		
	}
	 static boolean isvowel(char c) {
		 
		 return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	 }
}
