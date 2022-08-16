package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Excel {
    //dosya yolu ve satır, hücre index ini verince hücre bilgisinin döndürsün
    public static Cell hucreGetir(String path, String sayfaIsim, int satirIndex, int hucreIndex){
        Cell cell = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fis);
            cell=workbook.getSheet(sayfaIsim).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cell;
    }

    public static Map mapOlustur(String path, String sayfaIsim) {
        Workbook workbook=null;
        Map<String,String> excelMap = new TreeMap<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            workbook=WorkbookFactory.create(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirSayısı=workbook.getSheet(sayfaIsim).getLastRowNum();
        String key="";
        String value="";
        for (int i = 0; i <= satirSayısı; i++) {
            key=workbook.getSheet(sayfaIsim).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaIsim).getRow(i).getCell(1).toString()+
                    ", "+workbook.getSheet(sayfaIsim).getRow(i).getCell(2).toString()+
                    ", "+workbook.getSheet(sayfaIsim).getRow(i).getCell(3).toString();
            excelMap.put(key,value);
        }

        return excelMap;
    }
}
