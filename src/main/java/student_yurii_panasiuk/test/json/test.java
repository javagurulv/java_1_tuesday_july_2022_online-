package student_yurii_panasiuk.test.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import java.io.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;


class test {

     static String readUrl(String urlString) throws Exception {
         BufferedReader reader = null;
         try {
             URL url = new URL(urlString);
             reader = new BufferedReader(new InputStreamReader(url.openStream()));
             StringBuffer buffer = new StringBuffer();
             int read;
             char[] chars = new char[1024];
             while ((read = reader.read(chars)) != -1)
             buffer.append(chars, 0, read);
             return buffer.toString();
         } finally {
             if (reader != null)
                 reader.close();
         }
     }

    static class Currency {
        int id;
        int Code;
        String Ccy;
        String CcyNm_RU;
        String	CcyNm_UZ;
        String CcyNm_UZC;
        String CcyNm_EN;
        int Nominal;
        BigDecimal Rate;
        BigDecimal Diff;
        String Date;

        public int getId() {
            return id;
        }

        public int getCode() {
            return Code;
        }

        public String getCcy() {
            return Ccy;
        }

        public String getCcyNm_RU() {
            return CcyNm_RU;
        }

        public String getCcyNm_UZ() {
            return CcyNm_UZ;
        }

        public String getCcyNm_UZC() {
            return CcyNm_UZC;
        }

        public String getCcyNm_EN() {
            return CcyNm_EN;
        }

        public int getNominal() {
            return Nominal;
        }

        public BigDecimal getRate() {
            return Rate;
        }

        public BigDecimal getDiff() {
            return Diff;
        }

        public String getDate() {
            return Date;
        }
    }

    public static void main(String[] args)  throws Exception    {

        String json = readUrl("https://cbu.uz/oz/arkhiv-kursov-valyut/json/");

        Gson gson = new Gson();

        Type userListType = new TypeToken<ArrayList<Currency>>(){}.getType();


        ArrayList<Currency> jsonArray = gson.fromJson(json, userListType);

        for(Currency currency : jsonArray) {
            System.out.println(currency.getCcy());
        }

        // создание самого excel файла в памяти
        HSSFWorkbook workbook = new HSSFWorkbook();
        // создание листа с названием "Просто лист"
        HSSFSheet sheet = workbook.createSheet("arkhiv-kursov-valyut");

        // счетчик для строк
        int rowNum = 0;
        // создаем подписи к столбцам (это будет первая строчка в листе Excel файла)
        Row row = sheet.createRow(rowNum);
        row.createCell(0).setCellValue("id");
        row.createCell(1).setCellValue("Code");
        row.createCell(2).setCellValue("getCcy");
        row.createCell(3).setCellValue("getCcyNm_RU");
        row.createCell(4).setCellValue("ggetCcyNm_UZ");
        row.createCell(5).setCellValue("getCcyNm_UZC");
        row.createCell(6).setCellValue("getCcyNm_EN");
        row.createCell(7).setCellValue("getNominal");
        row.createCell(8).setCellValue("getRate");
        row.createCell(9).setCellValue("getDiff");
        row.createCell(10).setCellValue("getDate");

        for(Currency currency : jsonArray) {
            row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(currency.getId());
            row.createCell(1).setCellValue(currency.getCode());
            row.createCell(2).setCellValue(currency.getCcy());
            row.createCell(3).setCellValue(currency.getCcyNm_RU());
            row.createCell(4).setCellValue(currency.getCcyNm_UZ());
            row.createCell(5).setCellValue(currency.getCcyNm_UZC());
            row.createCell(6).setCellValue(currency.getCcyNm_EN());
            row.createCell(7).setCellValue(currency.getNominal());
            row.createCell(8).setCellValue(currency.getRate().toString());
            row.createCell(9).setCellValue(currency.getDiff().toString());
            row.createCell(10).setCellValue(currency.getDate());
        }

        // записываем созданный в памяти Excel документ в файл
        try (FileOutputStream out = new FileOutputStream(new File("F:\\Apache POI Excel File.xls"))) {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel файл успешно создан!");
    }


}

