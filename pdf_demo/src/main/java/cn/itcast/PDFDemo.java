package cn.itcast;

import net.sf.jasperreports.engine.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PDFDemo {
    private static Connection connection;



    public static void main(String[] args) throws Exception {
//        //1.导出一个只有静态文本的pdf
//        //制定的路径
//        String filePath = "C:\\Users\\jht\\Desktop\\jasper01.jasper";
//        //文件的输入流
//        InputStream inputStream=new FileInputStream ( filePath );
//        //准备模板中需要的参数
//        Map parameters = new HashMap <>();
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport ( inputStream,parameters ,new JREmptyDataSource (  ));
//        //输出
//        JasperExportManager.exportReportToPdfStream ( jasperPrint,new FileOutputStream ( "d:\\demo1.pdf" ) );

        //2.导出一个带有参数的dbf
       /* String filePath = "C:\\Users\\jht\\Desktop\\jasper02.jasper";
        //文件的输入流
        InputStream inputStream = new FileInputStream ( filePath );
        //准备模板中需要的参数
        Map parameters = new HashMap<>();
        parameters.put ( "username","张三" );
        parameters.put ( "email","zhangsan@qq.com" );
        parameters.put ( "deptName","财务部" );
        parameters.put ( "companyName","腾讯" );

        JasperPrint jasperPrint = JasperFillManager.fillReport ( inputStream,parameters ,new JREmptyDataSource (  ));
        //输出
        JasperExportManager.exportReportToPdfStream ( jasperPrint,new FileOutputStream ( "d:\\demo2.pdf" ) );*/

        //3.导出一个数据从数据库中获得pdf指定模板的路径
//        String filePath = "C:\\Users\\jht\\Desktop\\jasper03.jasper";
//        //文件的输入流
//        InputStream inputStream = new FileInputStream ( filePath );
//        //准备模板中需要的参数
//        Map parameters = new HashMap <> ();
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport ( inputStream, parameters, getConnection () );
//        JasperExportManager.exportReportToPdfStream ( jasperPrint, new FileOutputStream ( "d:\\demo3.pdf" ) );


        //4.导出一个数据从集合获取的pdf
        String filePath = "C:\\Users\\jht\\Desktop\\jasper04.jasper";
        InputStream inputStream = new FileInputStream ( filePath );
        Map parameters = new HashMap <> ();
        List <User> userList = new ArrayList <> ();
        for (int i = 0; i < 100; i++) {
            User user = new User ();
            user.setUsername ( "张"+i );
            user.setEmail ( "" );
        }

    }

 public static Connection lisi() {
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection connection = DriverManager.getConnection ( "jdbc:mysql:///saas-export-103", "root", "root" );
            return connection;
        } catch (Exception e) {
            e.printStackTrace ();
            return null;
        }


    }

public static Connection zhangsan() {
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection connection = DriverManager.getConnection ( "jdbc:mysql:///saas-export-103", "root", "root" );
            return connection;
        } catch (Exception e) {
            e.printStackTrace ();
            return null;
        }


    }



    public static Connection getConnection() {
        try {
            Class.forName ( "com.mysql.jdbc.Driver" );
            Connection connection = DriverManager.getConnection ( "jdbc:mysql:///saas-export-103", "root", "root" );
            return connection;
        } catch (Exception e) {
            e.printStackTrace ();
            return null;
        }

    }
}
