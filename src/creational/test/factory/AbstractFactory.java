/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.test.factory;

/**
 *
 * @author vichet
 */
public abstract class AbstractFactory {
    public abstract Bird getBird(BirdType type);
    public abstract Instrument getInstrument(InstrumentType type);
}
