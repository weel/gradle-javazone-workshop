package no.weel.gradleworkshop.runningtest;

import static org.junit.Assert.*;
import org.junit.*;

public class RunningTest {

    @Test public void gradle_better_than_maven() {
        assertEquals("Gradle is better than maven", "Gradle is better than maven");
    }
}