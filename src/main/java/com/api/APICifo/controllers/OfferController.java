package com.api.APICifo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.APICifo.domains.Offer;
import com.api.APICifo.services.OfferService;

@RestController
public class OfferController {
	
	@Autowired
	OfferService offerService;
	
	

}
