package pwo;

import java.math.BigDecimal;

public class FibonacciGenerator extends Generator {

    public static final int f_1 = 1;
    public static final int f_2 = 0;
    
    FibonacciGenerator(){
        n_1 = new BigDecimal(f_1);
        n_2 = new BigDecimal(f_2);
    }

}
