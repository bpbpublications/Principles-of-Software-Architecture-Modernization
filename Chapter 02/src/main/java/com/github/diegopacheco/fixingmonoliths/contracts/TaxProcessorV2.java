package com.github.diegopacheco.fixingmonoliths.contracts;

import java.math.BigDecimal;

public interface TaxProcessorV2 {
    BigDecimal computeSalesTax(Long salesID, BigDecimal value, String state);
}