package com.fxtradeapi.controller;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fxtradeapi.constants.GlobalConst;
import com.fxtradeapi.model.FxTrade;

public class FxTradeControllerTest extends AbstractTest {

   @Override
   @Before
   public void setUp() {
      super.setUp();
   }
	
	@Test
	public void getAllFxTradesTest() throws Exception{
		String uri = GlobalConst.DOMAIN_URL+GlobalConst.GET_ALL_URL;
		
		//send mock http request to controller
		MvcResult mvcResult = mockMvc.perform(get(uri)
				.accept(MediaType.APPLICATION_JSON))
				.andReturn();
		
		//check response status
		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		
		//check query result
	    String json = mvcResult.getResponse().getContentAsString();	    
	    //query result should be a list of fxtrade objects
	    List<FxTrade> fxTradeList = super.mapFromJson(json, new TypeReference<List<FxTrade>>(){});
	    assertNotEquals(fxTradeList.size(), 0);
	}	
	
	@Test 
	public void sendFxTradeTest() throws Exception{ 
		String uri = GlobalConst.DOMAIN_URL+GlobalConst.ADD_NEW_URL;
		       
		//given
		String messagets = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss.SSS").format(new Date());	      	      
		FxTrade fxTrade = new FxTrade("S000001","USD",10000f,"HKD",75000f,7.5f,messagets,"HK");
		
		//this is payload of post request message which contains unique json data
		String inputJson = super.mapToJson(fxTrade);
	  
		//when
		//send mock http request to controller
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post(uri)
			.contentType(MediaType.APPLICATION_JSON_VALUE)
			.content(inputJson))
			.andReturn();
	  
		//then
		//check response status
		int status = mvcResult.getResponse().getStatus();
		assertEquals(201, status);
		//check returned newly created object
		String json = mvcResult.getResponse().getContentAsString();
		assertNotEquals(json, "");
	}
	 
}
