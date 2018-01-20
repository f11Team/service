package cn.com.wtrj.jx.web.portal.service.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.com.wtrj.jx.web.portal.model.entities.Job;

public class ScoreTaskJob implements Runnable{
	private final static Logger logger = LoggerFactory.getLogger(ScoreTaskJob.class);
	private Job scoreJob;
	private String toUrl;
	public ScoreTaskJob(Job scoreJob,String toUrl) {
		this.scoreJob = scoreJob;
		this.toUrl = toUrl;
	}
	@Override
	public void run() {
		//获取header信息
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		
		ObjectMapper mapper = new ObjectMapper(); 
		String json = null;
		try {
			json = mapper.writeValueAsString(scoreJob);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} //将对象转换成json  
        System.out.println(json); 
		
		HttpEntity<String> formEntity = new HttpEntity<String>(json, headers);
		
		String result = restTemplate.postForObject(toUrl, formEntity, String.class);
	}
	
}
