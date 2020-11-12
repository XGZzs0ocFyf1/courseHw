# courseHw
Репозиторий для проверки домашнего задания.

ниже команды для использования в консоли Win:

перейти в папку проекта

cd courceHw

скомпилировать исходные файлы в папку compiled
javac -d compiled -sourcepath src src/com/mysite/Hw.java

собрать из скомпилированных файлов jar файл

jar cfvm MyJar.jar manifest.MF -C compiled .

запустить java -jar MyJar.jar Username1 .. UsernameN
где Username1..UsernameN имена пользователей разделенные пробелом.

при вводе команды с аргументами:
java -jar MyJar.jar Alex Anna John Tanya Rita

Ожидаемый вывод в консоль:

Now: 05:05 PM 12-11-2020
Greeting section:
Hello  Alex!
Hello  Anna!
Hello  John!
Hello  Tanya!
Hello  Rita!





