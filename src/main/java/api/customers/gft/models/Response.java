package api.customers.gft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Response {
	private String customerId;
	private String originChannel;
	private String fullName;
	private String condition;
	private String segment;
	private String address;
	private String customerCategory;
}
