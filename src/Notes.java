import java.util.Arrays;
import java.util.Scanner;

public class Notes{
    private int id;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void note(){
        Scanner scanner = new Scanner(System.in);
        Notes[] notes = new Notes[0];
        boolean isTrue = true;
        while (isTrue){
            noteMenu();
            System.out.print("-----> ");
            switch (scanner.nextLine().toLowerCase()){
                case "1" -> {
                    notes = addNotes(notes);
                    System.out.println("Successful added");
                }
                case "2" -> {
                    for (Notes note : notes) {
                        System.out.println(note);
                    }
                }
                case "3" -> upDateNotes(notes);
                case "4" -> {
                    notes = deleteNotes(notes);
                    System.out.println("Successful deleted");
                }
                case "5" -> isTrue = false;
            }
        }
    }

    private Notes[] addNotes(Notes[] notes){
        Notes notes1 = new Notes();
        notes1.setId(MyGenerate.generateId());
        System.out.print("Write text: ");
        notes1.setText(new Scanner(System.in).nextLine());

        notes = Arrays.copyOf(notes, notes.length +1);
        notes[notes.length -1] = notes1;
        return notes;
    }

    private  Notes[] deleteNotes(Notes[] notes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getId() == id){
                for (int j = i; j < notes.length -1; j++) {
                    notes[j] = notes[j +1];
                }
            }
        }
        return Arrays.copyOf(notes, notes.length -1);
    }

    private void upDateNotes(Notes[] notes){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerSTR = new Scanner(System.in);
        System.out.print("Write ID: ");
        int id  = scanner.nextInt();
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getId() ==  id){
                System.out.println("Write text: ");
                notes[i].setText(scannerSTR.nextLine());
            }
        }
        System.out.println("Success Up-Dated! ");
    }


     private void noteMenu(){
        System.out.println(STR."""
                |----------------------|
                |      |_(0)_|         |
                |   1. Add notes       |
                |                      |
                |   2. Get notes       |
                |                      |
                |   3. Up-Date         |
                |                      |
                |   4. Delete          |
                |                      |
                |   5. Exit            |
                |______________________|
                """);
    }

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
