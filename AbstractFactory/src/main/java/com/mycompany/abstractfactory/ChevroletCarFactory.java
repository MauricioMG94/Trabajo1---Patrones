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
public class ChevroletCarFactory implements  CarFactory{

    @Override
    public Car createCar(String carType) {
      if("aveo".equalsIgnoreCase(carType)){
      return new Aveo();
      }
      
      if("sail".equalsIgnoreCase(carType)){
      return new Sail();
      }
       return null;
    
    }
    
}
