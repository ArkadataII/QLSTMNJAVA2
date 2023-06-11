/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author danhn
 */
public class chuyendoi {
    static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    static DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
    public static String LayngayString(Date date){
        return df.format(date);
    }
    public static Date LayngayDate(String nn) throws ParseException{
        return df.parse(nn);
    }
    public static String LayngayString1(Date date){
        return df1.format(date);
    }
    public static Date LayngayDate1(String nn) throws ParseException{
        return df1.parse(nn);
    }
}
