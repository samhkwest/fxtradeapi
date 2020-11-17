package com.fxtradeapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fxtradeapi.model.FxTrade;
import com.fxtradeapi.repository.FxTradeRepository;
import com.fxtradeapi.constants.GlobalConst;

@RestController
@RequestMapping(GlobalConst.DOMAIN_URL)
public class FxTradeController {

  @Autowired
  private FxTradeRepository fxTradeRepository;

  @PostMapping(path = GlobalConst.ADD_NEW_URL, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> addFxTrade(@RequestBody FxTrade fxTradeToAdd) {		 
	FxTrade createdFxTrade = fxTradeRepository.saveAndFlush(fxTradeToAdd);	  
	return new ResponseEntity<>(createdFxTrade, HttpStatus.CREATED);
  }
    
  @GetMapping(path = GlobalConst.GET_ALL_URL)
  public List<FxTrade> getAllFxTrade() {	 
	List<FxTrade> fxTradeList = fxTradeRepository.findAll();	  
	return fxTradeList;
  }  
  
}
