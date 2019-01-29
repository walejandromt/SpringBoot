package api.customers.gft.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Filtros Request
 * @author walejandromt
 */
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Request {
	
	/**
	 * description: Customer ID
	 * required: false
	 */
	private String customer_id;
	
	/**
	 * description: Document number
	 * required: false
	 */
	private String document_number;
	
	/**
	 * description: Company name
	 * required: false
	 */
	private String company_name;
	
	/**
	 * description: Account number
	 * required: false
	 */
	private String account_number;
	
	/**
	 * description: Name
	 * required: false
	 */
	private String name;
	
	/**
	 * description: Paternal Name
	 * required: false
	 */
	private String paternal_name;
	
	/**
	 * description: Maternal Name
	 * required: false
	 */
	private String maternal_name;
}
