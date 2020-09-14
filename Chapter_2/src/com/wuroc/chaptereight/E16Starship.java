//: Starship.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年9月13日
 * import static com.wuroc.util.Print.*;
 * 
 */
class AlertStatus {
	public String getStatus() {
		return "None";
	}	
}

class RedAlertStatus extends AlertStatus {
	public String getStatus() {
		return "Red";
	}
}

class YellowAlertStatus extends AlertStatus {
	public String getStatus() {
		return "Yellow";
	}
}

class GreenAlertStatus extends AlertStatus{
	public String getStatus() {
		return "Green";
	}
}

class Starship {
	private AlertStatus status = new GreenAlertStatus();
	public void setStatus(AlertStatus istatus) {
		status = istatus;
	}
	public String toString() {
		return status.getStatus();
	}		
}
public class E16Starship{
	public static void main(String[] args) {
		
		Starship eprise = new Starship();
		System.out.println(eprise);
		
		eprise.setStatus(new YellowAlertStatus());
		System.out.println(eprise);
		
		eprise.setStatus(new RedAlertStatus());
		System.out.println(eprise);
	}
}

/* Output:
Green
Yellow
Red
 */






