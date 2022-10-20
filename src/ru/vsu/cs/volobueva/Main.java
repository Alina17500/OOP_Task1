package ru.vsu.cs.volobueva;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //1: из csv в json
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        //определяем csv файл, с которого считываем
        String fileNameCsv = "data.csv";
        //конвертируем данные из csv в json
        ParseCsvToJson.parseCsvToJson(columnMapping, fileNameCsv);

        //2: из xml в json
        // определяем xml файл, с которого считываем
        String fileNameXml = "data.xml";
        //конвертируем данные из xml в json
        ParseXmlToJson.parseXmlToJson(fileNameXml);

        //3: преобразование объектов файла json в классы java
        //определяем xml файл, с которого считываем
        String fileNameJson = "data.json";
        //передаем данные из файла json в java
        ParseJsonToJava.parseJsonToJava(fileNameJson);
    }
}
