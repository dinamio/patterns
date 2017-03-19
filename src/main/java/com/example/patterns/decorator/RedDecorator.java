package com.example.patterns.decorator;

/**
 * Created by eugen on 3/19/17.
 */
public class RedDecorator extends InstrumentDecorator {

    Instrument instrument;

    public RedDecorator(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.println("This instrument is red:");
        instrument.play();
    }
}
