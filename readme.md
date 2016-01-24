**Build**

`mvn clean package` 

`sudo docker run -it --rm -v "$PWD":/usr/src/mymaven:rw -v /tmp/docker-m2cache:/root/.m2:rw -w /usr/src/mymaven maven:3-jdk-8 mvn clean package`

**Run**

`sudo docker build .`
