1. Record classes
2. Sealed classes
3. Text blocks
4. New switch



Sealed Classes
=============

interface - Contain only incomplete(abstract) methods
abstract class - meant to be inherited. may Contain both complete and incomplete variables and methods
final class - no class can inherit this type of classes
concrete class - the class which implements an interface or extends an abstract class

What if we want something in between?
like you want something to be inherited. But not every class could do it(only for limited number of classes).

SURPRISE!!!! Now in java 17 we can do that with "Sealed" keyword