package student_yurii_panasiuk.test.json;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.Configurator;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;


class test {

    static IncomingData incomingData = new IncomingData(
            "https://cbu.uz/oz/arkhiv-kursov-valyut/json/",
            "D:\\Apache POI Excel File.xls");
    public static void main(String[] args) throws IOException, Exception {

        String json = readUrl(incomingData.getUrlJson());

        Type userListType = new TypeToken<ArrayList<Currency>>(){}.getType();
        Gson gson = new Gson();
        ArrayList<Currency> jsonArray = gson.fromJson(json, userListType);

        // создание самого excel файла в памяти
        Workbook workbook = new HSSFWorkbook();
        // создание листа с названием "arkhiv-kursov-valyut"
        Sheet sheet = workbook. createSheet("arkhiv-kursov-valyut");

        // счетчик для строк
        int rowNum = 0;
        // создаем подписи к столбцам
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
            rowNum++;
            row = sheet.createRow(rowNum);
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
/*
        FileOutputStream out = new FileOutputStream (incomingData.getWorkFolderAndFileName());
        workbook.write(out);
        out.close();
        workbook.close();

 */

        // или так

          try (FileOutputStream out = new FileOutputStream(new File(incomingData.getWorkFolderAndFileName()))) {
            workbook.write(out);
          } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel файл успешно создан!");
        System.out.println(incomingData.getWorkFolderAndFileName());
    }

    static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
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

}







