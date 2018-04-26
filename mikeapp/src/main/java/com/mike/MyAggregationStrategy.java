package com.mike;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class MyAggregationStrategy implements AggregationStrategy {

	        public MyAggregationStrategy() {
	                super();
	        }

	        public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
	                
	        	// Message newIn = newExchange.getIn();
                // String newBody =  newIn.getBody(String.class);

	        	if (oldExchange != null){
	                	    
	                	String newBody = newExchange.getIn().getBody(String.class);
	                    String oldBody = oldExchange.getIn().getBody(String.class);
	                    newExchange.getIn().setBody(oldBody + newBody ); 
	                }
	                
	                return newExchange;
	        }

	}