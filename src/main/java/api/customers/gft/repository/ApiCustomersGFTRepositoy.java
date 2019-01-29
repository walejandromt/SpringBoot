package api.customers.gft.repository;

import java.util.Collection;
import java.util.List;

import api.customers.gft.models.Predicate;
import api.customers.gft.models.Request;
import api.customers.gft.models.Response;

/**
 * Interface Repository de Spring Data
 * @author walejandromt
 */
public interface ApiCustomersGFTRepositoy {

	/**
	 * Consulta en el DS
	 * @param predicate
	 * @param request
	 * @return
	 */
	List<Response> findAll(Collection<Predicate> predicate, Request request);
}
