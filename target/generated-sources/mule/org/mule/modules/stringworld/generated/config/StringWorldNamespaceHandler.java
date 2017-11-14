
package org.mule.modules.stringworld.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/string-world</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-14T01:20:41+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class StringWorldNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(StringWorldNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [string-world] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [string-world] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new StringWorldConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("greet", new GreetDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("greet", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("compare", new CompareDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("compare", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("upper-case", new UpperCaseDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("upper-case", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("lower-case", new LowerCaseDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("lower-case", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("concat", new ConcatDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("concat", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("char-at", new CharAtDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("char-at", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("index-of", new IndexOfDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("index-of", "@Processor", ex);
        }
    }

}
