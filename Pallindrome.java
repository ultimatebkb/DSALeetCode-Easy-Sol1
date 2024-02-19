class Solution {
    public boolean isPalindrome(int x) {
        boolean r = false;
         int p = 0;
            int a = x;
        if (x < 0)
            return r;
        else {
           
            while (!(x == 0)) {
                p += (x % 10);
                x /= 10;
                if (x > 0)
                    p *= 10;
            }
            
        }
        if (p == a)
                r=true;
        return r;

    }
}
