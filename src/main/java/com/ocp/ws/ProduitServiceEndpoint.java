package com.ocp.ws;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocp.entities.Produit;

@Service("produitService")
public class ProduitServiceEndpoint implements ProduitService {

		
		private Logger logger = LoggerFactory.getLogger(this.getClass());

		private Map<String, Produit> produits = new HashMap<String, Produit>();

		@Autowired
		private Validator validator;
		

		@Override
		public Produit findProduit(String produit) {
	
			return new Produit ("2" , "quartable");
		}

		@Override
		public Collection<Produit> findAllProduits() {
			produits.put("1", new Produit ("1" , "valise") ) ;
			produits.put("2", new Produit ("2" , "quartable") ) ;
			
			return (Collection<Produit>) produits ;
		}
	    
	
}
