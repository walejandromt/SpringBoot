package api.customers.gft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Simulacion de Predicados de Spring Data
 * @author walejandromt
 */
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Predicate {
	private String alias;
	private String value;
}
