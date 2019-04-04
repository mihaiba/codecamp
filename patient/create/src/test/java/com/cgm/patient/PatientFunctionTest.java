package com.cgm.patient;

import com.cgm.patient.model.Patient;
import com.fnproject.fn.testing.FnResult;
import com.fnproject.fn.testing.FnTestingRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatientFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    private static final Patient given = new Patient("", "John Doe");
    private static final Patient expected = new Patient("1", "John Doe");

    @Test
    public void shouldReturnPatient() {
        testing.givenEvent().withBody(given.toJson()).enqueue();
        testing.thenRun(PatientFunction.class, "create");

        FnResult result = testing.getOnlyResult();
        assertEquals(expected.toJson(), result.getBodyAsString());
    }

}