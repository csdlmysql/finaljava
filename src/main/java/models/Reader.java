/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import models.*;
import java.util.ArrayList;

/**
 *
 * @author for
 */
public class Reader extends Base{
    private String fullname;
    private String address;
    private String phone;
    private ArrayList<Book> books;
    private boolean is_oke = true;
    
    public Reader(){
        super();
    }
    
    boolean borrow(Book obj){
        if (this.is_oke == true){
            books.add(obj);
            return true;
        }else{
            return false;
        }
    }
}
