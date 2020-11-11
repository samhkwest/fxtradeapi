package com.fxtradeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fxtradeapi.model.FxTrade;

@Repository
public interface FxTradeRepository extends JpaRepository<FxTrade, Long> {
	
	
	
}
