package com.azamda.solid_principle;

//interface or abstraction layer
interface DBConnection {
	public void connect();

	public void save();
}
class ConnectionManager{
	public static DBConnection getConnection(String type) {
		if(type.equalsIgnoreCase("Oracle")) {
            return new OracleConnection();
        }else if(type.equalsIgnoreCase("MySql")) {
            return new MySqlConnection();
        }else {
            return null;
        }
    }
}
//implementation layer
class OracleConnection implements DBConnection {
	@Override
	public void connect() {
		System.out.println("Oracle Connection");
	}

	@Override
	public void save() {
		System.out.println("data saved into Oracle Database");
	}
}

class MySqlConnection implements DBConnection {
	@Override
	public void connect() {
		System.out.println("MySql Connection");
	}
	@Override
    public void save() {
        System.out.println("data saved into MySql Database");
    }
}
//client is dealing with interface layer only
public class DependencyInversionPrinciple {
	public static void main(String[] args) {
        DBConnection connection = ConnectionManager.getConnection("Oracle");
        connection.connect();
        connection.save();
        connection = ConnectionManager.getConnection("MySql");
        connection.connect();
        connection.save();
	}
}
