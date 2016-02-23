/**
 * IntelliJ had some random problems with me calling the file Question10,
 * hence QuestionTen.
 *
 * Question: What are the signs that a Factory Method is at work?
 *
 * This answer:
 * @author Annabel Jump
 */

/**
 * Signs a Factory Method is at work:
 * - There is an "abstract" "creator" class/interface which specifies the supertype of object to be
 * created by the implementing classes (this may not actually be an Abstract class).
 * - Implementing classes will specify the exact object types, which will all be subtypes
 * of the one in the "creator" class/interface.
 * - This way more than one subtype of object can be created through the "creator" class, using
 * different implementations.
 * - The object returned through the "creator" class will be of the same parent class
 *
 */
