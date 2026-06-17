package com.testing.practice.test02_selenium;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test19_ExcelDataReader {

    @Test(dataProvider = "credSupplier")
    public void login(String username, String password) {
        System.out.println(username + "-----------" + password);

    }

    @DataProvider(name = "credSupplier")
    public Object[][] dataSupplier() throws IOException {
        File file = new File(System.getProperty("user.dir") + "\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Login");//sheet name inside the test data

        //Fetch rows and column
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        //Loop for row
        Object[][] data = new Object[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            // (r+1) ==> skip the first row as it might be heading and not the real data
            XSSFRow row = sheet.getRow(r + 1);

            //Fetch the column
            for (int c = 0; c < columnCount; c++) {
                XSSFCell cell = row.getCell(c);
                CellType cellType = cell.getCellType();

                //Retrieve cell value using cellType
                switch (cellType) {
                    case STRING:
                        data[r][c] = cell.getStringCellValue();
                        break;

                    case NUMERIC:
                        data[r][c] = Integer.toString((int) cell.getNumericCellValue());
                        break;

                    case BOOLEAN:
                        data[r][c] = cell.getBooleanCellValue();
                }

            }
        }
        return data;
    }
}
