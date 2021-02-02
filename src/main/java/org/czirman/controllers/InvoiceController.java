package org.czirman.controllers;

import lombok.RequiredArgsConstructor;
import org.czirman.api.InvoiceEndpoint;
import org.czirman.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor - TODO obadać jak te wstrzykiwanie sie ma do Autowired
public class InvoiceController implements InvoiceEndpoint {

    @Autowired
    private InvoiceService invoiceService;


    @Override
    public ResponseEntity<String> addInvoice() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> editInvoide() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteInvoide() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getInvoide() {
        invoiceService.getInvoice();
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
