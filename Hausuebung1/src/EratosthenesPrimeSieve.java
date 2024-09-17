import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;
    private boolean[] isPrimeArray;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
        this.isPrimeArray = new boolean[obergrenze + 1];
        for (int i = 0; i <= obergrenze; i++) {
            isPrimeArray[i] = true;
        }
        sieve();
    }

    public void sieve() {
        isPrimeArray[0] = false;
        isPrimeArray[1] = false;
        for (int i = 2; i <= Math.sqrt(obergrenze); i++) {
            if (isPrimeArray[i]) {
                for (int j = i * i; j <= obergrenze; j += i) {
                    isPrimeArray[j] = false;
                }
            }
        }


    }


    @Override
    public boolean isPrime(int p) {
        return isPrimeArray[p];
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i <= obergrenze; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
