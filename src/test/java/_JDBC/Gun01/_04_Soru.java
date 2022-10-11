package _JDBC.Gun01;

import _JDBC.JDBCParrent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_Soru extends JDBCParrent {
    // city tablosundaki tüm kayıtları next ile yazdırınız
    // city tablosundaki tüm kayıtları absolute ile yazdırınız
    // city tablosundaki tüm kayıtları relative ile yazdırınız.
    @Test
    public void Test1() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from city");
        
        int cnt=0;
        
        while (rs.next()){

            System.out.println(rs.getString(2));
            cnt++;

        }
        System.out.println("cnt = " + cnt);

    }

    @Test
    public void Test2() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from city");

        int cnt=1;

        while (rs.absolute(cnt)){

            System.out.println(rs.getString(2));
            cnt++;

        }
        System.out.println("cnt = " + cnt);

    }
    @Test
    public void Test3() throws SQLException {

        ResultSet rs= statement.executeQuery("select * from city");

        int cnt=0;

        while (rs.relative(1)){

            System.out.println(rs.getString(2));
            cnt++;

        }
        System.out.println("cnt = " + cnt);

    }
}
