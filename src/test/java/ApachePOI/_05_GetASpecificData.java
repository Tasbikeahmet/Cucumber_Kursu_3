package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */
public class _05_GetASpecificData {
    public static void main(String[] args) {
        System.out.print("Istenen sütun=");
        Scanner oku= new Scanner(System.in);
        int sutun= oku.nextInt();

        String donenSonuc=bul(sutun);
        System.out.println("donenSonuc = " + donenSonuc);
    }

    public static String bul(int sutun)
    {
        String donecek="";

        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";

        Workbook workbook=null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet= workbook.getSheetAt(0);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
            if (sheet.getRow(i).getPhysicalNumberOfCells() > sutun)
                donecek+=sheet.getRow(i).getCell(sutun)+"\n";

        return donecek;
    }

}
