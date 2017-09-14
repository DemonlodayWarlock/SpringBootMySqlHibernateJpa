#Today hard work,Tomorrow happy life!


# SpringBootMySqlHibernateJpa
Local test for spring boot with mysql , hibernate, jpa

#Tips:
Spring boot is auto configured, we need follow the rule.
1.If want to use html as view, need add dependency:
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
   Besides, add folder "templates" in sourcefolder src/main/resources.
   
2.If want to use jsp as view, need add dependency:
        <dependency>
    		    <groupId>org.apache.tomcat.embed</groupId>
    		    <artifactId>tomcat-embed-jasper</artifactId>
    		    <scope>provided</scope>
		    </dependency>
  Besides, add folder "WEB-INF/jsp" in sourcefolder src/main/webapp.
  Also, config "spring.mvc.view.prefix" and "spring.mvc.view.suffix" in application.properties.
  If want to use static resources in jsp, need config "spring.resources.static-locations" in application.properties.
