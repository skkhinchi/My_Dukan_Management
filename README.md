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



                


