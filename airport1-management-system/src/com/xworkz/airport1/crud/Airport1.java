package com.xworkz.airport1.crud;

import com.xworkz.airport1.dto.TerminalDTO;

public interface Airport1 {
	
	public boolean createTerminals(TerminalDTO dto);
	public void getTerminalDetails();
	public boolean updateTypeById(int id,String type);
	public boolean updateTypeByName(String name, String type);
	public boolean updateNameById(String name, int id);
	public TerminalDTO getTerminalDetailsById(int id);
	public boolean deleteTerminalsById(int id);
	public boolean deleteTerminalsByName(String name);

}
