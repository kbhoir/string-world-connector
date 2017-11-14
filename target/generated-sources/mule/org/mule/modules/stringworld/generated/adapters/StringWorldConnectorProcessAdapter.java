
package org.mule.modules.stringworld.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.stringworld.StringWorldConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>StringWorldConnectorProcessAdapter</code> is a wrapper around {@link StringWorldConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-14T01:20:41+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class StringWorldConnectorProcessAdapter
    extends StringWorldConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<StringWorldConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, StringWorldConnectorCapabilitiesAdapter> getProcessTemplate() {
        final StringWorldConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,StringWorldConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, StringWorldConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, StringWorldConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
