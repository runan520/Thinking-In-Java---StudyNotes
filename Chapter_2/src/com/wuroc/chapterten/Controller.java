//Controller.java
package com.wuroc.chapterten;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RocWu
 *
 */
public class Controller {
	//集合
	private List<Event> eventList = new ArrayList<>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size() > 0)
			//集合变数组
			for(Event e : new ArrayList<>(eventList) )
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
		}
	}
}
