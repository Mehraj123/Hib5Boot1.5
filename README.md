# Dockering the SpringBoot 2.X with Hibernate 5.X Microservice

## Docker Commands

### Show all the running container on machine

- docker ps 



### Show all the available container on machine 

- docker ps -a                  



### Building a docker image 

- docker build -f Dockerfile -t myapp .



### Running a docker image (Creating a docker container)

- docker run -p 2018:2018 myapp



### Pull mysql image from DockerHub

- docker pull mysql



### Running a docker image (Creating a docker container)

- docker run --name=dockersql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=hotel -e MYSQL_USER=root -d mysql



### Running an image with mysql 

- docker run --name=awesomehotel -p 2018:2018 --link dockersql:mysql -d myapp
