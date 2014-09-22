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
 * ajUnit - Step 1 (Override {@link #setup(org.failearly.ajunit.AjUnitSetup)}).
 *
 * Next step is to override the method {@link #setup(org.failearly.ajunit.AjUnitSetup)}.
 *
 *
 * Second error message:
 *
 *      ajUnit - Setup Error: Missing aspect or not yet assigned.
 *      - Create an aspect and ...
 *      - assign it by calling AjUnitSetup.assignAspect("full.path.MyAspect") in setup(AjUnitSetup).
 */
public class MyAjUnit1Test extends AjUnit4Test {

    @Override
    public void setup(AjUnitSetup ajUnitSetup) {
    }
}