/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.ch4.builderpattern.person;

/**
 *
 * @author vichet
 */
public class ProductBuilder implements Builder {

    private Product product = new Product();
    
    @Override
    public void buildPart() {
        
    }
    
    public Product getResult() {
        return this.product;
    }
}
