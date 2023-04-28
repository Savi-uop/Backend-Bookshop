package com.system.Bookshop.Controller;


import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Supplier;
import com.system.Bookshop.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "api/v1/supplier")
@CrossOrigin("http://localhost:3000")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/getSuppliers")
    public List<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @PostMapping("/saveSupplier")
    public String saveSupplier(@RequestBody Supplier supplier){
        supplierService.saveSupplier(supplier);
        return "new supplier is added" ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supplier> getSupplier(@PathVariable Integer id){
        try{
            Supplier supplier = supplierService.getSupplierById(id);
            return new ResponseEntity<Supplier>(supplier, HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<Supplier>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("update/{id}")
    public ResponseEntity<Supplier> updateSupplier(@RequestBody Supplier supplier, @PathVariable Integer id){
        try{
            Supplier existingSupplier = supplierService.getSupplierById(id);
            supplierService.saveSupplier(supplier);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<Supplier>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleting/{id}")
    public String deleteSupplier(@PathVariable Integer id){
        supplierService.deleteSupplier(id);
        return "Deleted supplier with ID :" + id + " successfully!";
    }

}
