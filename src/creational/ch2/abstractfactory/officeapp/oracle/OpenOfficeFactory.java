/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch2.abstractfactory.officeapp.oracle;

import creational.ch2.abstractfactory.officeapp.OfficeAbstractFactory;
import creational.ch2.abstractfactory.officeapp.microsoft.MSOffice;

/**
 *
 * @author vichet
 */
public class OpenOfficeFactory extends OfficeAbstractFactory {

    @Override
    public MSOffice getMSOffice(String officeAppName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public OpenOffice getOpenOffice(String officeAppName) {

        switch (officeAppName.toUpperCase()) {
            case "WRITER":
                return new Writer();
            case "CALC":
                return new Calc();
            case "IMPRESS":
                return new Impress();
            default:
                throw new IllegalArgumentException("Invalid Office "
                        + "Application Name");
        }
    }

}


