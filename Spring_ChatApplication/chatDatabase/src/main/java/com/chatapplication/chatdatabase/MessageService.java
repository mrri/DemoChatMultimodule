/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chatapplication.chatdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Quoc Huy Ngo
 */
@Component
public class MessageService {
    @Autowired
    MessageDAO messageDAO;

    public MessageDAO getMessageDAO() {
        return messageDAO;
    }

    public void setMessageDAO(MessageDAO messageDAO) {
        this.messageDAO = messageDAO;
    }
    
    public void addMessage(Message message){
        this.messageDAO.insert(message);
    }
}
