package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {

	static XSSFWorkbook workbook;

	public ExcelReader(String path) {

		File f = new File(path);

		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static int getRowCount(int sheetIndex) {

		int row = workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;

		return row;
	}

	public static int getCellCount(int sheetIndex) {

		int cell = workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();

		return cell;
	}

	public static Object getSpecificSheetData(int sheetIndex, int row, int cell) {
		XSSFCell cells = workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell);

		if (cells == null) {
			return "";
		} else {
			if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cells.getRawValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cells.getBooleanCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
				return cells.getCellFormula();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_ERROR) {
				return cells.getErrorCellString();
			}
		}
		return null;

	}

	public static Object[][] getAllSheetData(int sheetIndex) {

		int row = getRowCount(sheetIndex);
		int cell = getCellCount(sheetIndex);

		Object[][] data = new Object[row][cell];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				data[i][j] = getSpecificSheetData(sheetIndex, i, j);
			}
		}

		return data;

	}

}
