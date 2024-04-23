// Solution using recursion

class solution {
    public int maxScore(String s) {
        int ones=0,zeros=0,max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') ones++;
            else zeros++;
            if(i!=s.length()-1) max = Math.max(zeros-ones,max);
        }
        return max+ones;
    }
}