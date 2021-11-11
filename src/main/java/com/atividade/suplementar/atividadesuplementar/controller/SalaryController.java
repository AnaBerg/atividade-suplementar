package com.atividade.suplementar.atividadesuplementar.controller;

import com.atividade.suplementar.atividadesuplementar.dto.SalaryDTO;
import com.atividade.suplementar.atividadesuplementar.service.SalaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryController {

  @Autowired
  SalaryService salaryService;

  @GetMapping
  @RequestMapping()
  public ResponseEntity<SalaryDTO> getSalario(@RequestParam(required = true) double salarioBruto) {
    SalaryDTO salary = salarioService.calcSalario(salarioBruto);
    return ResponseEntity.status(HttpStatus.OK).body(salary);
  }

}