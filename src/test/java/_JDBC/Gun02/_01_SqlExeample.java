package _JDBC.Gun02;

import _JDBC.JDBCParrent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExeample extends JDBCParrent {

    // last , first ,getRow,getInt,getDouble
    @Test
    public void Test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select city_id,city,country_id from city");

        rs.last();// sonuncu row a gider
        String id=rs.getString(1);//city id
        System.out.println("id = " + id);
        int idInt=rs.getInt(1);
        System.out.println("idInt = " + idInt);

        String name=rs.getString(2);
        System.out.println("name = " + name);

//        int nameInt=rs.getInt(2);
//        System.out.println("nameInt = " + nameInt);
        // tipi uygun olan dönüşümle , mesala hepsini String olarak alabilirsin.
        // ancak tipi uygun olmayan mesala isimleri , int olarak zaten alınmaz

        int kacinciSatir=rs.getRow();
        System.out.println("kacinciSatir = " + kacinciSatir);
        // dolayısıyla bir sorgunun sonucunda kaç satır geldiğini
        // rs.last() dedikten sonra rs.getRow() ile alabilirim.

        rs.first(); // ilk Row a gider

        kacinciSatir=rs.getRow();
        System.out.println("kacinciSatir = " + kacinciSatir);

    }
}
