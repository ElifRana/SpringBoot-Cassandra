# SpringBoot-Cassandra

* docker-compose up -d
* docker ps 
* docker exec -it cassandra_id bash
* cqlsh
* describe keyspaces;
* CREATE KEYSPACE mykeyspace WITH replication = {'class':'SimpleStrategy','replication_factor':3};
* use mykeyspace;
* CREATE TABLE Product( id int PRIMARY KEY, name text);
* describe tables;

<img src="https://github.com/ElifRana/SpringBoot-Cassandra/blob/master/1.png"/> 
<img src="https://github.com/ElifRana/SpringBoot-Cassandra/blob/master/2.png"/>

* select * from product;

<img src="https://github.com/ElifRana/SpringBoot-Cassandra/blob/master/3.png"/>
