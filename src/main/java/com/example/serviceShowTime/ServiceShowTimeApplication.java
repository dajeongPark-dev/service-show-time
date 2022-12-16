package com.example.serviceShowTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class ServiceShowTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceShowTimeApplication.class, args);
	}

	@RequestMapping("/api/time")
	public String serviceDate() {
		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)

		LocalTime time = LocalTime.now();

		// 포맷 정의하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");

		// 포맷 적용하기
		String formatedNow = time.format(formatter);

		return String.valueOf(formatedNow);
	}
}
