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
public class OfficeAbstractFactoryDemo {

    public static void main(String[] args) {

        // Microsoft Office
        OfficeAbstractFactory microsoft
                = OfficeFactoryProducer.getOfficeFactory("MICROSOFT");

        MSOffice word = microsoft.getMSOffice("WORD");
        word.run();

        // Oracle OpenOffice
        OfficeAbstractFactory oracle
                = OfficeFactoryProducer.getOfficeFactory("ORACLE");

        OpenOffice writer = oracle.getOpenOffice("WRITER");
        writer.run();

        // Nested Calling
        microsoft.getMSOffice("EXCEL").run();
        oracle.getOpenOffice("CALC").run();

        MSOffice ppt = OfficeFactoryProducer.getOfficeFactory("MICROSOFT")
                .getMSOffice("POWERPOINT");
        ppt.run();

        OfficeFactoryProducer.getOfficeFactory("ORACLE")
                .getOpenOffice("IMPRESS").run();

    }
}
