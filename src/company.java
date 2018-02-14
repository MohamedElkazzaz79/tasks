
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed ragab
 */
public class company {
    public static void displayData(ResultSet rs) throws SQLException{
        while (rs.next()){
        StringBuffer buffer = new StringBuffer();
        buffer.append("company "+rs.getInt("id"+": "));
            System.out.println(buffer.toString());
        
        }
    
    }
    
}
