package com.klu.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // Use H2 in-memory DB for tests
class EcommerceApplicationTests {

    @Test
    void contextLoads() {
        // Test to ensure Spring context loads successfully
    }
}
