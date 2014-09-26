# Description

This example demonstrates usage of [ajUnit](https://github.com/loddar/ajunit). 

Unit tests of method execution/call pointcuts.

# ajUnit Tests

### _InvalidGetterAnnotationAspectTest_ (finished)

Selects invalid getter executions based on annotation AspectJ notation: _@Aspect class MyAspect {}_.

An invalid getter is a method:

- name starting with get
- returning void
- returning an array
- returning a collection or map
- having declared exception
- having parameters


    
### _InvalidGetterClassicAspectTest_ 

Selects invalid getter calls based on classic AspectJ notation: _aspect MyAspect {}_.

An invalid getter is a method:

- name starting with get
- returning void

(The rest has been skipped for training purposes.)

