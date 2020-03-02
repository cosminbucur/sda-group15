package com.bucur.testing.tdd;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FahrenheitCelsiusConverterTest {

    // given when then
    @Test
    public void givenConverter_whenToCelsius50_thenReturn10() {
        // given
        TemperatureConverter converter = new TemperatureConverter();

        // when
        int actual = converter.toCelsius(50);

        // then
        assertThat(actual).isEqualTo(10);
    }
}
