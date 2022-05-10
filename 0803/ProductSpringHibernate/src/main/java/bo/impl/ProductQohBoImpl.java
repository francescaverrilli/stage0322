package bo.impl;

import com.lr.ProductQoh;

import bo.ProductQohBo;
import dao.ProductQohDao;

public class ProductQohBoImpl implements ProductQohBo {
	
	ProductQohDao productQohDao;
	
	public void setProductQohDao(ProductQohDao productQohDao) {
		this.productQohDao = productQohDao;
	}


	@Override
	public void save(ProductQoh productQoh) {
		productQohDao.save(productQoh);
		
	}

}
