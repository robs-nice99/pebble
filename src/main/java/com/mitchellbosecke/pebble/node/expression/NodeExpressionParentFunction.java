/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Original work Copyright (c) 2009-2013 by the Twig Team
 * Modified work Copyright (c) 2013 by Mitchell Bösecke
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.node.expression;

import java.util.ArrayList;
import java.util.List;

import com.mitchellbosecke.pebble.compiler.Compiler;
import com.mitchellbosecke.pebble.node.Node;
import com.mitchellbosecke.pebble.node.NodeExpression;

public class NodeExpressionParentFunction extends NodeExpression {

	private final String blockName;

	public NodeExpressionParentFunction(int lineNumber, String blockName) {
		super(lineNumber);
		this.blockName = blockName;
	}

	@Override
	public void compile(Compiler compiler) {
		compiler.raw("getParent().block(").string(blockName).raw(", context, true)");
	}

	@Override
	public List<Node> getChildren() {
		List<Node> children = new ArrayList<>();
		return children;
	}

}