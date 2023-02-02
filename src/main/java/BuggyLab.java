public class BuggyLab {
    public static void main(String[] args) {

        // We're having another pizza party!
        int pizzaSlices = 10;
        int people = 10;

        // Bug One
        // Do we have enough pizza to feed everyone?
        boolean enoughPizza = pizzaSlices > people;
        System.out.println("Do we have enough pizza to feed everyone? Answer: " + enoughPizza);

        // Bug Two
        // We're in luck! Bob ordered another pizza pie! The other pizza has 10 slices
        // How many slices of pizza do we have now?
        pizzaSlices =+ 10;
        System.out.println("With another pizza, we now have " + pizzaSlices + " pizza slices.");

        // Bug Three
        // Oh no! Alyssa has to leave the party early and can't have any pizza.
        // Will we have any slices of pizza left over?
        people--;
        int leftovers = pizzaSlices / people;
        System.out.println("We will have " + leftovers + " slices of pizza left over if we only have "
                + people + " people at the party.");

    }
}
