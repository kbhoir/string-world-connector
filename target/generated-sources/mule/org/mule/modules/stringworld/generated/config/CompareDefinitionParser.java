
package org.mule.modules.stringworld.generated.config;

import javax.annotation.Generated;
import org.mule.common.MuleVersion;
import org.mule.config.MuleManifest;
import org.mule.modules.stringworld.generated.processors.CompareMessageProcessor;
import org.mule.modules.stringworld.generated.processors.CompareMessageProcessorDebuggable;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-14T01:20:41+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class CompareDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(CompareDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            MuleVersion muleVersion = new MuleVersion(MuleManifest.getProductVersion());
            BeanDefinitionBuilder beanDefinitionBuilder;
            if (muleVersion.atLeastBase("3.8.0")) {
                beanDefinitionBuilder = beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompareMessageProcessorDebuggable.class.getName());
            } else {
                beanDefinitionBuilder = beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(CompareMessageProcessor.class.getName());
            }
            return beanDefinitionBuilder;
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [compare] within the connector [string-world] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [compare] within the connector [string-world] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("compare");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [compare] within the connector [string-world] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "string1", "string1");
        parseProperty(builder, element, "String2", "String2");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
