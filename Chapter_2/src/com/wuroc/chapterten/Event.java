//Event.java
package com.wuroc.chapterten;

import java.time.Duration;
import java.time.Instant;

/**
 * @author RocWu
 *
 */

public abstract class Event {
	//Instant 即时时间
	private Instant eventTime;
	//Duration 持续时间
	protected final Duration delayTime;
	public Event(long millisecondDelay) {
		//从指定的毫秒中提取秒和纳秒
		delayTime = Duration.ofMillis(millisecondDelay);
		start();
	}
	
	/**
	 * 
	 */
	public  void start() {
		//现在的时间加上需要延迟的时间，delayTime是构造器内产生的
		eventTime = Instant.now().plus(delayTime);
	}
	
	public boolean ready() {
		
		//检查此时刻是否在指定时刻之后。比较基于时刻的时间轴位置
		return Instant.now().isAfter(eventTime);
	}
	public abstract void action();

}
