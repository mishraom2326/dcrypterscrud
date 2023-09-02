FROM openjdk:17
WORKDIR /usrdocker/src/student
COPY target/student-0.0.1-SNAPSHOT.jar /usr/src/student
CMD ["java","-jar","/usr/src/student/student-0.0.1-SNAPSHOT.jar"]