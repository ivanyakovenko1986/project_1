package Lesson5;

import java.util.Arrays;

public class StringLesson {
    public static int i;

    public static void main(String[] args) {
      //char  примитивный тип данных 16 битный символ Unicode
        //от 0 до 65536 (не имеет отрицательных кодов) /'\u0000' до '\uffff
        char char1 = 'j'; //в одинарных ковычках помещается 1 символ
        char char2 = 74; //номер символа J
        char char3 = '\u0044'; //16ти ричное представление символа в escape последовательности

        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        System.out.println("Строки");

        //строка - упорядоченная последовательность символов
        //строка - ссылочный тип, экземпляр класса String
        //строки задаются:
        // 1. в "" ковычках
        // 2. new String(), используется, если способ создания строки через "" невозможен
        // строки неизменны, можно лишь создать новую строку на основе существующей
        //JJD
        //jjd
        System.out.println("Строковый литерал");

        char[] chars = {'\u004A', '\u004A', '\u0044'};
        String jjdstring = new String(chars);
        System.out.println(jjdstring); //JJD
        System.out.println(jjdstring.length()); // 3

        char[] chars1 = {'\uD83D', '\uDC38'}; //2 чара это сурогатная пара
        String frogString = new String(chars1);
        System.out.println(frogString); //символы типа иероглифов и спец символов, которые образуются нескольки чарами
        System.out.println(frogString.length());//2
        System.out.println(frogString.codePoints().count()); // 1 способ используется если нужно узнать количество символов

        //пул строк - для пула строк лучше использовать ""
        //пул строк он для оптимизации, что бы не плодить одинаковые объекты
        //в пуле строк всегда хранятся уникальные строки
        // пул строк всегда хранит только одну копию строкового литерала (строки в пуле уникальны)

        String string1 = "Строка"; // строка уходит в пл строк, так как совпадений не было и строка уникальна
        String string2 = "Строка"; //данная строка не уникальна и в пул она не создаётся

        String string3 = new String("Строка"); //в пул строк не попадет, создается в памяти новый объект строки
        //через == сравниваются только примитивы
        System.out.println(string1 ==string2); //true
        System.out.println(string1 ==string3); //false

        String internString = string3.intern();
        //метод интерн - интернирование. у стринг3 вызвали метод интрнт.
        // метод смотрит пул строк. если есть такая строка, значит метод вернет ссылку на строку из пула

        //Сравнение строк  equals
        //для сравнения не исользуем ==, так как == сравнивает ссылки

        System.out.println(string1.equals(string2)); //true
        System.out.println("cтрока".equals(string2)); // false
        System.out.println("cтрока".equalsIgnoreCase(string2)); // true

        string2 = null;

        System.out.println("cтрока".equals(string2));
        //System.out.println(string1.equals("cтрока")); //ошибка времени выполнения NullpointerException

        System.out.println(string2 == null); //true
        System.out.println(string2 != null); //false

        string1 = "Java";
        string2 = "Python";

        //конкатенация строк
        String concatString = string1 + " : : " + string2;
        System.out.println(concatString);
        // Java : :
        concatString = string1.concat(" : : ").concat(string2); //Java : : Python

        concatString = String.join(" : : " < string1, string2); // метод join - объединение строк

        concatString = "";
        for (int i = 0, i < 10, i++) {
            concatString += i + " ";
        }
        System.out.println(concatString);

        //StringBuilder - раюотает быстрее чем стрингБуффер (позволяет не создавать новые объекты строк)
        //StringBuffer - потокобезопасный (позволяет не создавать новые объекты строк)

        string1 = "Java";
        string2 = "Python";

        concatString = "Nachalo stroki";
        StringBuilder sb = new StringBuilder(concatString);
        sb.append(string1).append(" : : ").append(string2);

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0, i < 10, i += 1 {
            sb2.append(i).append(" : : ");
        }

        String sbString = sb2.toString();
            System.out.println(sbString);

            //метод spLit()
        String langs = "Java, Python, javascript";
        String[] langArr = langs.split(",");
        System.out.println(Arrays.toString(langArr));


        //метод замены // Java, Python, javascript - метод нашел значения и заменил символы на Java - Python - javascript
        String newString = langs.replaceAll(", ", " - "); //метод replaceAll потдерживает регулярны выражения
        System.out.println(newString);

        String newString = langs.replaceFirst(", ", " - "); //метод replaceFirst
        System.out.println(newString);

        String newString = langs.replace(", ", " - "); // метод replace не потдерживает регулярны выражения
        System.out.println(newString);

        System.out.println(langs.contains(th)); // contains проверяет содержит ли строка указанную последовательность символов
        System.out.println(langs.startsWith(j)); // проверяет начинается ли строка с последовательности симоволов
        System.out.println(langs.endsWith(script)); // проверяет заканчивается ли строка указнной последовательностью символов

        System.out.println(langs.startsWith(""));

        String name = "Иван";
        String surname = "Петров";
        String fullname1 = "Иван";
        String fullname2 = "Иван";





    }
}
