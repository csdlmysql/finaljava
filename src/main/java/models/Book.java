/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author for
 */
public class Book extends Base{
    public String name;
    public String author;
    public String category;
    public Date published_at;
    public static int avaiable = 0;
    public Book(String name, String author, String category){
        super();
        this.name = name;
        this.author = author;
        this.category = category;
        this.avaiable += 1;
    }
    boolean validName(String name){
        return false;
    }
    boolean validAuthor(String author){
        return false;
    }
    void add(){
        
    }
    
}
