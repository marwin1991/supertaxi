package com.codecool.supertaxi.SuperTaxi

import spock.lang.Specification

class SuperTaxiApplicationTest extends Specification {


    def "Ala ma kota"() {
        given:
            int a = 2
            int b = 3

        when:
            int result = a + b

        then:
            result == 5
    }
}
