package com.bucur.testing.mockito;

import com.bucur.testing.junit4.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;

// run tests using mockito
@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    // define the mock object
    @Mock
    private Calculator mockCalculator;

    @Test
    public void whenAdd_thenReturnOk() {
        // given
        // force mock object to return what I want
        Mockito.when(mockCalculator.sum(anyInt(), anyInt()))
                .thenReturn(123);

        // when
        int actual = mockCalculator.sum(1, 2);

        // then
        assertThat(actual).isEqualTo(123);
    }
}
