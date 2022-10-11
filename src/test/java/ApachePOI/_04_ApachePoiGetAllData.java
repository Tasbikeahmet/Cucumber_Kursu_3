package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePoiGetAllData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream inputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inputStream);

        Sheet sheet=workbook.getSheet("Sheet1");
        // calisma sayfasindaki toplam satir sayisini veriyor
        int rowCount=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            Row  row= sheet.getRow(i);//i.satir salindi
            //bu satirdaki topplam hucre sayisi alindi
            int cellCount=row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {//i satirdaki hucre sayisi kadar donecek
                Cell cell=row.getCell(j);//bu satirdaki siradaki hucreyi aldim
                System.out.print(cell+"\t");


            }
            System.out.println();
        }




    }
}
