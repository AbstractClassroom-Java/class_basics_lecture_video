package io.github.nathanjrussell;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course cse220 = new Course(
                3,
                220,
                "CSE",
                "Object Oriented Programming",
                "This is where the members of the cool meet with Nathan"
        );

//        System.out.println("Credit Hours: " + cse220.getCreditHours());
        System.out.println(cse220);

        Course cse310 = new Course(
                4,
                310,
                "MTH",
                "Cool Course",
                "Another Cool learning experience"
        );

        System.out.println(cse310);

    }
}