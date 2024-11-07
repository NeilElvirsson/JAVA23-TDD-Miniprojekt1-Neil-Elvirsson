package miniprojecttestdriven;

import miniprojecttestdriven.primenumbers.PrimeNumbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {
    @Test
    @DisplayName("Test för att räkna primtal mellan 0 och 1000")
    public void testPrimeCounting() {

        PrimeNumbers primeNumbers = new PrimeNumbers();
        int count = primeNumbers.countPrimes(0,1000);
        assertEquals(168, count);

    }

    @Test
    @DisplayName("Test för giltig intervall 0-1000")
    public void testValidIntervall() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertTrue(primeNumbers.validateInput(0, 1000), "Intervall mellan 0 till 1000 är giltigt!");
    }

    @Test
    @DisplayName("Test för negativt startvärde")
    public void testInvalidNegativStart() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertFalse(primeNumbers.validateInput(-1, 1000),"Negativt startvärde är ogiltigt!");

    }

    @Test
    @DisplayName("Test för ogiltligt slutvärde")
    public void testInvalidEndValue() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertFalse(primeNumbers.validateInput(0, 1001), "Slutvärde större än 1000 är ogiltigt!");

    }

    @Test
    @DisplayName("Test för primtal mellan 0 och 10")
    public void testPrimeCountingSmallRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int count = primeNumbers.countPrimes(0, 10);
        assertEquals(4, count);
    }

    @Test
    @DisplayName("Test för startvärde som är större än slutvärde")
    public void testStartGreaterThanEnd() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertFalse(primeNumbers.validateInput(1000, 500), "Start värde större än slutvärde, ogiltigt!");

        assertTrue(primeNumbers.validateInput(500,500), "Startvärde lika med slutvärde är giltigt!");

        assertTrue(primeNumbers.validateInput(999,1000), "Startvärde nära slutvärde är giltigt!");
    }

    @Test
    @DisplayName("Test för primtal i ett mycket litet intervall")
    public void testSinglePrimeInRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int count1 = primeNumbers.countPrimes(2,2);
        assertEquals(1, count1, "Det finns exakt ett primtal mellan 2 och 2!");

        int count2 = primeNumbers.countPrimes(29,29);
        assertEquals(1, count2, "Där finns exakt ett primtal mellan 29 och 29!");
    }

    @Test
    @DisplayName("Test för intervall utan primtal")
    public void testNoPrimeInRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int count1 = primeNumbers.countPrimes(0,1);
        assertEquals(0, count1, "Det finns inga primtal  mellan 0 och 1!");

        int count2 = primeNumbers.countPrimes(4,5);
        assertEquals(1, count2, "Det finns ett primtal mellan 4 och 5!");
    }

    @Test
    @DisplayName("Test för mycket stora slutvärden")
    public void testVeryLargeEndValue() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertFalse(primeNumbers.validateInput(0, Integer.MAX_VALUE), "Slutvärde över 1000 är ogiltigt!");

        assertFalse(primeNumbers.validateInput(0, 1001), "Slutvärde över 1000 är ogiltigt!");

        assertTrue(primeNumbers.validateInput(0, 1000), "Slutvärde exakt 1000 är giltigt!");
    }

    @Test
    @DisplayName("Test för att summera primtal mellan 0 och 10")
    public void testSumPrimes() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int sum = primeNumbers.sumPrimes(0,10);
        assertEquals(17, sum, "Summan av primtal mellan 0 och 10 ska vara 17!");

        int sum2 = primeNumbers.sumPrimes(0,30);
        assertEquals(129,sum2, "Summan av primtal mellan 0 och 30 ska vara 129!");
    }
    @Test
    @DisplayName("Test för att kontrollera om ett tal är ett primtal")
    public void testIsPrime() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        assertTrue(primeNumbers.isPrime(2), "2 ska vara ett primtal!");

        assertFalse(primeNumbers.isPrime(1), "1 ska inte vara ett primtal!");
    }

    @Test
    @DisplayName("Test för att summera primtal mellan 0 och 10")
    public void testSumPrimesSmallRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int sum = primeNumbers.sumPrimes(0, 10);
        assertEquals(17, sum, "Summan av primtal mellan 0 och 10 ska vara 17!");
    }

    @Test
    @DisplayName("Test för att summera primtal mellan 10 och 20")
    public void testSumPrimesMediumRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        int sum = primeNumbers.sumPrimes(10, 20);
        assertEquals(60, sum, "Summan av primtal mellan 10 och 20 ska vara 60!");
    }
    @Test
    @DisplayName("Test för att summera primtal i ett intervall utan primtal")
    public void testSumPrimesNoPrimesInRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int sum = primeNumbers.sumPrimes(8, 10);
        assertEquals(0, sum, "Summan av primtal mellan 8 och 10 ska vara 0!");
    }

    @Test
    @DisplayName("Test för att summera primtal där start och slut är samma och är ett primtal")
    public void testSumPrimesSinglePrime() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int sum = primeNumbers.sumPrimes(13, 13);
        assertEquals(13, sum, "Summan av primtal mellan 13 och 13 ska vara 13!");
    }

    @Test
    @DisplayName("Test för att summera primtal där start och slut är samma och inte är ett primtal")
    public void testSumPrimesNonPrime() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int sum = primeNumbers.sumPrimes(4, 4);
        assertEquals(0, sum, "Summan av primtal mellan 4 och 4 ska vara 0!");
    }
}
