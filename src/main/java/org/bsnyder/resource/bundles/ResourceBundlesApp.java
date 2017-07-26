package org.bsnyder.resource.bundles;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ResourceBundlesApp {

    private static final String RESOURCE_NAME = "org.bsnyder.resource.messages";

    private ResourceBundle bundle;

    public ResourceBundlesApp() {
       load();
    }

    public void load() {
        this.bundle = ResourceBundle.getBundle(RESOURCE_NAME);
    }

    public String getMessage(String key) {
        return bundle.getString(key);
    }

    public String formatMessage(String key, String arg) {
        String msg = getMessage(key);
        MessageFormat formatter = new MessageFormat(msg);
        return formatter.format(new Object[] {arg});
    }
}
