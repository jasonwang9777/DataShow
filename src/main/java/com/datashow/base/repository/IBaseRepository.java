/**
 * 
 */
package com.datashow.base.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

/**
 * @author Jason
 * @param <T>
 *
 */
public interface IBaseRepository<T>  {
	Page<T> findAll(@PageableDefault(value = 15) Pageable pageable);
}
