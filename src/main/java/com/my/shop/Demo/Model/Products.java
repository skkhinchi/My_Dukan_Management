package com.my.shop.Demo.Model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "product_serial_no")
    private String productSerialNo;

    @Column(name = "group_associated")
    private String groupAssociated;

    @Column(name="product_mrp")
    private String productMrp;


    public Products() {
    }

    public Products(String productName, String modelName, String productSerialNo, String groupAssociated, String productMrp) {

        this.productName = productName;
        this.modelName = modelName;
        this.productSerialNo = productSerialNo;
        this.groupAssociated = groupAssociated;
        this.productMrp = productMrp;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProductSerialNo() {
        return productSerialNo;
    }

    public void setProductSerialNo(String modelSerialNo) {
        this.productSerialNo = modelSerialNo;
    }

    public String getGroupAssociated() {
        return groupAssociated;
    }

    public void setGroupAssociated(String groupId) {
        this.groupAssociated = groupId;
    }

    public String getProductMrp() {
        return productMrp;
    }

    public void setProductMrp(String productMrp) {
        this.productMrp = productMrp;
    }



    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelSerialNo=" + productSerialNo +
                ", groupId=" + groupAssociated +
                ", mrp=" + productMrp +
                '}';
    }



}
