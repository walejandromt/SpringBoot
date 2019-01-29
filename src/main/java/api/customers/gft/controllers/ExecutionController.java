package api.customers.gft.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import api.customers.gft.models.MensajeResponse;
import api.customers.gft.models.Request;
import api.customers.gft.models.Response;
import api.customers.gft.services.ApiCustomersGFTServices;

public class ExecutionController {

	public ApiCustomersGFTServices getService() {
		return null;
	}
	
	/**
	 * Catch base para todos los controladores
	 * @param request
	 * @return
	 */
	public <T> ResponseEntity<T> requestExecution(Request request){
		try {
			MensajeResponse mensaje = getService().getCustomers(request);
			
			switch(mensaje.getHeader().getStatus()) {
			case SUCCESSFULL:
				return (ResponseEntity<T>) new ResponseEntity<List<Response>>(mensaje.getResponse(), HttpStatus.OK);
			case NOT_FOUND:
				return (ResponseEntity<T>) new ResponseEntity<List<Response>>(mensaje.getResponse(), HttpStatus.NOT_FOUND);
			case UNEXPECTED_ERROR:
				return (ResponseEntity<T>) new ResponseEntity<List<Response>>(mensaje.getResponse(), HttpStatus.INTERNAL_SERVER_ERROR);
			default:
				return (ResponseEntity<T>) new ResponseEntity<List<Response>>(mensaje.getResponse(), HttpStatus.BAD_REQUEST);
			
			}
		}catch(Exception e) {
			return (ResponseEntity<T>) new ResponseEntity<List<Response>>(new ArrayList<Response>(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
