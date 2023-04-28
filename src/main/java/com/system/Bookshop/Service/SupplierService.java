package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    public Supplier saveSupplier(Supplier supplier);

    public List<Supplier> getAllSuppliers();

    public abstract Supplier getSupplierById(Integer id);

    public void deleteSupplier(Integer id);

}
