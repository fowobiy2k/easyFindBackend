From tomcat:latest

copy target/easy-find-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

cmd ["catalina.sh", "run"]