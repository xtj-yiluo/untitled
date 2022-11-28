package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestDate {
    private static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static Date formatDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        Date parse = new Date();
        try {
            parse = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
    private static String format(String formatStr, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatStr);
        return formatter.format(date);
    }

    public static String formatYYYYMMDDHHMMSS(Date date) {
        return format(YYYY_MM_DD_HH_MM_SS, date);
    }

    public static void main(String[] args) {
        System.out.println(formatDate("2019-05-06 14:25:21"));// new Date()为获取当前系统时间
        System.out.println(formatYYYYMMDDHHMMSS(new Date()));// new Date()为获取当前系统时间

        System.out.println(new Date().toString() );

        List list = new LinkedList();

    }

}
