/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapplication.chatdatabase;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Quoc Huy Ngo
 */
@Entity
@Table(name="message")
public class Message implements Serializable{
    @Id
    @Column(name="id")
    private int id;
    @Column(name="ms_from")
    private String ms_from;
    @Column(name="ms_to")
    private String ms_to;
    @Column(name="message")
    private String message;

     public Message() {
        this.ms_from = "Anonymous";
        this.ms_to = "Anonymous";
        this.message = "hello world";
    }
    
    public Message(String from , String to , String message){
        this.ms_from = from;
        this.ms_to = to;
        this.message = message;
    }
    
    public String getFrom() {
        return ms_from;
    }

    public void setFrom(String from) {
        this.ms_from = from;
    }

    public String getTo() {
        return ms_to;
    }

    public void setTo(String to) {
        this.ms_to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
