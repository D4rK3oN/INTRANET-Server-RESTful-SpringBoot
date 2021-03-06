package com.d4rk3on.intranet.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.util.constant.UrlConstants;

/**
 * Employee controller
 * 
 * @author javier.moreno
 *
 */
@RestController
@RequestMapping(UrlConstants.PATH_SECURE + UrlConstants.EMPLOYEE)
public class EmployeeController extends GenericController {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -5113575402724058415L;

}
