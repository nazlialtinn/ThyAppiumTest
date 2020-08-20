package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class XlsReader {
    public static String flightFrom;
    public static String flightTo;
    public static String name;
    public static String lastName;
    public static String email;
    public static String flyerNumber;
    public static final String NAME = "C:/Users/TESTINIUM/IdeaProjects/mobil/src/test/java/resources/kisiBilgisi.xlsx";
   public static void main(String[] args) throws Exception {
            flightFrom();
            flightTo();
            name();
            lastName();
            email();
            flyerNumber();
        }

    public static CharSequence flightFrom()throws Exception{
        FileInputStream file = new FileInputStream(new File(NAME));
        Workbook workbook = new XSSFWorkbook(file);
        Iterator<Sheet> sheets = workbook.sheetIterator();
        Sheet sh = sheets.next();
        Iterator<Row> iterator = sh.iterator();
        Row row = iterator.next();
        flightFrom= String.valueOf(row.getCell(0));
        return flightFrom;
    }
    public static CharSequence flightTo()throws Exception{
       FileInputStream file = new FileInputStream(new File(NAME));
       Workbook workbook = new XSSFWorkbook(file);
       Iterator<Sheet> sheets = workbook.sheetIterator();
       Sheet sh = sheets.next();
       Iterator<Row> iterator = sh.iterator();
       Row row = iterator.next();
       flightTo = String.valueOf(row.getCell(1));
       return flightTo;
   }

    public static CharSequence name()throws Exception{
        FileInputStream file = new FileInputStream(new File(NAME));
        Workbook workbook = new XSSFWorkbook(file);
        Iterator<Sheet> sheets = workbook.sheetIterator();
        Sheet sh = sheets.next();
        Iterator<Row> iterator = sh.iterator();
        Row row = iterator.next();
        name = String.valueOf(row.getCell(2));
        return name;
    }
    public static CharSequence lastName()throws Exception{
        FileInputStream file = new FileInputStream(new File(NAME));
        Workbook workbook = new XSSFWorkbook(file);
        Iterator<Sheet> sheets = workbook.sheetIterator();
        Sheet sh = sheets.next();
        Iterator<Row> iterator = sh.iterator();
        Row row = iterator.next();
        lastName = String.valueOf(row.getCell(3));
        return lastName;
    }

    public static CharSequence email()throws Exception{
        FileInputStream file = new FileInputStream(new File(NAME));
        Workbook workbook = new XSSFWorkbook(file);
        Iterator<Sheet> sheets = workbook.sheetIterator();
        Sheet sh = sheets.next();
        Iterator<Row> iterator = sh.iterator();
        Row row = iterator.next();
        email = String.valueOf(row.getCell(4));
        return email;
    }

    public static CharSequence flyerNumber()throws Exception{
        FileInputStream file = new FileInputStream(new File(NAME));
        Workbook workbook = new XSSFWorkbook(file);
        Iterator<Sheet> sheets = workbook.sheetIterator();
        Sheet sh = sheets.next();
        Iterator<Row> iterator = sh.iterator();
        Row row = iterator.next();
        flyerNumber = String.valueOf(row.getCell(5));
        return flyerNumber;
    }



   }
