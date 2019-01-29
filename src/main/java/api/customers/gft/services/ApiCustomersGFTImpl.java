package api.customers.gft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.customers.gft.assemblersPredicate.AssemblerToPredicate;
import api.customers.gft.mocks.UtilMocks;
import api.customers.gft.models.EstatusHttpEnum;
import api.customers.gft.models.Header;
import api.customers.gft.models.MensajeResponse;
import api.customers.gft.models.Request;
import api.customers.gft.models.Response;
import api.customers.gft.repository.ApiCustomersGFTRepositoy;

/**
 * Logica de negocio
 * @author walejandromt
 */
@Service
public class ApiCustomersGFTImpl extends UtilMocks implements ApiCustomersGFTServices {

	@Autowired
	private AssemblerToPredicate assemblerToPredicate;
	
	/**
	 * Autowired
	 */
	private ApiCustomersGFTRepositoy apiCustomersGFTRepositoy;
	
	/*
	 * (non-Javadoc)
	 * @see api.customers.gft.mocks.UtilMocks#getRepository()
	 */
	@Override
	public ApiCustomersGFTRepositoy getRepository() {
		return apiCustomersGFTRepositoy;
	}
	
	/*
	 * (non-Javadoc)
	 * @see api.customers.gft.mocks.UtilMocks#getAssembler()
	 */
	@Override
	public AssemblerToPredicate getAssembler() {
		return assemblerToPredicate;
	}

	/*
	 * (non-Javadoc)
	 * @see api.customers.gft.services.ApiCustomersGFTServices#getCustomers(api.customers.gft.models.Request)
	 */
	@Override
	public MensajeResponse getCustomers(Request request) {
		MensajeResponse mensaje = new MensajeResponse();
		
		List<Response> lstResponse = execute(request).findAll(getAssembler().toPredicate(request), request);
		mensaje.setResponse(lstResponse );
		
		Header header = new Header();
		header.setMensaje("Busqueda exitosa");
		header.setStatus(EstatusHttpEnum.SUCCESSFULL);
		mensaje.setHeader(header);
		
		if(lstResponse == null || lstResponse.isEmpty()) {
			header.setMensaje("No se encontraron resultados");
			header.setStatus(EstatusHttpEnum.NOT_FOUND);
		}
		
		return mensaje;
	}

}
