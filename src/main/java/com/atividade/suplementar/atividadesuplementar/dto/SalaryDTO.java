package com.atividade.suplementar.atividadesuplementar.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class SalaryDTO {
  private double discountINSS;
  private double discountIRRF;
  private double liquid;
  private double gross;

}
