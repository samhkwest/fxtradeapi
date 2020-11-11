package com.fxtradeapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "fxtrade")
@EntityListeners(AuditingEntityListener.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FxTrade {
	
	@Id
	@Column(name = "id", nullable = false)	
	@GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name = "native", strategy = "native") 
	private long id;
	 		
	@Column(name = "usrid", nullable = false)
	private String usrid;
	
	@Column(name = "sellccy", nullable = false)
	private String sellccy;
	
	@Column(name = "buyccy", nullable = false)
	private String buyccy;
	
	@Column(name = "sellamt", nullable = false)
	private float sellamt;
	
	@Column(name = "buyamt", nullable = false)
	private float buyamt;
	
	@Column(name = "fxrate", nullable = false)
	private float fxrate;
	
	@Column(name = "messagets", nullable = false)
	private String messagets;
	
	@Column(name = "origctry", nullable = false)
	private String origctry;
	
	public FxTrade() {
		
	}
	
	public FxTrade(String usrid, String sellccy, float selamt, String buyccy, float buyamt, float fxrate, String messagets, String origctry) {
		this.usrid = usrid;
		this.sellccy = sellccy;
		this.sellamt = selamt;
		this.buyccy = buyccy;
		this.buyamt = buyamt;
		this.fxrate = fxrate;
		this.messagets = messagets;
		this.origctry = origctry;
	}
		
	public long getId() { return id; }
	  
	public void setId(long id) { this.id = id; }
	 	
	public String getUsrid() {
		return usrid;
	}	
	
	public void setUsrid(String usrid) {
		this.usrid = usrid;
	}
		
	public String getSellccy() {
		return sellccy;
	}
		
	public void setSellccy(String sellccy) {
		 this.sellccy = sellccy;
	}
		
	public String getBuyccy() {
		return buyccy;
	}
		
	public void setBuyccy(String buyccy) {
		 this.buyccy = buyccy;
	}
	  
	public float getSellamt() {
		return sellamt;
	}	
	
	public void setSellamt(Float sellamt) {
		 this.sellamt = sellamt;
	}
	
	public float getBuyamt() {
		return buyamt;
	}	
	
	public void setBuyamt(float buyamt) {
		 this.buyamt = buyamt;
	}
	
	public float getFxrate() {
		return fxrate;
	}	
	
	public void setFxrate(Float fxrate) {
		 this.fxrate = fxrate;
	}
	
	public String getMessagets() {
		return messagets;
	}
		
	public void setMessagets(String messagets) {
		 this.messagets = messagets;
	}
	
	public String getOrigctry() {
		return origctry;
	}
	
	public void setOrigctry(String origctry) {
		 this.origctry = origctry;
	}
	
}