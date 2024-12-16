package com.scaler.productservicejanfeb24.dtos;

import com.scaler.productservicejanfeb24.models.Category;
import com.scaler.productservicejanfeb24.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto
{
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;

    public Product toProduct()
    {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);

        Category category1 = new Category();
        category1.setTitle(category);
        product.setCategory(category1);

        product.setImageUrl(image);
        return product;
    }
}
