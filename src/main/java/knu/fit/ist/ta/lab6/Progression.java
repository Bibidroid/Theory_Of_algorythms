
package knu.fit.ist.ta.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Progression {
    public static String GetSequence(int length, int base, int degree)
    {
        List array = new ArrayList(length);
        int counter = length;
        GetSequenceRecursion(array, base, counter);
        Collections.reverse(array);
        return array.toString();
    }
    
    private static void GetSequenceRecursion(List array, int base, int counter)
    {
        if(counter == 0)
            return;
        else
        {
            array.add(Math.pow(base, counter));
            GetSequenceRecursion(array, base, counter - 1);
        }
    }
}
