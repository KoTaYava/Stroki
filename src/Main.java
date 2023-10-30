public class Main {
    public static void main(String[] args) {
        String firsName = " Ivan";
        String middName = " Ivanovich";
        String fullName = " Ivanov";
        String fiName = "Семён ";
        String miName = "Семёнович";
        String fuName = "Иванов";
        fiName = fiName.replace("ё", "е");
        miName = miName.replace("ё", "е");

        System.out.println(fullName + firsName + middName );
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета " + fullName.toUpperCase() + firsName.toUpperCase() + middName.toUpperCase());
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета " + fuName + " " + fiName + " " + miName);

    }
}