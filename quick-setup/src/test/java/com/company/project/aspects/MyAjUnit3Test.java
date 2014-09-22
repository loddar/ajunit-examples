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
 * ajUnit - Step 3 (Extend your aspect from one of the provided ajUnit (classic or annotation) aspects).
 *
 * Currently there are 2 aspects of each kind (classic or annotation).
 *
 * - with an already defined before advice (recommended): AjUnitBeforeAnnotationAspect or AjUnitBeforeClassicAspect
 * - without any advice (you must create an appropriate advice by yourself) : AjUnitAnnotationAspect or AjUnitClassicAspect.
 *
 * So these are the next steps:
 *
 * 1. Extend your aspect.
 * 2. "implement" the pointcut pointcutUnderTest() in your aspect (in this case: com.company.project.aspects.MyAspect)
 *
 * Fourth error message:
 *
 *      ajUnit - Setup Error: Missing test fixture class(es).
 *      - Apply addTestFixtureClass(<class> or <class name>) for every test fixture class.
 */
public class MyAjUnit3Test extends AjUnit4Test {

    @Override
    public void setup(AjUnitSetup ajUnitSetup) {
        ajUnitSetup.assignAspect("com.company.project.aspects.MyAspect");
    }
}