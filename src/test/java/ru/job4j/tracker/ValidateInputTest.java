package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenCorrectInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleCorrectInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"1", "15", "17"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        int selected1 = input.askInt("Enter menu:");
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
        assertThat(selected1).isEqualTo(15);
        assertThat(selected2).isEqualTo(17);
    }

    @Test
    public void whenMinusInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}