package com.sql;

import java.util.HashMap;

public class Parser {
	
	private String ajeitarVirgula(String sql) {
		char[] chs = sql.toCharArray();
		chs[chs.length-1] = ')';
		return new String(chs);
	}
	
	public String gerarSQL(Tabela t) {
		String sql = "INSERT INTO ";
		sql = sql + t.getNomeTabela() + " (";
		HashMap<String,Object> hm = t.getValores();
		for(String campo : hm.keySet()) {
			sql = sql + campo + ",";
		}
		sql = ajeitarVirgula(sql);
		sql = sql + " VALUES (";
		for(Object obj : hm.values()) {
			sql = sql + obj.toString() + ",";
		}
		sql = ajeitarVirgula(sql);
		sql = sql + ";";
		return sql;
	}
	
}
