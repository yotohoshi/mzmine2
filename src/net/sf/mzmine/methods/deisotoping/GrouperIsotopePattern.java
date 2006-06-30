/*
 * Copyright 2006 The MZmine Development Team
 *
 * This file is part of MZmine.
 *
 * MZmine is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * MZmine is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * MZmine; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.methods.deisotoping;

import java.util.Hashtable;

import net.sf.mzmine.interfaces.IsotopePattern;

/**
 * This interface defines the properties of a detected peak
 */
public class GrouperIsotopePattern implements IsotopePattern {

	private int chargeState;

	public GrouperIsotopePattern(int chargeState) {
		this.chargeState = chargeState;
	}

	/**
	 * Returns the charge state of peaks in the pattern
	 */
	public int getChargeState() {
		return chargeState;
	}

}