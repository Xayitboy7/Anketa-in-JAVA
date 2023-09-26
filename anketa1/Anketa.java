import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anketa {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Person> personList = new ArrayList<>();
    static List<Farzand> farzandList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            int menuNumber = menu();
            switch (menuNumber) {
                case 1:
                    inputPersonDataToList();
                    break;
                case 2:
                    viewPersonData();
                    break;
                case 3:
                    updatePersonData();
                    break;
                case 4:
                    deletePersonData();
                    break;
                case 6:
                    viewFarzandData();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("0..6 oraliqda kiriting");
                    break;
            }
        }
    }

    private static void deletePersonData() {
        System.out.println("O'chirish");
        scanner = new Scanner(System.in);
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < personList.size()) {
            personList.remove(index);
            System.out.println("Hodim ma'lumotlari o'chirildi.");
        } else {
            System.out.println("Noto'g'ri indeks kiritildi.");
        }
    }

    private static void updatePersonData() {
        System.out.println("Yangilash");

        boolean continueUpdating = true;

        while (continueUpdating) {
            System.out.println("Ma'lumotlarni yangilash uchun indexni kiriting: ");
            int index = scanner.nextInt() - 1;

            if (index >= 0 && index < personList.size()) {
                Person person = personList.get(index);

                System.out.println("Hozirgi ma'lumotlar: ");
                person.printData();

                System.out.println("Yangi ismni kiriting: ");
                String newFirstName = scanner.next();
                person.setFirstName(newFirstName);

                System.out.println("Yangi familiyani kiriting: ");
                String newLastName = scanner.next();
                person.setLastName(newLastName);

                System.out.println("Yangi yosh kiriting: ");
                int newAge = scanner.nextInt();
                person.setAge(newAge);

                System.out.println("Yangi jins kiriting: ");
                Boolean newJinsi = scanner.nextBoolean();
                person.setJinsi(newJinsi);

                System.out.println("Yangi jins kiriting: ");
                boolean newUylanganmisiz = scanner.nextBoolean();
                person.setUylanganmisiz(newUylanganmisiz);

                System.out.println("Ma'lumotlar yangilandi");

                System.out.println("Yana ma'lumotlarni yangilashni xohlaysizmi? (ha/yoq)");
                String continueChoice = scanner.next();
                if (!continueChoice.equalsIgnoreCase("ha")) {
                    continueUpdating = false;
                }
            } else {
                System.out.println("Noto'g'ri indeks kiritildi.");
                System.out.println("Yana ma'lumotlarni yangilashni xohlaysizmi? (ha/yoq)");
                String continueChoice = scanner.next();
                if (!continueChoice.equalsIgnoreCase("ha")) {
                    continueUpdating = false;
                }
            }
        }
    }

    private static void viewPersonData() {
        System.out.println("sizning ma'lumotlaringiz");
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).printData();
        }
    }

    private static void viewFarzandData() {
        System.out.println("sizning ma'lumotlaringiz");
        for (int i = 0; i < farzandList.size(); i++) {
            farzandList.get(i).printData();
            if (personList.get(farzandList.get(i).getParentId()).getJinsi()) {
                System.out.println("Farzand otasi: " + personList.get(farzandList.get(i).getParentId()).getFirstName());
            }
        }
    }

    private static void inputPersonDataToList() {
        while (true) {
            scanner = new Scanner(System.in);
            Person person = new Person();
            person.setFirstName(KeyboardHelper.getText("Hodim ismini kiriting: "));
            person.setLastName(KeyboardHelper.getText("Hodim familiyasini kiriting: "));
            person.setJinsi(KeyboardHelper.getBoolean("Hodim jinsini kiriting"));
            person.setAge(KeyboardHelper.getNumber("Hodim yoshini kiriting: "));

            if (person.getAge() >= 18 && person.getAge() <= 50) {
                if (person.getJinsi() == true) {
                    person.setUylanganmisiz(KeyboardHelper.askYesNo("erga tegganmisiz"));
                } else {
                    person.setUylanganmisiz(KeyboardHelper.askYesNo("Uylanganmisiz"));
                }
                if (person.getUylanganmisiz() == true) {
                    person.setFarzand(KeyboardHelper.askYesNo("Farzandingiz bormi? "));
                    if (person.getFarzand() == true) {
                        int farzandSoni = KeyboardHelper.getNumber("nechta farzandigingiz bor: ");
                        for (int i = 1; i <= farzandSoni; i++) {
                            Farzand farzand = new Farzand();
                            farzand.setFarzandName(KeyboardHelper.getText(i + " chi farzandigniz ismi"));
                            farzand.setFarzandFam(KeyboardHelper.getText(i + " chi farzandigniz familiyasi"));
                            farzand.setAgee(KeyboardHelper.getNumber(i + " chi farzandigniz yoshi"));
                            farzand.setFJinsi(KeyboardHelper.getBoolean(i + " chi farzandigniz jinsi"));
                            farzandList.add(farzand);
                            farzand.setParentId(personList.size());
                        }
                    }
                }
                personList.add(person);
            } else if (person.getAge() > 50) {
                System.out.println("Uzrli siz ishga yaramaysiz!");
            }

            else if (person.getAge() <= 7) {
                System.out.println("Uzrli siz juda juda yoshsiz!");
            }
            if (KeyboardHelper.askYesNo("Yana hodim kiritasizmi?")) {
                continue;
            } else {
                break;
            }
        }
    }

    private static int menu() {
        scanner = new Scanner(System.in);
        System.out.println("1) Ma'lumot kiritish");
        System.out.println("2) Ma'lumotni ko'rish");
        System.out.println("3) Ma'lumotni o'zgartirish");
        System.out.println("4) Ma'lumotni o'chirish");
        System.out.println("5) Chiqish");
        System.out.println("6) Farzand ma'lumotni ko'rish");
        System.out.println("Menu bandini kiriting: ");
        int menuNumber = scanner.nextInt();
        return menuNumber;
    }
}

// ozgartirish