sudo docker run -it --rm -v "$PWD":/usr/src/mymaven:rw -v ~/.m2:/root/.m2:rw -w /usr/src/mymaven maven:3-jdk-8 mvn clean package
