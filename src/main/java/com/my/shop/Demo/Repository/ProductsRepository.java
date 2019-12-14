package com.my.shop.Demo.Repository;

import com.my.shop.Demo.Model.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends CrudRepository<Products, Integer> {

//    @Query(value = "SELECT DISTINCT p.product_name FROM Products p",nativeQuery = true)

//    public List<Products> findDistinctByGroupAssociated(String groupId);
//
//    public Products findById(int id);
    public Products findByGroupAssociatedAndProductMrp(String groupName,String prouductMrp);

}
