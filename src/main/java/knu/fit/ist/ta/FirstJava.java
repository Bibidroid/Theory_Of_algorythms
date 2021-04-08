/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta;

/**
 *
 * @author ProBook
 */
public class FirstJava {

    private int example;
    public static int count;

    public FirstJava() {
        example = 5;
    }

    public FirstJava(int example) {
        this.example = example;
    }

    public void SetExample(int example) {
        this.example = example;
    }

    public int GetExample() {
        return example;
    }

    @Override
    public String toString() {
        return "Example = " + example;
    }
}