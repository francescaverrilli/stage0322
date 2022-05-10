package bo.impl;

import com.lr.Product;
import com.lr.ProductQoh;

import bo.ProductBo;
import bo.ProductQohBo;
import dao.ProductDao;

public class ProductBoImpl implements ProductBo{
	
	
	ProductDao productDao;
	ProductQohBo productQohBo;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao=productDao;
	}
	
	public void setProductQohBo(ProductQohBo productQohBo) {
		this.productQohBo=productQohBo;
	}
	
	
	@Override
	public void save(Product product, int qoh) {
		
		productDao.save(product);
		System.out.println("Prodotto inserito");
		
		ProductQoh productQoh= new ProductQoh();
		productQoh.setProductId(product.getProductId());
		productQoh.setQty(qoh);
		
		productQohBo.save(productQoh);
		System.out.println("ProductQoh inserito");
		
		
	}

}
