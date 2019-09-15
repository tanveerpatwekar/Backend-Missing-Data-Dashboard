package com.bsl.MiData.pojos;

public class Masterdata {
	private int holding_company_id;
	private String holding_company_name;
	private int phys_id;
	private String comp_no;
	private String country_name;
	private int companies_id;
	private String deleted;
	private String iln;
	
	
	public Masterdata(int holding_company_id, String holding_company_name, int phys_id, String comp_no,
			String country_name, int companies_id, String deleted, String iln) {
		super();
		this.holding_company_id = holding_company_id;
		this.holding_company_name = holding_company_name;
		this.phys_id = phys_id;
		this.comp_no = comp_no;
		this.country_name = country_name;
		this.companies_id = companies_id;
		this.deleted = deleted;
		this.iln = iln;
	}


	public int getHolding_company_id() {
		return holding_company_id;
	}


	public void setHolding_company_id(int holding_company_id) {
		this.holding_company_id = holding_company_id;
	}


	public String getHolding_company_name() {
		return holding_company_name;
	}


	public void setHolding_company_name(String holding_company_name) {
		this.holding_company_name = holding_company_name;
	}


	public int getPhys_id() {
		return phys_id;
	}


	public void setPhys_id(int phys_id) {
		this.phys_id = phys_id;
	}


	public String getComp_no() {
		return comp_no;
	}


	public void setComp_no(String comp_no) {
		this.comp_no = comp_no;
	}


	public String getCountry_name() {
		return country_name;
	}


	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}


	public int getCompanies_id() {
		return companies_id;
	}


	public void setCompanies_id(int companies_id) {
		this.companies_id = companies_id;
	}


	public String getDeleted() {
		return deleted;
	}


	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}


	public String getIln() {
		return iln;
	}


	public void setIln(String iln) {
		this.iln = iln;
	}


	@Override
	public String toString() {
		return "Masterdata [holding_company_id=" + holding_company_id + ", holding_company_name=" + holding_company_name
				+ ", phys_id=" + phys_id + ", comp_no=" + comp_no + ", country_name=" + country_name + ", companies_id="
				+ companies_id + ", deleted=" + deleted + ", iln=" + iln + "]";
	}
	
	
	
	
	
	
	
	}
