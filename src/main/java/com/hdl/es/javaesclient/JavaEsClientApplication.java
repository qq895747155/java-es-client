package com.hdl.es.javaesclient;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaEsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaEsClientApplication.class, args);
    }


    @Bean(name = "esClient")
    public RestHighLevelClient getEsClient() {

        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost(
                        "47.93.247.163", 9200, "http")));
        return client;
    }
}
