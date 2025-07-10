package org.customer.customermanagement.DTO;

public class CustomerData {
    private Long id;
    private String name;
    private String address;

    public CustomerData(Long id, String name, String address) {
        this.id=id;
    this.name=name;
    this.address=address;
}
public void setId(Long id) {
        this.id=id;
}
public long  getid() {
        return id;
}
public void setname(String name ) {
        this.name=name;
}
public String getname() {
        return name;
}
public void setAddress(String address) {
        this.address= address;
}
public String getAddress() {
        return address;
}
}
