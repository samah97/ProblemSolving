package org.problem_solving.ing_exam_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {


    // 1: 5
    //
    public long[] test(Stream<Product> products){

        if(products != null) {
            AtomicLong correctCount = new AtomicLong();
            AtomicLong checkedExceptionsCount = new AtomicLong();
            AtomicLong uncheckedExceptionsCount = new AtomicLong();
            AtomicLong errorsCount = new AtomicLong();

            products
                    .filter(Objects::nonNull)
                    .filter(product -> !"invalid".equalsIgnoreCase(product.getStatus()))
                    .skip(10)
                    .limit(20)
                    .forEachOrdered(product -> {
                                try {
                                    correctCount.incrementAndGet();
                                } catch (Throwable throwable) {
                                    if (throwable instanceof RuntimeException) {
                                        uncheckedExceptionsCount.incrementAndGet();
                                    }
                                    if (throwable instanceof Exception) {
                                        checkedExceptionsCount.incrementAndGet();
                                    } else {
                                        errorsCount.incrementAndGet();
                                    }
                                }
                            }
                    );
            return new long[]{
                    correctCount.get(),
                    checkedExceptionsCount.get(),
                    uncheckedExceptionsCount.get(),
                    errorsCount.get()
            };

        }
        return new long[4];
    }

    long[] invalidStream(){
        return new long[4];
    }

    public class Product{

        String status;

        public String getStatus() {
            return status;
        }
    }
}
