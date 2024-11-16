package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriceInfoDTO {
	private String goodName;
	private Integer goodPrice;

}
