/**
 * Created by karolsudol on 27/11/14.
 */
public interface PersonQueue {

    // Adds another person to the queue.
    void insert(Person person);

    // Removes a person from the queue.
    Person retrieve();
}
