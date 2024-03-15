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
public class ToyotaCarFactory implements CarFactory{

    @Override
    public Car createCar(String carType) {
    
        if("txl".equalsIgnoreCase(carType)){
      return new Txl();
      }
      
      if("prado".equalsIgnoreCase(carType)){
      return new Prado();
      }
       return null;
        
    }
    
}
