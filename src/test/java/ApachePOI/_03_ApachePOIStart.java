package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        // dosya yolu alindi
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        //String path="src\\test\\java\\ApachePOI\\resource\\ApacheExcel2.xlsx";

        //java Dosya okuma islemcisine dosyanin yolunu veriyoruz
        //boylece program ile doys arasinda baglanti olustu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        //Dosya okuma islemcisi uzerinden calisma kitabini aliyorum
        //hafizada workbook u alip olusturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istadigim isimdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        //istenilen satiri aliyorum
        Row satir=calismaSayfasi.getRow(0);

        //istenilen satirdaki istenilen hucreyi aliyorum
        Cell hucre= satir.getCell(0);


        System.out.println("hucre = " + hucre);




    }
}
