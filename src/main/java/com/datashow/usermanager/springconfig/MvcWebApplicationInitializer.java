/**
 * 
 */
package com.datashow.usermanager.springconfig;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author Jason
 *
 */
@Order(2)
public class MvcWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
}
