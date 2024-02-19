class Solution {
    public int myAtoi(String s) {
        if(s==null)return 0;
        else{
        int newint=0;
        s=s.replaceAll("\s","");
        int a=s.


        if(s[0]=="-"){
            newint*=-1;
        }


        return newint;}
    }
}
