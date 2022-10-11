package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _10_Tasks {
    /**  Soru 1:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
     */

    /**  Soru 2:
     *  Çarpım tablosunu excele yazdırınız.
     *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
     *  sıfırdan excel oluşturarak.
     *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
     */
    public static void main(String[] args) throws IOException {

        // hafızada  yeni workbook oluştur, sonra sheet oluştur, sonra row oluştur, sonra cell oluştur.
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");

        // HAFIZADA oluşturma ve yazma işlemelri yapılıyor
        Row yeniSatir= sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre= yeniSatir.createCell(0); // yeni satırda ilk hucre oluşturuldu


        for (int i = 0; i < 10 ; i++) {
            yeniSatir=sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                yeniSatir.createCell(0).setCellValue(i+1);
                yeniSatir.createCell(1).setCellValue("x");
                yeniSatir.createCell(2).setCellValue(1);
                yeniSatir.createCell(3).setCellValue("=");
                yeniSatir.createCell(4).setCellValue(1*(i+1));
                yeniSatir.createCell(6).setCellValue(i+1);
                yeniSatir.createCell(7).setCellValue("x");
                yeniSatir.createCell(8).setCellValue(2);
                yeniSatir.createCell(9).setCellValue("=");
                yeniSatir.createCell(10).setCellValue(2*(i+1));
            }

        }

        // Yazma işlemini YAZMA modunda açıp öyle yapacağız.
        String carpmaExcelPath="src/test/java/ApachePOI/resource/carpmaExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(carpmaExcelPath);
        workbook.write(outputStream);
        workbook.close();  // hafıza boşaltıldı
        outputStream.close();
        System.out.println("işlem tamamlandı");
    }
}


