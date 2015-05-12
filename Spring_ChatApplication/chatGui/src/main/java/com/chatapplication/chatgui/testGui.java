/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapplication.chatgui;
/**
 *
 * @author Quoc Huy Ngo
 */
import com.chatapplication.chatdatabase.*;
import com.chatapplication.chatnetwork.*;
public class testGui {
    public static void main(String[] args){
        System.out.println("This 's gui");
        new testDB().test();
        new testNetwork().test();
    }
}
