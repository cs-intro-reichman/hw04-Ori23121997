

public class Primes {
    public static void main(String[] args) {
        /**
         * to get n
         * to run loop from 2 - n
         * the loop need to div all num on the way to n 
         * each num div by 2 -- n-1 if the is no int so this is a prime
         * else this is not a prime
        */
       int n = Integer.parseInt(args[0]);
       String res = "2";
       if (n==2) {
        System.out.println("There are 1 primes between 2 and 2 (100% are primes)");
       }
       else if (n > 2) {
        System.out.println(2);
        int i = 3;
        int j = 2;
        int counter =0;
        while (i<=n) {
                    while (j<i) {
               int mod = i%j;
                if (mod == 0) {
                    i++;
                    j=2;
                    break;
                }else if (mod != 0 && j == i-1 ) {
                 res = res + i;
                 System.out.println(i);
                 j =2;
                 i++;
                 counter++;
                 break;
                }else if (mod != 0) {
                    j++;
                }
            }
        }

        double precent = ((double)(counter+1)/n)*100;
        System.out.println("There are " + (counter+1) + " primes between 2 and " + n 
       + " ("+ (int)precent +"%25 are primes)");
    }
}}