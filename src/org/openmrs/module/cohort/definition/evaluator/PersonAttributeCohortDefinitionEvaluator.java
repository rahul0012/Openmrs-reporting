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
package org.openmrs.module.cohort.definition.evaluator;

import org.openmrs.Cohort;
import org.openmrs.annotation.Handler;
import org.openmrs.api.PatientSetService;
import org.openmrs.api.context.Context;
import org.openmrs.module.cohort.definition.CohortDefinition;
import org.openmrs.module.cohort.definition.PersonAttributeCohortDefinition;
import org.openmrs.module.evaluation.EvaluationContext;

/**
 * Evaluates an PersonAttributeCohortDefinition and produces a Cohort
 */
@Handler(supports={PersonAttributeCohortDefinition.class})
public class PersonAttributeCohortDefinitionEvaluator implements CohortDefinitionEvaluator {

	/**
	 * Default Constructor
	 */
	public PersonAttributeCohortDefinitionEvaluator() {}
	
	/**
     * @see CohortDefinitionEvaluator#evaluateCohort(CohortDefinition, EvaluationContext)
     */
    public Cohort evaluate(CohortDefinition cohortDefinition, EvaluationContext context) {
    	PersonAttributeCohortDefinition d = (PersonAttributeCohortDefinition) cohortDefinition;
		
    	PatientSetService pss = Context.getPatientSetService();
		return pss.getPatientsHavingPersonAttribute(d.getAttribute(), d.getValue());
    }
}