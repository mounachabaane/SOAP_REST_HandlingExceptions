package com.memorynotfound.server;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.memorynotfound.book.GetBookRequest;
import com.memorynotfound.book.GetBookResponse;

@Endpoint
public class BookEndpoint {

	public static final String NAMESPACE_URI = "http://memorynotfound.com/book";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
	@ResponsePayload
	public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
		throw new ServiceFaultException("NOT FOUND",
				new ServiceFault("NOT_FOUND", "Book with id: " + request.getId() + " not found."));
	}

}
