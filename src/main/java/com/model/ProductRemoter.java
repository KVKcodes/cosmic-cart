package com.model;

import javax.ejb.Remote;
import com.Bean.Product;
@Remote
public interface ProductRemoter {
   String insertData(Product p)throws Exception;
}
