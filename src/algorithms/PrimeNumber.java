package algorithms;

/**
 * Prime Number - A number which is divisible by itself and 1.
 * Two algorithms are discussed here. O(n) time complexity.
 * @author Sanjeev
 */
public class PrimeNumber {
    
    public static void main(String[] args){
        System.out.print(isPrime2(719));
    }
    
    private static boolean isPrime(int n){
        for(int i=2;2*i<n;i++) {
            System.out.println("i: "+i+" n%i: "+ n%i);
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    //checks whether an int is prime or not.
    static boolean isPrime2(int n) {
    //check if n is a multiple of 2
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
         System.out.println("i: "+i+" n%i: "+ n%i);   
        if(n%i==0)
            return false;
    }
    return true;
}
        
}
