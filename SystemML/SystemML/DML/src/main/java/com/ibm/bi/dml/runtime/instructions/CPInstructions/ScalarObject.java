/**
 * IBM Confidential
 * OCO Source Materials
 * (C) Copyright IBM Corp. 2010, 2014
 * The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the U.S. Copyright Office.
 */

package com.ibm.bi.dml.runtime.instructions.CPInstructions;

import com.ibm.bi.dml.parser.Expression.DataType;
import com.ibm.bi.dml.parser.Expression.ValueType;

public abstract class ScalarObject extends Data 
{
	@SuppressWarnings("unused")
	private static final String _COPYRIGHT = "Licensed Materials - Property of IBM\n(C) Copyright IBM Corp. 2010, 2014\n" +
                                             "US Government Users Restricted Rights - Use, duplication  disclosure restricted by GSA ADP Schedule Contract with IBM Corp.";
	
	private String _name;

	public ScalarObject(String name, ValueType vt) {
		super(DataType.SCALAR, vt);
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public abstract Object getValue();

	public abstract boolean getBooleanValue();

	public abstract int getIntValue();

	public abstract long getLongValue();
	
	public abstract double getDoubleValue();

	public abstract String getStringValue();
	
}