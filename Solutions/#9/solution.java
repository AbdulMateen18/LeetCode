class solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
    	    rev = rev*10 + x%10;
    	    x = x/10;
        }//while
        return (x==rev || x==rev/10);
    }//isPalindrome()
}//class

// A solution I studied in my collage