# LegalFirm

mysql.file: 

For creating a backend database for storing contactform and store email just write the following code

create database legalfirmdata;


CREATE TABLE `legalfirmdata`.`contactform` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `Phone` VARCHAR(45) NULL,
  `Email` VARCHAR(45) NULL,
  `description` TEXT NULL,
  PRIMARY KEY (`id`));



CREATE TABLE `legalfirmdata`.`storeemails` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


Steps for running the project: 

1. Install MySQL(workbench), eclipse 

2. Download the zip and import in the eclipse

3. Build the project and update maven 

4. Set the password and username of the MySQL in the workbench 

5. Run the script of MySQL in workbench to create database and tables 

6. And also set the email configuration to send mail from the project in the application properties

7. Now Run the project

8. Open the index.html page that is home page 

9. You can now run all features and also can check the database if all the data have been saved by using SQL commands in workbench

10. When you give valid email id and subscribe you will receive an email. You can verify that by checking your mail and also in workbench in the emailstore table the email.would havesaved


  
