package com.trustid.utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	// public static List<RedmineData> LISTA_DATOS = new ArrayList<RedmineData>();

	public static void main(String[] args) {
		ReadExcelFile.findRealRows("horas");
	}

	public static List<RedmineData> findRealRows(String horas) {

		List<String> listaDatos = new ArrayList<String>();

		XSSFWorkbook samplexlsx;

		String pathExcel = System.getProperty("user.dir") + "/data/TestData.xlsx";

		System.out.println(pathExcel);

		try {

			samplexlsx = new XSSFWorkbook(pathExcel);

			XSSFSheet sheet1 = samplexlsx.getSheet(horas);

			int rowCount = sheet1.getLastRowNum() - sheet1.getFirstRowNum();

			try {

				for (int i = 1; i <= rowCount; i++) {
					String dato = "";
					Row row = sheet1.getRow(i);

					for (int j = 0; j < row.getLastCellNum(); j++) {
						try {

							if (row.getCell(j).getCellTypeEnum().toString() == "STRING") {
								dato += row.getCell(j).getStringCellValue() + ";";
							} else {
								dato += (int) row.getCell(j).getNumericCellValue() + ";";
							}

						} catch (IllegalStateException ex) {

							if (row.getCell(j).getCellTypeEnum().toString() == "STRING") {
								dato += row.getCell(j).getStringCellValue() + ";";
							} else {
								dato += (int) row.getCell(j).getNumericCellValue() + ";";
							}

						}
					}

					listaDatos.add(dato);

				}

			}

			catch (NullPointerException e) {
				// lanzar una nueva BusinessException ("Excepción de formato de Excel, compruebe
				// si faltan datos en formato Excel, filas de datos no válidas");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (String d : listaDatos) {
			System.out.println(d);
		}

		// listaDatos.remove(0);

		// FANCY WAY

		return listaDatos.stream().map(obj -> new RedmineData(obj)).collect(Collectors.toList());

		// LAMDAS en JAVA //COLLECTIONS

		/*
		 * for (String data : listaDatos) {
		 * 
		 * String[] redmineData = data.split(";"); String day = redmineData[0]; String
		 * hours = redmineData[1]; String comment = redmineData[2]; String activity =
		 * redmineData[3];
		 * 
		 * RedmineData rmd = new RedmineData(day,hours,comment,activity);
		 * 
		 * LISTA_DATOS.add(rmd);
		 * 
		 * }
		 * 
		 * //return LISTA_DATOS;
		 */
	}
}
