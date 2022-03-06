package com.abans.abansservice;

import com.abans.abansservice.domain.GetAllProductsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProductEndpoint {
	private static final String NAMESPACE_URI = "http://www.abans.com/products-ws";
	@Autowired
	private ProductRepository productRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllProductsRequest")
	@ResponsePayload
	public GetAllProductsResponse getAllProducts() {
		GetAllProductsResponse response = new GetAllProductsResponse();
		response.getProduct().addAll(productRepository.queryProducts());
		return response;
	}
}
