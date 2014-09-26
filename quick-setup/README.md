# Description

This example project demonstrates an [ajUnit](https://github.com/loddar/ajunit) test setup.



# Seven tiny steps to get started ...

On each step, ajUnit throws a setup error, which tells you, what to do. After you've finished these seven tiny steps, the actually development
of your pointcut could start.

## Step 0

Create an JUnit4 test class by extending _org.failearly.ajunit.AjUnit4Test_ .

Example Gist: [ajUnit - Step 0 (create an ajUnit test)](https://gist.github.com/loddar/4ae8e534d7647d765b96)


## Step 1

Second step is to override the method setup(org.failearly.ajunit.AjUnitSetup).

Example Gist: [ajUnit - Step 1 (Override setup())](https://gist.github.com/loddar/ac9869b87df5c5fba5fe)


## Step 2

Create an aspect and assign it. 

Create an aspect com.company.project.aspects.IncorrectAspect in folder src/test/aspect.
If you forget to create the aspect or misspell it you will get a new setup error message, i.e.
   
    _"ajUnit - Setup Error: Class 'com.company.project.aspects.Aspect' could not be found."_
        
        

Assign it by calling ajUnitSetup.assignAspect("the.path.to.my.Aspect").


    ajUnit separates multiple tests by defining an universe (the codebase). The universe will be defined by the full qualified class 
    name of your test aspect. So its necessary that your test assign the associates aspect. 
    
    You must not assign multiple aspects to your tests.


Example Gists: 
  
  * [ajUnit - Step 2 (Create an aspect and assign it)](https://gist.github.com/loddar/06ebfea786ab61243c7d)
  * [An (incorrect) aspect.](https://gist.github.com/loddar/a2cd04522dd04dbd58b0)




## Step 3

So these are the next steps:

1. Extend your aspect.
2. "implement" the pointcut pointcutUnderTest() in your aspect (in this case: com.company.project.aspects.MyAspect)

Currently there are 2 aspects of each kind (classic or annotation).

- with an already defined _before advice_ (recommended): AjUnitBeforeAnnotationAspect or AjUnitBeforeClassicAspect
- without any advice (you must create an appropriate advice by yourself) : AjUnitAnnotationAspect or AjUnitClassicAspect.


Example Gists:
    
  * [ajUnit - Step 3 (Extend your aspect from one of the provided ajUnit (classic or annotation) aspects)](https://gist.github.com/loddar/a6e5dc051ab34991eadf)
  * [A correct ajUnit test aspect.](https://gist.github.com/loddar/2cbee5b1504d1cb14f81)



## Step 4

Create _at least one_ test fixture class and add it. 

A test fixture class is a class where your aspect will be applied on. 
ajUnit uses reflection to extract the potential joinpoints from these classes.

Example Gists:

  * [ajUnit - Step 4 (Create at least one test fixture class and add it/them)](https://gist.github.com/loddar/c5f974f5e987527f68c3)
  * [A sample test fixture class for ajUnit](https://gist.github.com/loddar/a53c231eb6733fa56520)
  
  

## Step 5

Override method assertPointcut(JoinPointSelector) and "implement" it by calling JoinPointSelector.notYetSpecified().

Example Gist: [ajUnit - Step 5 (Override method assertPointcut(JoinPointSelector) and "implement" it)](https://gist.github.com/loddar/0bcbddc8a4333773fc8a)



## Step 6

Override method _execute()_.

NOW you're done! No more "ajUnit - Setup Error: ..."! You can start developing your aspect - sorry I mean your pointcut :-)

You got an test failure (not an ajUnit setup error):

     java.lang.AssertionError: ajUnit - Pointcut test failed with 2 error(s).
     Details:
     - No join points selected. Possible reasons:
     * Method assertPointcut(JoinPointSelector) uses notYetSpecified().
     * You defined a join point selector which has a impossible condition.
     - Missing none selected join points. Possible reason:
     * Your ajUnit universe is too small. For example: Add a new method which should not selected by your pointcut definition.
     at org.junit.Assert.fail(Assert.java:88)
     at org.failearly.ajunit.AjUnit4Test.doFail(AjUnit4Test.java:42)
     (...)



Example Gist: [Override method execute())](https://gist.github.com/loddar/e4b760b92b4c353f516e)


# Remarks


## TDD with ajUnit

After the setup, your actually work starts. I recommend following steps:

1. Extend your test fixture class. 
For example define a method which should be weaved by the aspect and one which should not. This could be done by using your IDE quickly, 
if you call it in _execute()_ and leave the work to your IDE creating the method/constructor.
   
2. Call the new code within _execute()_.   

3. Define the join point selector.

4. Execute the test class. This should fail.

5. Extend the pointcut.

6. Execute the test class again. If the test gets green you're done. If the test fails, correct the pointcut until it gets green.


If the your pointcut definition is not yet complete, start again with 1.


## Side effects 

It's possible to share the test fixture classes between several ajUnit tests. But be aware of the potential side effects. ajUnit does not
prevent AspectJ to apply the aspects on all of your classes.






