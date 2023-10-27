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

    static List<String> itsTest = new ArrayList<>();

    public static void main(String[] args) {
        WriteExel.AddList();
        Workbook wb = new XSSFWorkbook();
        FileOutputStream fileOutput = null;

        Sheet sheet = wb.createSheet("Тестируем");
        int rowNumber = 0;
        int cellNumber = 0;

        Row row1 = sheet.createRow(rowNumber);
        for (int i = 0; i <= itsTest.size() -1; i++){
            Cell cell1 = row1.createCell(cellNumber++);
            if (cellNumber == 3 ){
                Cell cell = row1.createCell(cellNumber++);
                int forFormula = rowNumber;
                cell.setCellFormula("SUM(C"+ ++forFormula + "*0.1)");
                row1 = sheet.createRow(++rowNumber);
                cellNumber = 0;
            }
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
        itsTest.add("15700");
        itsTest.add("27894");
        itsTest.add("3567");
        itsTest.add("4899");
        itsTest.add("56788");
        itsTest.add("6000");
        itsTest.add("75432");
        itsTest.add("865");
        itsTest.add("9678");
        itsTest.add("10555");
        itsTest.add("11124");
        itsTest.add("12234");
    }

}
