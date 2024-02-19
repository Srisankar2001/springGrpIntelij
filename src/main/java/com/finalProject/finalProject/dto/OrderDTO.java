package com.finalProject.finalProject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private Long id;
    private String name;
    private String description;
    private String price;
    private String location;
}
