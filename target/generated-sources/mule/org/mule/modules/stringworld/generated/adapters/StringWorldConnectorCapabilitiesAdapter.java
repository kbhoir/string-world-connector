
package org.mule.modules.stringworld.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.stringworld.StringWorldConnector;


/**
 * A <code>StringWorldConnectorCapabilitiesAdapter</code> is a wrapper around {@link StringWorldConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-14T01:20:41+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class StringWorldConnectorCapabilitiesAdapter
    extends StringWorldConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
