package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAdd() {
        AppController controller = new AppController();
        assertEquals(5, controller.add(2, 3));
    }
}
