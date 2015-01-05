/**
 * Created by karolsudol on 10/11/2014.
 */
public class Patient {

    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    // this is a member method of class Patient

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            //// this means this is the last patient in the list
            this.nextPatient = newPatient;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient (Patient patient){
        if (this.nextPatient==null){
            return false;
        }
        else if (this.nextPatient.name.equals(patient.name)){
            this.nextPatient = nextPatient.nextPatient;
            return true;
        }
        else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    public listLengh (Patient ){



        return ;

    public static void main(String[] args) {



        }
    }



}

