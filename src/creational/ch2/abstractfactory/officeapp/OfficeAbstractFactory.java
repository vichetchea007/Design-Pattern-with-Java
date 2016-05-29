/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.ch2.abstractfactory.officeapp;

import creational.ch2.abstractfactory.officeapp.microsoft.MSOffice;
import creational.ch2.abstractfactory.officeapp.oracle.OpenOffice;

/**
 *
 * @author vichet
 */
public abstract class OfficeAbstractFactory {

    public abstract OpenOffice getOpenOffice(String officeAppName);

    public abstract MSOffice getMSOffice(String officeAppName);

}
