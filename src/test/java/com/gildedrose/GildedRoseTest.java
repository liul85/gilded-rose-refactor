package com.gildedrose;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void shouldGetCorrectAppOutput() throws IOException {
        String appOutput = TexttestFixture.getAppOutput();
        assertThat(appOutput, is(new String(Files.readAllBytes(Paths.get("src/test/output.txt")))));
    }

}
