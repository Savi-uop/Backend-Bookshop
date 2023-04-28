package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Supplier;
import com.system.Bookshop.Repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    @Autowired
    private SupplierRepo supplierRepo;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepo.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepo.findAll();
    }

    @Override
    public Supplier getSupplierById(Integer id) {
        return supplierRepo.findById(id).get();
    }

    @Override
    public void deleteSupplier(Integer id) {
        supplierRepo.deleteById(id);
    }


}
