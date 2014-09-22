/*
 * ajUnit - Unit Testing AspectJ.
 *
 * Copyright (C) 2013-2014 Marko Umek (http://fail-early.com/contact)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.company.project.aspects;

import org.failearly.ajunit.AjUnit4Test;
import org.failearly.ajunit.AjUnitSetup;
import org.failearly.ajunit.builder.JoinPointSelector;

/**
 * ajUnit - Final Step 6 (Override method execute()).
 *
 * NOW you're done! No more "ajUnit - Setup Error: ..."! You can start developing your aspect - sorry I mean your pointcut :-)
 *
 * You got an test failure (not an ajUnit setup error):
 *
 *      java.lang.AssertionError: ajUnit - Pointcut test failed with 2 error(s).
 *
 *      Details:
 *
 *      - No join points selected. Possible reasons:
 *      * Method assertPointcut(JoinPointSelector) uses notYetSpecified().
 *      * You defined a join point selector which has a impossible condition.
 *
 *      - Missing none selected join points. Possible reason:
 *      * Your ajUnit universe is too small. For example: Add a new method which should not selected by your pointcut definition.
 *      at org.junit.Assert.fail(Assert.java:88)
 *      at org.failearly.ajunit.AjUnit4Test.doFail(AjUnit4Test.java:42)
 *      (...)
 */
public class MyAjUnit6Test extends AjUnit4Test {

    @Override
    public void setup(AjUnitSetup ajUnitSetup) {
        ajUnitSetup.assignAspect("com.company.project.aspects.MyAspect");
        ajUnitSetup.addTestFixtureClass(com.company.project.aspects.testfixture.MyTestFixture.class);
    }


    @Override
    public void execute() throws Exception {
        // TODO: Do your callings on your test fixture class(es).
    }

    @Override
    public void assertPointcut(JoinPointSelector joinPointSelector) {
        // TODO: Replace notYetSpecified with your join point selectors.
        joinPointSelector.notYetSpecified();
    }
}