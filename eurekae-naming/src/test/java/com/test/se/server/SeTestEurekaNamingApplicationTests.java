package com.test.se.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = SeTestEurekaNamingApplication.class)
public class SeTestEurekaNamingApplicationTests {


	@Value("${local.server.port}")
	private int port = 9999;


	@Test
	public void checkServerRunningStatus() {
		@SuppressWarnings("rawtypes")
		ResponseEntity<String> entity = new TestRestTemplate().getForEntity("http://localhost:" + port , String.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
	}


	@Test
	public void catalogLoads() {
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = new TestRestTemplate().getForEntity("http://localhost:" + port + "/eureka/apps", Map.class);
		assertEquals(HttpStatus.OK, entity.getStatusCode());
	}


}
