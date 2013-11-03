/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Copyright (c) 2012 Mitchell Bosecke.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 
 * Unported License. To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/3.0/
 ******************************************************************************/
package com.mitchellbosecke.pebble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class CoreFunctionTest extends AbstractTest {

	@Test
	public void testParent() throws PebbleException {
		PebbleTemplate template = pebble.loadTemplate("function/template.child.peb");
		assertEquals("parent text\n\t\tparent head\n\tchild head\n", template.render());
	}

	@Test
	public void testBlock() throws PebbleException {
		PebbleTemplate template = pebble.loadTemplate("function/template.block.peb");
		assertEquals("Default Title\nDefault Title", template.render());
	}

}