package org.customer.customermanagement.model;

public class Customer {
    private Long  id;
    private String name;
    private String address;



    public Customer(Long id, String name, String address) {
        this.id =id;
        this.name=name;
        this.address=address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
