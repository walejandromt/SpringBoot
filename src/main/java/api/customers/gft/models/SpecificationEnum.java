package api.customers.gft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum define los tipos de especificaciones de Criteria
 * @author walejandromt
 */
@AllArgsConstructor @Getter
public enum SpecificationEnum {
	ACCOUNT_NUMBER("Account_number"),
	COMPANY_NAME("Company_name"),
	CUSTOMER_ID("Customer_id"),
	DOCUMENT_NUMBER("Document_number"),
	MATERLNAL_NAME("Maternal_name"),
	NAME("Name"),
	PATERLNAL_NAME("Paternal_name");
	
	private String specification;
}
