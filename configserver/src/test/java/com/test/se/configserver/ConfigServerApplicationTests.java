package com.test.se.configserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ConfigServerApplication.class)
@WebAppConfiguration
public class ConfigServerApplicationTests {

	@Value("${local.server.port}")
	private int port = 9999;

	@Test
	public void whenSpringContextIsBootstrapped_thenNoExceptions() {
		@SuppressWarnings("rawtypes")
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity("http://localhost:" + port , String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
	}






}
