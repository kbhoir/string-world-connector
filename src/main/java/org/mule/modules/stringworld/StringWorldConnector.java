package org.mule.modules.stringworld;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.stringworld.config.ConnectorConfig;

@Connector(name="string-world", friendlyName="StringWorld")
public class StringWorldConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }
    
    @Processor
    public Boolean compare(String string1, String String2) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return string1.equals(String2);
    }
    
    @Processor
    public String UpperCase(String text) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return text.toUpperCase();
    }
    
    @Processor
    public String LowerCase(String text) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return text.toLowerCase();
    }

    @Processor
    public String Concat(String text1, String text2) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return text1.concat(text2);
    }
    
    @Processor
    public Character CharAt(String text, int index) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return text.charAt(index);
    }
    
    @Processor
    public Integer indexOf(String text, char letter) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return text.indexOf(letter);
    }
    
    
    
    
    
    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}