/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author ASUS X509L
 */
public class FactoryProducer {
   
    public static CarFactory getCarFactory(String factoryType){
    
      if("toyota".equalsIgnoreCase(factoryType)){
      return new ToyotaCarFactory();
      }
      
      if("chevrolet".equalsIgnoreCase(factoryType)){
      return new ChevroletCarFactory();
      }
       return null;

    
    }
}
