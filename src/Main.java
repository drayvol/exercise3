public class Main {
    public static void main(String[] args) {
        // Задача 6
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        System.out.println("Общий вес двух бойцов " + (firstWeight + secondWeight));
        System.out.println("Разница весов двух бойцов " + (secondWeight-firstWeight));
        // Задача 7
        System.out.println("Разница весов двух бойцов (1 способ) " + (secondWeight-firstWeight));
        System.out.println("Разница весов двух бойцов (2 способ) " + (secondWeight%firstWeight));

        // Задача 8
        var totalTime = 640;
        var timePerPerson = 8;
        System.out.println("Всего работников в компании - " +(totalTime/timePerPerson) + " человек");
        System.out.println("Если в компании работает " +(totalTime/timePerPerson + 94)  + " человек, то всего "+(timePerPerson*(totalTime/timePerPerson + 94)) + " часов работы может быть поделено между сотрудниками" );
    }
}