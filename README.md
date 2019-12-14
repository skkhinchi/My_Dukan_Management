# EcxelToMySqlDatabase
Put your Excel file and Dump into the Database

Create Table in DatabaseName:- Myukan
                Table Name :- products
=>                
   CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `model_name` varchar(45) NOT NULL,
  `product_serial_no` varchar(45) NOT NULL,
  `group_associated` varchar(45) NOT NULL,
  `product_mrp` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) 

OAuth2-Authentication userid=> MyDukan
                     password=> shop123
              
              
Assignment (1):-  A script in any language to read the data given in the excel sheet and add this to the mysql database.(please make sure you added file,startIndex,endIndex) 


 curl -X POST \
  http://localhost:8080/abc \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 57817' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 503e9e18-668a-4bde-9924-d3299cdae537,e0343b76-95cc-4fe8-92a2-2bfb1213d0a9' \
  -H 'User-Agent: PostmanRuntime/7.20.1' \
  -H 'cache-control: no-cache' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F 'file=@/C:/Users/Sumit Khinchi/Downloads/beginner_assignment01.xlsx' \
  -F startIndex=1 \
  -F endIndex=111
  
  
  
*Show All Products

curl -X GET \
  http://localhost:8080/show-products 
  
  ================================================================================================================================
  
  
  Assignment (2):- 

	

	1. Write an API to update the price of a product given with the group and the price.

   curl -X PUT \
   http://localhost:8080/update-product \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 251' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 758a91b6-d190-4c07-aea3-5966eb01968d,0ed8351d-ae68-401e-9705-dfdb2b8d0ac3' \
  -H 'User-Agent: PostmanRuntime/7.20.1' \
  -H 'cache-control: no-cache' \
  -d '	{	"id": 112,
        "productName": "Save New Product Demo",
        "modelName": "Product Model Demo Updated",
        "productSerialNo": "DemoNumber Updated",
        "groupAssociated": "Group Demo New 1",
        "productMrp": "9000.0"
    }'
  
  
  
 	2.Write an API to add a new Product.
  
   curl -X POST \
  http://localhost:8080/save-product \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 221' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 70f385ac-c7cc-42a8-b217-7d22341bc57e,2e2147c7-9dee-4a0b-92cc-d34b6a49175f' \
  -H 'User-Agent: PostmanRuntime/7.20.1' \
  -H 'cache-control: no-cache' \
  -d '	{
        "productName": "Save New Product Demo",
        "modelName": "Product Model Demo",
        "productSerialNo": "DemoNumber",
        "groupAssociated": "Group Demo 1",
        "productMrp": "70002.0"
    }'
    
    3. Write an API to add change the group of a product(put the id of particular product and change the group(it's override the group Associated value)   )

	 curl -X PUT \
   http://localhost:8080/update-product \
  -H 'Accept: */*' \
  -H 'Accept-Encoding: gzip, deflate' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Length: 251' \
  -H 'Content-Type: application/json' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 758a91b6-d190-4c07-aea3-5966eb01968d,0ed8351d-ae68-401e-9705-dfdb2b8d0ac3' \
  -H 'User-Agent: PostmanRuntime/7.20.1' \
  -H 'cache-control: no-cache' \
  -d '	{	"id": 112,
        "productName": "Save New Product Demo",
        "modelName": "Product Model Demo Updated",
        "productSerialNo": "DemoNumber Updated",
        "groupAssociated": "Group Demo New 1",
        "productMrp": "9000.0"
    }'
  
  
  4. Write an API to return the list of groups available in the db, with the total number of products and total value of all products          (sum of prices of products) within that group.
        
        

