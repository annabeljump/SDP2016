/**
 * Question 3 - Provide an example of an interface with methods that do not imply
 * responsibility on the part of the implementing class to take action on behalf
 * of the caller or to return a value.
 *
 * This answer:
 * @author Annabel Jump
 */

/*
    Notification methods do not imply that any action be taken or values returned.
    For example, as below, if a picture is right clicked, the method must do
    something - but if left clicked, the method may be ignored - this is for
    the implementing class to decide.
    (I have specified picture here so as not to get into left clicking links or buttons)
    */

public interface Question3Interface {

    public void rightClickPicture();

    public void leftClickPicture();

}