/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jmsclient;

import javax.jms.JMSException;
import javax.naming.NamingException;

/**
 *
 * @author biar
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException, JMSException {
        // TODO code application logic here
        NotificatoreQuotazioni n = new NotificatoreQuotazioni();
                n.start();	
    }
    
}
