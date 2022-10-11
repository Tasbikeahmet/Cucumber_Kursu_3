package _JDBC.Gun01;

import _JDBC.JDBCParrent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBCParrent {
    @Test
    private void Test1() throws SQLException {


        // next() = bir sonraki row a gider
        //previous () = bir onceki row
        //absolute (sayi) = bastan itibaren verilen row a gider
        // relative (sayi) = bulundugu yerden verilen sayi kadar row ileri gider

        ResultSet rs=statement.executeQuery("select * from film");
        rs.absolute(10); // 10 row gitti
        String title=   rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15); // 15 row gitti
        title=   rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15); // sondan 15 row gitti
        title=   rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(5); // en son bulundugun yerden 5 row ileri
        title=   rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5); // en son bulundugun yerden 5 row geri
        title=   rs.getString("title");
        System.out.println("title = " + title);


    }
}
