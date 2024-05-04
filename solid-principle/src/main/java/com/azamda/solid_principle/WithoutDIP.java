package com.azamda.solid_principle;
class MySQL{
	void connect() {
		System.out.println("MySQL connected");
	}
	void save() {
		System.out.println("data saved into MySQL database");
	}
}
class Oracle{
	void connect() {
		System.out.println("Oracle connected");
	}
	void save() {
		System.out.println("data saved into Oracle database");
	}
}
public class WithoutDIP {
	public static void main(String[] args) {
		//client wants to connect MySQL so here client directly using implementation
		MySQL mySQL = new MySQL();
		mySQL.connect();
		mySQL.save();
		//client wants to connect Oracle so here client directly using implementation
		Oracle oracle = new Oracle();
        oracle.connect();
        oracle.save();
	}
}
