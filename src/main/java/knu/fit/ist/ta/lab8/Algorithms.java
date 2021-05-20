package knu.fit.ist.ta.lab8;


import java.util.Arrays;
import java.util.Random;


public class Algorithms {
    private int[] _array;
    
    public Algorithms(int length)
    {
        _array = GenerateArray(length);
    }
    
    public int[] GenerateArray(int length)
    {
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
           array[i] = rd.nextInt();
        return array;
    }
    
    public AlgorithmDetails bubbleSort() {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        for(int i=0; i < array.length; i++){ 
            comparisons++;
            for(int j=1; j < array.length - i; j++){  
                comparisons += 2;
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;
                    substitutions++;
                }                
            }  
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    public AlgorithmDetails SelecionSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = array.length-1;
        int comparisons = 0;
        int min_idx = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length-1; i++)
        {
            comparisons++;
            min_idx = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min_idx])
                    min_idx = j;
                comparisons += 2;
            }
            temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    private void QuickSortInner(int[] array, int low, int high, AlgorithmDetails details)
    {
       details.setComparisons(details.getComparisons() + 1);
       if (array.length == 0)
            return;
       
        details.setComparisons(details.getComparisons() + 1);
        if (low >= high)
            return;
 
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        int i = low, j = high;
        while (i <= j) {
            details.setComparisons(details.getComparisons() + 1);
            while (array[i] < opora) {
                i++;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            while (array[j] > opora) {
                j--;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                details.setSubstitutions(details.getSubstitutions() + 1);
                details.setComparisons(details.getComparisons() + 1);
            }
        }
 
        details.setComparisons(details.getComparisons() + 1);
        if (low < j)
            QuickSortInner(array, low, j, details);
        details.setComparisons(details.getComparisons() + 1);
        if (high > i)
            QuickSortInner(array, i, high, details);
    }
    
    public AlgorithmDetails QuickSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        long startTime = System.nanoTime();
        QuickSortInner(array, 0, array.length - 1, details);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
}