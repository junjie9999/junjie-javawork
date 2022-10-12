package FunctionInterface;

import java.util.function.Predicate;
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> pred=a->(a>10);
        System.out.println(pred.test(5));
    }
}