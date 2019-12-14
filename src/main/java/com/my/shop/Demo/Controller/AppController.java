package com.my.shop.Demo.Controller;

import com.my.shop.Demo.Model.Products;
import com.my.shop.Demo.Repository.ProductsRepository;
import com.my.shop.Demo.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class AppController {

    @Autowired
    private Products products;

    @Autowired
    private ProductsService productsService;

    @Autowired
    private ProductsRepository productsRepository;
////    ProductsService ps=new ProductsService();
//    String file = System.getProperty("user.dir")+"C:\\Users\\Sumit Khinchi\\Downloads\\beginner_assignment01.xlsx";
//    String sheetName="product_listing";
//    int startIndex=5;
//    int endIndex=28;


    @RequestMapping(value = "/abc", method = RequestMethod.POST)
    @ResponseBody
    public String addData(@RequestParam(value = "file") MultipartFile file,@RequestParam(value = "startIndex") Integer startIndex,@RequestParam(value = "endIndex") Integer endIndex) throws Exception {
        productsService.migratingProducts(file, startIndex, endIndex);
            return "Operation success ";
    }
    @ResponseBody
    @RequestMapping("/")
    public String Hello()
    {
        return "Hello ! Sucessfully Login .....";
    }


    @GetMapping("/show-products")
    public List<Products> showAllProducts() {
//       List<Products> products=productsService.showAllProducts();
        return (List<Products>) productsRepository.findAll();
    }


    @PostMapping("/save-product")
    public Products save(@RequestBody Products products)
    {
//        return productsService.saveMethod();
        return productsRepository.save(products);
    }




    @PutMapping("/update-product")
    public Products update(@RequestBody Products products) {
        return productsRepository.save(products);
    }

//
//        @RequestMapping("/update-product-price")
//        public Products updatePrice(@RequestParam String groupId, String productMrp )
//    {
//            return productsService.findGroupAndPrize(group,productMrp);
//
//
//    }

//    @GetMapping("/product/{id}")
//    public Products get(@PathVariable int id) {
//        Optional<Products> products = productsRepository.findById(id);
//        if(products.isPresent()) {
//            return products.get();
//        }else {
//          return productsRepository.save(products);
//        }
//    }


}
