// Using Recursion
/* 
class solution {
    public double myPow(double x, long n) {
        if(n<0){
            n= Math.abs(n);
            x=1/x;
        }
        if(n==0) return 1;
        if(n%2==0) return myPow(x*x,n/2);
        else return x*myPow(x,n-1);
    }//myPow()
}//class
*/

// 2nd solution added

// class Solution {
//     public double myPow(double x, int n) {
//         double result = 1;
//         if(n<0){
//             n *= -1;
//             for(int i=0;i<n;i++){
//                 result *= (1/x); 
//             }
//         }else{
//             for(int i=0;i<n;i++){
//                 result *= x; 
//             }
//         }
        
//         return result;
//     }
// }

// Above solution gives "TIME LIMIT EXCEEDED ERROR"

class solution {
    public double myPow(double x, int n) {
        double ans=1;
        long n_temp = n;
        if(n_temp<0) n_temp *= -1;
        while(n_temp>0){
            if(n_temp%2==0){
                x = x*x;
                n_temp = n_temp/2;
            }else{
                ans = ans * x;
                n_temp--;
            }//else
        }//while
        if(n<0) return (double) 1/ans;
        return ans;
    }//myPow()
}//class

// Credits : Rutvik_Jasani