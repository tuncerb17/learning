package com.tuncerb17.learning;

import com.tuncerb17.learning.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeControllerTest {

    @Test
    public void sayHello() {
        HomeController homeController = new HomeController();
        String result = homeController.sayHello();
        assertEquals(result, "let's begin");
    }

}
