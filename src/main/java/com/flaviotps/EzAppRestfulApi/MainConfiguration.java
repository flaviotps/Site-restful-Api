package com.flaviotps.EzAppRestfulApi;


import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class MainConfiguration {

    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI("postgres://eipnejvbbzxlug:7db22778ca0da5ef872fb24c8ab9ae3fd2279a485d0f675cdceb02048060d578@ec2-23-21-171-249.compute-1.amazonaws.com:5432/d34sajf37v3dge");

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }
}
