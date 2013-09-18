// -----BEGIN DISCLAIMER-----
/**************************************************************************************************
 * Copyright (c) 2013 JCrypTool Team and Contributors
 * 
 * All rights reserved. This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *************************************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.keystore;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.jcryptool.crypto.keystore.backend.KeyStoreManager;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle and initializes the singleton JCrypTool KeyStoreManager.
 * 
 * @see org.jcryptool.crypto.keystore.backend.KeyStoreManager
 * 
 * @author Tobias Kern, Dominik Schadow
 */
public class KeyStorePlugin extends AbstractUIPlugin {
    /** The plug-in ID, value is {@value} . */
    public static final String PLUGIN_ID = "org.jcryptool.crypto.keystore"; //$NON-NLS-1$
    /** The shared instance. */
    private static KeyStorePlugin plugin;

    /**
     * The constructor, initializes the singleton KeyStoreManager instance.
     */
    public KeyStorePlugin() {
        KeyStoreManager.getInstance();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext )
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static KeyStorePlugin getDefault() {
        return plugin;
    }

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path.
     * 
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    /**
     * Returns an image descriptor for the image file at the provided plug-in relative path.
     * 
     * @param path the path
     * @return the image descriptor
     */
    public static ImageDescriptor getImageDescriptor(String pluginID, String path) {
        return imageDescriptorFromPlugin(pluginID, path);
    }
}
