package com.system.Bookshop.Controller;

import com.system.Bookshop.Entity.Invoice;
import com.system.Bookshop.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/invoice")
@CrossOrigin
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/getInvoices")
    public List<Invoice> getAllInvoice(){
        return invoiceService.getAllInvoice();
    }

    @PostMapping("/saveInvoice")
    public String saveInvoice(@RequestBody Invoice invoice){
        invoiceService.saveInvoice(invoice);
        return "new invoice created!" ;
    }

}
