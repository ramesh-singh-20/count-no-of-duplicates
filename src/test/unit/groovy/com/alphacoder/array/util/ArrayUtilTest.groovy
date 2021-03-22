package com.alphacoder.array.util

import spock.lang.Specification

class ArrayUtilTest extends Specification{

    def 'Test ArrayUtil | Count No Of Duplicates'(){
        given:
        List<Integer> numbers= new ArrayList<>()

        numbers.add(1)
        numbers.add(5)
        numbers.add(9)
        numbers.add(7)
        numbers.add(5)
        numbers.add(1)
        numbers.add(10)
        numbers.add(1)
        numbers.add(7)
        numbers.add(1)

        when:
        def result= ArrayUtil.countNoOfDuplicates(numbers)

        then:
        result== 3
    }
}
