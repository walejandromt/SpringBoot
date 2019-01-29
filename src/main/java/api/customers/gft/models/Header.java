package api.customers.gft.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO Genérico se encarga de encapsular el Header de cada mensaje
 * @author walejandromt
 */
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Header {
	private String mensaje;
	private EstatusHttpEnum status;
}
