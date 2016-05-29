/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch2.abstractfactory.officeapp.microsoft;

import creational.ch2.abstractfactory.officeapp.OfficeAbstractFactory;
import creational.ch2.abstractfactory.officeapp.oracle.OpenOffice;

/**
 *
 * @author vichet
 */
public class MSOfficeFactory extends OfficeAbstractFactory {

    @Override
    public MSOffice getMSOffice(String officeAppName) {
        switch (officeAppName.toUpperCase()) {
            case "WORD":
                return new Word();
            case "EXCEL":
                return new Excel();
            case "POWERPOINT":
                return new PowerPoint();
            default:
                throw new IllegalArgumentException("Invalid Office "
                        + "Application Name");
        }
    }

    @Override
    public OpenOffice getOpenOffice(String officeAppName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
