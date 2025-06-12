package com.ecommerce.product.service;

import com.ecommerce.product.dto.ProductDTO;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProducts() {
        // Arrange
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setPrice(100.0);
        product1.setDescription("Description 1");

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product 2");
        product2.setPrice(200.0);
        product2.setDescription("Description 2");

        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        // Act
        List<ProductDTO> products = productService.getAllProducts();

        // Assert
        assertEquals(2, products.size());
        assertEquals("Product 1", products.get(0).getName());
        assertEquals("Product 2", products.get(1).getName());
    }

    @Test
    void testAddProduct() {
        // Arrange
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("New Product");
        productDTO.setPrice(300.0);
        productDTO.setDescription("New Description");

        Product product = new Product();
        product.setId(3L);
        product.setName("New Product");
        product.setPrice(300.0);
        product.setDescription("New Description");

        when(productRepository.save(any(Product.class))).thenReturn(product);

        // Act
        ProductDTO savedProduct = productService.addProduct(productDTO);

        // Assert
        assertEquals("New Product", savedProduct.getName());
        assertEquals(300.0, savedProduct.getPrice());
        assertEquals("New Description", savedProduct.getDescription());
    }
}