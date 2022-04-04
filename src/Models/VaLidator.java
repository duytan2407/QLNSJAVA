/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class VaLidator {
    public static boolean isEmpty (JTextField txtField , StringBuilder str , String msg)
    {
        String strField = txtField.getText().trim();
        if (strField.equals(""))
        {
         str.append(msg).append("\n");
        txtField.setBackground(Color.RED);
        return false ;
        }
    txtField.setBackground(Color.YELLOW);
    return true;
    }
      public static boolean isDate (JTextField txtField , StringBuilder str , String msg , String pattern )
    {   SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        if (!pattern.equals("")) {
        dateFormat.applyPattern(pattern);
     }
        
        if (!isEmpty(txtField, str, msg)) {
            return  false;
        } else {
            try {
                msg = "Ngay Thang Nam khong dung dinh dang";
                Date date = dateFormat.parse(txtField.getText().trim());
            } catch (Exception e) {
               str.append(msg).append("\n");
               txtField.setBackground(Color.PINK);
                System.out.println("loi ngay" +e.toString());
                return false;
            }
        }
        txtField.setBackground(Color.red);
        return true;
    }  public static boolean isDate (JTextField txtField , StringBuilder str , String msg  )
    {   
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (!isEmpty(txtField, str, msg)) {
            return  false;
        } else {
            try {
                msg = "Ngay Thang Nam khong dung dinh dang";
                Date date = dateFormat.parse(txtField.getText().trim());
            } catch (Exception e) {
               str.append(msg).append("\n");
               txtField.setBackground(Color.PINK);
                System.out.println("loi ngay" +e.toString());
                return false;
            }
        }
        txtField.setBackground(Color.red);
        return true;
    }
}
