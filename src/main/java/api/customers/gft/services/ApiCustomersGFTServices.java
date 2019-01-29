package api.customers.gft.services;

import api.customers.gft.models.MensajeResponse;
import api.customers.gft.models.Request;

/**
 * Definicion de logica de negocio
 * @author walejandromt
 */
public interface ApiCustomersGFTServices {
	
	/**
	 * Metodo se encarga de consultar los customers
	 * @param request
	 * @return
	 */
	MensajeResponse getCustomers(Request request);

}
