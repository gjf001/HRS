package com.until;

import java.io.FileWriter;    
import java.io.IOException;    
import java.io.PrintWriter;    
import java.sql.Connection;    
import java.sql.PreparedStatement;    
import java.sql.ResultSetMetaData;    
import java.sql.SQLException;
   
public class GenEntityTool {    
    private String tablename = "checks"; // 鐞涖劌鎮�    
    private String dUrl = "src\\com\\staff\\entity\\"; // 閺傚洣娆㈢�涙ê鍋嶆担宥囩枂    
    private String pack = dUrl.substring(dUrl.indexOf("\\")+1, dUrl.length()-1).replace("\\", "."); // 閸栧懎鎮�    
    private String[] colnames; // 閸掓鎮曢弫鎵矋    
    private String[] colTypes; // 閸掓鎮曠猾璇茬�烽弫鎵矋    
    private int[] colSizes; // 閸掓鎮曟径褍鐨弫鎵矋    
    private boolean f_util = false; // 閺勵垰鎯侀棁锟界憰浣割嚤閸忋儱瀵榡ava.util.*    
    private boolean f_sql = false; // 閺勵垰鎯侀棁锟界憰浣割嚤閸忋儱瀵榡ava.sql.*    
    
    public GenEntityTool() {    
        Connection conn = ConnectiondatabaseForJDBC.getConnection(); // 瀵版鍩岄弫鐗堝祦鎼存捁绻涢幒锟�    
        String strsql = "select * from " + tablename;    
        try {    
            PreparedStatement pstmt = conn.prepareStatement(strsql);    
            ResultSetMetaData rsmd = pstmt.getMetaData();    
            int size = rsmd.getColumnCount(); // 閸忚鲸婀佹径姘毌閸掞拷    
            colnames = new String[size];    
            colTypes = new String[size];    
            colSizes = new int[size];    
            for (int i = 0; i < rsmd.getColumnCount(); i++) {    
                colnames[i] = rsmd.getColumnName(i + 1);    
                colTypes[i] = rsmd.getColumnTypeName(i + 1);    
                if (colTypes[i].equalsIgnoreCase("datetime")) {    
                    f_util = true;    
                }    
                if (colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")) {    
                    f_sql = true;    
                }    
                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);    
            }    
            String content = parse(colnames, colTypes, colSizes);    
            try {    
                // 閻㈢喐鍨氶弬鍥︽閸︽澘娼�    
                FileWriter fw = new FileWriter(dUrl + initcap(tablename) + ".java");    
                PrintWriter pw = new PrintWriter(fw);    
                pw.println(content);    
                pw.flush();    
                pw.close();    
            } catch (IOException e) {    
                e.printStackTrace();    
            }    
        } catch (SQLException e) {    
            e.printStackTrace();    
        }  
    }    
    
    /**  
     * 鐟欙絾鐎芥径鍕倞(閻㈢喐鍨氱�圭偘缍嬬猾璁冲瘜娴ｆ挷鍞惍锟�)  
     *   
     * @param colNames  
     * @param colTypes  
     * @param colSizes  
     * @return  
     */    
    private String parse(String[] colNames, String[] colTypes, int[] colSizes) {    
        StringBuffer sb = new StringBuffer("package " + pack + ";\r\n\r\n");    
        if (f_util) {    
            sb.append("import java.util.Date;\r\n");    
        }    
        if (f_sql) {    
            sb.append("import java.sql.*;\r\n");    
        }    
        sb.append("public class " + initcap(tablename) + " {\r\n");    
        processAllAttrs(sb);   
        processAllConstructor(sb);  
        processAllMethod(sb);    
        sb.append("}\r\n");    
        System.out.println(sb.toString());    
        return sb.toString();    
    }    
    /** 
     * 閸掓稑缂撻弸鍕拷鐘虫煙濞夛拷 
     * @param sb 
     */  
    private void processAllConstructor(StringBuffer sb) {  
        sb.append("\tpublic "+initcap(tablename)+"(){\r\n\t}\r\n");    
        sb.append("\tpublic "+initcap(tablename)+"(");  
        for (int i = 0; i < colnames.length; i++) {    
            sb.append(sqlType2JavaType(colTypes[i]) + " " + colnames[i]);  
            if(i<colnames.length-1){  
                sb.append(", ");  
            }  
        }    
        sb.append("){\r\n");  
        for (int i = 0; i < colnames.length; i++) {  
            sb.append("\t\tthis." + colnames[i] + "=" + colnames[i] + ";\r\n");  
        }  
        sb.append("\t}\r\n");  
    }  
  
    /**  
     * 閻㈢喐鍨氶幍锟介張澶屾畱閺傝纭�  
     *   
     * @param sb  
     */    
    private void processAllMethod(StringBuffer sb) {    
        for (int i = 0; i < colnames.length; i++) {    
            sb.append("\tpublic void set" + initcap(colnames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " "    
                    + colnames[i] + "){\r\n");    
            sb.append("\t\tthis." + colnames[i] + "=" + colnames[i] + ";\r\n");    
            sb.append("\t}\r\n");    
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(colnames[i]) + "(){\r\n");    
            sb.append("\t\treturn " + colnames[i] + ";\r\n");    
            sb.append("\t}\r\n");    
        }    
    }    
    
    /**  
     * 鐟欙絾鐎芥潏鎾冲毉鐏炵偞锟斤拷  
     *   
     * @param sb  
     */    
    private void processAllAttrs(StringBuffer sb) {    
        for (int i = 0; i < colnames.length; i++) {    
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colnames[i] + ";\r\n");    
        }    
    }    
    
    /**  
     * 閹跺﹨绶崗銉ョ摟缁楋缚瑕嗛惃鍕浕鐎涙鐦濋弨瑙勫灇婢堆冨晸  
     *   
     * @param str  
     * @return  
     */    
    private String initcap(String str) {    
        char[] ch = str.toCharArray();    
        if (ch[0] >= 'a' && ch[0] <= 'z') {    
            ch[0] = (char) (ch[0] - 32);    
        }    
        return new String(ch);    
    }    
    
    private String sqlType2JavaType(String sqlType) {    
        if (sqlType.equalsIgnoreCase("bit")) {    
            return "bool";    
        } else if (sqlType.equalsIgnoreCase("tinyint")) {    
            return "byte";    
        } else if (sqlType.equalsIgnoreCase("smallint")) {    
            return "short";    
        } else if (sqlType.equalsIgnoreCase("int")) {    
            return "int";    
        } else if (sqlType.equalsIgnoreCase("double")) {    
            return "double";    
        } else if (sqlType.equalsIgnoreCase("bigint")) {    
            return "long";    
        } else if (sqlType.equalsIgnoreCase("float")) {    
            return "float";    
        } else if (sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric")    
                || sqlType.equalsIgnoreCase("real")) {    
            return "double";    
        } else if (sqlType.equalsIgnoreCase("money") || sqlType.equalsIgnoreCase("smallmoney")) {    
            return "double";    
        } else if (sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")    
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")) {    
            return "String";    
        } else if (sqlType.equalsIgnoreCase("datetime")) {    
            return "Date";    
        } else if (sqlType.equalsIgnoreCase("image")) {    
            return "Blob";    
        } else if (sqlType.equalsIgnoreCase("text")) {    
            return "Clob";    
        }    
        return null;    
    }    
    
    public static void main(String[] args) {    
        new GenEntityTool();    
    }    
}    