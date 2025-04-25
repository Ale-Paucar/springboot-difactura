package com.alexispaucar.springboot.di.factura.springboot_difactura.controllers;

import com.alexispaucar.springboot.di.factura.springboot_difactura.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping
    @RequestMapping("/show")
    public Invoice show(){
        return  invoice;
    }
}
