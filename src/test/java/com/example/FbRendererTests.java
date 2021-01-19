package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class FbRendererTests {
    private FbRenderer testSubject = new FbRenderer();
    
    @Test
    public void should_create_fizzbuzz_renderer() {
        assertThat(true).isEqualTo(true);
    }

    @Test
    public void should_render_1_as_1() {
        assertThat(testSubject.render(1)).isEqualTo("1");
    }

    @Test
    public void should_render_2_as_2() {
        assertThat(testSubject.render(2)).isEqualTo("2");
    }

    @Test
    public void should_render_3_as_Fizz() {
        assertThat(testSubject.render(3)).isEqualTo("Fizz");
    }

    @Test
    public void should_render_5_as_Buzz() {
        assertThat(testSubject.render(5)).isEqualTo("Buzz");
    }

    @Test
    public void should_render_6_as_Fizz() {
        assertThat(testSubject.render(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_render_9_as_Fizz() {
        assertThat(testSubject.render(9)).isEqualTo("Fizz");
    }

    @Test
    public void should_render_15_as_FizzBuzz() {
        assertThat(testSubject.render(15)).isEqualTo("FizzBuzz");
    }

}
