/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.math.BigDecimal;

/**
 *
 * @author dariusz
 */
public abstract class Generator {

    protected int lastIndex = 0;
    protected BigDecimal current = new BigDecimal(0);

    protected BigDecimal n_1, n_2;

    public void reset(int n1, int n2) {
        lastIndex = 0;
        current = new BigDecimal(0);
        n_1 = new BigDecimal(n1);
        n_2 = new BigDecimal(n2);
    }

    public BigDecimal nextTerm(int n1, int n2) {
        if (lastIndex > 1) {
            current = n_1.add(n_2);
            n_2 = n_1;
            n_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(n1);
        } else {
            current = new BigDecimal(n2);
        }
        lastIndex++;
        return current;
    }
        public BigDecimal getTerm(int i, int n1, int n2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset(n1, n2);
        }
        while (lastIndex <= i) {
            nextTerm(n1, n2);
        }
        return current;
    }

}
