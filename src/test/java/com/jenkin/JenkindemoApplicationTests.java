package com.jenkin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(MockitoExtension.class)
class JenkindemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkindemoApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("test case executing.....");
		Assertions.assertEquals(true, true);
	}

}
