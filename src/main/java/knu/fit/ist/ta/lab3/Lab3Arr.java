/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab3;

/**
 *
 * @author User
 */
public class Lab3Arr {

    private double min;
    private double max;

    public Lab3Arr() {
        min = 0f;
        max = 0f;
    }

    public String ShowArray() {
        double[] array = new double[30];
        String str = "";

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 80)) / 10.;
            str += array[i] + " | ";
        }

        min = array[0];
        max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        return str;
    }

    public double GetMax() {
        return max;
    }

    public double GetMin() {
        return min;
    }

    public double CalculateMaxMin() {
        return max - min;
    }
}
