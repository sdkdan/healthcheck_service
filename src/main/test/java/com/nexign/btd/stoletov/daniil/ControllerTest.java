package com.nexign.btd.stoletov.daniil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {
    @InjectMocks
    private Controller testee; //наименование контроллера созданного ранее

    @Test
    public void whenAnswerToIsNullThenResponseShouldBeSimpleOk() {
        String response = testee.check(null);
        assertEquals("response", "I'm OK!" , response);
    }
    @Test
    public void whenAnswerToIsEmptyThenResponseShouldBeSimpleOk() {
        String response = testee.check("");
        assertEquals("response", "I'm OK!" , response);
    }
    @Test
    public void whenAnswerToIsNotEmptyhenResponseShouldBeOkWithName() {
        String response = testee.check("son");
        assertEquals("response", "I'm OK, son!" , response);
    }