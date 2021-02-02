package org.czirman.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Provides api for invoice operation")
@RequestMapping(value = InvoiceEndpoint.REQUEST_MAPPING)
public interface InvoiceEndpoint {

    String REQUEST_MAPPING = "/invoice";

    @ApiOperation(value = "Add invoide")
    @PostMapping(path = "/addinvoide")
    public ResponseEntity<String> addInvoice();

    @ApiOperation(value = "Edit invoide")
    @PatchMapping(path = "/editinvoide")
    public ResponseEntity<String> editInvoide();

    @ApiOperation(value = "Delete invoide")
    @DeleteMapping(path = "/deleteinvoide")
    public ResponseEntity<String> deleteInvoide();


    @ApiOperation(value = "Delete invoide")
    @GetMapping(path = "/getinvoide")
    public ResponseEntity<String> getInvoide();




}
