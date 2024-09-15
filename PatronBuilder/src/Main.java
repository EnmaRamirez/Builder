package gt.edu.miumg.Enma.Builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Email email = new Email.EmailBuilder()
                .setDestinatario("enma25leticia@gmail.com")
                .setAsunto("Asunto: Oportunidad de empleo, vacantes para puesto de software")
                .setCuerpo("Presenta tu papeleria ")
                .build();

        System.out.println(email);

    }
}