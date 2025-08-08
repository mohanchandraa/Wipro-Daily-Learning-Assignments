package com.wipro.mohanachandra.quizappmonorepo.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
	private int id;
	private String userAnswer;
}
