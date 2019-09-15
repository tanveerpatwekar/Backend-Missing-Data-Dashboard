package com.bsl.MiData.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bsl.MiData.pojos.Masterdata;
import com.bsl.MiData.utils.ConnectionFactory;

public class MissingReportDao
{
	Connection con;	
	List<Masterdata> list, listCid;
	PreparedStatement pst1,pstCid;
	private static MissingReportDao dao = null;
	
	
	public MissingReportDao() throws Exception
	{
		con = ConnectionFactory.getConnection();
		pst1 = con.prepareStatement("SELECT * FROM stores");
		pstCid = con.prepareStatement("select * from midata.stores where companies_id=?");
		System.out.println("");
	}
	
	public static MissingReportDao getInstance() throws Exception
	{
		if(dao==null)
		{
			dao = new MissingReportDao();
		}
		return dao;
	}
	
	public List<Masterdata> viewStores() throws SQLException
	{
		
		ResultSet rst = pst1.executeQuery();
		System.out.println("rst of all stores: "+rst);
		list = new ArrayList<Masterdata>();
		while(rst.next())
		{
			System.out.println("******adding in list: "+list);
			list.add(new Masterdata(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getString(7), rst.getString(8)));
		}
		return list;
	}

	public List<Masterdata> storesByCid(int cid) throws SQLException 
	{
		pstCid.setInt(1, cid);
		ResultSet rst = pstCid.executeQuery();
		System.out.println("rst of all stores: "+rst);
		list = new ArrayList<Masterdata>();
		while(rst.next())
		{
			System.out.println("******adding in list: "+list);
			list.add(new Masterdata(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getString(7), rst.getString(8)));
		}
		return list;
	}
}
