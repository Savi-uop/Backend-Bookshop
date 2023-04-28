package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {

    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoice();

}
