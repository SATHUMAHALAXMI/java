package org.techzoo.shopping.order;

import java.util.Collection;
import org.techzoo.shopping.exception.ProductNotFoundException;
import org.techzoo.shopping.bean.Product;

public interface IOrder {
	boolean addProduct(Product p);
	boolean removeProduct(String pid) throws ProductNotFoundException;
	Collection<Product> getCartDetails();
	Product getProductFromCart(String pid) throws ProductNotFoundException;
	int productCount();
  double getCartPrice();
}