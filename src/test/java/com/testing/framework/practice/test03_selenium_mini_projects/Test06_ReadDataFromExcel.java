package com.testing.framework.practice.test03_selenium_mini_projects;

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

public class Test06_ReadDataFromExcel {

    @Test(dataProvider = "credsSupplier")
    public void loginTest(String username, String password) {
        System.out.println(username + " --------- " + password);
    }


    @DataProvider(name = "credsSupplier")
    public Object[][] dataSupplier() throws IOException {
        File file = new File(System.getProperty("user.dir") + "\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Login");
        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][columnCount];

        for (int r = 0; r < rowCount; r++) {
            XSSFRow row = sheet.getRow(r + 1);

            for (int c = 0; c < columnCount; c++) {
                XSSFCell cell = row.getCell(c);
                CellType cellType = cell.getCellType();

                switch (cellType) {
                    case STRING:
                        data[r][c] = cell.getStringCellValue();
                        break;

                    case NUMERIC:
                        data[r][c] = Integer.toString((int) cell.getNumericCellValue());
                        break;

                    case BOOLEAN:
                        data[r][c] = cell.getBooleanCellValue();
                        break;
                }
            }
        }
        return data;

    }


}
