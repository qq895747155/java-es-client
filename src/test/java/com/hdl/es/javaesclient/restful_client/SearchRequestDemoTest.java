package com.hdl.es.javaesclient.restful_client;

import com.hdl.es.javaesclient.JavaEsClientApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JavaEsClientApplication.class)
public class SearchRequestDemoTest {

    @Autowired
    SearchRequestDemo searchRequestDemo;

    @Test
    public void searchData(){
        try {
            searchRequestDemo.searchData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
