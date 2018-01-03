package com;

import org.apache.camel.builder.RouteBuilder;

public class CamelTimerRoute extends RouteBuilder {

	 

    @Override

    public void configure() throws Exception {

          from("timer://simpleTimer?period=1000").setBody(simple("Hi at ${header.firedTime}"))

                       .to("stream:out");

    }



}


