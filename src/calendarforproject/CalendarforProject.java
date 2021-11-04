/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarforproject;

import static calendarforproject.Login.login_email_id;
import java.util.prefs.Preferences;

/**
 * We declare a enum class called MONTHS to represent a group of months.
 * 
 */
enum MONTHS
{
	Jan, Feb, March, Apr, May, June, July, Aug, Sep, Oct, Nov, Dec;
}

/**
 * This is the main class that calls the Login class. 
 * 
 * @author Sadat Arefin Rafat,180041106
 * @author Shams Tanveer Jim,180041107
 * @author Faysal Mahmud,180041117
 */
public class CalendarforProject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login obj=new Login();
        obj.setBounds(0,0,1940,1050);
        obj.setTitle("Calendar");
        obj.setResizable(true);
        obj.setVisible(true);
    }
    
}
