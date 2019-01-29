package api.customers.gft.assemblersPredicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import api.customers.gft.models.Predicate;
import api.customers.gft.models.Request;
import api.customers.gft.models.SpecificationEnum;

/**
 * Simbola un ensamblador de predicados de Criteria
 * @author walejandromt
 */
@Component
public class AssemblerToPredicate {
	
	public Collection<Predicate> toPredicate(Request request){
		List<Predicate> list = new ArrayList<Predicate>();
		
		if(request.getAccount_number() != null && !request.getAccount_number().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.ACCOUNT_NUMBER.getSpecification(), request.getAccount_number()));
		}
		
		if(request.getCompany_name() != null && !request.getCompany_name().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.COMPANY_NAME.getSpecification(), request.getCompany_name()));
		}
		
		if(request.getCustomer_id() != null && !request.getCustomer_id().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.CUSTOMER_ID.getSpecification(), request.getCustomer_id()));
		}
		
		if(request.getDocument_number() != null && !request.getDocument_number().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.DOCUMENT_NUMBER.getSpecification(), request.getDocument_number()));
		}
		
		if(request.getMaternal_name() != null && !request.getMaternal_name().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.MATERLNAL_NAME.getSpecification(), request.getMaternal_name()));
		}
		
		if(request.getName() != null && !request.getName().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.NAME.getSpecification(), request.getName()));
		}
		
		if(request.getPaternal_name() != null && !request.getPaternal_name().isEmpty()) {
			list.add(new Predicate(SpecificationEnum.PATERLNAL_NAME.getSpecification(), request.getPaternal_name()));
		}
		
		return list;
	}

}
