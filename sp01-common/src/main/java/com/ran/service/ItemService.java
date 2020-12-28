package com.ran.service;

import java.util.List;

import com.ran.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}

