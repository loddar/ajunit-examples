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

/**
 * ajUnit - Step 2 (Create an aspect and assign it).
 *
 * 1. Create an aspect com.company.project.aspects.IncorrectAspect in folder src/test/aspect.
 *    If you forget to create the aspect or misspell it you will get a new setup error message, i.e.
 *
 *    "ajUnit - Setup Error: Class 'com.company.project.aspects.Aspect' could not be found."
 *
 * 2. Assign it by calling {@link AjUnitSetup#assignAspect(String)}.
 *
 * Reason:
 *
 *   ajUnit separates multiple tests by defining an universe. The universe will be defined by the class
 *   name of your test aspect. So its necessary that your test assign the associates aspect.
 *
 * Third error message:
 *
 *  ajUnit - Setup Error: Test aspect 'com.company.project.aspects.IncorrectAspect' is not an ajUnit based aspect!
 *   - Please extend your aspect from one of the provided base aspects:
 *     * AjUnitAnnotationAspect or AjUnitClassicAspect
 *     * AjUnitBeforeAnnotationAspect or AjUnitBeforeClassicAspect
 */
public class MyAjUnit2Test extends AjUnit4Test {

    @Override
    public void setup(AjUnitSetup ajUnitSetup) {
        ajUnitSetup.assignAspect("com.company.project.aspects.IncorrectAspect");
    }
}