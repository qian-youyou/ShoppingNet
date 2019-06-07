package com.itshop.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.itshop.dao.AdminDao;
import com.itshop.domain.Category;
import com.itshop.domain.Order;
import com.itshop.domain.Product;

public interface AdminService {

	public List<Category> findAllCategory();

	public void saveProduct(Product product) throws SQLException;

	public List<Order> findAllOrders();

	public List<Map<String, Object>> findOrderInfoByOid(String oid);

}
