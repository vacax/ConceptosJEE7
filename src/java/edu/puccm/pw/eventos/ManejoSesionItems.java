/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.puccm.pw.eventos;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 *
 * @author vacax
 */
@WebListener
public class ManejoSesionItems implements HttpSessionAttributeListener{

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("Incluyendo el atributo "+event.getName()+" = "+event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
       System.out.println("Removiendo el atributo "+event.getName()+" = "+event.getValue()); 
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
       System.out.println("Reemplazado el atributo "+event.getName()+" = "+event.getValue());  
    }
    
}
