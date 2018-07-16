Dockering the SpringBoot 2.X with Hibernate 5.X Microservice

#Docker Commands

1) docker ps                         ----->  Show all the running container on machine
2) docker ps -a                      ----->  Show all the available container on machine

3) docker run --name=dockersql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=hotel -e MYSQL_USER=root -d mysql

4) docker run --name=awesomehotel -p 2018:2018 --link dockersql:mysql -d myapp