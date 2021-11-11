package com.atividade.suplementar.atividadesuplementar.service;

import com.atividade.suplementar.atividadesuplementar.dto.SalaryDTO;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {

  public SalaryDTO calcSalary(double salaryGross) {
    double descontoINSS = calcDiscountINSS(salaryGross);
    double descontoIRRF = calcDiscountIRRF(salaryGross - discountIRRF);
    double liquid = salaryGross - discountIRRF - discountINSS;
    return new SalaryDTO(discountINSS, discountIRRF, liquid, salaryGross);
  }

  private double calcDiscountINSS(double salaryGross) {
    if (salaryGross <= 429) {
      return salaryGross * 0.0765;
    } else if (salaryGross <= 540) {
      return salaryGross * 0.0865;
    } else if (salaryGross <= 715) {
      return salaryGross * 0.09;
    } else if (salaryGross <= 1430) {
      return salaryGross * 0.11;
    } else {
      return 157;
    }
  }

  private double calcDiscountIRRF(double salaryGross) {
    if (salaryGross <= 1058) {
      return 0;
    } else if (salaryGross <= 2115) {
      return salaryGross * 0.15;
    } else {
      return salaryGross * 0.275;
    }
  }

}
