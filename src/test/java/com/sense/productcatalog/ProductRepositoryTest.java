package com.sense.productcatalog;

import com.sense.productcatalog.entity.Product;
import com.sense.productcatalog.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest(classes = com.sense.productcatalog.ProductcatalogApplication.class)
@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    //public ProductRepositoryTest(ProductRepository productRepository) {
    //    this.productRepository = productRepository;
    //}

    @Test
    void testProductMapping() {
        Product product = new Product();
        product.setName("Product 1");
        product.setDescription("Description for Product 1");
        product.setPrice(BigDecimal.valueOf(9.99));

        Product savedProduct = productRepository.save(product);

        //Verify Attributes
        assertThat(savedProduct).isNotNull();
        assertThat(savedProduct.getName()).isEqualTo("Product 1");
        assertThat(savedProduct.getDescription()).isEqualTo("Description for Product 1");
        assertThat(savedProduct.getPrice()).isEqualTo(9.99);

    }
}
