package com.cgm.doctor;

import com.cgm.doctor.model.Doctor;
import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoctorFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    private static final Doctor given = new Doctor("1", "Acula", "vampire");
    private static final Doctor expected = new Doctor("1", "Acula", "vampire");

    @Test
    public void shouldReturnDoctor() {
        testing.givenEvent().withBody(given.toJson()).enqueue();
        testing.thenRun(DoctorFunction.class, "create");

        FnResult result = testing.getOnlyResult();
        assertEquals(expected.toJson(), result.getBodyAsString());
    }

}