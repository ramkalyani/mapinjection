package com.zensar.spring.performers;

import java.util.List;
import java.util.Map;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Map<Instrument,String> instrumentSongMap;

	

	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}

	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist is playing");
		for(Map.Entry<Instrument,String> entr:instrumentSongMap.entrySet())
		{
			System.out.println("song is" +entr.getValue()+ "played by:");
			entr.getKey().play();
			
		}
		
		
		
	}
	
}