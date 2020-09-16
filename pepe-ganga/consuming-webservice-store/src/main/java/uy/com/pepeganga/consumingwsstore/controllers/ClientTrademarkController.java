package uy.com.pepeganga.consumingwsstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.com.pepeganga.consumingwsstore.services.TrademarkService;
import uy.com.pepeganga.consumingwsstore.wsdl.marcas.CargaMarcasExecuteResponse;

@RestController
@RequestMapping("/api")
public class ClientTrademarkController {

	@Autowired
	TrademarkService trademarks;
	
	@GetMapping("/trademarks")
	public CargaMarcasExecuteResponse getTrademarks() {
		return trademarks.getTrademarks();
	}
}