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
public class AbstractFactoryTest {
    
    public static void main(String[] args) {
        
        CarFactory chevroletCarFactory = FactoryProducer.getCarFactory("chevrolet");
        
        Car aveo = chevroletCarFactory.createCar("aveo");
        aveo.driven(); 
        
        Car sail = chevroletCarFactory.createCar("sail");
        sail.driven(); 
        
        
        CarFactory toyotaCarFactory = FactoryProducer.getCarFactory("toyota");
        
        Car txl = toyotaCarFactory.createCar("txl");
        txl.driven();
        
        Car prado = toyotaCarFactory.createCar("prado");
        prado.driven();
    }
       
    
}
