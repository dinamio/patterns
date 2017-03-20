package com.example.patterns.abstractfactory;

/**
 * Created by eugen on 3/20/17.
 */
public class CabbageOsetinPieFactory implements OsetinPieFactory {
    @Override
    public OsetinPie createPie() {
        return new CabbageOsetinPie();
    }
}
