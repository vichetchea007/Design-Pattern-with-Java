/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch2.abstractfactory.officeapp;

import creational.ch2.abstractfactory.officeapp.microsoft.MSOfficeFactory;
import creational.ch2.abstractfactory.officeapp.oracle.OpenOfficeFactory;

/**
 *
 * @author vichet
 */
public class OfficeFactoryProducer {
    
    public static OfficeAbstractFactory getOfficeFactory(String factoryName) {
        
        switch (factoryName) {
            case "MICROSOFT":
                return new MSOfficeFactory();
            case "ORACLE":
                return new OpenOfficeFactory();
            default:
                throw new IllegalArgumentException("Invalid Factory Name");
        }
        
        
    }
    
}
