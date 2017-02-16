
package com.ocp.ws;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.apache.cxf.jaxrs.model.wadl.Description;

import com.ocp.entities.Produit;


@Path("/produit/")
@WebService
public interface ProduitService {

	@WebMethod

    public Produit findProduit(@Description(value = "the string representation of the location") @PathParam("produit") @NotNull @Size(max=10, min=5) String produit);
	
	@WebMethod

    public Collection<Produit> findAllProduits ();
	
	}
