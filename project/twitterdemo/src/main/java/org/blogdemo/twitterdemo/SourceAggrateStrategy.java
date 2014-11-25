package org.blogdemo.twitterdemo;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class SourceAggrateStrategy implements AggregationStrategy {

	
	
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		SourceCounter counter = null;
		
		if (oldExchange == null) {
			counter = new SourceCounter();
        }else{     	
        	counter = oldExchange.getIn().getBody(SourceCounter.class);
        }
		
		String newType = newExchange.getIn().getHeader("deviceType").toString();	
		counter.addType(newType);
	
		
		
		newExchange.getIn().setBody(counter);
	    //newExchange.getOut().setBody(counter);
	    
		return newExchange;
	}
	
	
}
