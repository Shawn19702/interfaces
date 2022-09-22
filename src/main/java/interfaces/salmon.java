package interfaces;
// Salmon implements prey interface that has the flee method
// there is no method for predator because we are implementing the prey interface method not the predator interface method


public class salmon implements prey{
    @Override
    public void flee() {
        System.out.println("the Salmon flees away");
    }
}
