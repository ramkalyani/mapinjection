package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;import com.zensar.spring.performers.Performer;

public class ZensarIodleMain {
	public static void main(String[] args)
	{
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("performer.xml");
		Performer p=ctx.getBean("kalyani", Performer.class);
		p.perform();
	
	}

}
