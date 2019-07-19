package com.hhc.util;

import com.hhc.constant.Constant;

import java.sql.*;

/**
 * 用于数据库连接和增删改查
 */
public class DBUtil {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //    得到数据库连接
    public Connection getConnection() throws SQLException {
        try {
            Class.forName(Constant.DRIVER);
            conn = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
            return conn;
        } catch (ClassNotFoundException e) {
           throw new SQLException("驱动错误或连接失败");
        }
    }
    //释放资源
    public void closeAll(){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //执行SQL语句进行查询
//    public ResultSet executeQuery(String preparedSql,Object[] param){
//
//    }
}
