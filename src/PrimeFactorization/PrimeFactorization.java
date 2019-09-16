package PrimeFactorization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

/**
 * @author Varadharajan on 2019-09-11
 * @project name: GoldmansachsCoderPadQuestions
 */
public class PrimeFactorization {

    public static void main(String[] args) {

        long num = 27;
        final List list = primeFactors(num);

        list.stream()
                .distinct()
                .map(n -> n)
                .forEach(s -> System.out.println(s));

        Map<Long, Long> f2m = factors(2, num).boxed()
                .collect(toMap(f -> f, f -> new Long(1), Long::sum, LinkedHashMap::new));

        List<Long> factorsList = new ArrayList<>(f2m.keySet());
        List<Long> multiplicities = factorsList.stream().map(f2m::get).collect(toList());

        System.out.println(factorsList);
    }

    public static List primeFactors(long number) {

        List primeFactorsList = new ArrayList<>();
        long copyOfInput = number;

        for (int i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primeFactorsList.add(i); // prime factor
                copyOfInput /= i;
                i--;
            }
        }
        return primeFactorsList;
    }

    static LongStream factors(long lastFactor, long num) {
        return LongStream.rangeClosed(lastFactor, (long) Math.sqrt(num))
                .filter(x -> num % x == 0)
                .mapToObj(x -> LongStream.concat(LongStream.of(x), factors(x, num / x)))
                .findFirst()
                .orElse(LongStream.of(num));
    }
}
