package api.customers.gft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import api.customers.gft.models.Request;
import api.customers.gft.models.Response;
import api.customers.gft.services.ApiCustomersGFTServices;

/**
 * Controllador de HTTP WS 
 * @author walejandromt
 */
@Controller
public class ApiCustomersGFTController extends ExecutionController{

	@Autowired
	private ApiCustomersGFTServices apiCustomersGFTServices;
	
	/*
	 * (non-Javadoc)
	 * @see api.customers.gft.controllers.ExecutionController#getService()
	 */
	@Override
	public ApiCustomersGFTServices getService() {
		return apiCustomersGFTServices;
	}
	
	/**
	 * Metodo HTTP principal
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ResponseEntity<List<Response>> customer(Request request) {
		return requestExecution(request);
	}

}
