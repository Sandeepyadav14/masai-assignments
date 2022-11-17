package dao;

import exception.ProductException;
import modules.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    public String addProduct(Product product) throws ProductException;
    public List<Product> getAllProducts() throws ProductException;
    public List<Product> getAllProductQuantityLessThan(int quantity)throws ProductException;
    public String addProductQuantity(int productId, int Quantity)throws ProductException;
    public String deleteProductByProductName(String pname) throws ProductException;
    public Product getProductByProductName(String pname)throws ProductException;


}
