// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2008 JCrypTool Team and Contributors
 * 
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.keystore.ui.views.interfaces;

import org.jcryptool.crypto.keystore.ui.views.nodes.ITreeNode;

/**
 * @author tkern
 * 
 */
public interface IKeyStoreListener {

    public void fireKeyStoreModified(ITreeNode node);

}
