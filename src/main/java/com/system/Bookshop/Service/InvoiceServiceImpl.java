package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Invoice;
import com.system.Bookshop.Repository.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    private InvoiceRepo invoiceRepo;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepo.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return invoiceRepo.findAll();
    }

}
