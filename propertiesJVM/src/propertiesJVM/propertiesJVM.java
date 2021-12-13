package propertiesJVM;

import java.util.Properties;

public class propertiesJVM {

	public static void main(String[] args) {
		getProperties();

	}

	public static void getProperties() {
		Properties properties = System.getProperties();

		//TODO add chaque properties dans StringBuffer();
		for ( Object key : properties.keySet() ) {
			if(key.toString().contains("os.")
				| key.toString().contains("java.vm.")
				| key.toString().contains("user.")) {
				System.out.println(key + " : " + properties.get(key));
			}
		}
		
	}

}
