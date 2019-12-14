package com.my.shop.Demo.Service;

import com.my.shop.Demo.Model.Products;
import com.my.shop.Demo.Repository.ProductsRepository;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;


    @Autowired
    private Products products;

    public void  migratingProducts(MultipartFile dataFile, Integer startIndex, Integer endIndex) throws Exception {

        InputStream ExcelFileToRead = dataFile.getInputStream();

        Workbook wb = new XSSFWorkbook(ExcelFileToRead);

        XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);

        XSSFRow row;
//        int rowCount = sheet.getLastRowNum();   //all row of db
        int rowCount=endIndex;      //if you want add limited row in db
        int startRow=startIndex;

        for (int i = startRow; i <= rowCount; i++)
        {
            row = (XSSFRow) sheet.getRow(i);

            int id=products.getId();

            products.setProductName(row.getCell(0).toString());
            products.setModelName(row.getCell(1).toString());
            products.setProductSerialNo(row.getCell(2).toString());
            products.setGroupAssociated(row.getCell(3).toString());
            products.setProductMrp(row.getCell(4).toString());


            productsRepository.save(new Products(products.getProductName(), products.getModelName(), products.getProductSerialNo(), products.getGroupAssociated(), products.getProductMrp()));

        }

    }
    public List<Products> showAllProducts()
    {
        List<Products> products= (List<Products>) productsRepository.findAll();
        return products;
    }

    public List<Products> findGroupAndPrize(String groupName, String productMrp)
    {
        return (List<Products>) productsRepository.findByGroupAssociatedAndProductMrp(groupName, productMrp);
    }

    public Products saveMethod() {
        return productsRepository.save(products);
    }


//    public List<Products> showByGroup(String groupName)
//    {
//        return productsRepository.findDistinctByGroupAssociated(groupName);
//    }
//
//
//    public Products editProduct(int id) {
//        return productsRepository.findById(id);
//    }


//    public Products save(Products products) {
//    }
//    public Products save()
//    {
//        return
//    }

}
