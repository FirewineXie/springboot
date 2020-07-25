package com.study.springcloud.providerticket.controller;

import com.study.springcloud.providerticket.server.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Firewine
 * @version 1.0
 * @ProgramName: TicketController
 * @Create 2020/7/25
 * @Description
 */
@RestController
public class TicketController {
    
    @Autowired
    TicketService ticketService;
    
    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
