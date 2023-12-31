package org.example.service;

import org.example.model.OrderDetail;

import java.util.List;

public interface OrderService {
    void setAddress(String address);
    void setTotalPrice(int totalPrice);
    void setOrderIdFromDatabase();
    int getOrderId();
    int getTotalPrice();
    int calculateTotal(List<OrderDetail> orderDetails);
    boolean insertOrder();
    void printReceipt(String filePath, ProductService productService, OrderDetailService orderDetailService);
}
