package SeleniumScriptsOct19;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FetchingDataExcel {

    static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("C:\\Users\\PRAGATI\\OneDrive\\Desktop\\anita\\Data.xlsx");

        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheet("Sheet1");
        int totalrows=sheet.getLastRowNum();

        System.out.println("Total rows "+totalrows);
        Row row= sheet.getRow(0);
       int  Totalcell=row.getLastCellNum();

        for (int i=0; i<=totalrows; i++) {

            for (int j = 0; j < Totalcell; j++) {
                System.out.print(sheet.getRow(i).getCell(j)+"  ");
            }

            System.out.println();
        }
    }
}
