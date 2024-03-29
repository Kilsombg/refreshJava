package laboratory.zadacha2;
/* Да се имплементира система от класове за войници в игра от тип real time strategy(RTS).
1.	Клас за войник – да се използва един единствен клас за всички видове войници.
Специфичният вид и способности на даден войник ще се определят от допълнителни модификатори,
които бъдат добавени върху него.

a.	Класът има атрибути за:
i.	Име
ii.	Вид на атаката му (melee или ranged)
iii.	Текущи и максимални точки живот
iv.	Сила на атаката
v.	Защита срещу ръкопашни атаки (melee)
vi.	Защита срещу стрелящи атаки (ranged)
vii.	Множество от тагове (стрингове)
viii.	Списък от текущи модификатори

b.	Дефинирайте поне един конструктор, който приема следните аргументи в същия ред: име, точки живот,
 сила на атаката, ръкопашна защита, стрелкова защита, вид на атаката. Класът не трябва да има дефолтен конструктор

c.	Дефинирайте метод void addModifier, който добавя нов модификатор към списъка с модификатори

d.	Дефинирайте гетъри за характеристиките на героя. Всеки гетър трябва да връща сумата от начална стойност
 на атрибута + всички приложими модификатори за него: текущи и максимални точки живот, сила на атаката,
 ръкопашна и стрелкова защита

e.	Дефинирайте метод toString, който връща информацията за войника в следния формат:
<име на войника>
    HP: <текущи точки живот>/<максимални точки живот>
    ATK: <базова атака> + <сума от модификациите за атака>
    DEF: <базова ръкопашна защита> + <сума от модификациите за ръкопашна защита>/<базова стрелкова защита> +
    <сума от модификациите за стрелкова защита>
Modifiers:
<име на модификатор> <детайли на модификатора>

Пример:
Warrior
    HP: 70/80
    ATK: 5+5
    DEF: 5+2/2+1
Modifiers:
Extra attack against “archer” for +5


2.	Работа на войника – след като един войник бъде инстанциран той може да се използва в битки,
като модификаторите му може да дават бонус според противника, срещу който се бие. Имплементирайте следните методи:

a.	Soldier chooseTarget(List<Soldier> enemies) – получава списък с противникови войници. Намира и връща
 този противник, на когото ще нанесе най-силен удар (не се взима предвид защитата на противника).

b.	int getDamageAgainst(Soldier enemy) – получава противников войник и връща силата на удара
срещу него. Силата се смята като сума от <сила на атаката> + <модификатори за атака> +
<модификатори с допълнителен бонус срещу този противник>
Пример:
Войник с атака 10, модификатор за атака +5 и модификатор за атака срещу противник
с таг archer +5 ще има обща атака 20 срещу противник с таг archer и само 15 срещу противник без такъв таг.

c.	int getDamageFrom(Soldier enemy, int value, String type) – получава противник,
сила на атаката му и тип на атаката (ръкопашна/стреляща).
Връща колко ще бъда финалната щета, която ще получи текущият войник, след като се приложат защитите му.
 Смята се като сума от <атака на противника> - <правилния тип защита на войника> - <модификатор на този тип защита>
  - <модификатори с допълнителен бонус срещу този противник>.
  Минималната стойност на върнатия резултат не може да бъде по-малка от 1.
Пример:
Войник с ръкопашна защита 10, модификатор на ръкопашната защита +5 и модификатор за защита срещу противник
с таг archer +5 ще има общо 20 защита срещу ръкопашни атаки от противници с този таг и ако получи атака със
 стойност 24 ще я намали до 4. Ако получи атака със сила 15 ще я намали до 1.

d.	void receiveAttack(Soldier enemy, int value, String type) – получава същите аргументи като getDamageFrom.
Пресмята колко ще бъде финалната щета от атаката и намалява текущите точки живот.
Точките живот не могат да бъдат по-малко от 0.

3.	Модификатори – модификаторът е такъв клас, който може да се инстанцира и добави към инстанция
на войник за да промени нейното поведение.

a.	Дефинирайте базов интерфейс Modifier, който дефинира нужните методи за всички модификатори.
 Класът за войник пази списък от инстанции на този интерфейс. Вие трябва да определите какви да бъдат
  методите и кога да се извикват за да могат да изпълнят изискванията

b.	Модификатори за атрибути – когато се инстанцира приема допълнителни параметри за име на
 характеристика на войника и стойност, с която я променя. Ефектът се прилага веднага след като се
 добави към инстанция на войник. Извиква се метод, на който се подава референция към войника,
  и променя съответната характеристика.

c.	Модификатор за атака – когато се инстанцира приема допълнителни параметри за таг на противника и стойност,
с която променя атаката на войника. Ефектът се прилага всеки път когато се пресмята колко ще бъде атаката на
 войника срещу даден противник. Извиква се метод, на който се подават референции към войника и противника,
  и връща допълнителната си атака ако противникът съдържа нужния таг.

d.	Модификатор за защита - когато се инстанцира приема допълнителни параметри за
таг на противника и стойност, с която променя защитата на войника. Ефектът се прилага
всеки път когато се пресмята колко ще бъде щетата от атака на противник. Извиква се метод,
 на който се подават референции към войника и противника, и връща допълнителната си защита ако
  противникът съдържа нужния таг.

4.	Изисквания към проекта
a.	Подредете кода в пакети
b.	Използвайте правилна енкапсулация. Атрибути, които не трябва или няма смисъл да
бъдат достъпни да бъдат скрити. Атрибути, които трябва само да се четат, да имат гетъри.
c.	Направете демонстрация на кода в main
d.	Довършете примерните юнит тестове
e.	Качвайте цялата папка на проекта без папката target
f.	Решенията качвайте като архив с име <номер>_<име>-<фамилия>
g.	Задачата може да се реши с 4 класа и без наследяване.
Описанието на класовете за модификатори е умишлено абстрактно и неясно.

h.	Оставете в кода ascii art на котка за допълнителна точка
*/