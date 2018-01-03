/**
 * customerDao.java
 * com.customer.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2018年1月3日 		Administrator
 *
 * Copyright (c) 2018, TNT All Rights Reserved.
*/

package com.customer.dao;

import java.util.List;

import com.customer.entity.Customer;

/**
 * ClassName:customerDao
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   gjf001
 * @version  
 * @since    Ver 1.1
 * @Date	 2018年1月3日		下午5:49:48
 *
 * @see 	 
 *  
 */
public interface customerDao {

    public List<Customer> queryAllCustomers();
    public Customer queryCustomerByMobile(String moblie);
    
}

