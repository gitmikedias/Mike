package com.mike;
import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.commons.lang3.StringUtils;


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