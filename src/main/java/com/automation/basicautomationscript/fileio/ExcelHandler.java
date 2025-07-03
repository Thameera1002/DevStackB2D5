package com.automation.basicautomationscript.fileio;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@Slf4j
public class ExcelHandler {

    public static List<Object[]> studentDetails = Arrays.asList(
      new Object[]{"Bimsara",25},
      new Object[]{"Amal",28},
      new Object[]{"Saman",32}

    );

    public static void writeToExcel() throws IOException {
        OutputStream outputStream = new FileOutputStream("studentDetails.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sheet1");

        IntStream.range(0, studentDetails.size()).forEach(index -> {
            XSSFRow row = sheet.createRow(index);
            Object[] values = studentDetails.get(index);

            List<Object> objectValues = Arrays.stream(values).toList();
            IntStream.range(0, objectValues.size()).forEach(index2 -> {
                XSSFCell cell =null;
                if(objectValues.get(index2) instanceof String){
                    cell = row.createCell(index2, CellType.STRING);
                    cell.setCellValue((String)objectValues.get(index2));
                }else {
                    cell = row.createCell(index2, CellType.NUMERIC);
                    cell.setCellValue((int)objectValues.get(index2));
                }
            });
        });

        workbook.write(outputStream);
    }

    public static void readFromExcel() throws IOException {
        try(FileInputStream inputStream = new FileInputStream("studentDetails.xlsx")){
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("sheet1");
            List<Object[]> readData = new ArrayList<>();
            for(Row row : sheet){
                List<Object> rowData = new ArrayList<>();
                for(Cell cell : row){
                    switch (cell.getCellType()){
                        case STRING -> rowData.add(cell.getStringCellValue());
                        case NUMERIC -> rowData.add(cell.getNumericCellValue());
                        default -> rowData.add(null);
                    }
                }
                readData.add(rowData.toArray());
            }

            readData.forEach(row-> System.out.println(Arrays.toString(row)));
        }
    }

    public static void main(String[] args) throws IOException {
//        ExcelHandler.writeToExcel();
        ExcelHandler.readFromExcel();
    }
}
