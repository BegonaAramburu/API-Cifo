package com.api.APICifo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.APICifo.domains.Offer;
import com.api.APICifo.repositories.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	OfferRepository offerRepository;
	
	

}
