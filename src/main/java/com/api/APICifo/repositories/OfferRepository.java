package com.api.APICifo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.api.APICifo.domains.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer> {
	
	

}
