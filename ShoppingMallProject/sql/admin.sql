CREATE database smp;
	  
use smp;
CREATE  TABLE user (
	id VARCHAR(45) NOT NULL ,
	name VARCHAR(45) NOT NULL ,
	password VARCHAR(45) NOT NULL ,
	PRIMARY KEY (id));

 
use smp; 	
INSERT INTO user(id,name,password)
VALUES ('1','kim', '1111');


