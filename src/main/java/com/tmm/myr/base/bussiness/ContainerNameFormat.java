package com.tmm.myr.base.bussiness;

public class ContainerNameFormat {

	public static String containerToFormatSQL(String containerName, String containerCode) {
		String container = containerName.concat(containerCode);
		//Formato completo: XXXX-123456-7
		if(container.contains("-")) {
			return container;
		}
		//Formato sin digito verificador: XXXX123456
		if(container.length() == 10) {
			return container.substring(0, 4) + "-" + container.substring(4, 6);
		}
		//Formato completo sin separador: -: XXXX1234567
		if (container.length() == 11) {
            return container.substring(0, 4) + "-"+ container.substring(4, 10) + "-" +container.substring(10, 11);
        }
        return container;
	}
}
