package poject.ApachePoi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        XSSFWorkbook workbook;
        FileInputStream file;
        try {
            file = new FileInputStream("C:\\Users\\Ирен\\Desktop\\bonus\\test1.xlsx");
            workbook = new XSSFWorkbook(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String res = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
        System.out.println(res);

    }
}
