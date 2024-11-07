package miniprojecttestdriven.primenumbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange startvärde för intervallet");
        int start = scanner.nextInt();

        System.out.println("Ange slutvärde för intervallet");
        int end = scanner.nextInt();

        PrimeNumbers primeNumbers = new PrimeNumbers();

        if (primeNumbers.validateInput(start, end)) {

            int count = primeNumbers.countPrimes(start, end);
            int sum = primeNumbers.sumPrimes(start, end);

            System.out.println("Det finns " + count + "primtal mellan " + start + " och " + end + ". ");
            System.out.println("Den totala summan av primtal är " + sum + ". ");
        } else {
            System.out.println("Fel interval angivet!");
        }

        scanner.close();

    }

    public int countPrimes(int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumPrimes(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }


    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public boolean validateInput(int start, int end) {

        if (start >= 0 && end <= 1000 && start <= end) {

            return true;
        }
        return false;
    }
}
