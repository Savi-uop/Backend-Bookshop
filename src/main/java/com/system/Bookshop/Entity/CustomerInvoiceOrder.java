package com.system.Bookshop.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class CustomerInvoiceOrder {

    @EmbeddedId
    private CustomerInvoiceOrderId id;

    @OneToOne
    @MapsId("customer_id")
    private Customer customer;

    @OneToOne
    @MapsId("invoice_id")
    private Invoice invoice;

    @OneToOne
    @MapsId("order_id")
    private Order order;

    @Embeddable
    public  static class CustomerInvoiceOrderId implements Serializable {
        private int customer_id;
        private int invoice_id;
        private int order_id;

        public CustomerInvoiceOrderId(){}

        public int getCustomer_id() {
            return customer_id;
        }

        public void setCustomer_id(int cust_id) {
            this.customer_id = customer_id;
        }

        public int getInvoice_id() {
            return invoice_id;
        }

        public void setInvoice_id(int invoice_id) {
            this.invoice_id = invoice_id;
        }

        public int getOrder_id() {
            return order_id;
        }

        public void setOrder_id(int order_id) {
            this.order_id = order_id;
        }

    }


}
