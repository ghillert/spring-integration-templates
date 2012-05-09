#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ${package};

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ${package}.service.StringConversionService;


/**
 * Starts the Spring Context and will initialize the Spring Integration routes.
 *
 * @author Gunnar Hillert
 * @version 1.0
 *
 */
public final class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Main() { }

    /**
     * Load the Spring Integration Application Context
     *
     * @param args - command line arguments
     */
    public static void main(final String... args) {

        LOGGER.info("${symbol_escape}n========================================================="
                  + "${symbol_escape}n                                                         "
                  + "${symbol_escape}n          Welcome to Spring Integration!                 "
                  + "${symbol_escape}n                                                         "
                  + "${symbol_escape}n    For more information please visit:                   "
                  + "${symbol_escape}n    http://www.springsource.org/spring-integration       "
                  + "${symbol_escape}n                                                         "
                  + "${symbol_escape}n=========================================================" );

        final AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/integration/*-context.xml");

        context.registerShutdownHook();

        final Scanner scanner = new Scanner(System.in);

        final StringConversionService service = context.getBean(StringConversionService.class);

        LOGGER.info("${symbol_escape}n========================================================="
                  + "${symbol_escape}n                                                         "
                  + "${symbol_escape}n    Please press 'q + Enter' to quit the application.    "
                  + "${symbol_escape}n                                                         "
                  + "${symbol_escape}n=========================================================" );

        System.out.print("Please enter a string and press <enter>: ");

        while (true) {

        	final String input = scanner.nextLine();

        	if("q".equals(input.trim())) {
        		break;
        	}

        	try {

	        	System.out.println("Converted to upper-case: " + service.convertToUpperCase(input));

        	} catch (Exception e) {
        		LOGGER.error("An exception was caught: " + e);
        	}

        	System.out.print("Please enter a string and press <enter>:");

        }

        LOGGER.info("Exiting application...bye.");

        System.exit(0);

    }
}
