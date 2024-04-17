/* ToDo:Implement the methods speak() and sound().
* The speak() method should check the boolean value isHumanForm and if the answer is true, return "I am a human."
* If the value is false, return "I cannot speak in wolf form."
* The sound() method should check the boolean value isHumanForm and if the answer is true, return "No sound in human form."
* If the value is false, return "Howl!"
* It's important that the returned values are exactly as specified so that the tests pass successfully. */

public class Werewolf extends Mutant implements Animal, Human {
    public boolean isHumanForm;

    public Werewolf() {
        this.isHumanForm = true;
    }

    public void transform() {
        isHumanForm = !isHumanForm;
        if (isHumanForm) {
            System.out.println("Transformed into a human.");
        } else {
            System.out.println("Transformed into a wolf.");
        }
    }

    @Override
    public String sound() {
        if (isHumanForm) {
            return "No sound in human form.";
        } else {
            return "Howl!";
        }
    }

    @Override
    public String speak() {
        if (isHumanForm) {
            return "I am a human.";
        } else {
            return "I cannot speak in wolf form.";
        }
    }
}
