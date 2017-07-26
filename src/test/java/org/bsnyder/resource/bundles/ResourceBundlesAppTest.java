package org.bsnyder.resource.bundles;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ResourceBundlesAppTest {

    private ResourceBundlesApp app = new ResourceBundlesApp();

    @Test
    public void testGetMessage() {
        String msg = app.getMessage("test.message1");
        assertThat(msg, is("This is a test of the Java Resource Bundles"));
    }

    @Test
    public void testFormatMessage() {
        String msg = app.formatMessage("test.message2", "foo");
        assertThat(msg, is("The field \"foo\" is not fully populated."));
    }
}
