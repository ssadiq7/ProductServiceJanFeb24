package com.scaler.productservicejanfeb24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
