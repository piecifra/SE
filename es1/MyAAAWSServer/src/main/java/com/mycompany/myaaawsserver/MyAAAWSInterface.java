/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myaaawsserver;

import javax.jws.WebService;
/**
 *
 * @author biar
 */
@WebService
public interface MyAAAWSInterface {
    
    java.lang.String[] getClients();
}
