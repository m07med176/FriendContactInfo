package friendsinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataBaseLayerAccess {
    
    
    private static String TABLE = "FRIENDCONTACTTABLE";
    public static int index = 0;
        
   public static ArrayList<FriendContact> dataCollector(ResultSet  result) throws SQLException{
       ArrayList<FriendContact> dataList = new ArrayList<>();
        while(result.next())
        {
            FriendContact data = new FriendContact();
            data.setId(result.getInt(1));
            data.setfName(result.getString(2));
            data.setmName(result.getString(3));
            data.setlName(result.getString(4));
            data.setEmail(result.getString(5));
            data.setPhone(result.getString(6));
            dataList.add(data);
        }
        
        return dataList;
   }

   
   public static void requestNew(FriendContact data,Connection connection) throws SQLException {
        PreparedStatement sql = connection.prepareStatement("INSERT INTO "+TABLE+" VALUES(?,?,?,?,?,?)");
        sql.setInt(1, data.getId());
        sql.setString(2, data.getfName());
        sql.setString(3, data.getmName());
        sql.setString(4, data.getlName());
        sql.setString(5, data.getEmail());
        sql.setString(6, data.getPhone());
        
        sql.execute();
        connection.commit();
    }   
    
   public static void requestUpdate (FriendContact data,Connection connection) throws SQLException {
        System.out.println(data.toString());
        PreparedStatement sql = connection.prepareStatement("UPDATE  "+TABLE+
                " SET FNAME =?,LNAME=?,MNAME=?,EMAIL =?,PHONE=? WHERE ID=?");
        
        sql.setString(1, data.getfName());
        sql.setString(2, data.getmName());
        sql.setString(3, data.getlName());
        sql.setString(4, data.getEmail());
        sql.setString(5, data.getPhone());
        sql.setInt(6, data.getId());
        
        sql.executeUpdate();
        connection.commit();
        
    }

   public static FriendContact requestDelete(int id,Connection connection) throws SQLException,IndexOutOfBoundsException {
        System.out.println(String.valueOf(id));
        PreparedStatement sql = connection.prepareStatement("DELETE FROM "+TABLE+
                "  WHERE ID=?");
       
        sql.setInt(1, id);
     
        sql.execute();
        connection.commit();
        
        return requestFIrst(connection);
    }

   public static FriendContact requestFIrst(Connection connection) throws SQLException,IndexOutOfBoundsException {
        PreparedStatement sql = connection.prepareStatement("SELECT * FROM "+TABLE);
        ResultSet  result = sql.executeQuery();
        ArrayList<FriendContact> data = dataCollector(result);
        
        FriendContact reVal = new FriendContact();
        if(!data.isEmpty()){
                reVal = data.get(0);
                index=0;
        }
        return reVal;
    }

   public static FriendContact requestNext(Connection connection) throws SQLException,IndexOutOfBoundsException {
        
        PreparedStatement sql = connection.prepareStatement("SELECT * FROM "+TABLE);
        ResultSet  result = sql.executeQuery();
   
        ArrayList<FriendContact> data = dataCollector(result);
        FriendContact reVal = new FriendContact();
        if(index <data.size()-1 && index >=0){
            reVal = data.get(++index);       
        }
        return reVal;
    }

    public static FriendContact requestPrevious(Connection connection) throws SQLException,IndexOutOfBoundsException {
        PreparedStatement sql = connection.prepareStatement("SELECT * FROM "+TABLE);
        ResultSet  result = sql.executeQuery();
   
        ArrayList<FriendContact> data = dataCollector(result);
        FriendContact reVal = new FriendContact();
        if(index<=data.size() && index >0){
                reVal = data.get(--index);
        }
        return reVal;
    }

    public static FriendContact requestLast(Connection connection) throws SQLException,IndexOutOfBoundsException {
        PreparedStatement sql = connection.prepareStatement("SELECT * FROM "+TABLE);
        ResultSet  result = sql.executeQuery();
        ArrayList<FriendContact> data = dataCollector(result);
        FriendContact reVal = new FriendContact();
        if(!data.isEmpty()){
                reVal = data.get(data.size()-1);
                index=data.size()-1;
        }
        return reVal;
    }
    
}
