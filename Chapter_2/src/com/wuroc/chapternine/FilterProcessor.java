//FilterAdapter.java
package com.wuroc.chapternine;

/**
 * @author RocWu
 *
 */
class FilterAdapter implements Processor1 {

	Filter filter;
	
	FilterAdapter(Filter filter){
		this.filter = filter;
	}
	
	@Override
	public String name() {
		return filter.name();
	}
	
	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}

}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Applicator1.apply(new FilterAdapter(new LowPass(1.0)), w);
		Applicator1.apply(new FilterAdapter(new HighPass(2.0)), w);
		Applicator1.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
		
	}
	
}


