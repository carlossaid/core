//-----BEGIN DISCLAIMER-----
/*******************************************************************************
* Copyright (c) 2011, 2020 JCrypTool Team and Contributors
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
//-----END DISCLAIMER-----
package org.jcryptool.crypto.flexiprovider.descriptors.reflect.interfaces;

import java.util.List;

public interface IMetaParameter {

	public void addParameter(IMetaParameter parameter);	
	public String getDescription();	
	public String getName();
	public List<IMetaParameter> getSubParameters();
	public String getType();
	
}
