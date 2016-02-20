/**
 *True or False?
 * a) Every interface must have at least one method
 * b) An interface can declare instance fields that an implementing class
 * must also declare
 * c) Although you can't instantiate an interface, an interface definition can declare
 * constructor methods that require an implementing class to provide constructors with
 * given signatures.
 *
 * @author of answers is Annabel Jump
 */

/**
 * a) False - see InterfaceExample - no method, but will compile.
 */

/**
 * b) False - implementing class need only declare the methods of the interface
 * See InterfaceExample2 and InterfaceExample2Impl - the Impl does not declare the fields, but will compile.
 */

/**
 * c) False - see InterfaceExample3 and InterfaceExample3Impl
 * Interfaces do not accept constructors. Trying to put constructors breaks the whole thing.
 */