package api.customers.gft.mocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import api.customers.gft.assemblersPredicate.AssemblerToPredicate;
import api.customers.gft.models.Predicate;
import api.customers.gft.models.Request;
import api.customers.gft.models.Response;
import api.customers.gft.models.SpecificationEnum;
import api.customers.gft.repository.ApiCustomersGFTRepositoy;

/**
 * Se encarga de controlar los mocks
 * @author walejandromt
 */
public class UtilMocks {
	
	/**
	 * Obtiene el repository generico
	 * @return
	 */
	public ApiCustomersGFTRepositoy getRepository() {
		return null;
	}
	
	/**
	 * Obtiene el ensamblador generico
	 * @return
	 */
	public AssemblerToPredicate getAssembler() {
		return null;
	}
	
	/**
	 * Se encarga de generar Mocks
	 * @param request
	 * @return
	 */
	public ApiCustomersGFTRepositoy execute(Request request) {
		Collection<Predicate> predicate = getAssembler().toPredicate(request);
		
		List<Response> lst = new ArrayList<Response>();
		
		for(Predicate search : predicate) {
			
			if(SpecificationEnum.ACCOUNT_NUMBER.getSpecification().equals(search.getAlias())) {
				if("000547".equalsIgnoreCase(search.getValue())) {
					addResultSet(lst, "00021244", "BANCA SERFIN", "ACEVES GONZALEZ ADOLFO", "CLIENTE", "PREMIER", "LOMA BONITA 1839", "FISICA");
				}
			}
			
			if(SpecificationEnum.COMPANY_NAME.getSpecification().equals(search.getAlias())) {
				if("BANCA SERFIN".equalsIgnoreCase(search.getValue())) {
					addResultSet(lst, "00021244", "BANCA SERFIN", "ACEVES GONZALEZ ADOLFO", "CLIENTE", "PREMIER", "LOMA BONITA 1839", "FISICA");
					addResultSet(lst, "00021244", "BANCA SERFIN", "Williams Alejandro", "CLIENTE", "PREMIER", "LOMA BONITA 1839", "FISICA");
					addResultSet(lst, "00021244", "BANCA SERFIN", "Karla Martinez", "CLIENTE", "PREMIER", "LOMA BONITA 1839", "FISICA");
				}
				
				if("banca".equalsIgnoreCase(search.getValue())) {
					addResultSet(lst, "00021244", "BANCA SERFIN", "Williams Alejandro", "CLIENTE", "PREMIER", "LOMA BONITA 1839", "FISICA");
				}
			}
			
			if(SpecificationEnum.CUSTOMER_ID.getSpecification().equals(search.getAlias())) {
				//Se agrega esta excepción para hacer la cobertura del caso 500 "Unexpected error."
				throw new NullPointerException("null");
			}

			if(SpecificationEnum.DOCUMENT_NUMBER.getSpecification().equals(search.getAlias())) {
				
			}
			
			if(SpecificationEnum.MATERLNAL_NAME.getSpecification().equals(search.getAlias())) {
				
			}
			
			if(SpecificationEnum.NAME.getSpecification().equals(search.getAlias())) {
				
			}
			
			if(SpecificationEnum.PATERLNAL_NAME.getSpecification().equals(search.getAlias())) {
				
			}
		}
		
		return new ApiCustomersGFTRepositoy() {
			
			@Override
			public List<Response> findAll(Collection<Predicate> predicate, Request request) {
				return lst;
			}
		};
	}
	
	/**
	 * Construye el resultado para los Mocks
	 * @param lst
	 * @param args
	 */
	private void addResultSet(List<Response> lst, String ...args) {
		
		Response resp = new Response(
				/*customerId*/		args.length >= 0 ? args[0]:null, 
				/*originChannel*/	args.length > 0 ? args[1]:null, 
				/*fullName*/		args.length > 1 ? args[2]:null, 
				/*condition*/		args.length > 2 ? args[3]:null, 
				/*segment*/			args.length > 3 ? args[4]:null, 
				/*address*/			args.length > 4 ? args[5]:null, 
				/*customerCategory*/args.length > 5 ? args[6]:null);
		
		lst.add(resp);
	}

}
