package com.ecommerce.promotion.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Promotion {

	private String id;
	private String type;
	private Double offerPrice;
	private Double discount;
	private String name;
	private List<PromotionItem> promotionItem = new ArrayList<PromotionItem>();
	
	

	
}
