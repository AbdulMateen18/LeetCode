class solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        else if(n==1) return true;
        else return n%2==0 && isPowerOfTwo(n/2);  
    }
} //class