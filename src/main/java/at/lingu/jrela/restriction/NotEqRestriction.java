/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.lingu.jrela.restriction;

import at.lingu.jrela.source.SourceColumn;

/**
 *
 * @author flo
 */
public class NotEqRestriction extends Restriction {

	private SourceColumn left;

	private SourceColumn right;

	@Override
	public void acceptVisitor(RestrictionVisitor visitor) {
		visitor.visit(this);
	}
}