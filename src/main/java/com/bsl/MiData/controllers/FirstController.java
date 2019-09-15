package com.bsl.MiData.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsl.MiData.dao.MissingReportDao;
import com.bsl.MiData.pojos.Masterdata;

@RestController
@CrossOrigin
public class FirstController {
	List<Masterdata> ls;
	MissingReportDao mdao;

	@GetMapping("/api/welcome")
	public String welcome() {
		return "Welcome to java REST API!!!!";
	}

	
	/* Access this api through below link
	 * http://localhost:8080/api/allstores
	 */
	@GetMapping("api/allstores")
	public List<Masterdata> allstores() 
	{
		
		try 
		{
			 mdao = new MissingReportDao();
			ls = new ArrayList<Masterdata>();
			ls = mdao.viewStores();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}
	
	@GetMapping("api/storesbycid")
	public List<Masterdata> storesByGln() 
	{
		List<Masterdata> lsCid = new ArrayList<Masterdata>();
		try 
		{
			mdao = new MissingReportDao();
			lsCid = new ArrayList<Masterdata>();
			lsCid = mdao.storesByCid(220285);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lsCid;
	}
}
