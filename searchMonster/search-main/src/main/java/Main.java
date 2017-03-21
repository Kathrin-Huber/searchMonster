import org.kitodo.search.api.*;
import org.kitodo.search.impl.SearchImplementation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by al-huber on 20.03.2017.
 */
public class Main {

    public static void main(String [] args)
    {
        SearchTupel<Integer> ageSmallerThanThirty = new SearchTupel<>();
        ageSmallerThanThirty.setFieldName("age");
        ageSmallerThanThirty.setValue(30);
        ageSmallerThanThirty.setOperator(Operator.SMALLER);

        SearchTupel<Integer> ageBiggerThanSixty = new SearchTupel<>();
        ageBiggerThanSixty.setFieldName("age");
        ageBiggerThanSixty.setValue(60);
        ageBiggerThanSixty.setOperator(Operator.BIGGER);

        SearchParameter<Process, SearchTupel<Integer>> userAgeSmaller = new SearchParameter<>();
        userAgeSmaller.setParameter(ageSmallerThanThirty);

        SearchParameter<Process, SearchTupel<Integer>> userAgeBigger = new SearchParameter<>();
        userAgeBigger.setParameter(ageBiggerThanSixty);

        HashMap concatinations = new HashMap<SearchParameter<?,?>, Concatination>();
        concatinations.put(userAgeBigger, Concatination.AND);

        userAgeSmaller.setConcatination(concatinations);

        SearchImplementation<Process,User> impl = new SearchImplementation();
        impl.search(userAgeSmaller);

    }

}
