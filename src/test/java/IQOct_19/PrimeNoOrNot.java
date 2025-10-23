package IQOct_19;

public class PrimeNoOrNot {
    static void main(String[] args) {
        // if the no is divisible by any no between 2 to ( no-1 ) then its not prime no

        int no=77;
        boolean isPrime=true;  // agar no 10 hai to usse 5 tak hi divide karke check karna padega
        // that is optimize logic
        //  always we are validating negative condition

        for (int i = 2; i <=no/2 ; i++) {
            if (no%i==0)
                isPrime=false;

        }
        if(isPrime)
            System.out.println(" number is prime ");
        else
            System.out.println(" number is not prime");
    }
}
