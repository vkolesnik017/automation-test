package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
    @Test
    public void test() {
        navigate("https://www.google.com/");
    }
}
