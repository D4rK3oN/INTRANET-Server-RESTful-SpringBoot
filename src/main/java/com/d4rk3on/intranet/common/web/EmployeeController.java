package com.d4rk3on.intranet.common.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.dto.response.EmployeeCompleteResponse;
import com.d4rk3on.intranet.common.model.dto.response.EmployeeSimpleResponse;
import com.d4rk3on.intranet.common.service.EmployeeService;
import com.d4rk3on.intranet.common.util.constant.UrlConstants;
import com.d4rk3on.intranet.common.util.function.CommonUtils;

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

	@Autowired
	private CommonUtils utils;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Get the Employee by employee number
	 * 
	 * @param employeeId
	 * @return EmployeeCompleteResponse
	 */
	@RequestMapping(value = UrlConstants.EMPLOYEE_ID, method = RequestMethod.GET)
	public EmployeeCompleteResponse getEmployeeById(@Valid @PathVariable("employeeId") String employeeId) {

		EmployeeBean employee = employeeService.getEmployeeById(employeeId);

		return null;
	}

	/**
	 * Get the list of employees
	 * 
	 * @return List<EmployeeSimpleResponse>
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeSimpleResponse> getEmployees() {

		List<EmployeeBean> listEmployee = employeeService.listEmployees();

		return null;
	}

}
