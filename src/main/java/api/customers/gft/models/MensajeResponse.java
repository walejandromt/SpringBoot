package api.customers.gft.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO genérico para manejar las tras acción de capas en la aplicación
 * @author walejandromt
 */
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class MensajeResponse {
	private Header header; 
	private List<Response> response;
}
