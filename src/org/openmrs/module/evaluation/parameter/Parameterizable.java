/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.evaluation.parameter;

import java.io.Serializable;
import java.util.List;

import org.openmrs.module.evaluation.EvaluationContext;

/**
 * A class that implements this interface indicates that it is 
 * capable of being configured at runtime using Parameters.
 * 
 * @see Parameter
 * @see EvaluationContext
 * @see Param
 */
public interface Parameterizable extends Serializable {
	
	/**
	 * @return list of parameters that have been configured on this instance
	 */
	public List<Parameter> getParameters();
	
	/**
	 * @return the Parameter which has been added with the given name
	 */
	public Parameter getParameter(String name);
	
	/**
	 * This method take a Parameter as input and adds it to its list of Parameters
	 * @param parameter - The {@link Parameter} to add
	 */
	public void addParameter(Parameter parameter);
}
