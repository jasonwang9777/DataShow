/**
 * 
 */
package com.datashow.base.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Jason
 *
 */
public interface IBaseService<T> {
	public Page<T> findAllFromPage(Pageable page);
}
