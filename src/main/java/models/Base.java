/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.UUID;
import java.io.*;

/**
 *
 * @author for
 */
public class Base {
    public String ID;
    
    public String generate_uuid(){
        return UUID.randomUUID().toString();
    };
    
    public Base(){
        this.ID = this.generate_uuid();
    }
    public void pushToFile(){
        //save file to SACH.DAT;
    }
    public void PullFromFile(){
        //read from file SACH.DAT;
    }
}


