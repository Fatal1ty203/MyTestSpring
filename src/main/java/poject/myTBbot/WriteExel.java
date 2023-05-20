package poject.myTBbot;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteExel {

    static List<Integer> itsTest = new ArrayList<>();

    public static void main(String[] args) {
        WriteExel.AddList();
        Workbook wb = new XSSFWorkbook();
        FileOutputStream fileOutput = null;

        Sheet sheet = wb.createSheet("Тестируем");
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        Cell cell2 = row.createCell(1);
//        cell.setCellValue("Привет");
//        cell2.setCellValue("Привет");
        int rowNumber = 0;
        int cellNumber = 0;

        Row row1 = sheet.createRow(rowNumber);
        for (int i = 0; i < itsTest.size(); i++){
            if (cellNumber == 3 ){
                row1 = sheet.createRow(++rowNumber);
                cellNumber = 0;
            }

            Cell cell1 = row1.createCell(cellNumber++);

            cell1.setCellValue(itsTest.get(i));

        }





        try {
            fileOutput = new FileOutputStream("C:\\Users\\Ирен\\Desktop\\test2\\myExelTest\\test.xlsx");
            wb.write(fileOutput);
            fileOutput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void AddList(){
        itsTest.add(1);
        itsTest.add(2);
        itsTest.add(3);
        itsTest.add(4);
        itsTest.add(5);
        itsTest.add(6);
        itsTest.add(7);
        itsTest.add(8);
        itsTest.add(9);
        itsTest.add(10);
        itsTest.add(11);
    }

}
